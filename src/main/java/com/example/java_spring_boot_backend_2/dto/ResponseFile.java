package com.example.java_spring_boot_backend_2.dto;

public class ResponseFile
{
    private String name;
    private String url;
    private String type;
    private long size;

    public ResponseFile(String name, String url, String type, long size){
        this.name = name;
        this.url = url;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }

    public long getSize() {
        return size;
    }
    ////

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
