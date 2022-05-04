/* program that will accept two numbers, that will compute the sum, difference, 
product and qoutient of the two number.*/

import javax.swing.JOptionPane;
public class ExerciseONE{
	
public static void main(String args[]){

String input;
int num1, num2, sum, diff, pro, qou;

input = JOptionPane.showInputDialog("Enter the first number:");
num1 = Integer.parseInt(input);

input = JOptionPane.showInputDialog("Enter the second number:");
num2 = Integer.parseInt(input);

sum = num1 + num2;
diff = num1 - num2;
pro = num1*num2;
qou = num1/num2;

	
JOptionPane.showMessageDialog(null, "The sum is:"+sum+ "\nThe different is:" +diff+ "\nThe product is: "+pro+ "\nThe qoutient is: "+qou);

System.exit(0);
}
}