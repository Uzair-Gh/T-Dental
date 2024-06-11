/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdental;
import javax.swing.*;
import java.awt.*;

public class LoginController {
    private MainController mainController;

    public LoginController(MainController mainController) {
        this.mainController = mainController;
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));

        frame.add(new JLabel("Username:"));
        JTextField usernameField = new JTextField();
        frame.add(usernameField);

        frame.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField();
        frame.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (username.equals("admin") && password.equals("admin")) {
                frame.dispose();
                mainController.showChoice();
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(loginButton);
        frame.setVisible(true);
    }
}

