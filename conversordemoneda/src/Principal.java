import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal extends ConvertirMoneda implements IndentificarMoneda{

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        ConvertirMoneda accion = new ConvertirMoneda();

        String menu= """
                ***********************************************
                *** Sea Bienvenido/a al conversor de monedas =]  ***
                1) Dolar =>>> peso Argentino
                2) peso Argentino  =>>> Dolar
                3) Dolar =>>> Real Brasileño
                4) Real Brasileño =>>> Dolar
                5) Dolar =>>> peso Colombiano
                6) peso Colombiano=>>> Dolar
                9) Salir
                """;
        String valor1;
        String valor2;


        int Accion =0;
        try {
        while(Accion!=9) {
            System.out.println(menu);
             Accion = Integer.parseInt(teclado.nextLine());




            switch (Accion){


                case 1:
                    valor1=Dolar;
                    valor2=PesoArgentino;
                   accion.Conversiona(valor1,valor2);
                    break;
                case 2:
                    valor1=PesoArgentino;
                    valor2=Dolar;
                    accion.Conversiona(valor1,valor2);
                    break;
                    case 3:
                    valor1=Dolar;
                    valor2=RealBrasileño;
                   accion.Conversiona(valor1,valor2);
                    break;
                case 4:
                    valor1=RealBrasileño;
                    valor2=Dolar;
                    accion.Conversiona(valor1,valor2);
                    break;
                    case 5:
                    valor1=Dolar;
                    valor2=PesoColombiano;
                   accion.Conversiona(valor1,valor2);
                    break;
                case 6:
                    valor1=PesoColombiano;
                    valor2=Dolar;
                    accion.Conversiona(valor1,valor2);
                    break;

                    case 9:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida");

        }
        }
    } catch (NumberFormatException e) {
            System.out.println("Cantidad incorrecta");

            return;
        }

    }

    @Override
    public String getTagecode() {
        return null;
    }
}
