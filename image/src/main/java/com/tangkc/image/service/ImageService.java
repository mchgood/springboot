package com.tangkc.image.service;

import com.tangkc.image.entity.ImageEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lenovo
 * @Date: 2019-04-25 22:01
 * @Description:
 */
@Service
public class ImageService {

    public List<ImageEntity> getImage(){
        List<ImageEntity> imageList = new ArrayList<>();
        File file = new File("E:\\ideaWorkSpace\\image\\src\\main\\resources\\static\\image\\");
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null == files || files.length == 0) {
                System.out.println("文件夹是空的!");
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {

                    } else {
                        String strIn = "\\image\\"+file2.getName();
                        String strOut = "\\image\\"+"1\\"+file2.getName();
                        ImageEntity imageEntity = new ImageEntity();
                        imageEntity.setSrc(strOut);
                        imageEntity.setResource(strIn);
                        imageEntity.setType("image");
                        imageList.add(imageEntity);
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        return imageList;
    }
}
