package com.hzwotu.bsuionline.base;

/**
 * Created by wangyu on 2017/3/2.
 */
public class TestList {

    private String name;

    private String url;

    private String img;

    private int id;

    public TestList(String name, String url, String img ,int id) {

        this.name = name;

        this.url = url;

        this.img = img;

        this.id = id;

    }

    public TestList() {

        new TestList("","","",0);

    }

    public String getName(int position){

        return name;

    }

    public void setName(String name){

        this.name = name;

    }

    public String getUrl(int position){

        return url;

    }

    public void setUrl(String url){

        this.url = url;
    }

    public String getImg(int position){

        return img;

    }

    public void setImg(String img){

        this.img = img;

    }

    public int getId(int position){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


}
