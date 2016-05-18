package com.wanliang.docker.controller;

import com.wanliang.docker.model.SwarmInfo;
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
    public SwarmInfo info(HttpServletResponse response) throws Exception {
        SwarmInfo info = new SwarmInfo();
        info.setContainersRunning(10);
        info.setImages(10);
        info.setContainersStopped(20);
        info.setOperatingSystem("Linux CentOS");
        return info;
    }
}
