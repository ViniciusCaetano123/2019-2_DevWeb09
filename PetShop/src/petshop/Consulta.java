package petshop;

/**
 *
 * @author edugu
 */

public class Consulta {
    private static int idmestre;
    private final int id;
    private int idcliente, idservico, idfuncionario, ano, mes, dia, hora;

    public Consulta(int idcliente, int idservico, int idfuncionario, int ano, int mes, int dia, int hora) {
        id = idmestre + 1;
        idmestre = id;
        this.idcliente = idcliente;
        this.idservico = idservico;
        this.idfuncionario = idfuncionario;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public static int getIdmestre() {
        return idmestre;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdservico() {
        return idservico;
    }

    public void setIdservico(int idservico) {
        this.idservico = idservico;
    }

    public int getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
}