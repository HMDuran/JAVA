/* program that accepts an input grade in percentile format text box 1 and output 
its grade equivalent based on the given range of percentile and grade equivalent */

import javax.swing.JOptionPane;

public class ExerciseEIGHT{

public static void main (String args[]){

String input;
int gr;

input = JOptionPane.showInputDialog("Enter the Grade: ");
gr = Integer.parseInt(input);

if(gr >= 98 && gr <=100 ){
JOptionPane.showMessageDialog(null, "The Grade is Equivalent to 1.00");}

else if (gr >=95 && gr <= 97) {
JOptionPane.showMessageDialog(null, "The Grade is Equivalent to 1.25 ");}

else if (gr >=92 && gr <= 94) {
JOptionPane.showMessageDialog(null, "The Grade is Equivalent to 1.50 ");}

else if (gr >= 89 && gr <= 91) {
JOptionPane.showMessageDialog(null, "The Grade is Equivalent to 1.75 ");}

else if (gr >=85 && gr <= 88) {
JOptionPane.showMessageDialog(null, "The Grade is Equivalent to 2.00 ");}

else if (gr >=82 && gr <= 84) {
JOptionPane.showMessageDialog(null, "The Grade is Equivalent to: 2.25 ");}

else{
JOptionPane.showMessageDialog(null, "The grade is Out of Range");}

System.exit(0);
}
}