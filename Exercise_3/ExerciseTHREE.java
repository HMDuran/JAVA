/*program that will accept two unique numbers. 
If two unique numbers are equal do not print anything otherwise print the product of two numbers.*/

import javax.swing.JOptionPane;

public class ExerciseTHREE{

public static void main (String args[]){

String input;
int frnum, scnum, prod;

input = JOptionPane.showInputDialog("Enter the first number: ");
frnum = Integer.parseInt(input);

input = JOptionPane.showInputDialog("Enter the second number: ");
scnum = Integer.parseInt(input);

if(frnum==scnum){
JOptionPane.showMessageDialog(null, "");}

else{
prod = frnum*scnum;
JOptionPane.showMessageDialog(null, "The Product of two numbers: "+prod);}

System.exit(0);
}
}