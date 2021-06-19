package com.trpg.version1.controller.character;

import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.mybatis.dto.CreateCharacterDTO;
import com.trpg.version1.mybatis.entity.Charact;
import com.trpg.version1.mybatis.entity.Room;
import com.trpg.version1.mybatis.vo.CharacterVO;
import com.trpg.version1.mybatis.vo.RoomVO;
import com.trpg.version1.service.CharacterService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/14
 **/
@Api(value = "角色操作")
@RestController
@CrossOrigin
public class CharacterController {
    @Resource
    private CharacterService characterService;

    @RequestMapping(value = "/character/create/{uid}", method = RequestMethod.POST)
    public JsonMessage<String> createRoom(@PathVariable("uid") Integer uid, @RequestBody CreateCharacterDTO createCharacterDTO){
        return new JsonMessage(characterService.createCharacter(uid,createCharacterDTO));
    }

    @RequestMapping(value = "/Character/getAllList/{uid}", method = RequestMethod.GET)
    public JsonMessage<List<CharacterVO>> getCharacterList(@PathVariable("uid") Integer uid){
        return new JsonMessage<List<CharacterVO>>(characterService.getCharacterList(uid));
    }

    @RequestMapping(value = "/Character/getCharacter/{uid}/{cid}", method = RequestMethod.GET)
    public JsonMessage<CharacterVO> getCharacterList(@PathVariable("uid") Integer uid, Integer cid){
        return new JsonMessage<CharacterVO>(characterService.getCharacter(uid,cid));
    }
}
