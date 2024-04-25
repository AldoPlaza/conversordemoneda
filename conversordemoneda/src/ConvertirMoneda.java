import java.io.IOException;
import java.util.Scanner;

public class ConvertirMoneda  {



    public ObtenerDatosMoneda Conversiona(String valor1, String valor2) throws IOException, InterruptedException {
        ObtenerDatosMoneda consulta = new ObtenerDatosMoneda();
              Scanner Cantidad = new Scanner(System.in);
        // var numerodeAccion = Integer.valueOf(teclado.nextLine());



        //

        try {
            System.out.println("Ingresa la cantidad que deseas convertir: ");
            int numerodeAccion = Integer.valueOf(Cantidad.nextLine());
            String val=valor1;
            consulta.buscaMoneda(numerodeAccion,valor1,valor2);
;


        } catch (NumberFormatException e) {
            System.out.println("Cantidad incorrecta");
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicacion");
        }
        return consulta;
    }
}


