/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

/**
 *
 * @author Lucas
 */
public class VGerenteVO {
    
    private int id_gerente;
    private String nome_gerente;
    
    private int cod_funcionario;

    /**
     * @return the id_gerente
     */
    public int getId_gerente() {
        return id_gerente;
    }

    /**
     * @param id_gerente the id_gerente to set
     */
    public void setId_gerente(int id_gerente) {
        this.id_gerente = id_gerente;
    }

    /**
     * @return the nome_gerente
     */
    public String getNome_gerente() {
        return nome_gerente;
    }

    /**
     * @param nome_gerente the nome_gerente to set
     */
    public void setNome_gerente(String nome_gerente) {
        this.nome_gerente = nome_gerente;
    }

    /**
     * @return the cod_funcionario
     */
    public int getCod_funcionario() {
        return cod_funcionario;
    }

    /**
     * @param cod_funcionario the cod_funcionario to set
     */
    public void setCod_funcionario(int cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }
    
}
