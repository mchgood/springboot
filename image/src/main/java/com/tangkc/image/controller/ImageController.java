package com.tangkc.image.controller;

import com.tangkc.image.entity.ImageEntity;
import com.tangkc.image.service.ImageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: lenovo
 * @Date: 2019-04-25 21:58
 * @Description:
 */
@Controller
public class ImageController {
    @Resource
    private ImageService imageService;

    @RequestMapping("/images")
    @ResponseBody
    public List<ImageEntity> getImage(){
        List<ImageEntity> imageList = imageService.getImage();
        return imageList;
    }
}
