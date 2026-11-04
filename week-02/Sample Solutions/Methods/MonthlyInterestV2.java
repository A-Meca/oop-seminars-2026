package Methods;

import javax.swing.JOptionPane;

public class MonthlyInterestV2 {

    public static void main(String[] args) {
        String balanceText = JOptionPane.showInputDialog("Enter balance:");
        double balance = Double.parseDouble(balanceText);

        String rateText = JOptionPane.showInputDialog("Enter annual interest rate (e.g. 3.5):");
        double annualInterestRate = Double.parseDouble(rateText);

        double interest = balance * (annualInterestRate / 1200);

        JOptionPane.showMessageDialog(null,
                String.format("The interest for next month is %.2f", interest));
    }
}
