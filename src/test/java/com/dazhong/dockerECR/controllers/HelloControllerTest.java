package com.dazhong.dockerECR.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;



    @Test
    public void test() throws Exception {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/hello", String.class);

        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
    }
}
