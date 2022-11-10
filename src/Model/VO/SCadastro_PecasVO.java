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
public class SCadastro_PecasVO {
    
    private int id_pecas;
    private String nome_pecas;
    private String aplicacao;
    
    
    private int PesquisaIDPecas;
    private String PesquisaNomePeca;
    
    private String Fabricante;

    private String Cod_Barras;

    /**
     * @return the id_pecas
     */
    public int getId_pecas() {
        return id_pecas;
    }

    /**
     * @param id_pecas the id_pecas to set
     */
    public void setId_pecas(int id_pecas) {
        this.id_pecas = id_pecas;
    }

    /**
     * @return the nome_pecas
     */
    public String getNome_pecas() {
        return nome_pecas;
    }

    /**
     * @param nome_pecas the nome_pecas to set
     */
    public void setNome_pecas(String nome_pecas) {
        this.nome_pecas = nome_pecas;
    }

    /**
     * @return the aplicacao
     */
    public String getAplicacao() {
        return aplicacao;
    }

    /**
     * @param aplicacao the aplicacao to set
     */
    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    /**
     * @return the PesquisaIDPecas
     */
    public int getPesquisaIDPecas() {
        return PesquisaIDPecas;
    }

    /**
     * @param PesquisaIDPecas the PesquisaIDPecas to set
     */
    public void setPesquisaIDPecas(int PesquisaIDPecas) {
        this.PesquisaIDPecas = PesquisaIDPecas;
    }

    /**
     * @return the PesquisaNomePeca
     */
    public String getPesquisaNomePeca() {
        return PesquisaNomePeca;
    }

    /**
     * @param PesquisaNomePeca the PesquisaNomePeca to set
     */
    public void setPesquisaNomePeca(String PesquisaNomePeca) {
        this.PesquisaNomePeca = PesquisaNomePeca;
    }

    /**
     * @return the Fabricante
     */
    public String getFabricante() {
        return Fabricante;
    }

    /**
     * @param Fabricante the Fabricante to set
     */
    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    /**
     * @return the Cod_Barras
     */
    public String getCod_Barras() {
        return Cod_Barras;
    }

    /**
     * @param Cod_Barras the Cod_Barras to set
     */
    public void setCod_Barras(String Cod_Barras) {
        this.Cod_Barras = Cod_Barras;
    }
    
    
}
