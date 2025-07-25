public class seven_program {
    public static void main(String[] args) {
        int num=-10;
        System.out.println("the number is positive");
        if (num>0) {
        System.out.println("the number is positive");
        } else {
            System.out.println("the number is negative");
        }
        int age=18;
        if(age>=18) {
            System.out.println("you can vote");

        } else {
            System.out.println("you cannot vote");
        }

        int avg_Score=40;
        if (avg_Score>=90) {
            System.out.println("a grade");
        } else if (avg_Score>=75) {
             System.out.println("b grade");

        } else if (avg_Score>=60){
            System.out.println("c grade");
        } else if(avg_Score>=50){
            System.out.println("d grade");

        } else if (avg_Score>=50){
            System.out.println("e grade");
        } else {
              System.out.println("failed");
        }
        
        int choice =6;
        switch (choice) {
            case 1:
            System.out.println("a selected");
            
                break;
            case 2:
            System.out.println("b selected");
                 break;
            case 3:
            System.out.println("c selected");
                 break;
            case 4:
            System.out.println("d selected");
                 break;
            default:
            System.out.println("Invalid choice");
                break;
        }

    }

}
