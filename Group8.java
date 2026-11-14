
import java.util.Scanner;

public class Group8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student Full Name:");
        String name = input.nextLine();

        System.out.println("Enter Student ID Number:");
        String idNumber = input.nextLine();

        System.out.println("Enter Prelim Grade:");
        double prelim = input.nextDouble();

        System.out.println("Enter Midterm Grade:");
        double midterm = input.nextDouble();

        System.out.println("Enter Final Grade:");
        double finalGrade = input.nextDouble();

        System.out.println("Enter Attendance Percentage:");
        double attendance = input.nextDouble();

        System.out.println("Enter Number of Disciplinary Violations:");
        int violations = input.nextInt();

        if (prelim < 0 || prelim > 100 || midterm < 0 || midterm > 100 || finalGrade < 0 || finalGrade > 100 || attendance < 0 || attendance > 100 ||
        violations < 0) {

        System.out.println("Invalid Input!");
        return;
        }

        double finalAverage = (prelim * 0.30) + (midterm * 0.30) + (finalGrade * 0.40);

        String academicStanding;

        if (finalAverage >= 97 && finalAverage <= 100) {
            academicStanding = "Outstanding";
        }
        else if (finalAverage >= 93) {
            academicStanding = "Excellent";
        }
        else if (finalAverage >= 90) {
            academicStanding = "Very Good";
        }
        else if (finalAverage >= 85) {
            academicStanding = "Good";
        }
        else if (finalAverage >= 75) {
            academicStanding = "Passed";
        }
        else {
            academicStanding = "Failed";
        }

        String attendanceEvaluation;

        if (attendance >= 95 && attendance <= 100) {
            attendanceEvaluation = "Excellent Attendance";
        }
        else if (attendance >= 90) {
            attendanceEvaluation = "Satisfactory Attendance";
        }
        else {
            attendanceEvaluation = "Poor Attendance";
        }

        String recognition;

        if (finalAverage >= 95 &&
            attendance >= 95 &&
            violations == 0) {

            recognition = "ELIGIBLE FOR ACADEMIC RECOGNITION";
        }
        else {
            recognition = "NOT ELIGIBLE FOR ACADEMIC RECOGNITION";
        }

        String remark;

        if (finalAverage < 75) {
            remark = "RECOMMENDED FOR ACADEMIC INTERVENTION";
        }
        else if (attendance < 90) {
            remark = "ATTENDANCE IMPROVEMENT REQUIRED";
        }
        else if (violations >= 1) {
            remark = "DISCIPLINARY RECORD FOR REVIEW";
        }
        else {
            remark = "GOOD ACADEMIC STANDING";
        }

        System.out.println("STUDENT ASSESSMENT REPORT");

        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + idNumber);

        System.out.println("ACADEMIC RESULTS");

        System.out.println("Preliminary: " + prelim);
        System.out.println("Midterm: " + midterm);
        System.out.println("Final: " + finalGrade);

        System.out.println("Final Average: " + finalAverage);

        System.out.println("Academic Standing: " + academicStanding);

        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Attendance Evaluation: " + attendanceEvaluation);

        System.out.println("Disciplinary Violations: " + violations);

        System.out.println("\n" + recognition);

        System.out.println("Final Remark: " + remark);

        input.close();
    }
}