/* program that will accept two integers. 
If two unique numbers are equal print the equal numbers otherwise print the higest number.*/

import javax.swing.JOptionPane;

public class ExerciseFOUR {

    public static void main(String args[]) {

        String input;
        int frnum, scnum;

        input = JOptionPane.showInputDialog("Enter the first number: ");
        frnum = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the second number: ");
        scnum = Integer.parseInt(input);

        if (frnum == scnum) {
            JOptionPane.showMessageDialog(null, "The number is equal to: " + frnum);
        }

        else if (frnum > scnum) {
            JOptionPane.showMessageDialog(null, "The highest number is: " + frnum);
        }

        else {
            JOptionPane.showMessageDialog(null, "The highest number is: " + scnum);
        }

        System.exit(0);
    }
}