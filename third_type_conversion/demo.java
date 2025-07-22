package third_type_conversion;

public class demo {
    public static void main(String[] args) {
        int num1 =20;
        double num2=num1;
        System.out.println("original value:"+num1);
        System.out.println("original value:"+num2);
        
        double num3=5.67;
        int num4=(int)num3;
        System.out.println("original value:"+num3);
        System.out.println("original value:"+num4);
        
        int zip=500053;
        //string str_zip=(string)zip;
        String str_zip = String.valueOf(zip);
        System.out.println("original value:"+zip);
        System.out.println("original value:"+str_zip+5);
        System.err.println(str_zip+10);
        String str_zip_new ="500053";
        int zip_new = Integer.parseInt(str_zip_new);
        System.out.println("original value:"+str_zip_new);
        System.out.println("converted value:"+zip_new);
        System.out.println(zip_new+10);
        String str_zip_new1 ="500053";
        int zip_new1 = Integer.parseInt(str_zip_new1);
        System.out.println("original value:"+str_zip_new1);
        System.out.println("converted value:"+zip_new);
        System.out.println(zip_new-10);
        short num7=40;
        int num8=num7;
         System.out.println("original value:"+num7);
        System.out.println("converted value:"+num8);

        
        

        



    }
    
}
