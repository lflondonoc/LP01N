public class OperadoresLogicos {
    static void main() {
        //Operadores lógicos AND(&&)
        boolean a= 3>5 && 4<2;
        System.out.println(a);

        boolean b= 3*2 == 2*3 && Math.pow(2, 3) >Math.pow(1,2);
        System.out.println(b);

        boolean c= 1+4-8 != 2*4/8 && 3*7+1 >= 2*8;
        System.out.println(c);

        boolean d= 7+3 == 3+7 && 6*2 <= 2*6;
        System.out.println(d);

        boolean tengoDinero= true;
        boolean estaLloviendo= false;
        boolean salgo= tengoDinero && estaLloviendo;
        System.out.println("¿Puedo salir?:"+salgo);

        //Operadores lógicos OR(||)
        boolean e= 8>5 || 4<2;
        System.out.println(e);

        boolean f= 3*2 == 2*3 || Math.pow(2, 3) >Math.pow(1,2);
        System.out.println(f);

        boolean g= 3+2-4 != 2*2/4 || 3*4+8 >= 2*2*4;
        System.out.println(g);

        boolean h= 5>9 || 2*4< Math.pow(4,2);
        System.out.println(h);

        boolean haceSol= false;
        boolean esDomingo= false;
        boolean playa= haceSol || esDomingo;
        System.out.println("¿Voy a la playa?: "+playa);

        //Negación NOT (!=)
        boolean i= !(8>5);
        System.out.println(i);

        boolean j= !(3*2==2*3);
        System.out.println(j);


    }
}
