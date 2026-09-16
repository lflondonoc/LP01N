import java.util.Scanner;

public class Funciones {
    static void main() {
        //Invocar funiones en el main
        int numero1= Repositorio.ingresarEntero("Ingrese número 1: ");
        int numero2= Repositorio.ingresarEntero("Ingrese número 2: ");
        int edad= Repositorio.ingresarEntero("Ingrese su edad: ");
        String nombre= Repositorio.ingresarTexto("Ingrese su nombre: ");
        double estatura= Repositorio.ingresarDecimal("Ingrese su estaura: ");
        boolean esMayor= Repositorio.ingresarBooleano("¿Es mayor de edad?: ");

    }

}
