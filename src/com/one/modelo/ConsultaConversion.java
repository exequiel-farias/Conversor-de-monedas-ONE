package com.one.modelo;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {

    public MonedaConvertida buscarMonedaConversion(String base, String otraMoneda, float cantidad){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/747ea034b2c12ee2f0c7aa38/pair/"+base+"/"+otraMoneda+"/"+cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), MonedaConvertida.class);
    }
}
