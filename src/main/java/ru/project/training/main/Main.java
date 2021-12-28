package ru.project.training.main;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import ru.project.training.entity.Animal;
import ru.project.training.entity.Cat;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        var x = 10;
        var y  = 2L;
        var z = x + y;
        var e = new Exception();
        var q = 7_999_333_333L;
        var animal = new Animal();
        animal = new Cat();
        var cat = (Cat)animal;
        MultiValueMap<String, String> headers = new HttpHeaders();
//        headers.add(headerDTO.getParAuthorization(), headerDTO.getBearer());
//        headers.add(headerDTO.getParRealIp(), headerDTO.getRealIP());
//        headers.add(headerDTO.getParIvUser(), headerDTO.getIvUser());

        HttpEntity<String> entity = new HttpEntity<String>("", headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity answer = null;
        answer = restTemplate.exchange(new URI("https://www.google.com/"), HttpMethod.GET, entity, String.class);


        System.out.println(answer.getBody());

    }
}
