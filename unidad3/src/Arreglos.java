public class Arreglos {
    static void main() {

        System.out.println("Los nombres que empiezan por la letra j: ");
        String []nombres={"juan","karen","junior","camila","sergio"};
        for(int i=0; i<nombres.length; i++){
            char primerLetra= nombres[i].charAt(0);
            if(primerLetra =='j'){
                System.out.println(nombres[i]);
            }
        }

        System.out.println("-----------");

        System.out.println("Edades mayores a 18: ");
        int []edades={20,18,17,16,15};
        for(int i=0; i<edades.length; i++){
            if(edades[i]>=18){
                System.out.println(edades[i]);
            }
        }

    }
}
