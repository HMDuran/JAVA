// program that will accept three unique numbers and display the highest and lowest number. 

import javax.swing.JOptionPane;

public class ExerciseFIVE{

public static void main (String args[]){

String input;
int frnum, scnum, trnum;

input = JOptionPane.showInputDialog("Enter the first number: ");
frnum = Integer.parseInt(input);

input = JOptionPane.showInputDialog("Enter the second number: ");
scnum = Integer.parseInt(input);

input = JOptionPane.showInputDialog("Enter the third number: ");
trnum = Integer.parseInt(input);

if(frnum>scnum && frnum>trnum){
JOptionPane.showMessageDialog(null, "The highest number is:"+frnum);}

	else if (scnum>frnum && scnum>trnum){
	JOptionPane.showMessageDialog(null, "The highest number is:"+scnum);}

	else{
	JOptionPane.showMessageDialog(null, "The highest number is:"+trnum);}

if(frnum<scnum &&frnum < trnum){
JOptionPane.showMessageDialog(null, "The lowest number is:"+frnum);}


	else if (scnum<frnum && scnum<trnum){
	JOptionPane.showMessageDialog(null, "The lowest number is:"+scnum);}

	else{
	JOptionPane.showMessageDialog(null, "The lowest number is:"+trnum);}

System.exit(0);
}
}