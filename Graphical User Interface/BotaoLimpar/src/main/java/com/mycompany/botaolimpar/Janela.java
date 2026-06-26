package com.mycompany.botaolimpar;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {

    private JLabel texto1;
    private JLabel texto2;

    private JTextField campo1;
    private JTextField campo2;

    private JButton limpar;

    public Janela() {

        super("Exemplo Limpar");

        Container tela = getContentPane();
        tela.setLayout(null);

        // Componentes
        texto1 = new JLabel("1° Número");
        texto2 = new JLabel("2° Número");

        campo1 = new JTextField(5);
        campo2 = new JTextField(5);

        limpar = new JButton("Limpar");

        // Posições
        texto1.setBounds(50, 20, 100, 20);
        texto2.setBounds(50, 60, 100, 20);

        campo1.setBounds(120, 20, 100, 20);
        campo2.setBounds(120, 60, 100, 20);

        limpar.setBounds(130, 90, 80, 25);

        // Evento do botão
        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campo1.setText("");
                campo2.setText("");
                campo1.requestFocus();
            }
        });

        // Adicionando componentes
        tela.add(texto1);
        tela.add(texto2);
        tela.add(campo1);
        tela.add(campo2);
        tela.add(limpar);

        // Configurações da janela
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
