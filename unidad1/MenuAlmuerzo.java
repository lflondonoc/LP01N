public class MenuAlmuerzo {
    static void main() {
        //1. Solicitar ingredientes
        String ingrediente= Repositorio.ingresarTexto("¿Cuál de estos ingredientes tiene (pollo, carne, pescado)?: ");
        //2. Determinar menú
        String menu= determinarMenu(ingrediente);
        //3. Mostrar menú
        Repositorio.mostrarMensaje(menu);
    }
    public static String determinarMenu(String ingrediente){
        String mensaje= "";
        if(ingrediente.equals("pollo")){
            String verduras= Repositorio.ingresarTexto("¿Tiene verduras (si/no)?: ");
            if (verduras.equals("si")){
                String arroz= Repositorio.ingresarTexto("¿Tiene arroz (si/no)?:");
                if (arroz.equals("si")){
                    mensaje= "Puede preparar pollo con arroz y verduras";
                }else{
                    mensaje = "Puede preparar pollo con verduras";
                }
            }else{
                mensaje ="Preparar pollo a la plancha.";
            }
        }else if(ingrediente.equals("carne")){
            String tortillas= Repositorio.ingresarTexto("¿Tiene tortillas (si/no)?: ");
            if(tortillas.equals("si")){
                mensaje = "Puede preparar tacos!!!";
            }else{
                mensaje = "Puede preparar carne con ensalada";
            }
        }else if(ingrediente.equals("pescado")){
            String limon= Repositorio.ingresarTexto("¿Tiene limón (si/no)?: ");
            if(limon.equals("si")){
                mensaje = "Puede preparar pescado al limón";
            }else{
                mensaje = "Puede preparar pescado a la plancha";
            }
        }else{
            mensaje = "Opción no válida";
        }
        return  mensaje;
    }
}
