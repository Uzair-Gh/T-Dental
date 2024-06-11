/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tdental;

/**
 *
 * @author RIMSHA
 */
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
public class TDental {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainController controller = new MainController();
            controller.showLogin();
        });
    }
}

    

