package Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Programa.Conexao;

public class UsuarioDAO {
    private final Connection connection;
    int idPessoa;
    String nomePessoa;
    String emailPessoa;
    double percDesconto;
    double imposto;
    int idConta;
    int mes;
    int ano;
    double valor;

    public UsuarioDAO() {
        this.connection = new Conexao().getConnection();
    }

    public void adicionaPessoa(final Programa.Pessoas pessoa) {
        final String sql = "INSERT INTO pessoas (nomePessoa,EmailPessoa) VALUES (?,?)";
        try {
            final PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(2, pessoa.getNomePessoa());
            stmt.setString(3, pessoa.getEmailPessoa());

            // stmt.execute();  verificar se precisa com profesor ******
            
        } catch (final SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public void adicionarProventos(final Programa.Proventos provento) {
        final String sql1 = "INSERT INTO proventos (idPessoa,mes,ano,valor,imposto) VALUES (?,?,?,?,?)";
        try {
            final PreparedStatement stmt = connection.prepareStatement(sql1);
            stmt.setInt(1, provento.getIdConta());
            stmt.setInt(2, provento.getMes());
            stmt.setInt(3, provento.getAno());
            stmt.setDouble(4, provento.getValor());
            stmt.setDouble(5, provento.getImposto());
        } catch (final SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void adicionarDividas(final Programa.Dividas divida) {
        final String sql2 = "INSERT INTO dividas (idPessoa,mes,ano,valor,desconto) VALUES (?,?,?,?,?)";
        try {
            final PreparedStatement stmt = connection.prepareStatement(sql2);
            stmt.setInt(1, divida.getIdConta());
            stmt.setInt(2, divida.getMes());
            stmt.setInt(3, divida.getAno());
            stmt.setDouble(4, divida.getValor());
            stmt.setDouble(5, divida.getPercDesconto());
        } catch (final SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void endConection() {
        try {
            this.connection.close();
        } catch (final SQLException e) {
            e.printStackTrace();
        }
    }
}