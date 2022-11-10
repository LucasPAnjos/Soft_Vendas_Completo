/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

import java.sql.Date;

/**
 *
 * @author Lucas
 */
public class CadastroAutomovelVO {

  private int id_cadastro;
  private String ano_fabricacao;
  private String ano_modelo;
  private String renavan;
  private String placa;
  private String chassi;
  private String cor_automovel;
  private String km;
  private String situacao;
  private float preco;
  private float preco_venda;
  private int Quant;
  private int Potencia;
  private int Cilindradas;
  private int Torque;
  private String LT;
  
  
  private String tipocombustivel;
  private String marca_automovel;
  private String vendedot;
  private String modelo;
  private String especie;
  private int portas;
  private String tipo;
  
  private int PesquisaAutomovel;

    /**
     * @return the id_cadastro
     */
    public int getId_cadastro() {
        return id_cadastro;
    }

    /**
     * @param id_
     * cadastro the id_cadastro to set
     */
    public void setId_cadastro(int id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

    /**
     * @return the ano_fabricacao
     */
    public String getAno_fabricacao() {
        return ano_fabricacao;
    }

    /**
     * @param ano_fabricacao the ano_fabricacao to set
     */
    public void setAno_fabricacao(String ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    /**
     * @return the ano_modelo
     */
    public String getAno_modelo() {
        return ano_modelo;
    }

    /**
     * @param ano_modelo the ano_modelo to set
     */
    public void setAno_modelo(String ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    /**
     * @return the renavan
     */
    public String getRenavan() {
        return renavan;
    }

    /**
     * @param renavan the renavan to set
     */
    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * @return the cor_automovel
     */
    public String getCor_automovel() {
        return cor_automovel;
    }

    /**
     * @param cor_automovel the cor_automovel to set
     */
    public void setCor_automovel(String cor_automovel) {
        this.cor_automovel = cor_automovel;
    }

    /**
     * @return the km
     */
    public String getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(String km) {
        this.km = km;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the tipocombustivel
     */
    public String getTipocombustivel() {
        return tipocombustivel;
    }

    /**
     * @param tipocombustivel the tipocombustivel to set
     */
    public void setTipocombustivel(String tipocombustivel) {
        this.tipocombustivel = tipocombustivel;
    }

    /**
     * @return the marca_automovel
     */
    public String getMarca_automovel() {
        return marca_automovel;
    }

    /**
     * @param marca_automovel the marca_automovel to set
     */
    public void setMarca_automovel(String marca_automovel) {
        this.marca_automovel = marca_automovel;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the preco_venda
     */
    public float getPreco_venda() {
        return preco_venda;
    }

    /**
     * @param preco_venda the preco_venda to set
     */
    public void setPreco_venda(float preco_venda) {
        this.preco_venda = preco_venda;
    }

    /**
     * @return the PesquisaAutomovel
     */
    public int getPesquisaAutomovel() {
        return PesquisaAutomovel;
    }

    /**
     * @param PesquisaAutomovel the PesquisaAutomovel to set
     */
    public void setPesquisaAutomovel(int PesquisaAutomovel) {
        this.PesquisaAutomovel = PesquisaAutomovel;
    }

    /**
     * @return the Quant
     */
    public int getQuant() {
        return Quant;
    }

    /**
     * @param Quant the Quant to set
     */
    public void setQuant(int Quant) {
        this.Quant = Quant;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the portas
     */
    

    /**
     * @return the Potencia
     */
    public int getPotencia() {
        return Potencia;
    }

    /**
     * @param Potencia the Potencia to set
     */
    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    /**
     * @return the Cilindradas
     */
    public int getCilindradas() {
        return Cilindradas;
    }

    /**
     * @param Cilindradas the Cilindradas to set
     */
    public void setCilindradas(int Cilindradas) {
        this.Cilindradas = Cilindradas;
    }

    /**
     * @return the Torque
     */
    public int getTorque() {
        return Torque;
    }

    /**
     * @param Torque the Torque to set
     */
    public void setTorque(int Torque) {
        this.Torque = Torque;
    }

    /**
     * @return the LT
     */
    public String getLT() {
        return LT;
    }

    /**
     * @param LT the LT to set
     */
    public void setLT(String LT) {
        this.LT = LT;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the portas
     */
    public int getPortas() {
        return portas;
    }

    /**
     * @param portas the portas to set
     */
    public void setPortas(int portas) {
        this.portas = portas;
    }

}
