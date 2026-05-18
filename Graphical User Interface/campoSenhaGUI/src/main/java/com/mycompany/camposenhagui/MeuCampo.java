/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.camposenhagui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author David
 */
public class MeuCampo extends JFrame {
  JPasswordField campo;
  JLabel rotulo;
    
    public MeuCampo () {
    super("Exemplo de PassWord");
    Container tela = getContentPane();
    setLayout(null);
    rotulo = new JLabel("Senha");
    campo = new JPasswordField(10);
    
   rotulo.setBounds(50,20,100,20);
   campo.setBounds (50,50,100,20);
   
   tela.add(rotulo);
   tela.add(campo);
    
    setSize(300,150);
    setVisible(true);
    
    }
    
    
}
