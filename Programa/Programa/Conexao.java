package Programa;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class Conexao {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/contas?useTimezone=true&serverTimezone=UTC","root","");
        }
        catch(final SQLException excecao) {
            throw new RuntimeException(excecao);
        }

    }
}