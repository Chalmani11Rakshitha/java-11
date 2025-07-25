public class test {
    public static void main(String[] args) {
        
        int age=21;
        if (age<=4){
            System.out.println("Toddler");

        } 
        else if (age<=5 && age<=12){
          System.out.println("child");
        } else if(age>=13 && age<=19){
            System.out.println("Teenager");
        } else if (age>=20 && age<=26){
            System.out.println("young adult");
        } else {
            System.out.println("adult");
        }
        
        String category;
        
        switch (age) {
            case 0:
                System.out.println("Toddler");

                break;
            case 1:
            System.out.println("Toddler");
                break;
            case 2:
            System.out.println("Toddler");
                break;
            default:
                break;
        }
          int day=9;
          switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                  System.out.println("weeekday");
                  break;
                case 6:
                case 7:
                  System.out.println("weekend");

          
            default:
                 System.out.println("Invalid day");
                
          }

    }
    
}
