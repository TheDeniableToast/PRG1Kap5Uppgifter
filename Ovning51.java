import java.util.Scanner;
import javax.swing.*;

public class Ovning51 {
	
	public static void main(String[] args) {
		
		//Variables
		String s = JOptionPane.showInputDialog("n");
		int n = Integer.parseInt(s);
		int summa = 0; 
		int k = 1;
		
		while (k <= n) {
			summa = summa + k*k;
			k = k + 1;
		}
		JOptionPane.showMessageDialog(null, "Summan blir" + summa);
	}
}