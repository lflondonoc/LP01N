public class Ciclos {
    static void main() {
        String numero= imprimirNumeros();
        Repositorio.mostrarMensaje(numero);

    }
    public static String imprimirNumeros(){
        String numero="";
        int i=20;
        while(i>=10){
            numero += i+"\n";
            i--;
        }
        return  numero;
    }

}

