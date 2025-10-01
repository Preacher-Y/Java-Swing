package First_GUI_Project;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        int num1,num2;
        int sum = 0;
        String str1, str2; 
        str1 = JOptionPane.showInputDialog("Enter first number");
        str2 = JOptionPane.showInputDialog("Enter second number");
        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);
        sum = num1 + num2;
        JOptionPane.showMessageDialog(null,"Sum is "+sum);
    }
}
