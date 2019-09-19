/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Empresa {
    private Integer codigo;
    private String nomefantasia;
    private String razaosocial;
    private String horariofuncionamento;
    private String datafundacao;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getHorariofuncionamento() {
        return horariofuncionamento;
    }

    public void setHorariofuncionamento(String horariofuncionamento) {
        this.horariofuncionamento = horariofuncionamento;
    }

    public String getDatafundacao() {
        return datafundacao;
    }

    public void setDatafundacao(String datafundacao) {
        this.datafundacao = datafundacao;
    }
    
    @Override
    public String toString() {
        return nomefantasia;
    }
    
}
