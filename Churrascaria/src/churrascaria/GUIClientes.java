/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package churrascaria;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUIClientes extends javax.swing.JFrame {

    public GUIClientes() {
        initComponents();
        atualizaTabela();
    }

    public static void atualizaTabela() {
        DefaultTableModel tTabela = (DefaultTableModel) jTable2.getModel();
        tTabela.setNumRows(0);

        ArrayList<Cliente> clientes = Banco.getClientes();

        for (int linha = 0; linha < clientes.size(); linha++) {
            Cliente cliente = clientes.get(linha);

            tTabela.addRow(new Object[]{1});

            jTable2.setValueAt(cliente.getCodigo(), linha, 0);
            jTable2.setValueAt(cliente.getNome(), linha, 1);
            jTable2.setValueAt(cliente.getCpf(), linha, 2);
            jTable2.setValueAt(cliente.getDataCadastro(), linha, 3);
            jTable2.setValueAt(cliente.getEndereco().getRua(), linha, 4);
            jTable2.setValueAt(cliente.getEndereco().getBairro(), linha, 5);
            jTable2.setValueAt(cliente.getEndereco().getCidade(), linha, 6);
            jTable2.setValueAt(cliente.getEndereco().getCep(), linha, 7);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Novo = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Novo.setText("Novo");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Data de Cadastro", "Rua", "Bairro", "Cidade", "CEP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1325, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Novo)
                        .addGap(90, 90, 90)
                        .addComponent(Editar)
                        .addGap(92, 92, 92)
                        .addComponent(Remover)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Novo)
                    .addComponent(Remover)
                    .addComponent(Editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        JFrame novoCliente = new NovoCliente();
        novoCliente.setVisible(true);
    }//GEN-LAST:event_NovoActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        int linhaSelecionada = jTable2.getSelectedRow();
        if (linhaSelecionada >= 0){
            JFrame janelaAlterar = new AlterarCliente(linhaSelecionada);
            janelaAlterar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "É necessário selecionar um cliente", "Cliente", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        int linhaSelecionada = jTable2.getSelectedRow();

        if (linhaSelecionada >= 0){
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir o cliente?");
            if (resposta == JOptionPane.YES_OPTION){
                Cliente cliente = Banco.getClientes().get(linhaSelecionada);
                Banco.removeCliente(cliente);
                atualizaTabela();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "É necessário selecionar um cliente", "Cliente", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_RemoverActionPerformed

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
            java.util.logging.Logger.getLogger(GUIClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Remover;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
