package com.example.behavioral.facade;

public class OggCompressionCodec implements Codec {
    private String type = "ogg";

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "OggCompressionCodec{" +
                "type='" + type + '\'' +
                '}';
    }

}
