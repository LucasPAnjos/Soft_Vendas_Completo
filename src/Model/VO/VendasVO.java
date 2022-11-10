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
public class VendasVO {
    
    private int id_venda;
    private String Data_venda;
    private float Valor_Venda;
    private int vendedor;
    private int gerente;
    private int cliente;
    private int forma_pagamento;

    
    private String Buscar_vendedor;
    private String Buscar_gerente;
    private String Buscar_cliente;
    private String Buscar_forma_pagamento;
    private String CPF_Vendedor;
    private String RG_Vendedor;
    
    
    private String placa_vandas;
    private String CadastroGerente;
    
    private int id_itens_vendas;
    private int IDAutomovel;
    private int ID_Venda;
    
    private int quantidade_venda;

    private float Total_Venda_Automoveis;
    
    /**
     * @return the id_venda
     */
    public int getId_venda() {
        return id_venda;
    }

    /**
     * @param id_venda the id_venda to set
     */
    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    /**
     * @return the Data_venda
     */
    public String getData_venda() {
        return Data_venda;
    }

    /**
     * @param Data_venda the Data_venda to set
     */
    public void setData_venda(String Data_venda) {
        this.Data_venda = Data_venda;
    }

    /**
     * @return the Valor_Venda
     */
    public float getValor_Venda() {
        return Valor_Venda;
    }

    /**
     * @param Valor_Venda the Valor_Venda to set
     */
    public void setValor_Venda(float Valor_Venda) {
        this.Valor_Venda = Valor_Venda;
    }

    /**
     * @return the vendedor
     */
    public int getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the gerente
     */
    public int getGerente() {
        return gerente;
    }

    /**
     * @param gerente the gerente to set
     */
    public void setGerente(int gerente) {
        this.gerente = gerente;
    }

    /**
     * @return the cliente
     */
    public int getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the forma_pagamento
     */
    public int getForma_pagamento() {
        return forma_pagamento;
    }

    /**
     * @param forma_pagamento the forma_pagamento to set
     */
    public void setForma_pagamento(int forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    /**
     * @return the id_itens_vendas
     */
    public int getId_itens_vendas() {
        return id_itens_vendas;
    }

    /**
     * @param id_itens_vendas the id_itens_vendas to set
     */
    public void setId_itens_vendas(int id_itens_vendas) {
        this.id_itens_vendas = id_itens_vendas;
    }

    /**
     * @return the IDAutomovel
     */
    public int getIDAutomovel() {
        return IDAutomovel;
    }

    /**
     * @param IDAutomovel the IDAutomovel to set
     */
    public void setIDAutomovel(int IDAutomovel) {
        this.IDAutomovel = IDAutomovel;
    }

    /**
     * @return the ID_Venda
     */
    public int getID_Venda() {
        return ID_Venda;
    }

    /**
     * @param ID_Venda the ID_Venda to set
     */
    public void setID_Venda(int ID_Venda) {
        this.ID_Venda = ID_Venda;
    }

    /**
     * @return the quantidade_venda
     */
    public int getQuantidade_venda() {
        return quantidade_venda;
    }

    /**
     * @param quantidade_venda the quantidade_venda to set
     */
    public void setQuantidade_venda(int quantidade_venda) {
        this.quantidade_venda = quantidade_venda;
    }

    /**
     * @return the placa_vandas
     */
    public String getPlaca_vandas() {
        return placa_vandas;
    }

    /**
     * @param placa_vandas the placa_vandas to set
     */
    public void setPlaca_vandas(String placa_vandas) {
        this.placa_vandas = placa_vandas;
    }

    /**
     * @return the CadastroGerente
     */
    public String getCadastroGerente() {
        return CadastroGerente;
    }

    /**
     * @param CadastroGerente the CadastroGerente to set
     */
    public void setCadastroGerente(String CadastroGerente) {
        this.CadastroGerente = CadastroGerente;
    }

    /**
     * @return the Buscar_vendedor
     */
    public String getBuscar_vendedor() {
        return Buscar_vendedor;
    }

    /**
     * @param Buscar_vendedor the Buscar_vendedor to set
     */
    public void setBuscar_vendedor(String Buscar_vendedor) {
        this.Buscar_vendedor = Buscar_vendedor;
    }

    /**
     * @return the Buscar_gerente
     */
    public String getBuscar_gerente() {
        return Buscar_gerente;
    }

    /**
     * @param Buscar_gerente the Buscar_gerente to set
     */
    public void setBuscar_gerente(String Buscar_gerente) {
        this.Buscar_gerente = Buscar_gerente;
    }

    /**
     * @return the Buscar_cliente
     */
    public String getBuscar_cliente() {
        return Buscar_cliente;
    }

    /**
     * @param Buscar_cliente the Buscar_cliente to set
     */
    public void setBuscar_cliente(String Buscar_cliente) {
        this.Buscar_cliente = Buscar_cliente;
    }

    /**
     * @return the Buscar_forma_pagamento
     */
    public String getBuscar_forma_pagamento() {
        return Buscar_forma_pagamento;
    }

    /**
     * @param Buscar_forma_pagamento the Buscar_forma_pagamento to set
     */
    public void setBuscar_forma_pagamento(String Buscar_forma_pagamento) {
        this.Buscar_forma_pagamento = Buscar_forma_pagamento;
    }

    /**
     * @return the Total_Venda_Automoveis
     */
    public float getTotal_Venda_Automoveis() {
        return Total_Venda_Automoveis;
    }

    /**
     * @param Total_Venda_Automoveis the Total_Venda_Automoveis to set
     */
    public void setTotal_Venda_Automoveis(float Total_Venda_Automoveis) {
        this.Total_Venda_Automoveis = Total_Venda_Automoveis;
    }

    /**
     * @return the CPF_Vendedor
     */
    public String getCPF_Vendedor() {
        return CPF_Vendedor;
    }

    /**
     * @param CPF_Vendedor the CPF_Vendedor to set
     */
    public void setCPF_Vendedor(String CPF_Vendedor) {
        this.CPF_Vendedor = CPF_Vendedor;
    }

    /**
     * @return the RG_Vendedor
     */
    public String getRG_Vendedor() {
        return RG_Vendedor;
    }

    /**
     * @param RG_Vendedor the RG_Vendedor to set
     */
    public void setRG_Vendedor(String RG_Vendedor) {
        this.RG_Vendedor = RG_Vendedor;
    }

   
}
