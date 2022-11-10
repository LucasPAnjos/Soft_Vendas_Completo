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
public class Cadastro_NFVO {
   
   private int Id_Prod;
   private String Descrição;
   
   private String Numero_NF;
   private float Icms;
   private float Ipi;
   private float Valor_total_NF;
   
   private String Data_emissao_NF;
   private String Data_vencimento_NF;
   private float Quantidade_NF;

   private int Id_PecaEstoque;
   
   private String Situacao;

   private String Fornecedor;
   
    /**
     * @return the Numero_NF
     */
    public String getNumero_NF() {
        return Numero_NF;
    }

    /**
     * @param Numero_NF the Numero_NF to set
     */
    public void setNumero_NF(String Numero_NF) {
        this.Numero_NF = Numero_NF;
    }

    /**
     * @return the Icms
     */
    public float getIcms() {
        return Icms;
    }

    /**
     * @param Icms the Icms to set
     */
    public void setIcms(float Icms) {
        this.Icms = Icms;
    }

    /**
     * @return the Ipi
     */
    public float getIpi() {
        return Ipi;
    }

    /**
     * @param Ipi the Ipi to set
     */
    public void setIpi(float Ipi) {
        this.Ipi = Ipi;
    }

    /**
     * @return the Valor_total_NF
     */
    public float getValor_total_NF() {
        return Valor_total_NF;
    }

    /**
     * @param Valor_total_NF the Valor_total_NF to set
     */
    public void setValor_total_NF(float Valor_total_NF) {
        this.Valor_total_NF = Valor_total_NF;
    }

    /**
     * @return the Data_emissao_NF
     */
    public String getData_emissao_NF() {
        return Data_emissao_NF;
    }

    /**
     * @param Data_emissao_NF the Data_emissao_NF to set
     */
    public void setData_emissao_NF(String Data_emissao_NF) {
        this.Data_emissao_NF = Data_emissao_NF;
    }

    /**
     * @return the Data_vencimento_NF
     */
    public String getData_vencimento_NF() {
        return Data_vencimento_NF;
    }

    /**
     * @param Data_vencimento_NF the Data_vencimento_NF to set
     */
    public void setData_vencimento_NF(String Data_vencimento_NF) {
        this.Data_vencimento_NF = Data_vencimento_NF;
    }

    /**
     * @return the Quantidade_NF
     */
    public float getQuantidade_NF() {
        return Quantidade_NF;
    }

    /**
     * @param Quantidade_NF the Quantidade_NF to set
     */
    public void setQuantidade_NF(float Quantidade_NF) {
        this.Quantidade_NF = Quantidade_NF;
    }

    /**
     * @return the Id_PecaEstoque
     */
    public int getId_PecaEstoque() {
        return Id_PecaEstoque;
    }

    /**
     * @param Id_PecaEstoque the Id_PecaEstoque to set
     */
    public void setId_PecaEstoque(int Id_PecaEstoque) {
        this.Id_PecaEstoque = Id_PecaEstoque;
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
     * @return the Fornecedor
     */
    public String getFornecedor() {
        return Fornecedor;
    }

    /**
     * @param Fornecedor the Fornecedor to set
     */
    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    /**
     * @return the Id_Prod
     */
    public int getId_Prod() {
        return Id_Prod;
    }

    /**
     * @param Id_Prod the Id_Prod to set
     */
    public void setId_Prod(int Id_Prod) {
        this.Id_Prod = Id_Prod;
    }

    /**
     * @return the Descrição
     */
    public String getDescrição() {
        return Descrição;
    }

    /**
     * @param Descrição the Descrição to set
     */
    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }
  
   
    
}
