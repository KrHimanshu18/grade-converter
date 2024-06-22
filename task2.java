
import java.util.Scanner;

class task2 {

    private String assignGrade(double percentage) {
        String grade;
        if (percentage >= 90) {
            grade = "AA";
        } else if (percentage >= 80) {
            grade = "AB";
        } else if (percentage >= 70) {
            grade = "BB";
        } else if (percentage >= 60) {
            grade = "BC";
        } else if (percentage >= 50) {
            grade = "CC";
        } else if (percentage >= 40) {
            grade = "CD";
        } else if (percentage >= 30) {
            grade = "DD";
        } else {
            grade = "F";
        }

        return grade;
    }

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("\nEnter the number of subjects: ");
        int numOfSub = keyboardInput.nextInt();
        String[] subjects = new String[numOfSub];

        keyboardInput.nextLine();

        for (int i = 0; i < numOfSub; i++) {
            System.out.print("Enter the subject " + (i + 1) + " : ");
            subjects[i] = keyboardInput.nextLine().toUpperCase();
        }

        double totalMarks = 0;

        System.out.print("\n");
        double[] marks = new double[numOfSub];
        for (int i = 0; i < numOfSub; i++) {
            System.out.print("Enter the marks obtained in " + subjects[i] + " : ");
            marks[i] = keyboardInput.nextDouble();
            totalMarks += marks[i];
        }

        double percentage = totalMarks / numOfSub;

        task2 obj = new task2();
        String grade = obj.assignGrade(percentage);

        System.out.println("\nTotal marks obtained : " + totalMarks);
        System.out.println("Average percentage : " + String.format("%.2f", percentage));
        System.out.println("Grade: " + grade);

        keyboardInput.close();
    }
}
