package com.wanliang.docker.service;

import com.wanliang.docker.model.Container;
import com.wanliang.docker.model.Image;

import java.util.List;

/**
 * Created by Administrator on 2016/5/19.
 */
public interface DockerService {

    public List<Container> getContainers();

    public List<Image> getImages();
}
