/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.*;

import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class AlteraInfo extends javax.swing.JInternalFrame implements InterfaceTelas{

    InterfaceFront inicial;
    Hospede hospede;
    Quarto quartoAux;
    ArrayList<Quarto> livres;
    
    public AlteraInfo() {
        initComponents();
    }
    public void MostraTela(InterfaceFront inicial, Hospede hospede){
        
        this.inicial = inicial;
        this.hospede = hospede;
        setVisible(true);
        
        livres = inicial.hotel.quartosLivres();
        nome_hospede.setText(hospede.getNome());
        quartoAtual.setText(""+hospede.getQuarto().numero);
        
        dadosTabela(TypeQuarto(Premium.isSelected()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome_hospede = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campEstadia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campCasal = new javax.swing.JTextField();
        campSolteiro = new javax.swing.JTextField();
        CheckIn = new javax.swing.JCheckBox();
        CafeManha = new javax.swing.JCheckBox();
        quartoAtual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaLivres = new javax.swing.JTable();
        campNovoQuarto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();
        Premium = new javax.swing.JCheckBox();
        Colchao = new javax.swing.JCheckBox();
        Hidromassagem = new javax.swing.JCheckBox();
        TVcabo = new javax.swing.JCheckBox();
        Wifi = new javax.swing.JCheckBox();

        jLabel1.setText("jLabel1");

        nome_hospede.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nome_hospede.setText("Nome do Hospede");

        jLabel2.setText("Dias de estadia:");

        jLabel3.setText("Cama casal:");

        jLabel4.setText("Cama solteiro:");

        CheckIn.setText("Check in");

        CafeManha.setText("Café da manhã");

        quartoAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quartoAtual.setText("Quarto atual");

        TabelaLivres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quartos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaLivres);
        if (TabelaLivres.getColumnModel().getColumnCount() > 0) {
            TabelaLivres.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel5.setText("Novo quarto:");

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Premium.setText("Premium");
        Premium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremiumActionPerformed(evt);
            }
        });

        Colchao.setText("Colchão Massagem");
        Colchao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColchaoActionPerformed(evt);
            }
        });

        Hidromassagem.setText("Hidromassagem");
        Hidromassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HidromassagemActionPerformed(evt);
            }
        });

        TVcabo.setText("TV a cabo");

        Wifi.setText("Wifi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campSolteiro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campCasal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CheckIn)
                                    .addComponent(CafeManha))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Wifi)
                                    .addComponent(TVcabo)
                                    .addComponent(Colchao)
                                    .addComponent(Premium)
                                    .addComponent(Hidromassagem)
                                    .addComponent(quartoAtual)))
                            .addComponent(nome_hospede))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campNovoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Cancelar)
                .addGap(18, 18, 18)
                .addComponent(Confirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_hospede)
                            .addComponent(quartoAtual))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Premium))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(campCasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(campSolteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CheckIn)
                                    .addComponent(TVcabo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CafeManha)
                                    .addComponent(Wifi)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(Colchao)
                                .addGap(2, 2, 2)
                                .addComponent(Hidromassagem))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campNovoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Confirmar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public void imprimeTabela(int i, ArrayList<Quarto> q, javax.swing.JTable p){
        
        if(i!=q.size()){
            DefaultTableModel tbl = (DefaultTableModel) p.getModel();
            Object[] dados = {q.get(i).numero};
            tbl.addRow(dados);
            imprimeTabela(i+1, q, p);
        }
        
    }
    @Override
    public void dadosTabela(ArrayList<Quarto> q){
        
        ArrayList<Quarto> aux = q;
        DefaultTableModel tbl = (DefaultTableModel) TabelaLivres.getModel();
        tbl.setRowCount(0);
        
        imprimeTabela(0, aux, TabelaLivres);
    }
    @Override
    public void verificaBox() {
        if(Premium.isSelected()){
            Quarto qAux = new QuartoPremium(-1,true,TVcabo.isSelected(),Wifi.isSelected(), Hidromassagem.isSelected(), Colchao.isSelected());
            quartoAux = qAux;
            
            Wifi.setSelected(true);
            TVcabo.setSelected(true);   
            dadosTabela(TypeQuarto(true));
        }
        else{
            Colchao.setSelected(false);
            Hidromassagem.setSelected(false);
            quartoAux = new Quarto(-1,true,TVcabo.isSelected(),Wifi.isSelected());

            dadosTabela(TypeQuarto(false));
        }

    }
    @Override
    public ArrayList<Quarto> TypeQuarto(boolean n){
        ArrayList<Quarto> q_aux = new ArrayList();
        
        for(Quarto q : livres){
            String t = ""+ q.getClass();
            if(n){
                if(t.equals("class classes.QuartoPremium")){
                    q_aux.add(q);
                }
            }
            else if(t.equals("class classes.Quarto")){
                q_aux.add(q);
            }
        }
        return q_aux;
    }
    
    
    
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AdicionaHospede.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelarActionPerformed

    private void PremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiumActionPerformed
        verificaBox();
    }//GEN-LAST:event_PremiumActionPerformed

    private void ColchaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColchaoActionPerformed
        verificaBox();
    }//GEN-LAST:event_ColchaoActionPerformed

    private void HidromassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HidromassagemActionPerformed
        verificaBox();
    }//GEN-LAST:event_HidromassagemActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        verificaBox();
        
        Hospede atualizado = hospede;
        
        if(campNovoQuarto.getText().equals("")||campNovoQuarto.getText().equals(null)){
            quartoAux.numero = hospede.getQuarto().numero;
        }
        else
            quartoAux.numero = Integer.parseInt(campNovoQuarto.getText());
        
        
        quartoAux.setCama_casal(Integer.parseInt(campCasal.getText()));
        quartoAux.setCama_solteiro(Integer.parseInt(campSolteiro.getText()));
        
        quartoAux.setHospede(atualizado);
        atualizado.setCheck_in(CheckIn.isSelected());
        atualizado.setCafe_manha(CafeManha.isSelected());
        
        inicial.hotel.alt_reserva(hospede, atualizado);
        
        inicial.hotel.AtualizaDados(quartoAux);
        
        inicial.Atualiza();
        setVisible(false);
    }//GEN-LAST:event_ConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CafeManha;
    private javax.swing.JButton Cancelar;
    private javax.swing.JCheckBox CheckIn;
    private javax.swing.JCheckBox Colchao;
    private javax.swing.JButton Confirmar;
    private javax.swing.JCheckBox Hidromassagem;
    private javax.swing.JCheckBox Premium;
    private javax.swing.JCheckBox TVcabo;
    private javax.swing.JTable TabelaLivres;
    private javax.swing.JCheckBox Wifi;
    private javax.swing.JTextField campCasal;
    private javax.swing.JTextField campEstadia;
    private javax.swing.JTextField campNovoQuarto;
    private javax.swing.JTextField campSolteiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome_hospede;
    private javax.swing.JLabel quartoAtual;
    // End of variables declaration//GEN-END:variables


    
}
