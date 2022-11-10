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
public class Estoque_ProdutosVO {
    
   private int Id_Estoque;
   private float Estoque_minimo;
   private float Estoque_maximo;
   private float Quantidade_em_Estoque;
   private float Valor_em_Estoque;
   private String Numero_NF;
   private float Icms;
   private float Ipi;
   private float Valor_total_NF;
   
   private int Id_NF;
   
   private String Data_emissao_NF;
   private String Data_vencimento_NF;
   private float Quantidade_adicionar;
   private float Valor_compra_unitario;
   private float Margem_lucro;
   private float Valor_venda_unitario;
   private float Valor_venda_total;
   
   private float Quantidade_NF;
   
   private int Id_Peca_Estoque;

   private int Fornecedor;
   private String Forncedor;
   
   private String data_fabr;
   private String data_vencimento;
   private String unidade_medida;
   
    /**
     * @return the Id_Estoque
     */
    public int getId_Estoque() {
        return Id_Estoque;
    }

    /**
     * @param Id_Estoque the Id_Estoque to set
     */
    public void setId_Estoque(int Id_Estoque) {
        this.Id_Estoque = Id_Estoque;
    }

    /**
     * @return the Estoque_minimo
     */
    public float getEstoque_minimo() {
        return Estoque_minimo;
    }

    /**
     * @param Estoque_minimo the Estoque_minimo to set
     */
    public void setEstoque_minimo(float Estoque_minimo) {
        this.Estoque_minimo = Estoque_minimo;
    }

    /**
     * @return the Estoque_maximo
     */
    public float getEstoque_maximo() {
        return Estoque_maximo;
    }

    /**
     * @param Estoque_maximo the Estoque_maximo to set
     */
    public void setEstoque_maximo(float Estoque_maximo) {
        this.Estoque_maximo = Estoque_maximo;
    }

    /**
     * @return the Quantidade_em_Estoque
     */
    public float getQuantidade_em_Estoque() {
        return Quantidade_em_Estoque;
    }

    /**
     * @param Quantidade_em_Estoque the Quantidade_em_Estoque to set
     */
    public void setQuantidade_em_Estoque(float Quantidade_em_Estoque) {
        this.Quantidade_em_Estoque = Quantidade_em_Estoque;
    }

    /**
     * @return the Valor_em_Estoque
     */
    public float getValor_em_Estoque() {
        return Valor_em_Estoque;
    }

    /**
     * @param Valor_em_Estoque the Valor_em_Estoque to set
     */
    public void setValor_em_Estoque(float Valor_em_Estoque) {
        this.Valor_em_Estoque = Valor_em_Estoque;
    }

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
     * @return the Quantidade_adicionar
     */
    public float getQuantidade_adicionar() {
        return Quantidade_adicionar;
    }

    /**
     * @param Quantidade_adicionar the Quantidade_adicionar to set
     */
    public void setQuantidade_adicionar(float Quantidade_adicionar) {
        this.Quantidade_adicionar = Quantidade_adicionar;
    }

    /**
     * @return the Valor_compra_unitario
     */
    public float getValor_compra_unitario() {
        return Valor_compra_unitario;
    }

    /**
     * @param Valor_compra_unitario the Valor_compra_unitario to set
     */
    public void setValor_compra_unitario(float Valor_compra_unitario) {
        this.Valor_compra_unitario = Valor_compra_unitario;
    }

    /**
     * @return the Margem_lucro
     */
    public float getMargem_lucro() {
        return Margem_lucro;
    }

    /**
     * @param Margem_lucro the Margem_lucro to set
     */
    public void setMargem_lucro(float Margem_lucro) {
        this.Margem_lucro = Margem_lucro;
    }

    /**
     * @return the Valor_venda_unitario
     */
    public float getValor_venda_unitario() {
        return Valor_venda_unitario;
    }

    /**
     * @param Valor_venda_unitario the Valor_venda_unitario to set
     */
    public void setValor_venda_unitario(float Valor_venda_unitario) {
        this.Valor_venda_unitario = Valor_venda_unitario;
    }

    /**
     * @return the Valor_venda_total
     */
    public float getValor_venda_total() {
        return Valor_venda_total;
    }

    /**
     * @param Valor_venda_total the Valor_venda_total to set
     */
    public void setValor_venda_total(float Valor_venda_total) {
        this.Valor_venda_total = Valor_venda_total;
    }

    /**
     * @return the Id_Peca_Estoque
     */
    public int getId_Peca_Estoque() {
        return Id_Peca_Estoque;
    }

    /**
     * @param Id_Peca_Estoque the Id_Peca_Estoque to set
     */
    public void setId_Peca_Estoque(int Id_Peca_Estoque) {
        this.Id_Peca_Estoque = Id_Peca_Estoque;
    }

    /**
     * @return the Fornecedor
     */
    public int getFornecedor() {
        return Fornecedor;
    }

    /**
     * @param Fornecedor the Fornecedor to set
     */
    public void setFornecedor(int Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    /**
     * @return the Forncedor
     */
    public String getForncedor() {
        return Forncedor;
    }

    /**
     * @param Forncedor the Forncedor to set
     */
    public void setForncedor(String Forncedor) {
        this.Forncedor = Forncedor;
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
     * @return the Id_NF
     */
    public int getId_NF() {
        return Id_NF;
    }

    /**
     * @param Id_NF the Id_NF to set
     */
    public void setId_NF(int Id_NF) {
        this.Id_NF = Id_NF;
    }

    /**
     * @return the data_fabr
     */
    public String getData_fabr() {
        return data_fabr;
    }

    /**
     * @param data_fabr the data_fabr to set
     */
    public void setData_fabr(String data_fabr) {
        this.data_fabr = data_fabr;
    }

    /**
     * @return the data_vencimento
     */
    public String getData_vencimento() {
        return data_vencimento;
    }

    /**
     * @param data_vencimento the data_vencimento to set
     */
    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    /**
     * @return the unidade_medida
     */
    public String getUnidade_medida() {
        return unidade_medida;
    }

    /**
     * @param unidade_medida the unidade_medida to set
     */
    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }
   
}
