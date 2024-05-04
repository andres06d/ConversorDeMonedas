import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    String convertir(String divisaOrigen, String divisaFinal, double monto) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .create();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/5ab1a150dafd3f485bde2692/pair/" + divisaOrigen + "/" + divisaFinal + "/"+monto))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        //System.out.println(json);


        Moneda moneda = gson.fromJson(json, Moneda.class);
      //  System.out.println(moneda);
        return moneda.toString();
    }
}
