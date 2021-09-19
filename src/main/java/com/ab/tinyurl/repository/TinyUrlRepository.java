package com.ab.tinyurl.repository;

import redis.clients.jedis.Jedis;
import org.springframework.stereotype.Repository;

/**
 * @author Arpit Bhardwaj
 */

@Repository
public class TinyUrlRepository {
    private final Jedis jedis;
    private final String idKey;
    private final String urlKey;

    public TinyUrlRepository() {
        this.jedis = new Jedis();
        this.idKey = "id";
        this.urlKey = "url";
    }

    public long getIncrementId() {
        Long id = jedis.incr(this.idKey);
        return id-1;
    }

    public void save(String uniqueId, String longUrl) {
        jedis.hset(urlKey,uniqueId,longUrl);
    }

    public String getLongUrl(String uniqueId) {
        String url = jedis.hget(urlKey, uniqueId);
        if (url == null){
            throw new IllegalArgumentException("URL at key : "+ uniqueId + " doesn't exist");
        }else {
            return url;
        }
    }
}
