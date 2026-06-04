/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcomboboxexemplo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;    

public class Janela  extends JFrame{

String cidades [] = {"Rio de Janeiro","Krakiv","Sevastopol","York", "São paulo", "Xingai"};

JButton exibir;
JLabel rotulo;
JList lista; 

public Janela () {

super("David Pedreira Mentality");
Container tela = getContentPane();
setLayout(null);
exibir = new JButton("Exibir");
rotulo = new JLabel ("");
lista = new JList(cidades);
lista.setVisibleRowCount(5);
JScrollPane painelRolagem = new JScrollPane(lista);
lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
painelRolagem.setBounds(40,50,150,100); 
exibir.setBounds(270,50,200,30);
rotulo.setBounds(50,150,400,30);
exibir.addActionListener(
new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    rotulo.setText("A(s) cidades selecionada(s) foi: " + lista.getSelectedValue().toString());
    }
}
); 
tela.add(painelRolagem);
tela.add(exibir);
tela.add(rotulo);
setSize(600,270);
setLocationRelativeTo(null);
setVisible(true);


}

    
}
