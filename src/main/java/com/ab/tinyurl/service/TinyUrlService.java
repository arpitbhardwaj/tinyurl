package com.ab.tinyurl.service;

import com.ab.tinyurl.repository.TinyUrlRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Arpit Bhardwaj
 */
public class TinyUrlService {

    @Autowired
    TinyUrlRepository repository;

    public String toTinyUrl(String longUrl, String localUrl){
        return null;
    }

    public String toRedirectUrl(String id){
        return null;
    }
}
