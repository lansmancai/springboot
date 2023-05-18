package com.lansmancai.config;

import com.lansmancai.config.model.ConfigRandomValue;
import com.lansmancai.config.model.WebSiteProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class Example01ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Value("${com.weiz.costum.firstname}")
    private String firstName;

    @Value("${com.weiz.costum.secondname}")
    private String secondName;


    @Test
    void getValue() {
        System.out.println("firstname:"+firstName);
        System.out.println("secondName:"+secondName);
    }

    @Autowired
    private Environment env;


    @Test
    void getEnv() {
        System.out.println(env.getProperty("com.weiz.costum.firstname"));
        System.out.println(env.getProperty("com.weiz.costum.secondname"));
    }


    @Autowired
    private WebSiteProperties website;

    @Test
    void getProperties() {
        System.out.println(website.getName());
        System.out.println(website.getWebsite());
        System.out.println(website.getLanguage());
    }

    @Autowired
    private ConfigRandomValue randomValue;

    @Test
    void getRandom() {
        System.out.println(randomValue.getSecret());
        System.out.println(randomValue.getUuid());
        System.out.println(randomValue.getBigNumber());
        System.out.println(randomValue.getNumber());
        System.out.println(randomValue.getNumber2());
        System.out.println(randomValue.getNumber3());
    }

}
