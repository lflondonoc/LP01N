public class DoWhile {
    static void main() {
        String mensaje= imprimirPalabra();
        Repositorio.mostrarMensaje(mensaje);

    }
    public static String imprimirPalabra(){
        String mensaje="";
        int i=1;
        do{
            mensaje += "hola"+"\n";
            i++;
        }while(i<=5);
        return mensaje;
    }
}
