public class CantidadVocales {
    static void main() {
        String nombre= Repositorio.ingresarTexto("Ingrese su nombre: ");
        int cantidadVocales= determinarCantidadVocales(nombre);
        int cantidadConsonantes= determinarCantidadConsonates(nombre);
        Repositorio.mostrarMensaje("La cantidad de vocales que tiene el nombre "+nombre+" es: "+cantidadVocales+" y la cantidad de consonantes es: "+cantidadConsonantes);

    }
    public static int determinarCantidadVocales(String nombre){
        int cantidadVocales=0;

        for(int i=0; i<nombre.length(); i++){
            char letra= nombre.charAt(i);
            if(Repositorio.determinarVocal(letra)){
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }
    public static int determinarCantidadConsonates(String nombre){
        int cantidadConsonantes=0;

        for(int i=0; i<nombre.length(); i++){
            char letra= nombre.charAt(i);
            if(!Repositorio.determinarVocal(letra)){
                cantidadConsonantes++;
            }
        }
        return cantidadConsonantes;
    }
}
