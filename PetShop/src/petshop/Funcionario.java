package petshop;

/**
 *
 * @author edugu
 */
public class Funcionario {
    
    private static int idmestre;
    private final int id;
    private int rg, cpf, numeroendereco, cep, telefone;
    private String nascimento, nacionalidade, uf, nome, sexo, estadocivil, rua, complemento, municipio, bairro, email;

    public Funcionario(int rg, int cpf, int numeroendereco, int cep, int telefone, String nascimento, String nacionalidade, String uf, String nome, String sexo, String estadocivil, String rua, String complemento, String municipio, String bairro, String email) {
        id = idmestre + 1;
        idmestre = id;
        this.rg = rg;
        this.cpf = cpf;
        this.numeroendereco = numeroendereco;
        this.cep = cep;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.nacionalidade = nacionalidade;
        this.uf = uf;
        this.nome = nome;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.rua = rua;
        this.complemento = complemento;
        this.municipio = municipio;
        this.bairro = bairro;
        this.email = email;
    }
    
    public int getRg() {
        return rg;
    }

    public static int getIdmestre() {
        return idmestre;
    }

    public int getId() {
        return id;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumeroendereco() {
        return numeroendereco;
    }

    public void setNumeroendereco(int numeroendereco) {
        this.numeroendereco = numeroendereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
