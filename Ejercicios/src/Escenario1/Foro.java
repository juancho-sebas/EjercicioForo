package Escenario1;

import javax.swing.JOptionPane;

public class Foro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input, operation; //variables are declared as integers
		
		input = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a whole number"));
		//Integer.parseInt(JOptionPane.showInputDialog... we obtain the data through a text box
        
        operation = input%100; //In this operation we obtain the remainder of the division by 100
        
        if(operation == 0) { //We set the result of the operation equal to 0 to know if it is a multiple of 100
        	JOptionPane.showMessageDialog(null, "multiple of 100");
        }
        else {
            JOptionPane.showMessageDialog(null, "is not a multiple of 100");
        }
	}

}
