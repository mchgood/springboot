package com.tangkc.image;

import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: lenovo
 * @Date: 2019-04-25 22:05
 * @Description:
 */
public class ImageUntil {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\ideaWorkSpace\\image\\src\\main\\resources\\static\\image\\");
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null == files || files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {

                    } else {
                        String strIn = file2.getAbsolutePath();
                        String strOut = file2.getParent()+"\\1\\"+file2.getName();
//                        System.out.println(strIn);
//                        System.out.println(strOut);
//                        System.out.println();
                        thumbnail(strIn,strOut,0.1);

                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        //thumbnail("E:\\ideaWorkSpace\\image\\src\\main\\resources\\static\\image\\20190425.JPEG","E:\\ideaWorkSpace\\image\\src\\main\\resources\\static\\image\\1\\308.jpg",0.1);


    }
    /**
     * 压缩图片
     *
     * @param srcImagePath 源图片路径
     * @param desImagePath 目标路径
     * @param scale        压缩率
     * @throws IOException the io exception
     */
    public static void thumbnail(String srcImagePath, String desImagePath, double scale) throws IOException {
        Thumbnails.of(srcImagePath).scale(scale).toFile(desImagePath);
    }
}
