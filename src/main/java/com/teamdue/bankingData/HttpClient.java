package com.teamdue.bankingData;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import com.teamdue.bankingData.model.Anagrafica;

import java.util.Arrays;
import java.util.List;


@Service
public class HttpClient {

    RestTemplate restTemplate = new RestTemplate();

    public List<Anagrafica> getAnagraficaByVatNum(String vat) {
        String url = "http://192.46.232.80:9090/kyc/vat-number/" + vat;

        Anagrafica anagrafica = restTemplate.getForObject(url, Anagrafica.class);

        return (List<Anagrafica>) anagrafica;
    }
}
