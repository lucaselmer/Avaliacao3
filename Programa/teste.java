import java.sql.Connection;
import java.sql.SQLException;

import Programa.Conexao;

public class teste {

    public static void main(String[] args) throws SQLException {
        Connection connection = new Conexao().getConnection();

        System.out.println("Conectado ");
        connection.close();

    }
}