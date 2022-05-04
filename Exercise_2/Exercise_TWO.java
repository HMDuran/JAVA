/* program that will accept the student prelim, midterm and final grade then compute its average. 
For Prelim 30%, midterm 30% and Final 40% */

import javax.swing.JOptionPane;

public class Exercise_TWO {

    public static void main(String args[]) {

        String input;
        int Pg, Mg, Fg;
        double ave;

        input = JOptionPane.showInputDialog("Enter the Prelim Grade:");
        Pg = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the Midterm Grade:");
        Mg = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the Final Grade:");
        Fg = Integer.parseInt(input);

        ave = (Pg * 0.3) + (Mg * 0.3) + (Fg * 0.4);

        JOptionPane.showMessageDialog(null, "The Final Grade is: " + ave);

        System.exit(0);
    }
}


