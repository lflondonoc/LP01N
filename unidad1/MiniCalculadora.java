public class MiniCalculadora {
    static void main() {
        int numero1= Repositorio.ingresarEntero("Ingresar primer número: ");
        int numero2= Repositorio.ingresarEntero("Ingresar segundo número: ");
        char operacion= Repositorio.ingresarCaracter("Selecione una de las siguientes operaciones(+,-,*,/):");
        double resultado= calcularOperacion(numero1, numero2, operacion);
        Repositorio.mostrarMensaje("El resultado de la operación "+numero1+" "+operacion+" "+numero2+" = "+(int)resultado);

    }
    public static double calcularOperacion(int numero1, int numero2, char operacion){
        double resultado=0;
        switch (operacion){
            case '+':
                resultado= numero1+numero2;
                break;
            case '-':
                resultado= numero1-numero2;
                break;
            case '*':
                resultado= numero1*numero2;
                break;
            case '/':
                resultado= numero1/numero2;
                break;
        }
        return resultado;

    }
}
