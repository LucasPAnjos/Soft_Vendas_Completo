/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.BD.Conecta_Banco;
import Model.VO.Cadastro_FuncionarioVO;
import View.Complementares.JI_Cargo;
import View.Complementares.JI_Cargo;
import View.Complementares.JI_Formacao;
import View.Complementares.JI_Setor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Frm_LoginInicial extends javax.swing.JFrame {

    Conecta_Banco Conexao = new Conecta_Banco();
  

Cadastro_FuncionarioVO ModFuncionario = new Cadastro_FuncionarioVO();    
    
    /**
     * Creates new form Frm_Principal
     */
    public Frm_LoginInicial() {
        initComponents();
        
        Conexao.conexao();
        
        Login_Inicial();
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Iniciar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticação");
        setResizable(false);
        setSize(new java.awt.Dimension(820, 535));

        jDesktopPanePrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPanePrincipal.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SENHA");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icones/secrecy-icon.png"))); // NOI18N

        Iniciar.setText("Entrar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jDesktopPanePrincipal.setLayer(jTextFieldLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePrincipal.setLayer(jPasswordFieldSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePrincipal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePrincipal.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePrincipal.setLayer(Iniciar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePrincipal.setLayer(jButtonSair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePrincipalLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPanePrincipalLayout.createSequentialGroup()
                            .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(258, 258, 258))
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanePrincipalLayout.createSequentialGroup()
                .addGroup(jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPanePrincipalLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Iniciar)
                            .addComponent(jButtonSair)))
                    .addGroup(jDesktopPanePrincipalLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton1)))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanePrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanePrincipal)
                .addContainerGap())
        );

        setBounds(0, 0, 836, 574);
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
        
        Verificar_login_acesso();
        
    }//GEN-LAST:event_IniciarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        
        dispose();
        
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_LoginInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_LoginInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_LoginInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_LoginInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_LoginInicial().setVisible(true);
            }
        });
        
    }

  public void Verificar_login_acesso() {
  
      String nome_acesso = jTextFieldLogin.getText(),senha_acesso = jPasswordFieldSenha.getText();
      int res=0, qt_acesso=0;
      if (nome_acesso.equals("")) {
            JOptionPane.showMessageDialog(null, "Campos Login ou Senha Não Podem Ser Vazio!");
       
      
      } else
      
          if (senha_acesso.equals("")){
              
              JOptionPane.showMessageDialog(null, "Campos Login ou Senha Não Podem Ser Vazio!");
          
          }else{
              
      try {
          
    Conexao.executaSQL("select * from login where Nome_acesso ='"+jTextFieldLogin.getText()+"'");
  
    Conexao.rs.first();


    if(Conexao.rs.getString("Senha").equals(jPasswordFieldSenha.getText())){
      
      Frm_Principal Frm = new Frm_Principal(jTextFieldLogin.getText());
      Frm.setVisible(true);
      dispose();
        }
    
  else{
        JOptionPane.showMessageDialog(rootPane, "Login ou Senha Inválido!");
    
    }
        
      }catch (SQLException ex){
     
      JOptionPane.showMessageDialog(rootPane, "Login ou Senha Inválido!");

             
      }
  }
        
  
  }
    

  public void Login_Inicial (){
      
      Conexao.conexao();
        
        try {
        
            
            Conexao.executaSQL("SELECT * FROM login");
        
            
            if(Conexao.rs.first()){
                
                
            }else{
            
            PreparedStatement pst = Conexao.conn.prepareStatement("INSERT INTO lojaautomoveis.login (`Nome_acesso`, `Senha`, `Permissao`, `Funcionario_Dados_idFuncionario`) VALUES ('Adm', '12345', 'Adm_Inicial', NULL)");
           
            
                pst.execute();
 
                JOptionPane.showMessageDialog(null, "Login Inicial Criado: User: Adm, Senha: 12345");
                
            } 
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Problema de Inicialização!"+ "Login Inicial");
        }
        
    }

      
   

    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
