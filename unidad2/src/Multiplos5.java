public class Multiplos5 {
    static void main() {
        int contadorMultiplos= contarMultiplos();
        Repositorio.mostrarMensaje("la cantidad de múltiplos de 5 es: "+contadorMultiplos);

    }
    public static int contarMultiplos(){
        int contadorMultiplos=0;
        for(int i=1; i<=15; i++){
            if(i%5==0){
                contadorMultiplos++;
            }
        }
        return contadorMultiplos;
    }
}
