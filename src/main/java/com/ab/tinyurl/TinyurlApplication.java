package com.ab.tinyurl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Arpit Bhardwaj
 *
 * Local Url	=http://localhost:8080/tinyurl
 * Long Url		=https://www.linkedin.com/in/arpitbhardwaj09/
 * Short Url	=http://localhost:8080/tinyurl/xxxx
 * Unique Id = xxxx
 */

@SpringBootApplication
public class TinyurlApplication {
	public static void main(String[] args) {
		SpringApplication.run(TinyurlApplication.class, args);
	}
}
