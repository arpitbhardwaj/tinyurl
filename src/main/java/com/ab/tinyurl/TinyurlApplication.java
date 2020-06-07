package com.ab.tinyurl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Arpit Bhardwaj
 *
 * https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsoncreator.htm
 * mapped to https://tinyurl.com/y76mn66q
 * Long Url=https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsoncreator.htm
 * Local Url=https://tinyurl.com
 * Unique Id = y76mn66q
 *
 */

@SpringBootApplication
public class TinyurlApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinyurlApplication.class, args);
	}

}
