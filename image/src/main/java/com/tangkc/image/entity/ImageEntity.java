package com.tangkc.image.entity;

/**
 * @Auther: lenovo
 * @Date: 2019-04-25 21:59
 * @Description:
 */
public class ImageEntity {
    String resource;
    String src;
    String type;

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ImageEntity{" +
                "resource='" + resource + '\'' +
                ", src='" + src + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
