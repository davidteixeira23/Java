/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroclientegui;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author David
 */
public class Janela extends JFrame{
   JLabel rotulo0, rotulo1, rotulo2, rotulo3, rotulo4,rotulo5,rotulo6,rotulo7,rotulo8;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
    public Janela () {
    super("janela em GUI");
    Container tela = getContentPane();
    setLayout(null);
     
     rotulo0 = new JLabel ("Cadastro do Cliente");
     rotulo1 = new JLabel ("Nome");
     rotulo2 = new JLabel ("CPF");
     rotulo3 = new JLabel ("RG");
     rotulo4 = new JLabel ("Endereço");
     rotulo5 = new JLabel ("Cidade");
     rotulo6 = new JLabel ("Estado");
     rotulo7 = new JLabel ("CEP");
    
     texto1 = new JTextField();
     texto2 = new JTextField();
     texto3 = new JTextField();
     texto4 = new JTextField();
     texto5 = new JTextField();
     texto6 = new JTextField();
     texto7 = new JTextField();
     
     rotulo0.setBounds(130,20,200,20);
     rotulo1.setBounds(50,100,100,20);
     rotulo2.setBounds(50,180,100,20); 
     rotulo3.setBounds(50,260,100,20);
     rotulo4.setBounds(50,340,100,20);
     rotulo5.setBounds(50,420,100,20);
     rotulo6.setBounds(50,500,100,20);
     rotulo7.setBounds(50,580,100,20);
     
     
     texto1.setBounds(50,120,180,25);  
     texto2.setBounds(50,200,180,25);
     texto3.setBounds(50,280,180,25);
     texto4.setBounds(50,360,180,25);
     texto5.setBounds(50,440,180,25);
     texto6.setBounds(50,520,180,25);
     texto7.setBounds(50,600,180,25);
     
     tela.add(rotulo0);
     tela.add(rotulo1);
     tela.add(rotulo2);
     tela.add(rotulo3);
     tela.add(rotulo4);
     tela.add(rotulo5);
     tela.add(rotulo6);
     tela.add(rotulo7);
     tela.add(texto1);
     tela.add(texto2);
     tela.add(texto3);
     tela.add(texto4);
     tela.add(texto5);
     tela.add(texto6);
     tela.add(texto7);
     
     rotulo0.setForeground(Color.RED);
     rotulo0.setFont(new Font("Arial",Font.BOLD,16));
     
     
     setVisible(true);
     
     setSize(420,670);
    }
    
    
    
    
    
    
}
