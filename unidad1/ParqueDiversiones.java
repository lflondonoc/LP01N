public class ParqueDiversiones {
    static void main() {
        Repositorio.mostrarMensaje("======BIENVENIDOS A LA ATRACCION======");
        int edad= Repositorio.ingresarEntero("Ingrese su edad: ");
        String acceso= verificarAcceso(edad);
        Repositorio.mostrarMensaje(acceso);
    }
    public static String verificarAcceso(int edad){
        String mensaje="";
        if(edad>=18){
            double estatura=Repositorio.ingresarDecimal("Ingrese su estatura: ");
            if(estatura>=1.50){
                mensaje = "Puede ingresar a la atracción!!!!";
            }else{
                mensaje = "No puede ingresar, estatura no válida";
            }
        }else{
            mensaje = "No puede ingresar, es menor de edad!!";
        }
        return mensaje;
    }
}

