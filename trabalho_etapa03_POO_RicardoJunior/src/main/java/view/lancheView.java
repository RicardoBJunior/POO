/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import conexao.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Cardapio;
import model.Lanche;
import model.Prato;
import model.PratoLista;

/**
 *
 * @author ricar
 */
public class lancheView extends javax.swing.JFrame {

    /**
     * Creates new form lancheView
     */
    public lancheView() {
        super("Cadastrar lanche");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPao = new javax.swing.JTextField();
        txtRecheio = new javax.swing.JTextField();
        txtMolho = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnCadLanche = new javax.swing.JButton();
        txtDataValidade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Pão");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Molho");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Recheio");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Preco");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Peso");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Data Validade");

        txtPao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaoActionPerformed(evt);
            }
        });

        txtRecheio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMolho.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtPreco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtPeso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        btnCadLanche.setText("Cadastrar");
        btnCadLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadLancheActionPerformed(evt);
            }
        });

        try {
            txtDataValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataValidade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPao)
                    .addComponent(txtRecheio)
                    .addComponent(txtMolho)
                    .addComponent(txtNome)
                    .addComponent(txtPreco)
                    .addComponent(txtPeso)
                    .addComponent(txtDataValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRecheio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMolho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadLanche)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void btnCadLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadLancheActionPerformed
        // TODO add your handling code here:
         String pao = txtPao.getText();
        String recheio = txtRecheio.getText();
        String molho = txtMolho.getText();
        String nome = txtNome.getText();
        Double preco = Double.parseDouble(txtPreco.getText());
        Date data = null;
        try {
                    data = new SimpleDateFormat("dd/MM/yyyy").parse(txtDataValidade.getText());
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
       
        Double peso = Double.parseDouble(txtPeso.getText());
        
        Lanche lanche = new Lanche(pao, recheio, molho, nome, preco, data, peso);
        Cardapio.adicionarPrato(lanche);
        
               Connection connection = ConexaoBanco.getConnection();
try {
   
    String query = "INSERT INTO lanche (pao, recheio, molho, nome, preco, dataDeValidade, peso) VALUES (?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, lanche.getPao());
    statement.setString(2, lanche.getRecheio());
    statement.setString(3, lanche.getMolho());
    statement.setString(4, lanche.getNome());
    statement.setDouble(5, lanche.getPreco());
    statement.setDate(6, new java.sql.Date(lanche.getDataDeValidade().getTime()));
    statement.setDouble(7, lanche.getPeso());
    
    statement.executeUpdate();
    
    JOptionPane.showMessageDialog(lancheView.this, "Lanche cadastrado com sucesso!");
    limparCampos();
    exibirPratosCadastrados();
    
    statement.close();
    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(lancheView.this, "Erro ao cadastrar o lanche");
}
      
    }//GEN-LAST:event_btnCadLancheActionPerformed

    private void txtPaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaoActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_txtPaoActionPerformed

        private void exibirPratosCadastrados() {
    StringBuilder sb = new StringBuilder();
    for (Prato prato : PratoLista.getPratosDisponiveis()) {
        sb.append(prato.toString()).append("\n");
    }
    JOptionPane.showMessageDialog(lancheView.this, "Pratos cadastrados:\n" + sb.toString());
}
    
    private void limparCampos() {
        txtPao.setText("");
        txtRecheio.setText("");
        txtMolho.setText("");
        txtNome.setText("");
        txtPreco.setText("");
        txtDataValidade.setText("");
        txtPeso.setText("");
        
    }
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
            java.util.logging.Logger.getLogger(lancheView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lancheView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lancheView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lancheView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lancheView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadLanche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtDataValidade;
    private javax.swing.JTextField txtMolho;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPao;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtRecheio;
    // End of variables declaration//GEN-END:variables
}
