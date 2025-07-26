public class lms_task {
    public static void main(String[] args) {
        int studentid=23;
        String studentname="Rakshitha";
        int studentage=19;
        int scoreassignment=79;
        int scorequiz=23;
        int scoreexam=80;
       int  attendancespercentage=85;

       double totalscore= scoreassignment+scorequiz+scoreexam;
       double averagescore= scoreassignment+scorequiz+scoreexam/3;

       String result= (averagescore>=75)? "pass": "fail" ;
       boolean isstudentpassed=averagescore >=75;

               boolean isQualified = (isstudentpassed  && attendancespercentage  >= 80);


       System.out.println("Studentid" +studentid);
       System.out.println("Studentnam" +studentname);
       System.out.println("Studentage" +studentage);
       System.out.println("Scoreassignment" +scoreassignment);
       System.out.println("Scorequiz" +scorequiz);
       System.out.println("Scoreexam" +scoreexam);
       System.out.println("Attendancespercentage" +attendancespercentage);
        System.out.println("Total Score:"+ totalscore);
        System.out.println("Average Score:"+ averagescore);
        System.out.println("results:"+ result);
        System.out.println("Updated Attendance Percentage:"+ attendancespercentage +"%");
        System.out.println("Is Student Qualified? :"+ isQualified);

    }
}
