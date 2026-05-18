/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.camposespeciaisgui2;
import javax.swing.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;



/**
 *
 * @author David
 */
public class Janela extends JFrame{
    JLabel titulo, rotulonome, rotulotel,rotulocpf,rotulocep ;
    JFormattedTextField nome,tel,cpf,cep;
    MaskFormatter mascararnome, mascarartel, mascararcpf, mascararcep;
    JButton botao;
    
    public Janela (){
   
    super("Janela bonita");
    setLayout(null);
    Container tela = getContentPane();
     
    titulo = new JLabel("Tela de Cadastro");
    rotulonome = new JLabel("Nome");
    rotulotel = new JLabel("Telefone");
    rotulocpf = new JLabel ("CPF");
    rotulocep = new JLabel ("CEP");
    botao = new JButton ("Cadastrar");
    titulo.setBounds(210,60,300,20);
    rotulonome.setBounds(50,100,100,20);
    rotulotel.setBounds(50,130,100,20);
    rotulocpf.setBounds(50,160,100,20);
    rotulocep.setBounds(50,190,100,20);
    botao.setBounds(250,250,100,20);
    
    try {
    mascararnome = new MaskFormatter("?????");
    mascarartel = new MaskFormatter("(##)#########");
    mascararcpf = new MaskFormatter("###########");
    mascararcep = new MaskFormatter("########"); 
    /*
    mascararnome.setPlaceholderCharacter('_');
    mascarartel.setPlaceholderCharacter('_');
    mascararcpf.setPlaceholderCharacter('_');
    mascararcep.setPlaceholderCharacter('_');
   */ 
    
    }
    catch(ParseException excp) {}
        
    nome = new JFormattedTextField(mascararnome);
    tel = new JFormattedTextField(mascarartel);
    cpf = new JFormattedTextField(mascararcpf);
    cep = new JFormattedTextField(mascararcep);
    
    nome.setBounds(120,100,350,28);
    tel.setBounds(120,130,350,28);
    cpf.setBounds(120,160,350,28);
    cep.setBounds(120,190,350,28);
    
    // personalização 
    tela.setBackground(Color.BLUE);
    titulo.setForeground(Color.white);
    rotulonome.setForeground(Color.white);
    rotulotel.setForeground(Color.white);
    rotulocpf.setForeground(Color.white);
    rotulocep.setForeground(Color.white);
    titulo.setFont(new Font("minha fonte",Font.BOLD,20));   
    botao.setForeground(Color.blue);
    
    tela.add(titulo);
    tela.add(rotulonome);
    tela.add(rotulotel);
    tela.add(rotulocpf);
    tela.add(rotulocep);
    tela.add(nome);
    tela.add(tel);
    tela.add(cpf);
    tela.add(cep);
    tela.add(botao);
    
    
    setVisible(true);
    setSize(600,350);
    
    
    
    }
    
    
    
    
    
}
