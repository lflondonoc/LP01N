import java.util.Scanner;

public class Technology {

    static void main() {

        Scanner sc = new Scanner(System.in);
        //1. solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto= sc.nextDouble();

        //2. solicitar el descuento
        System.out.print("Ingrese el porcentaje de descuento: ");
        int descuento= sc.nextInt();

        //3. calcular valor final
        double precioFinal= precioProducto -(precioProducto*descuento/100);

        //4. construir mensaje
        String mensaje= "El valor del producto es: "+(int)precioProducto+", el descuento es de : "+descuento+" %. Por lo tanto, el valor a pagar es de: "+(int)precioFinal;

        //5. mostrar mensaje
        System.out.println(mensaje);
    }
}
