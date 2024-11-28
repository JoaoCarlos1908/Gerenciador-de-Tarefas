package Telas;


import java.awt.Color;
import javax.swing.JPanel;
import Classes.GerenciadorDeTarefas;

public class ViewTarefa extends javax.swing.JPanel {

    JPanel jplBotoes;
    JPanel painelPrincipal;
    btnInicial iniciarBtn;
    btnEditar editarBtn;
    GerenciadorDeTarefas gerenciarTarefas;
    editarVisualizar edAdTarefa;
    
    public ViewTarefa(JPanel jplBotoes, JPanel painelPrincipal) {
        initComponents();
        
        this.jplBotoes = jplBotoes;
        this.painelPrincipal = painelPrincipal;
        gerenciarTarefas = new GerenciadorDeTarefas(jplBotoes, painelPrincipal);
        edAdTarefa = new editarVisualizar(jplBotoes, painelPrincipal);
        
        txtBox.setLineWrap(true);// Habilita a quebra de linha automática
        txtBox.setWrapStyleWord(true);// Faz a quebra entre palavras
        txtBox.setCaretPosition(0);
        txtBox.setEditable(false);
        
        editarBtn = new btnEditar(painelPrincipal, jplBotoes);
        iniciarBtn = new btnInicial(painelPrincipal, jplBotoes);
        
        this.setName(Integer.toString(-1));
        this.setTxtTitulo("");
        this.setDescricao("");
        this.setdata("");
        this.setPrioridade(Color.GREEN);
    }
    public void alterarJLabel(int x){
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        checkBox = new javax.swing.JCheckBox();
        colorPrioridade = new javax.swing.JPanel();
        txtData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBox = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTitulo.setText("Titulo");

        checkBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBox.setToolTipText("");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

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

        txtData.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtData.setText("19/02/2002");

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
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(checkBox)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(colorPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtData)
                                .addContainerGap(25, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(checkBox)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colorPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtData)))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
      if(gerenciarTarefas.checkBoxAtivado()){
           jplBotoes.removeAll();
            jplBotoes.add(editarBtn);
            jplBotoes.revalidate(); // Revalida o layout para que o novo botão seja considerado na disposição
            jplBotoes.repaint();// Redesenha o painel para refletir a mudança visual
            //JOptionPane.showMessageDialog(null, "Retornou True", "Alerta", JOptionPane.WARNING_MESSAGE);
       }else{
            jplBotoes.removeAll();
            jplBotoes.add(iniciarBtn);
            jplBotoes.revalidate(); // Revalida o layout para que o novo botão seja considerado na disposição
            jplBotoes.repaint();// Redesenha o painel para refletir a mudança visual
            //JOptionPane.showMessageDialog(null, "Retornou False", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_checkBoxActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getClickCount() == 2) {
            //JOptionPane.showMessageDialog(null, "Clique duplo detectado!");]
            gerenciarTarefas.abrirTelaEdição(this);
        }
    }//GEN-LAST:event_formMouseClicked

    private void txtBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBoxMouseClicked
        if (evt.getClickCount() == 2) {
            //JOptionPane.showMessageDialog(null, "Clique duplo detectado!");]
            gerenciarTarefas.abrirTelaEdição(this);
        }
    }//GEN-LAST:event_txtBoxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JPanel colorPrioridade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBox;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

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
        return txtData.getText();
    }
    
    public void setdata(String data){
        this.txtData.setText(data);
    }
}
