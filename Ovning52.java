import java.util.Scanner;
import javax.swing.*;

public class Ovning52 {
	
	public static void main(String[] args) {
		
		//Variables
		String s = JOptionPane.showInputDialog("n?");
		int n = Integer.parseInt(s);
		double summa = 0;
		double k = 1;
		
		while (k <= n) {
			summa = summa + 1/k;
			k = k + 1;
		}
		JOptionPane.showMessageDialog(null, "Summan blir" + summa);
	}
}