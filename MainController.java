/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdental;

import javax.swing.*;
import java.awt.*;

public class MainController {
    private JFrame frame;
    private LoginController loginController;
    private ChoiceController choiceController;
    private FeedbackService feedbackService;

    public MainController() {
        feedbackService = FeedbackService.getInstance();
    }

    public void showLogin() {
        loginController = new LoginController(this);
        loginController.createAndShowGUI();
    }

    public void showChoice() {
        choiceController = new ChoiceController(this);
        choiceController.createAndShowGUI();
    }

    public void showComplaintForm() {
        frame = new JFrame("Dental Clinic - Complaint Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Complaint Type:"));
        JTextField complaintTypeField = new JTextField();
        panel.add(complaintTypeField);

        panel.add(new JLabel("Description:"));
        JTextArea descriptionField = new JTextArea();
        panel.add(new JScrollPane(descriptionField));

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String complaintType = complaintTypeField.getText();
            String description = descriptionField.getText();

            if (complaintType.isEmpty() || description.isEmpty()) {
                showAlert("Error", "Please fill in all fields.");
            } else {
                Complaint complaint = new Complaint(complaintType, description);
                feedbackService.addComplaint(complaint);
                showAlert("Success", "Complaint submitted successfully!");
                complaintTypeField.setText("");
                descriptionField.setText("");
            }
        });

        panel.add(submitButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void showAlert(String title, String message) {
        JOptionPane.showMessageDialog(frame, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
