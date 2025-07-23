public class LMSOperators {
    public static void main(String[] args) {
        // variables
        int studentID=101;
        String studentName="Rakshitha";
        byte age=20;
        byte quizScore=80;
        byte assignmentScore=70;
        byte examScore=80;
        double attendance=80;



        double totalScore=quizScore+assignmentScore+examScore;
        double averageScore=totalScore/3;



        boolean isStudentPassed=averageScore >=75;


        attendance++;

        boolean studentQualifiedAward=attendance>=80 && isStudentPassed;
        System.out.println("student Name: "+studentName);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+averageScore);
        System.out.println("Updated Attendance: "+attendance);



        System.out.println("Student Passed: "+isStudentPassed);
        System.out.println("Student Awarded: "+studentQualifiedAward);





        
    }
    
}
