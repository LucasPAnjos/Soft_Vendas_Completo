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
public class ContasReceberVO {

private String Nome_Cliente_ContasReceber;
private int Id_Cliente_ContasReceber;
private String cpf_ContasReceber;
private String Data_Compra_ContasReceber;
private String Vencimento_NF_ContasReceber;
private int Id_Venda;
private String RG;

private float Vl_Entrada;
private float Juros;
private float Total_Prazo;
private int quantidade_Parcelas;
private float Valor_Parcelas;
private String Venc_Parcela1;
private String Venc_Parcela2;
private String Venc_Parcela3;

private float Valor_Liquido;

private String Pesquisa_Selecionar; 

private float Valor_dinheiro;

    /**
     * @return the Nome_Cliente_ContasReceber
     */
    public String getNome_Cliente_ContasReceber() {
        return Nome_Cliente_ContasReceber;
    }

    /**
     * @param Nome_Cliente_ContasReceber the Nome_Cliente_ContasReceber to set
     */
    public void setNome_Cliente_ContasReceber(String Nome_Cliente_ContasReceber) {
        this.Nome_Cliente_ContasReceber = Nome_Cliente_ContasReceber;
    }

    /**
     * @return the Id_Cliente_ContasReceber
     */
    public int getId_Cliente_ContasReceber() {
        return Id_Cliente_ContasReceber;
    }

    /**
     * @param Id_Cliente_ContasReceber the Id_Cliente_ContasReceber to set
     */
    public void setId_Cliente_ContasReceber(int Id_Cliente_ContasReceber) {
        this.Id_Cliente_ContasReceber = Id_Cliente_ContasReceber;
    }

    /**
     * @return the cpf_ContasReceber
     */
    public String getCpf_ContasReceber() {
        return cpf_ContasReceber;
    }

    /**
     * @param cpf_ContasReceber the cpf_ContasReceber to set
     */
    public void setCpf_ContasReceber(String cpf_ContasReceber) {
        this.cpf_ContasReceber = cpf_ContasReceber;
    }

    /**
     * @return the Data_Compra_ContasReceber
     */
    public String getData_Compra_ContasReceber() {
        return Data_Compra_ContasReceber;
    }

    /**
     * @param Data_Compra_ContasReceber the Data_Compra_ContasReceber to set
     */
    public void setData_Compra_ContasReceber(String Data_Compra_ContasReceber) {
        this.Data_Compra_ContasReceber = Data_Compra_ContasReceber;
    }

    /**
     * @return the Vencimento_NF_ContasReceber
     */
    public String getVencimento_NF_ContasReceber() {
        return Vencimento_NF_ContasReceber;
    }

    /**
     * @param Vencimento_NF_ContasReceber the Vencimento_NF_ContasReceber to set
     */
    public void setVencimento_NF_ContasReceber(String Vencimento_NF_ContasReceber) {
        this.Vencimento_NF_ContasReceber = Vencimento_NF_ContasReceber;
    }

    /**
     * @return the Id_Venda
     */
    public int getId_Venda() {
        return Id_Venda;
    }

    /**
     * @param Id_Venda the Id_Venda to set
     */
    public void setId_Venda(int Id_Venda) {
        this.Id_Venda = Id_Venda;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the Vl_Entrada
     */
    public float getVl_Entrada() {
        return Vl_Entrada;
    }

    /**
     * @param Vl_Entrada the Vl_Entrada to set
     */
    public void setVl_Entrada(float Vl_Entrada) {
        this.Vl_Entrada = Vl_Entrada;
    }

    /**
     * @return the Juros
     */
    public float getJuros() {
        return Juros;
    }

    /**
     * @param Juros the Juros to set
     */
    public void setJuros(float Juros) {
        this.Juros = Juros;
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
     * @return the quantidade_Parcelas
     */
    public int getQuantidade_Parcelas() {
        return quantidade_Parcelas;
    }

    /**
     * @param quantidade_Parcelas the quantidade_Parcelas to set
     */
    public void setQuantidade_Parcelas(int quantidade_Parcelas) {
        this.quantidade_Parcelas = quantidade_Parcelas;
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
     * @return the Venc_Parcela1
     */
    public String getVenc_Parcela1() {
        return Venc_Parcela1;
    }

    /**
     * @param Venc_Parcela1 the Venc_Parcela1 to set
     */
    public void setVenc_Parcela1(String Venc_Parcela1) {
        this.Venc_Parcela1 = Venc_Parcela1;
    }

    /**
     * @return the Venc_Parcela2
     */
    public String getVenc_Parcela2() {
        return Venc_Parcela2;
    }

    /**
     * @param Venc_Parcela2 the Venc_Parcela2 to set
     */
    public void setVenc_Parcela2(String Venc_Parcela2) {
        this.Venc_Parcela2 = Venc_Parcela2;
    }

    /**
     * @return the Venc_Parcela3
     */
    public String getVenc_Parcela3() {
        return Venc_Parcela3;
    }

    /**
     * @param Venc_Parcela3 the Venc_Parcela3 to set
     */
    public void setVenc_Parcela3(String Venc_Parcela3) {
        this.Venc_Parcela3 = Venc_Parcela3;
    }

    /**
     * @return the Valor_Liquido
     */
    public float getValor_Liquido() {
        return Valor_Liquido;
    }

    /**
     * @param Valor_Liquido the Valor_Liquido to set
     */
    public void setValor_Liquido(float Valor_Liquido) {
        this.Valor_Liquido = Valor_Liquido;
    }

    /**
     * @return the Pesquisa_Selecionar
     */
    public String getPesquisa_Selecionar() {
        return Pesquisa_Selecionar;
    }

    /**
     * @param Pesquisa_Selecionar the Pesquisa_Selecionar to set
     */
    public void setPesquisa_Selecionar(String Pesquisa_Selecionar) {
        this.Pesquisa_Selecionar = Pesquisa_Selecionar;
    }

    /**
     * @return the Valor_dinheiro
     */
    public float getValor_dinheiro() {
        return Valor_dinheiro;
    }

    /**
     * @param Valor_dinheiro the Valor_dinheiro to set
     */
    public void setValor_dinheiro(float Valor_dinheiro) {
        this.Valor_dinheiro = Valor_dinheiro;
    }


    /**
     * @return the Nome_Cliente_ContasReceber
     */
   
}
