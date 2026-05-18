/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botaoimagemgui;



import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


/**
 *
 * @author Admin
 */
public class Botao extends JFrame{
    JLabel texto1;
    JButton botao;
    JButton botao2;
    JButton botao3;
    ImageIcon icone;
    ImageIcon icone2;
    
    public Botao() {
    super("MENU DE ESCOLHA");
    Container tela = getContentPane();
    setLayout(null);
    
    icone = new ImageIcon("img.gif");
    icone2 = new ImageIcon ("img.gif");
    
    botao = new JButton ("abrir",icone);
    botao2 = new JButton (icone2);
    botao3 = new JButton ("abrir");
    texto1 = new JLabel ("ESCOLHA");
    
    botao.setBounds(50,100,100,20);
     botao2.setBounds(50,200,100,20);
    botao3.setBounds(50,300,100,20);
    texto1.setBounds(50,20,140,40);
    tela.add(botao);
    tela.add(botao2);
    tela.add(botao3);
    tela.add(texto1);
    
    
    
    setSize(300,400);
    setVisible(true);
    
        
        
    }
    
    
    
}
