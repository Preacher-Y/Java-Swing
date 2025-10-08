package form;

import javax.swing.*;
import java.awt.*;


public class main {
    public static void main(String[] args) {
        JFrame loanForm = new JFrame("Loan Application Form");
        loanForm.setSize(500, 700);
        loanForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lbMemberId = new JLabel("Member ID : "); 
        JLabel lbFirstName = new JLabel("First Name : "); 
        JLabel lbLastName = new JLabel("Last Name : ");
        JLabel lbLoanType = new JLabel("Loan Type : ");
        JLabel lbContribution = new JLabel("Contribution : ");
        JLabel lbMAxAllowed = new JLabel("Max. Allowed : ");
        JLabel lbLoneaPeriod = new JLabel("Loan Period : ");
        JLabel lbRequestedAmount = new JLabel("Req. Amount : ");
        JLabel lbCapital = new JLabel("Capital : ");
        JLabel lbInterest = new JLabel("Interest : ");
        JLabel lbTotal = new JLabel("Total : ");
        
        loanForm.setLayout(null);

        lbMemberId.setBounds(50, 50, 150, 30);
        lbMemberId.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbFirstName.setBounds(50, 90, 150, 30);
        lbFirstName.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbLastName.setBounds(50, 130, 150, 30);
        lbLastName.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbLoanType.setBounds(50, 170, 150, 30);
        lbLoanType.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbContribution.setBounds(50, 210, 150, 30);
        lbContribution.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbMAxAllowed.setBounds(50, 250, 150, 30);
        lbMAxAllowed.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbLoneaPeriod.setBounds(50, 290, 150, 30);
        lbLoneaPeriod.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbRequestedAmount.setBounds(50, 330, 150, 30);
        lbRequestedAmount.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbCapital.setBounds(50, 370, 150, 30);
        lbCapital.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbInterest.setBounds(50, 410, 150, 30);
        lbInterest.setFont(new Font("Ink Free", Font.BOLD, 16));
        lbTotal.setBounds(50, 450, 150, 30);
        lbTotal.setFont(new Font("Ink Free", Font.BOLD, 16));


        loanForm.add(lbMemberId);
        loanForm.add(lbFirstName);
        loanForm.add(lbLastName); 
        loanForm.add(lbLoanType);
        loanForm.add(lbContribution);
        loanForm.add(lbMAxAllowed);
        loanForm.add(lbLoneaPeriod);
        loanForm.add(lbRequestedAmount);
        loanForm.add(lbCapital);
        loanForm.add(lbInterest);
        loanForm.add(lbTotal);




        loanForm.setVisible(true);
    }
}
