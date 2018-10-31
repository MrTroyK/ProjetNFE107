package org.cnam.sample.dto;

public class NewSampleDto {

    public String data;
    public long id;

    public NewSampleDto(){

    }

    public NewSampleDto(long id, String data)
    {
        this.id = id;
        this.data = data;
    }

}
