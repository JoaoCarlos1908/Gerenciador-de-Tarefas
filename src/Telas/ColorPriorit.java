
package Telas;

import Classes.GerenciadorDeTarefas;
import com.sun.prism.paint.Color;
import javax.swing.JPanel;

public class ColorPriorit extends javax.swing.JFrame {

   editarVisualizar telaEditar;
   Boolean estado;
   GerenciadorDeTarefas gerenciar;
   JPanel jplBotoes;
   JPanel painelPrincipal;
           
    public ColorPriorit(editarVisualizar telaEditar, Boolean estado, JPanel jplBotoes, JPanel painelPrincipal) {
        initComponents();
        
        this.telaEditar = telaEditar;
        this.estado = estado;
        gerenciar = new GerenciadorDeTarefas(jplBotoes, painelPrincipal);
        
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorPrioridade11 = new javax.swing.JPanel();
        colorPrioridade12 = new javax.swing.JPanel();
        colorPrioridade13 = new javax.swing.JPanel();
        colorPrioridade6 = new javax.swing.JPanel();
        colorPrioridade8 = new javax.swing.JPanel();
        colorPrioridade7 = new javax.swing.JPanel();
        colorPrioridade1 = new javax.swing.JPanel();
        colorPrioridade9 = new javax.swing.JPanel();
        colorPrioridade10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        colorPrioridade11.setBackground(new java.awt.Color(255, 0, 255));
        colorPrioridade11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPrioridade11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPrioridade11Layout = new javax.swing.GroupLayout(colorPrioridade11);
        colorPrioridade11.setLayout(colorPrioridade11Layout);
        colorPrioridade11Layout.setHorizontalGroup(
            colorPrioridade11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorPrioridade11Layout.setVerticalGroup(
            colorPrioridade11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        colorPrioridade12.setBackground(new java.awt.Color(153, 153, 153));
        colorPrioridade12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPrioridade12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPrioridade12Layout = new javax.swing.GroupLayout(colorPrioridade12);
        colorPrioridade12.setLayout(colorPrioridade12Layout);
        colorPrioridade12Layout.setHorizontalGroup(
            colorPrioridade12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorPrioridade12Layout.setVerticalGroup(
            colorPrioridade12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        colorPrioridade13.setBackground(new java.awt.Color(0, 0, 0));
        colorPrioridade13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPrioridade13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPrioridade13Layout = new javax.swing.GroupLayout(colorPrioridade13);
        colorPrioridade13.setLayout(colorPrioridade13Layout);
        colorPrioridade13Layout.setHorizontalGroup(
            colorPrioridade13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorPrioridade13Layout.setVerticalGroup(
            colorPrioridade13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        colorPrioridade6.setBackground(new java.awt.Color(255, 165, 0));
        colorPrioridade6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPrioridade6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPrioridade6Layout = new javax.swing.GroupLayout(colorPrioridade6);
        colorPrioridade6.setLayout(colorPrioridade6Layout);
        colorPrioridade6Layout.setHorizontalGroup(
            colorPrioridade6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorPrioridade6Layout.setVerticalGroup(
            colorPrioridade6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        colorPrioridade8.setBackground(new java.awt.Color(255, 255, 255));
        colorPrioridade8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPrioridade8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPrioridade8Layout = new javax.swing.GroupLayout(colorPrioridade8);
        colorPrioridade8.setLayout(colorPrioridade8Layout);
        colorPrioridade8Layout.setHorizontalGroup(
            colorPrioridade8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorPrioridade8Layout.setVerticalGroup(
            colorPrioridade8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        colorPrioridade7.setBackground(new java.awt.Color(255, 0, 0));
        colorPrioridade7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPrioridade7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPrioridade7Layout = new javax.swing.GroupLayout(colorPrioridade7);
        colorPrioridade7.setLayout(colorPrioridade7Layout);
        colorPrioridade7Layout.setHorizontalGroup(
            colorPrioridade7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorPrioridade7Layout.setVerticalGroup(
            colorPrioridade7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        colorPrioridade1.setBackground(new java.awt.Color(0, 51, 255));
        colorPrioridade1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPrioridade1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPrioridade1Layout = new javax.swing.GroupLayout(colorPrioridade1);
        colorPrioridade1.setLayout(colorPrioridade1Layout);
        colorPrioridade1Layout.setHorizontalGroup(
            colorPrioridade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorPrioridade1Layout.setVerticalGroup(
            colorPrioridade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        colorPrioridade9.setBackground(new java.awt.Color(255, 255, 0));
        colorPrioridade9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPrioridade9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPrioridade9Layout = new javax.swing.GroupLayout(colorPrioridade9);
        colorPrioridade9.setLayout(colorPrioridade9Layout);
        colorPrioridade9Layout.setHorizontalGroup(
            colorPrioridade9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorPrioridade9Layout.setVerticalGroup(
            colorPrioridade9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        colorPrioridade10.setBackground(new java.awt.Color(51, 255, 0));
        colorPrioridade10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPrioridade10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPrioridade10Layout = new javax.swing.GroupLayout(colorPrioridade10);
        colorPrioridade10.setLayout(colorPrioridade10Layout);
        colorPrioridade10Layout.setHorizontalGroup(
            colorPrioridade10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorPrioridade10Layout.setVerticalGroup(
            colorPrioridade10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colorPrioridade10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(colorPrioridade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colorPrioridade7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colorPrioridade6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorPrioridade9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorPrioridade11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorPrioridade13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorPrioridade12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorPrioridade8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(colorPrioridade7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorPrioridade9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorPrioridade6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorPrioridade10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorPrioridade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorPrioridade11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorPrioridade8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorPrioridade13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorPrioridade12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorPrioridade7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPrioridade7MouseClicked
        if(estado){
            this.dispose();
            gerenciar.altearCor(java.awt.Color.RED);
        }else{
            telaEditar.setColorPrioridade(java.awt.Color.RED);
        }
        this.dispose();
    }//GEN-LAST:event_colorPrioridade7MouseClicked

    private void colorPrioridade6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPrioridade6MouseClicked
        if(estado){
            this.dispose();
            gerenciar.altearCor(java.awt.Color.ORANGE);
        }else{
            telaEditar.setColorPrioridade(java.awt.Color.ORANGE);
        }
        this.dispose();
    }//GEN-LAST:event_colorPrioridade6MouseClicked

    private void colorPrioridade9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPrioridade9MouseClicked
        if(estado){
            this.dispose();
            gerenciar.altearCor(java.awt.Color.YELLOW);
        }else{
            telaEditar.setColorPrioridade(java.awt.Color.YELLOW);
        }
        this.dispose();
    }//GEN-LAST:event_colorPrioridade9MouseClicked

    private void colorPrioridade10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPrioridade10MouseClicked
        if(estado){
            this.dispose();
            gerenciar.altearCor(java.awt.Color.GREEN);
        }else{
            telaEditar.setColorPrioridade(java.awt.Color.GREEN);
        }
        this.dispose();
    }//GEN-LAST:event_colorPrioridade10MouseClicked

    private void colorPrioridade1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPrioridade1MouseClicked
        if(estado){
            this.dispose();
            gerenciar.altearCor(java.awt.Color.BLUE);
        }else{
            telaEditar.setColorPrioridade(java.awt.Color.BLUE);
        }
        this.dispose();
    }//GEN-LAST:event_colorPrioridade1MouseClicked

    private void colorPrioridade11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPrioridade11MouseClicked
        if(estado){
            this.dispose();
            gerenciar.altearCor(java.awt.Color.MAGENTA);
        }else{
            telaEditar.setColorPrioridade(java.awt.Color.MAGENTA);
        }
        this.dispose();
    }//GEN-LAST:event_colorPrioridade11MouseClicked

    private void colorPrioridade13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPrioridade13MouseClicked
        if(estado){
            this.dispose();
            gerenciar.altearCor(java.awt.Color.BLACK);
        }else{
            telaEditar.setColorPrioridade(java.awt.Color.BLACK);
        }
        this.dispose();
    }//GEN-LAST:event_colorPrioridade13MouseClicked

    private void colorPrioridade12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPrioridade12MouseClicked
        if(estado){
            this.dispose();
            gerenciar.altearCor(java.awt.Color.GRAY);
        }else{
            telaEditar.setColorPrioridade(java.awt.Color.GRAY);
        }
        this.dispose();
    }//GEN-LAST:event_colorPrioridade12MouseClicked

    private void colorPrioridade8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPrioridade8MouseClicked
        if(estado){
            this.dispose();
            gerenciar.altearCor(java.awt.Color.WHITE);
        }else{
            telaEditar.setColorPrioridade(java.awt.Color.WHITE);
        }
        this.dispose();
    }//GEN-LAST:event_colorPrioridade8MouseClicked
    
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel colorPrioridade1;
    private javax.swing.JPanel colorPrioridade10;
    private javax.swing.JPanel colorPrioridade11;
    private javax.swing.JPanel colorPrioridade12;
    private javax.swing.JPanel colorPrioridade13;
    private javax.swing.JPanel colorPrioridade6;
    private javax.swing.JPanel colorPrioridade7;
    private javax.swing.JPanel colorPrioridade8;
    private javax.swing.JPanel colorPrioridade9;
    // End of variables declaration//GEN-END:variables
}
