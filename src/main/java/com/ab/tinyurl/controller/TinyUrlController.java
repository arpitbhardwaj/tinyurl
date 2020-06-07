package com.ab.tinyurl.controller;

import com.ab.tinyurl.model.TinyUrlRequest;
import com.ab.tinyurl.service.TinyUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Arpit Bhardwaj
 */

@RestController
public class TinyUrlController {

    @Autowired
    TinyUrlService service;

    @RequestMapping(value = "/tinyurl", method = RequestMethod.POST, consumes = {"application/json"})
    public String getTinyUrl(@RequestBody final TinyUrlRequest tinyUrlRequest, HttpServletRequest request){
        String longUrl = tinyUrlRequest.getUrl();
        String localUrl = request.getRequestURL().toString();
        String tinyUrl = service.toTinyUrl(longUrl, localUrl);
        return tinyUrl;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RedirectView getTinyUrl(@PathVariable String id, HttpServletRequest request, HttpServletResponse response){
        String longUrl = service.toRedirectUrl(id);
        RedirectView view = new RedirectView();
        view.setUrl(longUrl);
        return view;
    }
}
