package com.example.jaya.itday;

public class Place {
    private String name,img,Desc,Lat,Long;

    public Place(Object value){}
    public Place(String name, String img,String Desc,String Lat,String Long)
    {
        this.name=name;
        this.img=img;
        this.Desc=Desc;
        this.Lat=Lat;
        this.Long=Long;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getimg() {
        return name;
    }

    public void setimg(String img) {
        this.img = img;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    public String getLong() {
        return Long;
    }

    public void setLong(String Long) {
        this.Long = Long;
    }





}

