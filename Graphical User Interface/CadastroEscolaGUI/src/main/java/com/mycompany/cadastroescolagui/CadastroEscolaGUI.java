package com.mycompany.cadastroescolagui;

import java.sql.Connection;
import javax.swing.JFrame;

public class CadastroEscolaGUI {

    public static void main(String[] args) {
      /*  System.out.println("Iniciando a aplicação...");

        // Chama o método estático para conectar e guarda a conexão em uma variável
        Connection conexaoAtiva = Conexao.conectar();

        // Se a conexão foi bem-sucedida, vamos fechá-la logo em seguida
        if (conexaoAtiva != null) {
            Conexao.fechar(conexaoAtiva);

      
        }
*/
      PaginaInicial app1 = new PaginaInicial();
      app1.setVisible(true);
      app1.setSize(800,400);
      app1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}