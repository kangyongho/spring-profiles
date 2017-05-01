package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NPOST on 2017-04-23.
 */
@RestController
@EnableConfigurationProperties(ProfilesConfig.class)
public class ProfilesController {

    @Autowired
    private ProfilesConfig profilesConfig;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public ProfilesConfig check() {
        return profilesConfig;
    }
}
