import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ObtenerDatosMoneda extends Principal {

    public Moneda buscaMoneda(int  numerodeAccion, String valor1,String valor2) throws IOException, InterruptedException {

          Principal Datos = new Principal();



        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9ca00bd1cdc3e27ad9a431b7/pair/"+valor1+"/"+valor2+"/"+numerodeAccion);
        // URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9ca00bd1cdc3e27ad9a431b7/latest/USD");



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());




        String json= response.body();
        //System.out.println(json);

        Gson gson = new Gson();

        Moneda miMonedaOmdb = gson.fromJson(json, Moneda.class);


        MonedaDatos miMoneda = new MonedaDatos(miMonedaOmdb);



        System.out.println("El valor de "+numerodeAccion+" "+miMoneda.getMonedaAconvertir()+" es equivalente a "+miMoneda.getValorMonedaTotal()+" "+miMoneda.getMonedaConvertida());

        return miMonedaOmdb;
    }

}
