/* program that determines the class of the Ship depending on its class ID (identifier). Here are the criteria. 
The Class ID serves as the input data and the class of the ship serves as the output information. 
Your program should be able to handle both capital and lower case letter as input data */

import javax.swing.JOptionPane;

public class ExerciseNINE {

    public static void main(String args[]) {

        String Input;
        char classid;

        Input = JOptionPane.showInputDialog("Enter the class ID: ");
        classid = Input.charAt(0);

        if (classid == 'B' || classid == 'b') {
            JOptionPane.showMessageDialog(null, "The Ship Class is Battleship");
        }

        else if (classid == 'C' || classid == 'c') {
            JOptionPane.showMessageDialog(null, "The Ship Class is Cruiser");
        }

        else if (classid == 'D' || classid == 'd') {
            JOptionPane.showMessageDialog(null, "The Ship Class is Destroyer");
        }

        else if (classid == 'F' || classid == 'f') {
            JOptionPane.showMessageDialog(null, "The Ship Class is Frigate");
        }

        System.exit(0);

    }
}