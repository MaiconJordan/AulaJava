package com.br.maicon.conexaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;   

public class ConexaoBanco {

    // Dados de conexão com o bancox
    private static final String URL = "xxxxxxxxxxxxxxxxxxx";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "treinamento-postgres";

    public static void main(String[] args) {
        Connection conexao = null;

        try {
            // 1. Abrir conexão
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("✅ Conectado com sucesso!");

            // 2. Definir a query
            String sql = "select id_fatura  from fat_fatura where id_fatura  in (10, 11, 12)";

            // 3. Criar statement e executar
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();

            // 4. Iterar sobre os resultados
            while (resultado.next()) {
                int id = resultado.getInt("id_fatura");

                System.out.println("ID: " + id );
            }

            // 5. Fechar recursos
            resultado.close();
            stmt.close();

        } catch (SQLException e) {
            System.err.println("❌ Erro na conexão ou consulta: " + e.getMessage());
        } finally {
            try {
                if (conexao != null && !conexao.isClosed()) {
                    conexao.close();
                    System.out.println("✅ Conexão encerrada.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
