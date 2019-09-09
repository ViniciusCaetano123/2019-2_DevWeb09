package petshop;

/**
 *
 * @author edugu
 */
public class Servico {
    
    private static int idmestre;
    private final int id;
    private String descricao;
    private double valor;

    public Servico(String descricao, double valor) {
        id = idmestre + 1;
        idmestre = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public static int getIdmestre() {
        return idmestre;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
