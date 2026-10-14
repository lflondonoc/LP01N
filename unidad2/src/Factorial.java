public class Factorial {
    static void main() {
        int numero= Repositorio.ingresarEntero("Ingrese un número: ");
        int factorial= calcularFactorial(numero);
        Repositorio.mostrarMensaje("El factorial de "+numero+ " es: "+factorial);

    }
    public static int calcularFactorial(int numero){
        int factorial=0;

        for(int i=1; i<=numero; i++){

        }
        return factorial;
    }
}
