package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by NPOST on 2017-04-23.
 */
@ConfigurationProperties(prefix = "protest")
public class ProfilesConfig {

    private String message;
    private String port;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
