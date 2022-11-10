/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Iniciar
 */
public class VendasPecasVO {
    
    private int IdVenda_Pecas;
    private String Data_VendaPecas;
    
    private int IDFuncionario_Vendedor;
    private int IDCliente;
    
    private float Total_Venda;

    private float Total_desconto;
    private float Total_venda_bruto;
    
    private float Estoque;
    
    
    private String Forma_pagamento;
    
    
    private float Valor_Entrada;
    private float Percentual_Juros_AM;
    private int Quant_Parcelas;
    private float Total_Prazo;
    private float Valor_Parcelas;
    private String Vencimento1;
    private String Vencimento2;
    private String Vencimento3;
    
    private String Situacao;
  
    private float Liquido;
    
    /**
     * @return the IdVenda_Pecas
     */
    public int getIdVenda_Pecas() {
        return IdVenda_Pecas;
    }

    /**
     * @param IdVenda_Pecas the IdVenda_Pecas to set
     */
    public void setIdVenda_Pecas(int IdVenda_Pecas) {
        this.IdVenda_Pecas = IdVenda_Pecas;
    }

    /**
     * @return the Data_VendaPecas
     */
    public String getData_VendaPecas() {
        return Data_VendaPecas;
    }

    /**
     * @param Data_VendaPecas the Data_VendaPecas to set
     */
    public void setData_VendaPecas(String Data_VendaPecas) {
        this.Data_VendaPecas = Data_VendaPecas;
    }

    /**
     * @return the IDFuncionario_Vendedor
     */
    public int getIDFuncionario_Vendedor() {
        return IDFuncionario_Vendedor;
    }

    /**
     * @param IDFuncionario_Vendedor the IDFuncionario_Vendedor to set
     */
    public void setIDFuncionario_Vendedor(int IDFuncionario_Vendedor) {
        this.IDFuncionario_Vendedor = IDFuncionario_Vendedor;
    }

    /**
     * @return the IDCliente
     */
    public int getIDCliente() {
        return IDCliente;
    }

    /**
     * @param IDCliente the IDCliente to set
     */
    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    /**
     * @return the Total_Venda
     */
    public float getTotal_Venda() {
        return Total_Venda;
    }

    /**
     * @param Total_Venda the Total_Venda to set
     */
    public void setTotal_Venda(float Total_Venda) {
        this.Total_Venda = Total_Venda;
    }

    /**
     * @return the Total_desconto
     */
    public float getTotal_desconto() {
        return Total_desconto;
    }

    /**
     * @param Total_desconto the Total_desconto to set
     */
    public void setTotal_desconto(float Total_desconto) {
        this.Total_desconto = Total_desconto;
    }

    /**
     * @return the Total_venda_bruto
     */
    public float getTotal_venda_bruto() {
        return Total_venda_bruto;
    }

    /**
     * @param Total_venda_bruto the Total_venda_bruto to set
     */
    public void setTotal_venda_bruto(float Total_venda_bruto) {
        this.Total_venda_bruto = Total_venda_bruto;
    }

    /**
     * @return the Forma_pagamento
     */
    public String getForma_pagamento() {
        return Forma_pagamento;
    }

    /**
     * @param Forma_pagamento the Forma_pagamento to set
     */
    public void setForma_pagamento(String Forma_pagamento) {
        this.Forma_pagamento = Forma_pagamento;
    }

    /**
     * @return the Estoque
     */
    public float getEstoque() {
        return Estoque;
    }

    /**
     * @param Estoque the Estoque to set
     */
    public void setEstoque(float Estoque) {
        this.Estoque = Estoque;
    }

    /**
     * @return the Valor_Entrada
     */
    public float getValor_Entrada() {
        return Valor_Entrada;
    }

    /**
     * @param Valor_Entrada the Valor_Entrada to set
     */
    public void setValor_Entrada(float Valor_Entrada) {
        this.Valor_Entrada = Valor_Entrada;
    }

    /**
     * @return the Percentual_Juros_AM
     */
    public float getPercentual_Juros_AM() {
        return Percentual_Juros_AM;
    }

    /**
     * @param Percentual_Juros_AM the Percentual_Juros_AM to set
     */
    public void setPercentual_Juros_AM(float Percentual_Juros_AM) {
        this.Percentual_Juros_AM = Percentual_Juros_AM;
    }

    /**
     * @return the Quant_Parcelas
     */
    public int getQuant_Parcelas() {
        return Quant_Parcelas;
    }

    /**
     * @param Quant_Parcelas the Quant_Parcelas to set
     */
    public void setQuant_Parcelas(int Quant_Parcelas) {
        this.Quant_Parcelas = Quant_Parcelas;
    }

    /**
     * @return the Total_Prazo
     */
    public float getTotal_Prazo() {
        return Total_Prazo;
    }

    /**
     * @param Total_Prazo the Total_Prazo to set
     */
    public void setTotal_Prazo(float Total_Prazo) {
        this.Total_Prazo = Total_Prazo;
    }

    /**
     * @return the Valor_Parcelas
     */
    public float getValor_Parcelas() {
        return Valor_Parcelas;
    }

    /**
     * @param Valor_Parcelas the Valor_Parcelas to set
     */
    public void setValor_Parcelas(float Valor_Parcelas) {
        this.Valor_Parcelas = Valor_Parcelas;
    }

    /**
     * @return the Vencimento1
     */
    public String getVencimento1() {
        return Vencimento1;
    }

    /**
     * @param Vencimento1 the Vencimento1 to set
     */
    public void setVencimento1(String Vencimento1) {
        this.Vencimento1 = Vencimento1;
    }

    /**
     * @return the Vencimento2
     */
    public String getVencimento2() {
        return Vencimento2;
    }

    /**
     * @param Vencimento2 the Vencimento2 to set
     */
    public void setVencimento2(String Vencimento2) {
        this.Vencimento2 = Vencimento2;
    }

    /**
     * @return the Vencimento3
     */
    public String getVencimento3() {
        return Vencimento3;
    }

    /**
     * @param Vencimento3 the Vencimento3 to set
     */
    public void setVencimento3(String Vencimento3) {
        this.Vencimento3 = Vencimento3;
    }

    /**
     * @return the Situacao
     */
    public String getSituacao() {
        return Situacao;
    }

    /**
     * @param Situacao the Situacao to set
     */
    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

    /**
     * @return the Liquido
     */
    public float getLiquido() {
        return Liquido;
    }

    /**
     * @param Liquido the Liquido to set
     */
    public void setLiquido(float Liquido) {
        this.Liquido = Liquido;
    }

    /**
     * @return the Vencimento1
     */
    
    

    
}
