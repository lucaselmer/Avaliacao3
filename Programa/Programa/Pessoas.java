package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Usuario.UsuarioDAO;

public class Pessoas {

    private int idPessoa;
    private String nomePessoa;
    private String emailPessoa;
    private List<Dividas> dividas = new ArrayList<>();
    private List<Proventos> proventos = new ArrayList<>();

    public Pessoas() {
    }

    public Pessoas(final int idPessoa, final String nomePessoa, final String emailPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
    }

    public Pessoas(final String nomePessoa, final String emailPessoa) {
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;

        final UsuarioDAO dao = new UsuarioDAO();
        dao.adicionaPessoa(this);
        dao.endConection();
    }

    public Pessoas(final int idPessoa, final String nomePessoa, final String emailPessoa, final List<Dividas> dividas,
            final List<Proventos> proventos) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.dividas = dividas;
        this.proventos = proventos;
    }

    public int getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(final int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return this.nomePessoa;
    }

    public void setNomePessoa(final String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmailPessoa() {
        return this.emailPessoa;
    }

    public void setEmailPessoa(final String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public List<Dividas> getDividas() {
        return this.dividas;
    }

    public void setDividas(final List<Dividas> dividas) {
        this.dividas = dividas;
    }

    public List<Proventos> getProventos() {
        return this.proventos;
    }

    public void setProventos(final List<Proventos> proventos) {
        this.proventos = proventos;
    }

    public Pessoas idPessoa(final int idPessoa) {
        this.idPessoa = idPessoa;
        return this;
    }

    public Pessoas nomePessoa(final String nomePessoa) {
        this.nomePessoa = nomePessoa;
        return this;
    }

    public Pessoas emailPessoa(final String emailPessoa) {
        this.emailPessoa = emailPessoa;
        return this;
    }

    public Pessoas dividas(final List<Dividas> dividas) {
        this.dividas = dividas;
        return this;
    }

    public Pessoas proventos(final List<Proventos> proventos) {
        this.proventos = proventos;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoas)) {
            return false;
        }
        final Pessoas pessoas = (Pessoas) o;
        return idPessoa == pessoas.idPessoa && Objects.equals(nomePessoa, pessoas.nomePessoa) && Objects.equals(emailPessoa, pessoas.emailPessoa) && Objects.equals(dividas, pessoas.dividas) && Objects.equals(proventos, pessoas.proventos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPessoa, nomePessoa, emailPessoa, dividas, proventos);
    }

    @Override
    public String toString() {
        return "{" +
            " idPessoa='" + getIdPessoa() + "'" +
            ", nomePessoa='" + getNomePessoa() + "'" +
            ", emailPessoa='" + getEmailPessoa() + "'" +
            ", dividas='" + getDividas() + "'" +
            ", proventos='" + getProventos() + "'" +
            "}";
    }

}