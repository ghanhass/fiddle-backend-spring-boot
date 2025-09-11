package com.example.java_spring_boot_backend_2.dto;

public class ResponseDto {
    public ResponseDto(Object result, String message, Integer total){
        this.result = result;
        this.message = message;
        this.total = total;
    }
    public Object result;
    public String message;
    public Integer total;
}
