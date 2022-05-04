/*program that examines the input value of a variable nTemp (Temperature) 
then displays the following messages depending on the value assigned to nTemp variable.*/

import javax.swing.JOptionPane;

public class ExerciseTEN{

public static void main (String args[]){

String input;
double nTemp;

input = JOptionPane.showInputDialog("Enter the Temperature: ");
nTemp = Double.parseDouble(input);

if(nTemp < 0 ){
JOptionPane.showMessageDialog(null, "ICE");}

else if (nTemp >=0 && nTemp <=100) {
JOptionPane.showMessageDialog(null, "WATER");}

else{
JOptionPane.showMessageDialog(null, "STEAM");}

System.exit(0);
}
}