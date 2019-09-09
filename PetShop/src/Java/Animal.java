package Java;

/**
 *
 * @author edugu
 */
public class Animal {

    private static int idmestre;
    private final int id;
    private int idcliente;
    private String nome, raca, sexo, porte;

    public Animal(int idcliente, String nome, String raca, String sexo, String porte) {
        id = idmestre + 1;
        idmestre = id;
        this.idcliente = idcliente;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.porte = porte;
    }

    public static int getIdmestre() {
        return idmestre;
    }

    public int getId() {
        return id;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

}
