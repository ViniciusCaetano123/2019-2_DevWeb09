package Java;

/**
 *
 * @author edugu
 */
public class Usuario {

    private static int idmestre;
    private final int id;
    private String nome, login, email;

    public Usuario(String nome, String login, String email) {
        id = idmestre + 1;
        idmestre = id;
        this.nome = nome;
        this.login = login;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public static int getIdmestre() {
        return idmestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
