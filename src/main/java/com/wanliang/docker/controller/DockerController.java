package com.wanliang.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/5/18.
 */
@RestController
@RequestMapping("/api/v1/")
public class DockerController {


    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public void info( HttpServletResponse response) throws Exception {

    }
}
