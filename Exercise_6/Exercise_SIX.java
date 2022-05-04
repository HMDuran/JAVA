/* program that will compute the final grade of the student.
Use this formula: Final_Grade = 50% Exam + 30% Quizzes + 10% Class Standing + 10% Attendance */
import javax.swing.JOptionPane;

public class Exercise_SIX {

    public static void main(String args[]) {

        String input;
        int Ex, Qz, Cs, Ad;
        double ave;

        input = JOptionPane.showInputDialog("Enter the Exam:");
        Ex = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the Quizzes:");
        Qz = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the Class Standing:");
        Cs = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the Attendance:");
        Ad = Integer.parseInt(input);

        ave = (Ex * 0.5) + (Qz * 0.3) + (Cs * 0.1) + (Ad * 0.1);

        JOptionPane.showMessageDialog(null, "The Grade of the student is: " + ave);

        System.exit(0);
    }
}
