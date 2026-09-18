public class PracticaFunciones {

    static void main() {
        //Invocación a las funciones
        int numero= Repositorio.ingresarEntero("Ingrese el número: ");
        int numeroCuadrado= calcularNumeroCuadrado(numero);
        Repositorio.mostrarMensaje("El resultado es: "+numeroCuadrado);

    }
    public static int calcularNumeroCuadrado(int numero){
        int resultado= numero*numero+5;
        return resultado;
    }

}
