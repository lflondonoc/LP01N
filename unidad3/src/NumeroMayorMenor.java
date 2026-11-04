public class NumeroMayorMenor {
    static void main() {
        int [] numeros={2,3,7,8,10};
        int mayor= determinarMayor(numeros);
        int menor= determinarMenor(numeros);
        Repositorio.mostrarMensaje("El número mayor es: "+mayor+" y el número menor es: "+menor);
    }

    public static int determinarMayor(int[]numeros){
        int mayor= numeros[0];
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]>mayor){
                mayor= numeros[i];
            }
        }
        return  mayor;
    }
    public static int determinarMenor(int[]numeros){
        int menor= numeros[0];
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]<menor){
                menor= numeros[i];
            }
        }
        return  menor;
    }
}
