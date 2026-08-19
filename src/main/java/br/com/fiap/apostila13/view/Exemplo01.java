package br.com.fiap.apostila13.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplo01 {
    public static void main(String[] args) {
        //Registrando Driver do banco de dados
        // vai cair no catch quando o driver do banco de dados nao estiver configurado direito

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm570294", "250397");
            System.out.println("Conectado ao banco de dados");
            // inserir um carro no BD
            Statement stm = conexao.createStatement();
            //Executar comando SWL no banco de dados
            stm.executeUpdate("insert into tb_carro (id, ano, cor, modelo, valor, automatico)\n" +
                    "    values(13,2020,'Roxo', 'Range Rover', 5600,1)");
            System.out.println("carro cadastrado!");

            //fechar a conexão
            conexao.close();
        } catch (ClassNotFoundException e){
            System.out.println("JDBC não encontrado " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Não foi possivel se conectar ao banco de dados" + e.getMessage());
        }
    }
}
