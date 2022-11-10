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
public class Cadastro_MarcaVO {
    
    private int id_marca;
    private String nome_marca;
    
    private int marca_id;
    private String PesquisaMarca_nome;

    /**
     * @return the id_marca
     */
    public int getId_marca() {
        return id_marca;
    }

    
    
    /**
     * @param id_marca the id_marca to set
     */
    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    /**
     * @return the nome_marca
     */
    public String getNome_marca() {
        return nome_marca;
    }

    /**
     * @param nome_marca the nome_marca to set
     */
    public void setNome_marca(String nome_marca) {
        this.nome_marca = nome_marca;
    }

    /**
     * @return the marca_id
     */
    public int getMarca_id() {
        return marca_id;
    }

    /**
     * @param marca_id the marca_id to set
     */
    public void setMarca_id(int marca_id) {
        this.marca_id = marca_id;
    }

    /**
     * @return the PesquisaMarca_nome
     */
    public String getPesquisaMarca_nome() {
        return PesquisaMarca_nome;
    }

    /**
     * @param PesquisaMarca_nome the PesquisaMarca_nome to set
     */
    public void setPesquisaMarca_nome(String PesquisaMarca_nome) {
        this.PesquisaMarca_nome = PesquisaMarca_nome;
    }
    
}
