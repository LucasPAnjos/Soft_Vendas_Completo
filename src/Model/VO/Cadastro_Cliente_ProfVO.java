/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

import java.time.Year;

/**
 *
 * @author Lucas
 */
public class Cadastro_Cliente_ProfVO {
    
    private int id_Clinte_prof;
    private String ocupacao;
    private String profissao;
    private float renda_principal;
    private int tempo_servico;
    
    private String Cadastro_cliente;

    private int Pesquisar_ClienteProfissional;
    
    /**
     * @return the id_Clinte_prof
     */
    public int getId_Clinte_prof() {
        return id_Clinte_prof;
    }

    /**
     * @param id_Clinte_prof the id_Clinte_prof to set
     */
    public void setId_Clinte_prof(int id_Clinte_prof) {
        this.id_Clinte_prof = id_Clinte_prof;
    }

    /**
     * @return the ocupacao
     */
    public String getOcupacao() {
        return ocupacao;
    }

    /**
     * @param ocupacao the ocupacao to set
     */
    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the renda_principal
     */
    public float getRenda_principal() {
        return renda_principal;
    }

    /**
     * @param renda_principal the renda_principal to set
     */
    public void setRenda_principal(float renda_principal) {
        this.renda_principal = renda_principal;
    }

    /**
     * @return the tempo_servico
     */
    public int getTempo_servico() {
        return tempo_servico;
    }

    /**
     * @param tempo_servico the tempo_servico to set
     */
    public void setTempo_servico(int tempo_servico) {
        this.tempo_servico = tempo_servico;
    }

    /**
     * @return the Cadastro_cliente
     */
    public String getCadastro_cliente() {
        return Cadastro_cliente;
    }

    /**
     * @param Cadastro_cliente the Cadastro_cliente to set
     */
    public void setCadastro_cliente(String Cadastro_cliente) {
        this.Cadastro_cliente = Cadastro_cliente;
    }

    /**
     * @return the Pesquisar_ClienteProfissional
     */
    public int getPesquisar_ClienteProfissional() {
        return Pesquisar_ClienteProfissional;
    }

    /**
     * @param Pesquisar_ClienteProfissional the Pesquisar_ClienteProfissional to set
     */
    public void setPesquisar_ClienteProfissional(int Pesquisar_ClienteProfissional) {
        this.Pesquisar_ClienteProfissional = Pesquisar_ClienteProfissional;
    }

}