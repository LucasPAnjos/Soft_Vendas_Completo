/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Complementares;

import Model.BD.Conecta_Banco;
import Model.BO.Adicionar_ProdutosBO;
import Model.DAO.PecasDAO;
import Model.VO.ModeloTabela;
import Model.VO.SCadastro_PecasVO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Lucas
 */
public class Frm_CategoriaContas extends javax.swing.JFrame {

    /**
     * Creates new form Frm_CategoriaContas
     */
    
    
    Conecta_Banco Conexao = new Conecta_Banco();
    SCadastro_PecasVO ModPecas = new SCadastro_PecasVO();
    PecasDAO ControlPecas = new PecasDAO();
    Adicionar_ProdutosBO ProdutosBO = new Adicionar_ProdutosBO();
    
    public Frm_CategoriaContas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldId = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNome = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListarPecas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldcod = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDistribuidor = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código");

        jLabel2.setText("Descrição");

        jTableListarPecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableListarPecas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarPecasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListarPecas);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText(" Listar Cadastrados");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cód. Barras");

        jLabel3.setText("Distribuidor/Fabricante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldcod)
                            .addComponent(jFormattedTextFieldNome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextFieldDistribuidor))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jFormattedTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableListarPecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarPecasMouseClicked
        // TODO add your handling code here:

//        Valores_TabelaPesquisa();

//        jButtonPesquisarActionPerformed(null);
        
    }//GEN-LAST:event_jTableListarPecasMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
        PreencherTabelaPecas("SELECT * FROM pecas WHERE aplicacao ='"+"Contas"+"'");
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
        int cod_pecas;
        ModPecas.setNome_pecas(jFormattedTextFieldNome.getText());
        ModPecas.setAplicacao("Contas");
        ModPecas.setFabricante(jFormattedTextFieldDistribuidor.getText());
        ModPecas.setCod_Barras(jFormattedTextFieldcod.getText());
        
        ProdutosBO.Verificar_Produtos(ModPecas);

        Registo_Cadastro();
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    
           public void Registo_Cadastro (){
           
        Conexao.conexao();
        
        Conexao.executaSQL("select * from pecas");
        try {
            Conexao.rs.last();

            String cod_pecas = Conexao.rs.getString("idPecas");
            jFormattedTextFieldId.setText(String.valueOf(cod_pecas));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Registro Localizado!");
        }

           }
    
    public void PreencherTabelaPecas (String sql){
        
        Conexao.conexao();
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"Código", "Descrição","Fabricante"};
    
    
    Conexao.executaSQL(sql);
    
        try {
            Conexao.rs.first();
            
            do{
                dados.add(new Object [] {Conexao.rs.getString("idPecas"),Conexao.rs.getString("nome_peca"),Conexao.rs.getString("fabricante_pecas_idfabricante_pecas")});
            }while (Conexao.rs.next()); 
                          
            } catch (Exception ex) {
            // JOptionPane.showMessageDialog(null, "Erro no preenchimento do Array List "+ex);
        }
                
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
       
        
        jTableListarPecas.setModel(modelo);
        
        jTableListarPecas.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableListarPecas.getColumnModel().getColumn(0).setResizable(false);
        jTableListarPecas.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTableListarPecas.getColumnModel().getColumn(1).setResizable(false);
        jTableListarPecas.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTableListarPecas.getColumnModel().getColumn(2).setResizable(false);
        
        jTableListarPecas.setAutoResizeMode(jTableListarPecas.AUTO_RESIZE_OFF);
        jTableListarPecas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        Conexao.desconecta();
        
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldDistribuidor;
    private javax.swing.JFormattedTextField jFormattedTextFieldId;
    private javax.swing.JFormattedTextField jFormattedTextFieldNome;
    private javax.swing.JFormattedTextField jFormattedTextFieldcod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableListarPecas;
    // End of variables declaration//GEN-END:variables
}
