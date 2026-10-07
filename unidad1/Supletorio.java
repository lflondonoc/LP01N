public class Supletorio {
    static void main() {
        //1.Solicitar supletorio
        String solicitud= Repositorio.ingresarTexto("¿Usted solicitud el supletorio?: ");
        //2. Determinar presentación supletorio
        String mensaje= determinarSupletorio(solicitud);
        //3. Mostrar mensaje
        Repositorio.mostrarMensaje(mensaje);

    }
public static String determinarSupletorio(String solicitud){
    String mensaje="";
    if(solicitud.equals("si")) {
        int dias = Repositorio.ingresarEntero("¿cuántos dias han pasado desde la fecha del supletório?: ");
        if (dias <= 5) {
            String recibo = Repositorio.ingresarTexto("¿tiene el recibo de pago?: ");
            if (recibo.equals("si")) {
                mensaje = "Puede presentar el supletorio";
            } else {
                mensaje = "Debe presentar el recibo";
            }
        } else {
            mensaje = "Supero el tiempo  limite";
        }
    }else{
        mensaje="No puede presentar el supletorio";
    }
    return mensaje;
}

}