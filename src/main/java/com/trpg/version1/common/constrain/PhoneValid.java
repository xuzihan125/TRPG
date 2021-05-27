package com.trpg.version1.common.constrain;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Constraint(validatedBy = {PhoneValidator.class})

public @interface PhoneValid {
    String message() default "手机格式异常";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
