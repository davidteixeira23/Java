package com.mycompany.cadastroescolagui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // Adicionado o 'serverTimezone=UTC' para evitar erros de fuso horário no MySQL 8+
    private static final String url = "jdbc:mysql://localhost:3306/TBusuario";
    private static final String usuario = "root";
    private static final String senha = "";

    public static Connection conectar() {
        try {
            // Garante o carregamento do driver do MySQL para evitar o erro "No suitable driver found"
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado ao banco de dados!");
            return conexao;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do MySQL não foi encontrado! Certifique-se de adicionar o JAR ao projeto.");
            return null;
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            return null;
        }
    }

    public static void fechar(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
                System.out.println("Conexão encerrada.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}