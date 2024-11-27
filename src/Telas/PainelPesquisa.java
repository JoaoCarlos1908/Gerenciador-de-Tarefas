
package Telas;

import java.awt.Color;

public class PainelPesquisa extends javax.swing.JPanel {

    public PainelPesquisa() {
        initComponents();
        txtBox.setLineWrap(true);// Habilita a quebra de linha automática
        txtBox.setWrapStyleWord(true);// Faz a quebra entre palavras
        txtBox.setCaretPosition(0);
        txtBox.setEditable(false);
    }
    
    public String getTitulo(){
        return txtTitulo.getText();
    }
    
    public void setTxtTitulo(String titulo) {
        this.txtTitulo.setText(titulo);
    }
    
    public String getDescricao(){
        return txtBox.getText();
    }
    
    public void setDescricao(String descricao){
        this.txtBox.setText(descricao);
    }
    
    public Color getPrioridade(){
        return colorPrioridade.getBackground();
    }
    
    public void setPrioridade(Color cor){
        this.colorPrioridade.setBackground(cor);
    }
    
    public String getData(){
        return txtPrazo.getText();
    }
    
    public void setdata(String data){
        this.txtPrazo.setText(data);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        colorPrioridade = new javax.swing.JPanel();
        txtPrazo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBox = new javax.swing.JTextArea();

        txtTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTitulo.setText("Titulo");

        colorPrioridade.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout colorPrioridadeLayout = new javax.swing.GroupLayout(colorPrioridade);
        colorPrioridade.setLayout(colorPrioridadeLayout);
        colorPrioridadeLayout.setHorizontalGroup(
            colorPrioridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        colorPrioridadeLayout.setVerticalGroup(
            colorPrioridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        txtPrazo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPrazo.setText("19/02/2002");

        txtBox.setColumns(20);
        txtBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtBox.setRows(5);
        txtBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBoxMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addContainerGap(860, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(colorPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(txtPrazo)))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrazo)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBoxMouseClicked
    }//GEN-LAST:event_txtBoxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel colorPrioridade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBox;
    private javax.swing.JLabel txtPrazo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}

