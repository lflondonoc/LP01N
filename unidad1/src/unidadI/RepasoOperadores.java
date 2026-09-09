public class RepasoOperadores {
    static void main() {
        boolean a= (20>40 && 2<=10) || (32<50 && 20<=20);
        System.out.println(a);

        boolean b= (15-6*2>5 && (4+3)<2*5) || (8%3==2 && 10/2>=5);
        System.out.println(b);

        boolean c= (3>8||12<=15) && (25<30||7!=7);
        System.out.println(c);

        boolean d= (20/4==5 && (3*2+2)<=11) || (12%5>2 && (10-5)*3 >=15);
        System.out.println(d);

        boolean e= ((4*5+2)/3>5 && Math.pow(6,2)/3<15) ||(25%4==3 && 10/3*2>=6);
        System.out.println(e);

        boolean f= (5+3*2<2*4 && 18-3*2>10) || (15/3==5 && 10/3+2>=5);
        System.out.println(f);

    }
}
