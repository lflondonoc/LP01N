public class PracticaFunciones2 {

    //Constantes
    public static final double MITAD=2.0;

    static void main() {
        //1. Ingresar el número entero
        int numero= Repositorio.ingresarEntero("Ingrese e número: ");
        //2. Calcular la mitad del número
        double resultado= calcularMitad(numero);
        //3. Generar y mostrar el resultado
        Repositorio.mostrarMensaje("El resultado es: "+resultado);
        
    }
    //Calcular una función de tipo decimal que se va a llamar calcular mitad
    // Va a recibir como parámetro un número entero
    //Crear una variable de tipo decimal: La mitad del número
    //Retornar la variable
    public static double calcularMitad(int numero){
        double resultado= numero/MITAD;
        return  resultado;
    }

}
