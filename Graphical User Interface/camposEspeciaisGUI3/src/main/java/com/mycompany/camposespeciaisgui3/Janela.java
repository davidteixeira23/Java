/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.camposespeciaisgui3;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.text.*;
/**
 *
 * @author David
 */
public class Janela extends JFrame {
    
  
    
    JButton cadastrar;
    JPasswordField camposenha;
    JLabel titulo, rotulocpf, rotulosenha;
    JFormattedTextField cpf;
    MaskFormatter mascararcpf;    
    
    public Janela () {
    super("Minha janela bonita");
    Container tela = getContentPane();
    setLayout(null);
        
    titulo = new JLabel ("Cadastro de Cliente");
    rotulocpf = new JLabel ("CPF");
    rotulosenha = new JLabel ("Senha");
    camposenha = new JPasswordField(10);
    cadastrar = new JButton("Cadastrar");
   
    // definir posição dos objetos
    
    titulo.setBounds(40,40,180,20);
    rotulocpf.setBounds(50,100,100,20);
    rotulosenha.setBounds(50,140,100,20);
    camposenha.setBounds(50,160,150,20);
    cadastrar.setBounds(50,200,100,20);
    // modulo de segurança
    try {
    
        mascararcpf = new MaskFormatter("###.###.###-##");
        mascararcpf.setPlaceholderCharacter('_');
        
                
    
    }
    catch(ParseException excp) {}
    
    cpf = new JFormattedTextField(mascararcpf);
    cpf.setBounds(50,120,150,20);
    
    tela.add(titulo);
    tela.add(rotulocpf);
    tela.add(cpf);
    tela.add(rotulosenha);
    tela.add(camposenha);
    tela.add(cadastrar);
    
    // Personalizando os objetos
    titulo.setFont(new Font("MinhaFonte",Font.BOLD,18));
    titulo.setForeground(Color.WHITE);
    tela.setBackground(Color.BLUE);
    rotulocpf.setForeground(Color.WHITE);
    rotulosenha.setForeground(Color.WHITE);
    
    
    setVisible(true);
    setSize(380,270);
    
    
    
    
    
    }
    
    
    
    
}
