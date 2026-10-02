public class DecisionesSwitch {
    static void main() {
        int edad= Repositorio.ingresarEntero("Ingrese su edad: ");
        String mensaje= verificarEdad(edad);
        Repositorio.mostrarMensaje(mensaje);


    }
    public static String verificarEdad(int edad){
        String mensaje="";
        if(edad>=18){
            mensaje = "Mayor de edad.";
        }else{
            mensaje = "Menor de edad.";
        }
        return mensaje;

    }

}
