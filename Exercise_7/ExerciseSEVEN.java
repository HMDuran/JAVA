//program that will accpet two numbers.that will compute the remainder of the two number.

import javax.swing.JOptionPane;
public class ExerciseSEVEN{
		
public static void main(String args[]){

String input;
int num1, num2, rem;
			
input = JOptionPane.showInputDialog("Enter the First Number:");
num1 = Integer.parseInt(input);

input = JOptionPane.showInputDialog("Enter the Second Number:");
num2 = Integer.parseInt(input);

rem = num1%num2;

JOptionPane.showMessageDialog(null, "The Remainder is: "+rem);
	
System.exit(0);
}
}

