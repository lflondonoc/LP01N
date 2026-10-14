public class CantidadParesImpares {
    static void main() {
        int contadorPares= contarPares();
        int contadorImpares= contarImpares();
        Repositorio.mostrarMensaje("La cantidad de pares del 1 al 5 es: "+contadorPares+" y la cantidad de impares es: "+contadorImpares);

    }
    public static int contarPares(){
        int contadorPares=0;

        int i=1;
        while (i<=5){
            if (i % 2 == 0) {
                contadorPares= contadorPares+1;
            }
           i++;
        }
        return contadorPares;
    }
    public static int contarImpares(){
        int contadorImpares=0;

        int i=1;
        while (i<=5){
            if (i % 2 != 0) {
                contadorImpares= contadorImpares+1;
            }
            i++;
        }
        return contadorImpares;
    }
}
