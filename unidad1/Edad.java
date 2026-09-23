public class Edad {

    public static final int EDAD=18;

    static void main() {
        int edad= Repositorio.ingresarEntero("Ingrese su edad: ");
        String mensaje= verificarEdad(edad);
        Repositorio.mostrarMensaje(mensaje);

    }

    public static String verificarEdad(int edad){
        String mensaje="Su edad es: "+edad+" años y usted es: ";
        if(edad>=EDAD){
            mensaje += "Mayor de edad";
        }else{
            mensaje += "Menor de edad";
        }
        return mensaje;
    }
}
