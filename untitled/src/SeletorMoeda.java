import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SeletorMoeda {
    private String moeda;


    String endereco = "https://v6.exchangerate-api.com/v6/e638228507a12c4117fa4588/latest/USD";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco)).GET()
            .build();

    HttpResponse<String> resposta = client
            .send(request, HttpResponse.BodyHandlers.ofString());



    JsonElement elemento = JsonParser.parseString(resposta.body());
    JsonObject objectRoot = elemento.getAsJsonObject();

    JsonObject conversionRates = objectRoot
            .getAsJsonObject("conversion_rates");



    public SeletorMoeda() throws IOException, InterruptedException {
    }

    double cambio(String moeda){
        return conversionRates.get(moeda).getAsDouble();
    }


}
