import java.sql.Connection;
import java.sql.SQLException;

public class teste {

    public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionX().getConnection();

        System.out.println("Conectado ");
        connection.close();

    }
}