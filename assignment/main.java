package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Loan Application Form");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(12, 2, 10, 10));
        frame.getContentPane().setBackground(Color.CYAN);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel memberIdLabel = new JLabel("Member Id:");
        JTextField memberIdField = new JTextField();

        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField();

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField();

        JLabel loanTypeLabel = new JLabel("Loan Type:");
        String[] loanTypes = {"Personal", "Business", "Education"};
        JComboBox<String> loanTypeBox = new JComboBox<>(loanTypes);

        JLabel contributionLabel = new JLabel("Contribution:");
        JTextField contributionField = new JTextField();

        JLabel maxAllowedLabel = new JLabel("Max. Allowed Amount:");
        JTextField maxAllowedField = new JTextField();

        JLabel loanPeriodLabel = new JLabel("Loan Period (Years: 1/2/3):");
        JTextField loanPeriodField = new JTextField();

        JLabel requestedAmountLabel = new JLabel("Requested Amount:");
        JTextField requestedAmountField = new JTextField();

        JLabel capitalLabel = new JLabel("Capital:");
        JTextField capitalField = new JTextField();

        JLabel interestLabel = new JLabel("Interest:");
        JTextField interestField = new JTextField();

        JLabel totalLabel = new JLabel("Capital + Interest:");
        JTextField totalField = new JTextField();

        panel.add(memberIdLabel); panel.add(memberIdField);
        panel.add(firstNameLabel); panel.add(firstNameField);
        panel.add(lastNameLabel); panel.add(lastNameField);
        panel.add(loanTypeLabel); panel.add(loanTypeBox);
        panel.add(contributionLabel); panel.add(contributionField);
        panel.add(maxAllowedLabel); panel.add(maxAllowedField);
        panel.add(loanPeriodLabel); panel.add(loanPeriodField);
        panel.add(requestedAmountLabel); panel.add(requestedAmountField);
        panel.add(capitalLabel); panel.add(capitalField);
        panel.add(interestLabel); panel.add(interestField);
        panel.add(totalLabel); panel.add(totalField);

        JButton saveButton = new JButton("Save");
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(saveButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String memberId = memberIdField.getText();
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String loanType = (String) loanTypeBox.getSelectedItem();
                String contribution = contributionField.getText();
                String maxAllowed = maxAllowedField.getText();
                String loanPeriod = loanPeriodField.getText();
                String requestedAmount = requestedAmountField.getText();
                String capital = capitalField.getText();
                String interest = interestField.getText();
                String total = totalField.getText();

                
                JOptionPane.showMessageDialog(frame, "Loan application saved successfully!");

                memberIdField.setText("");
                firstNameField.setText("");
                lastNameField.setText("");
                loanTypeBox.setSelectedIndex(0);
                contributionField.setText("");
                maxAllowedField.setText("");
                loanPeriodField.setText("");
                requestedAmountField.setText("");
                capitalField.setText("");
                interestField.setText("");
                totalField.setText("");

            }
        });

        frame.setVisible(true);
}

}
