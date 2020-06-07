package com.ab.tinyurl.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Arpit Bhardwaj
 */
public class TinyUrlRequest {
    private String url;

    @JsonCreator
    public TinyUrlRequest(@JsonProperty("url") String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
