import java.util.Scanner;

public class loopdemo {
    public static void main(String[] args) {
        System.out.println("hii");
        

        for (int i=1; i<=10; i++){
            System.out.println("hello");

            for (int n=1; n<=100; n++) {
                System.out.println(n);
            }
        }
       for (int i=1; i<=5; i++){
        if  (i==4) {
        continue;
        }
         System.out.println(i);

       }
       //while (true) {
         //System.out.println("hii");
       //}

       System.out.println("enter your age: ");
       Scanner sc=new Scanner(System.in);
       int age=sc.nextInt();
       if(age>=18){
        System.out.println("you can vote");
       }else{
        System.out.println("you cannot vote");
       }
       System.out.println("what is your name?");
       String name=sc.next();
       System.out.println("welcome: "+name);


       System.out.println("welcome,do you want to continue: (yes/no)");
       String user_choice=sc.next();
       while (user_choice.equals("YES")) {
        System.out.println("DO THIS WORK");
       }


    }
}
