package com.ab.tinyurl.service;

import com.ab.tinyurl.repository.TinyUrlRepository;
import com.ab.tinyurl.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Arpit Bhardwaj
 */
@Service
public class TinyUrlService {

    @Autowired
    TinyUrlRepository repository;

    public String toTinyUrl(String longUrl, String localUrl){
        long id = repository.getIncrementId();
        String uniqueId = Converter.getInstance().generateUniqueId(id);
        repository.save(uniqueId,longUrl);
        return localUrl + "/" + uniqueId;
    }

    public String toRedirectUrl(String id){
        String longUrl = repository.getLongUrl(id);
        return longUrl;
    }
}
