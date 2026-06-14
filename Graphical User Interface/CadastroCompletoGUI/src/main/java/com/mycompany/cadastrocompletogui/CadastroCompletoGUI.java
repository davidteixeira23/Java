/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrocompletogui;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author David
 */
public class CadastroCompletoGUI {

    public static void main(String[] args) {
    
        JFrame frame = new JFrame("PORTAL");    
        
       JanelaEntrada app = new JanelaEntrada();
       
frame.add(app);
frame.setVisible(true);
frame.setSize(600,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
    }
}
