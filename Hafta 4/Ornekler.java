package ornekler;
public class Ornekler {
    public static void main(String[] args) {
        //Örnek 1
        /*
        int f = 23;
        int c = (f-32)*5/9;
        System.out.println(c + " derece");
        */
        //Örnek 2
        /*
        int yas = 27;
        if(yas > 17) {
            System.out.println("Yetişkin");
        }else {
            if(yas > 5) {
                System.out.println("Çocuk");
            }else{
                System.out.println("Bebek");
            }
        }
        */
        //Örnek 3
        /*
        int sayi = 21;
        if(sayi % 2 == 0) {
            System.out.println("Çift");
        }else {
            System.out.println("Tek");
        }
        */
        //Örnek 4
        /*
        int vizeN=30, finalN=70;
        int YSS = (int) (vizeN*0.4+finalN*0.6);
        if(YSS > 50) {
            System.out.println("Geçti");
        }else{
            System.out.println("Kaldı");
        }
        */
        //Örnek 5
        /*
        int toplam=0,i=0,n=5;
        while(i<=n) {
            toplam += i;
            i++;
        }
        System.out.println(toplam);
    }   */
        //Örnek 6
        /*
        int a=15, b=25;
        while(a!=b) {
            if(a>b) {
                a=a-b;
            }
            b=b-a;
        }
        System.out.println(a);
        */
        //Örnek 7
        /*
        int sayi1=17, sayi2=25, i=2, obeb=1;
        while(i<=sayi1) {
            if(sayi1%i==0 && sayi2%i==0){
                obeb = i;
            }
            i++;
        }
        System.out.println(obeb);
       */
        //Örnek 8
        /*
        int a=0, b=1, n=15, c=0, i=2;
        System.out.print(a + " " + b);
        while(i<=n) {
            c = a+b;
            a=b;
            b=c;
            i++;
            System.out.print(" "+c);
        }
        */
    }
}
