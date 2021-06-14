package com.trpg.version1.mybatis.dto.room;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data
 **/
@Data
public class MapDTO {
    Integer mapId;

    @NotEmpty
    String title;

    MultipartFile[] map;
}
