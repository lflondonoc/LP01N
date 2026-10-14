public class SumaNumeros {
    static void main() {
        int sumaNumeros= sumarNumeros();
        Repositorio.mostrarMensaje("La suma de los números de 1 al 10 es: "+sumaNumeros);

    }
    public static int sumarNumeros(){
        int sumaNumeros=0;

        int i=1;
        while(i<=10){
            sumaNumeros= sumaNumeros+i;

            i++;
        }
        return  sumaNumeros;
    }
}
