package com.trpg.version1.common.security;

//import com.trpg.version1.common.Enum.RoleEnum;
import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.Enum.RoleEnum;
import com.trpg.version1.common.security.JWT.AuthEntryPointJwt;
import com.trpg.version1.common.security.JWT.AuthTokenFilter;
import com.trpg.version1.common.security.JWT.JWTAccessDenied;
import com.trpg.version1.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.annotation.Resource;


/**
 * @author xuzihan
 * @version 1.0
 * @description: 权限管理
 * @data 2021/3/30
 **/
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Resource
    private UserService userService;

    @Resource
    private AuthTokenFilter jwtauthFilter;

    @Resource
    private AuthEntryPointJwt authEntryPointJwt;

    @Resource
    private JWTAccessDenied jwtAccessDenied;


    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.cors().and().csrf().disable();
        http
                .addFilterBefore(jwtauthFilter, UsernamePasswordAuthenticationFilter.class)
                .exceptionHandling().authenticationEntryPoint(authEntryPointJwt)
                .and()
                .authorizeRequests()
                .antMatchers(
                        "/registration**",
                        "/js/**",
                        "/css/**",
                        "/img/**",
                        "/webjars/**",
                        "/swagger-ui/**",
                        "/swagger-ui.html",
                        "/chatRoom/info"
                )
                .permitAll()
                .antMatchers("/auth/**","/login").permitAll()
                .antMatchers("/room/**").hasRole(RoleEnum.DEFAULT_ROLE.getRole())
                .antMatchers(HttpMethod.OPTIONS,"/**").anonymous()
                .anyRequest().authenticated()
//                    .and().exceptionHandling().accessDeniedHandler(jwtAccessDenied)
//                    .and()
//                    .formLogin().loginPage("/login")
//                    .permitAll()
//                    .and()
//                    .logout().invalidateHttpSession(true).clearAuthentication(true)
//                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                    .logoutSuccessUrl("/login").permitAll()
//                    .permitAll()
                .and()
//                    .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //swagger2所需要用到的静态资源，允许访问
        web.ignoring().antMatchers("/v2/api-docs",
                "/swagger-resources/configuration/ui",
                "/swagger-resources",
                "/swagger-resources/configuration/security",
                "/swagger-ui.html");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
}
