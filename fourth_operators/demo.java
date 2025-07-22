package fourth_operators;

public class demo {
    public static void main(String[] args) {
        int num1=10;
        int num2=50;
        int num3=40;
        int sum=num1+num2+num3;
        System.out.println("Sum: "+sum);

        int diff=num1-num2;
        System.out.println("Difference:"+diff);
        System.out.println("Product: "+(num1*num2*num3));
        System.out.println("Division: "+(num1/num2/num3));
        System.out.println("Modulus:"+(num1/num2/num3));
        int a=40;
        System.out.println("A: "+a);
        System.out.println("++A: "+ ++a);
        System.out.println("A++: "+ a++);

        System.out.println("++A: "+ --a);
        System.out.println("A++: "+ a--);
        System.out.println("A: "+a);
        System.out.println("--A: "+ --a);
        System.out.println("A--: "+a--);
        System.out.println("A: "+a);
        int num = 20;
        num+=10;
        System.out.println("Number is: "+num);
        num*=10;
        System.out.println("Number is: "+num);
        int X =40;
        int Y =10;
        System.out.println("X is greater than Y: "+(X>Y));
        System.out.println("X is equal than Y: "+(X==Y));
        System.out.println("Y is lesser than Y: "+(X<Y));
        int l=10;
        int n=15;
        int m=20;
        int o=30;

        boolean resultAND = l>m&&n>o;
        System.out.println(resultAND);
        boolean resultOR= l>m||n>o;
        System.out.println(resultAND);
        boolean resultNOT=l>m;
        System.out.println(!resultNOT);
        int valuea=10;
        int valueb=3;
        int valuec=5;
        int resultand=valuea&valueb&valuec;
        System.out.println(resultand);

        int resultor=valuea|valueb|valuec;
        System.out.println(resultor);

        int resultxor=valuea^valuec;
        System.out.println(resultxor);

        int valuee=3;
        System.out.println(valuee<<2);

        int valuef=3;
        System.out.println(valuee>>2);













        
    }
    
}
