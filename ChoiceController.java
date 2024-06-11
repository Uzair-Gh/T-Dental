/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdental;

import javax.swing.*;
import java.awt.*;

public class ChoiceController {
    private MainController mainController;

    public ChoiceController(MainController mainController) {
        this.mainController = mainController;
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Choose Action");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(2, 1));

        JButton fileComplaintButton = new JButton("File a Complaint");
        fileComplaintButton.addActionListener(e -> {
            frame.dispose();
            mainController.showComplaintForm();
        });

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));

        frame.add(fileComplaintButton);
        frame.add(exitButton);
        frame.setVisible(true);
    }
}
