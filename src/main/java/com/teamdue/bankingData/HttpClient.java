package com.teamdue.bankingData;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Service
public class HttpClient {
    RestTemplate restTemplate = new RestTemplate();
    String resourceUrl = "http://192.46.232.80:9090/kyc/vat-number/58865973602";
    ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl, String.class);

    @GetMapping("/id")
    public List<Object> getId() {
        String url = "http://192.46.232.80:9090/kyc/vat-number/58865973602";
        Object[] objects = restTemplate.getForObject(resourceUrl, Object[].class);

        return Arrays.asList(objects);
    }

}
