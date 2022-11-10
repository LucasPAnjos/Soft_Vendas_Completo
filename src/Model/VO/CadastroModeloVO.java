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
public class CadastroModeloVO {
    
    private int id_modelo;
    private String nome_modelo; 
    private String Pesquisa_nome;
    private int Pesquisa_IDModelo;
    /**
     * @return the id_modelo
     */
    public int getId_modelo() {
        return id_modelo;
    }

    /**
     * @param id_modelo the id_modelo to set
     */
    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    /**
     * @return the nome_modelo
     */
    public String getNome_modelo() {
        return nome_modelo;
    }

    /**
     * @param nome_modelo the nome_modelo to set
     */
    public void setNome_modelo(String nome_modelo) {
        this.nome_modelo = nome_modelo;
    }

    /**
     * @return the Pesquisa_nome
     */
    public String getPesquisa_nome() {
        return Pesquisa_nome;
    }

    /**
     * @param Pesquisa_nome the Pesquisa_nome to set
     */
    public void setPesquisa_nome(String Pesquisa_nome) {
        this.Pesquisa_nome = Pesquisa_nome;
    }

    /**
     * @return the Pesquisa_IDModelo
     */
    public int getPesquisa_IDModelo() {
        return Pesquisa_IDModelo;
    }

    /**
     * @param Pesquisa_IDModelo the Pesquisa_IDModelo to set
     */
    public void setPesquisa_IDModelo(int Pesquisa_IDModelo) {
        this.Pesquisa_IDModelo = Pesquisa_IDModelo;
    }
    
}
