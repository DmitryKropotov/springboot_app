package ru.project.training.java11;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class RequestMaker {
    public void makeRequest() throws IOException, InterruptedException {
        // basic HttpClient instance
        HttpClient client = HttpClient.newHttpClient();
// Using builder pattern to get a basic HttpRequest instance with just
//the URI
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.google.com/"))
                .build();
// response instance not created using a builder.
// HttpClient sends HttpRequests and makes HttpResponse available
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(" ");

        CompletableFuture completableFuture = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse<String> responseAsync = null;
        try {
            responseAsync = (HttpResponse<String>) completableFuture.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(responseAsync.body());
        System.out.println(response.body().equals(response.equals(responseAsync.body())));

        HttpResponse response2 = client.send(request,
                HttpResponse.BodyHandlers.ofFile(Paths.get("http.html")));
        System.out.println(response2.body());
        System.out.println(" ");

        CompletableFuture completableFuture2 =
                client.sendAsync(request,
                        HttpResponse.BodyHandlers.ofFile(Paths.get("http.html")));//.thenApply(HttpResponse::body);
        HttpResponse<String> responseAsync2 = null;
        try {
            responseAsync2 = (HttpResponse)completableFuture2.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(responseAsync2.body());

//        CompletableFuture<HttpResponse> response3 = client.sendAsync(request,
//                HttpResponse.BodyHandlers.ofString());
    }

    public void makeMultipleImageDownload() {
        List<URI> imageURIs =
                List.of(
                        URI.create("http://ejavaguru.com/images/about/jbcn-actual-2018.jpg"),
                        URI.create("http://ejavaguru.com/images/about/iit-delhi.jpg"),
                        URI.create("http://ejavaguru.com/images/about/techfluence.jpg"));
        HttpClient client = HttpClient.newHttpClient();
        List<HttpRequest> imgDwnldRequests = imageURIs.stream()
                .map(HttpRequest::newBuilder)
                .map(builder -> builder.build())
                .collect(Collectors.toList());
        List<CompletableFuture> completableFutures = imgDwnldRequests.stream().map(request -> client.sendAsync(request,
                HttpResponse.BodyHandlers.ofFile(
                        Paths.get(((String)request.uri()
                                .getPath()).substring(14)
                        )
                ))).collect(Collectors.toList());
        CompletableFuture<Void> allCompletableFuture = CompletableFuture.allOf(completableFutures.toArray(CompletableFuture[]::new));
        try {
            allCompletableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(allCompletableFuture);
//                .map(request -> client.sendAsync(request,
//                        HttpResponse.BodyHandlers.ofFile(
//                                Paths.get(((String)request.uri()
//                                        .getPath()).substring(14)
//                                )
//                        )
//                ));
//                .toArray(CompletableFuture<?>[]::new))
//                .join();
    }
}
