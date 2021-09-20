# tinyurl
Springboot microservice for URL shortening

### Tech
* Jedis - a client library in Java for Redis, the popular in-memory data structure store that can persist on disk as well.

### Prerequisite
Install redis.

### Rest APIs
POST request to get tiny url
* http://localhost:8080/tinyurl

GET Request to get the original url
* http://localhost:8080/tinyurl/{uniqueid}