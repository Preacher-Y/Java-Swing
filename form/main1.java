package form;

import javax.swing.*;
import javax.swing.text.PasswordView;

import java.awt.*;
import java.awt.event.*;

public class main1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels
        JLabel lbUserName = new JLabel("User Name: ");
        lbUserName.setBounds(50,50,150,30);
        lbUserName.setFont(new Font("Ink Free", Font.BOLD,16));
        lbUserName.setForeground(Color.white);
        JLabel lbPassword = new JLabel("Password: ");
        lbPassword.setBounds(50,90,150,30);
        lbPassword.setFont(new Font("Ink Free", Font.BOLD,16));
        lbPassword.setForeground(Color.white);

        // inputs
        JTextField inputsUserName = new JTextField();
        inputsUserName.setBounds(150,45,150,30);
        JPasswordField inputsPassword = new JPasswordField();
        inputsPassword.setBounds(150,85,150,30);

        // button
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 150, 150, 40);
        btnLogin.setBackground(Color.blue);
        btnLogin.setForeground(Color.white);
        btnLogin.setFont(new Font("Ink Free", Font.BOLD,16));

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String UserName = inputsUserName.getText();
                String password = new String(inputsPassword.getPassword());
                if(UserName.equals("Preacher") & password.equals("Admin123")){
                    JOptionPane.showMessageDialog(frame,"Welcome Back '"+UserName+"' 🎉");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Invalid Username/Password !","Login Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        frame.add(lbUserName);
        frame.add(lbPassword);
        frame.add(btnLogin);
        frame.add(inputsUserName);
        frame.add(inputsPassword);

        frame.getContentPane().setBackground(Color.BLACK);

        frame.setVisible(true);
    }
}
