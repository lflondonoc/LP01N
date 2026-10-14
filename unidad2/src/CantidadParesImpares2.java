public class CantidadParesImpares2 {
    static void main() {
        String mensaje= mostrarParesImpares();
        Repositorio.mostrarMensaje(mensaje);

    }
    public static String mostrarParesImpares(){
        String mensaje="";
        int contadorPares=0;
        int contadorImpares=0;

        for(int i=1; i<=5; i++){
            if(i%2==0){
                contadorPares = contadorPares+1;
            }else{
                contadorImpares = contadorImpares+1;
            }
        }
        mensaje += "La cantidad de pares del 1 a 5 es: "+contadorPares+" y la cantidad de impares es: "+contadorImpares;
        return  mensaje;
    }
}
