public class ParqueDiversiones2 {
    static void main() {
        Repositorio.mostrarMensaje("======BIENVENIDOS A LA ATRACCION======");
        int edad= Repositorio.ingresarEntero("Ingrese su edad: ");
        double estatura=Repositorio.ingresarDecimal("Ingrese su estatura: ");
        String mensaje= verificarAcceso(edad, estatura);
        Repositorio.mostrarMensaje(mensaje);
    }
    public static String verificarAcceso(int edad, double estatura){
        String mensaje="";
        if(edad>=18 && estatura>=1.50){
                mensaje = "Puede ingresar a la atracción!!!!";
        }else if(edad>=18 && estatura<=1.50){
                mensaje = "No puede ingresar, estatura no válida";
        }else{
            mensaje = "No puede ingresar, es menor de edad!!";
        }
        return mensaje;
    }
}
