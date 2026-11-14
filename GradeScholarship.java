import java.util.Scanner;

public class GradeScholarship {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter your name:");
      String name = input.nextLine();
      
      System.out.print("Enter your average:");
      double average = input.nextDouble();
      
      System.out.print("Do you have any failing grades? (Yes/No): ");
      String failingGrades = input.next();

      if(average >= 95 && failingGrades.equalsIgnoreCase("No")) {
          System.out.println("Student: " + name);
         System.out.println("Result: Full Scholarship");
      }
      else if(average >= 90 && failingGrades.equalsIgnoreCase("No")) {
          System.out.println("Student: " + name);
         System.out.println("Result: Partial Scholarship");
      }
      else if(average <= 0 || average >= 100) {
          System.out.println("Student: " + name);
         System.out.println("Result: Invalid Input");
      }
      else {
         System.out.println("Student: " + name);
         System.out.println("Result: Not Eligible");
      }

      input.close();
   }
}

   



      
    
