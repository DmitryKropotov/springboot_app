package ru.project.training.main;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        MultiValueMap<String, String> headers = new HttpHeaders();
//        headers.add(headerDTO.getParAuthorization(), headerDTO.getBearer());
//        headers.add(headerDTO.getParRealIp(), headerDTO.getRealIP());
//        headers.add(headerDTO.getParIvUser(), headerDTO.getIvUser());

        HttpEntity<String> entity = new HttpEntity<String>("", headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity answer = restTemplate.exchange(new URI("https://www.google.com/"), HttpMethod.GET, entity, String.class);

        System.out.println(answer.getBody());

    }
}
