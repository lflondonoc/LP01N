import java.util.Scanner;

public class Jardineria {

    static void main() {

        Scanner sc = new Scanner(System.in);

        //1. Solicitar la longitud
        System.out.print("Ingrese la longitud en centimétros: ");
        int longitud= sc.nextInt();

        //2. Solicitar el ancho
        System.out.print("Ingrese el ancho en centimétros: ");
        int ancho= sc.nextInt();

        //3. Calcular la superficie
        int area= longitud*ancho;

        //4.Construir el mensaje
        String mensaje= "El valor de la longitud es: "+longitud+", el valor del ancho es de: "+ancho+". Por lo tanto la superficies es: "+area;

        //5. Mostrar el mensaje
        System.out.println(mensaje);



    }
}
