/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botaolimpar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Admin
 */
public class Janela extends JFrame{
    JLabel texto1, texto2;
    JTextField campo1, campo2;
    JButton limpar;
    
    public Janela () { 
    super ("Exemplo limpar");
    Container tela = getContentPane();
    setLayout(null);
    texto1 = new JLabel("1° Numero");
    texto2 = new JLabel("2° Numero");
    campo1 = new JTextField(5); 
    campo2 = new JTextField(5);
    limpar = new JButton("Limpar");
    
    
    texto1.setBounds(50,20,100,20);
    texto2.setBounds(50,60,100,20);
    campo1.setBounds(120,20,100,20);
    campo2.setBounds(120,60,100,20);
    limpar.setBounds(130,90,80,20);
    
    limpar.addActionListener(
     new  ActionListener() {
      public void actionPerformed(ActionEvent e ) {
      campo1.setText(null);
      campo2.setText(null);
      texto1.requestFocus();
      
      }
   
      
     
     }
    );
    
    
      
      tela.add(texto1);
      tela.add(texto2);
      tela.add(campo1);
      tela.add(campo2);
      tela.add(limpar);
      setVisible(true);
      setSize(400,250);
    
   

    
    
    
    }
    
    
    
    
    
}
