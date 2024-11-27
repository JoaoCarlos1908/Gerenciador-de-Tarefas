package Telas;


import Classes.GerenciadorDeTarefas;
import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class btnEditar extends javax.swing.JPanel {

    JPanel painelPrincipal;
    GerenciadorDeTarefas gerenciar;
    JPanel jplBotoes;
    ColorPriorit cor;
    editarVisualizar telaEditar;
    
    public btnEditar(JPanel painelPrincipal, JPanel jplBotoes) {
        initComponents();
         this.painelPrincipal = painelPrincipal; // Guarda a referência da tela principal
         this.jplBotoes = jplBotoes;
         gerenciar = new GerenciadorDeTarefas(jplBotoes, painelPrincipal);
         cor = new ColorPriorit(telaEditar, true, jplBotoes, painelPrincipal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExcluir = new javax.swing.JButton();
        btnCor = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cor.png"))); // NOI18N
        btnCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(btnCor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        gerenciar.remover();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorActionPerformed
        cor.setVisible(true);
    }//GEN-LAST:event_btnCorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCor;
    private javax.swing.JButton btnExcluir;
    // End of variables declaration//GEN-END:variables
}
