package com.wanliang.docker.util;

import javafx.util.Pair;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Scanner;

public final class ContainerUtils {

    public static final String NODE_NAME = "nodeHostName";
    public static final String IMAGE_NAME = "imageName";
    public static final String IMAGE_VERSION = "imageVersion";

    /**
     * Returns application name for discovery-service by image name
     * example:
     * @param appName
     * @return
     */
    public static String getApplicationName(String appName) {
        // slash in name is not allowed, because it used in uri
        // also, internally  app name in upper case
        String imageName = normalizeImageName(appName);
        int start = imageName.lastIndexOf('.') + 1;
        if(start < 0) {
            start = 0;
        }
        imageName = imageName.substring(start);
        return imageName.toUpperCase();
    }

    /**
     * Returns image name without Registry name and version
     * example: wddocker.mapbar.xom/com.navinfo.platform.opentsp-stub-core:172 -> com.navinfo.platform.opentsp-stub-core
     * @param appName
     * @return
     */
    public static String normalizeImageName(String appName) {
        int imageName = appName.lastIndexOf(':');
        if(imageName < 0) {
            imageName = appName.length();
        }
        int start = appName.lastIndexOf('/', imageName) + 1;
        if(start < 0) {
            start = 0;
        }
        appName = appName.substring(start, imageName);
        return appName;
    }

    /**
     * Returns image version
     * example: wddocker.mapbar.xom/com.navinfo.platform.opentsp-stub-core:172 -> 172
     * @param appName
     * @return
     */
    public static String getImageVersion(String appName) {
        int start = appName.lastIndexOf(':');
        if(start < 0) {
            return null;
        }
        appName = appName.substring(start + 1);
        return appName;
    }

    /**
     * Process any correct container name from docker or swarm and split in into container and node names pair.
     * @param names
     * @return Pair(ContainerName, NodeName), newer return null
     */
    public static Pair<String, String> getContainerNameAndNodeName(List<String> names) {
        String nodeName = null;
        CharSequence containerName = null;
        for(String name: names) {
            // name is start from slash, so we need skip first occurrence
            int slashPos = name.indexOf("/", 1);
            if(slashPos > 0) {
                if(nodeName == null) {
                    nodeName = name.substring(1, slashPos);
                }
                name = name.substring(slashPos + 1);
            }
            if(containerName == null) {
                containerName = name;
            } else if(containerName.equals(name)) {
                //do nothing, its equals
            } else {
                // we must join all names into single string
                StringBuilder sb;
                if(!(containerName instanceof StringBuilder)) {
                    sb = new StringBuilder(containerName);
                    containerName = sb;
                } else {
                    sb = (StringBuilder) containerName;
                }
                sb.append(", ").append(name);
            }
        }

        String name = null;
        if(containerName != null) {
            name = containerName.toString();
        }

        return new Pair<>(name, nodeName);
    }

    /**
     * Change version part of image string. If 'version' is empty or null then do nothing.
     * @param image
     * @param version
     * @return
     */
    public static String setImageVersion(String image, String version) {
        if(!StringUtils.hasText(version)) {
            return null;
        }
        int i = image.lastIndexOf(':');
        if(i < 0) {
            return image + ":" + version;
        }
        return image.substring(0, i + 1) + version;
    }

    public static Long parseMemorySettings(String memory) {
        String trim = memory.trim();
        if (isInteger(trim)) {
            return Long.parseLong(trim);
        } else {
            String substring = trim.substring(0, trim.length() - 1);
            if (isInteger(substring)) {
                long value = Long.parseLong(substring);
                String suffix = trim.substring(trim.length() - 1, trim.length());
                switch (suffix.toLowerCase()) {
                    case "k":
                        return value * 1024;
                    case "m":
                        return value * 1024 * 1024;
                    case "g":
                        return value * 1024 * 1024 * 1024;
                }
            } else {
                throw new IllegalArgumentException("can't parse memory settings: "+ memory);
            }
        }

        return null;
    }

    public static boolean isInteger(String s) {
        Scanner sc = new Scanner(s.trim());
        if(!sc.hasNextInt()) return false;
        // we know it starts with a valid int, now make sure
        // there's nothing left!
        sc.nextInt();
        return !sc.hasNext();
    }
}
