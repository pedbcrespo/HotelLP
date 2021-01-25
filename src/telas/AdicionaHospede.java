package telas;
import classes.*;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdicionaHospede extends javax.swing.JInternalFrame implements InterfaceTelas{
    
    Hospede novo;
    InterfaceFront inicial;
    Quarto qAux;
    ArrayList<Quarto> livres;
    ArrayList<Hospede> hospede = new ArrayList();
    public AdicionaHospede() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campNome = new javax.swing.JTextField();
        campMes = new javax.swing.JTextField();
        campDia = new javax.swing.JTextField();
        campAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campEstadia = new javax.swing.JTextField();
        cancela = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();
        Premium = new javax.swing.JCheckBox();
        Wifi = new javax.swing.JCheckBox();
        Hidromassagem = new javax.swing.JCheckBox();
        Colchao = new javax.swing.JCheckBox();
        TVcabo = new javax.swing.JCheckBox();
        CafeManha = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campS = new javax.swing.JTextField();
        campC = new javax.swing.JTextField();
        checkIn = new javax.swing.JCheckBox();
        camp_num_quarto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AdicionaHospede = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaLivres = new javax.swing.JTable();

        jLabel1.setText("Nome:");

        jLabel3.setText("Data:");

        jLabel4.setText("Dias de estadia:");

        jLabel5.setText("/");

        jLabel6.setText("/");

        cancela.setText("Cancelar");
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
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

        Wifi.setText("WiFi");

        Hidromassagem.setText("Hidromassagem");
        Hidromassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HidromassagemActionPerformed(evt);
            }
        });

        Colchao.setText("Colchão Especial");
        Colchao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColchaoActionPerformed(evt);
            }
        });

        TVcabo.setText("TV a cabo");
        TVcabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TVcaboActionPerformed(evt);
            }
        });

        CafeManha.setText("Café da manhã");

        jLabel7.setText("Cama solteiro:");

        jLabel8.setText("Cama casal:");

        campS.setText("1");

        campC.setText("1");

        checkIn.setText("Check in");

        jLabel2.setText("Quarto:");

        AdicionaHospede.setText("Adiciona Hospede");
        AdicionaHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionaHospedeActionPerformed(evt);
            }
        });

        tabelaLivres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quartos"
            }
        ));
        jScrollPane2.setViewportView(tabelaLivres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(cancela)
                .addGap(18, 18, 18)
                .addComponent(Confirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(camp_num_quarto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campMes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel6)
                                                .addGap(9, 9, 9)
                                                .addComponent(campAno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Premium)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Hidromassagem)
                                            .addComponent(Colchao)
                                            .addComponent(checkIn)
                                            .addComponent(CafeManha))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Wifi)
                                            .addComponent(TVcabo)))))
                            .addComponent(AdicionaHospede))
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Premium))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(campDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(campMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(campEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(campS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(campC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Hidromassagem)
                                    .addComponent(TVcabo))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Colchao)
                                    .addComponent(Wifi))
                                .addGap(44, 44, 44)
                                .addComponent(checkIn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CafeManha)))
                        .addGap(18, 18, 18)
                        .addComponent(AdicionaHospede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camp_num_quarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancela)
                    .addComponent(Confirmar))
                .addContainerGap())
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
    public void MostraTela(InterfaceFront inicial){
        this.inicial = inicial;
        this.setVisible(true);
        livres = inicial.hotel.quartosLivres();
        verificaBox();
        dadosTabela(TypeQuarto(Premium.isSelected()));
    }
    @Override
    public void dadosTabela(ArrayList<Quarto> q){
        
        livres = q;
        DefaultTableModel tbl = (DefaultTableModel) tabelaLivres.getModel();
        tbl.setRowCount(0);
        
        imprimeTabela(0, livres, tabelaLivres);
    }
    @Override
    public void  verificaBox(){
        qAux = null;
        livres = inicial.hotel.quartosLivres();
        if(Premium.isSelected()){               

            Quarto qAux = new QuartoPremium(-1,true,TVcabo.isSelected(),Wifi.isSelected(), Hidromassagem.isSelected(), Colchao.isSelected());
            Wifi.setSelected(true);
            TVcabo.setSelected(true);
            
            this.qAux = qAux;
            dadosTabela(TypeQuarto(true));
        }
        else{
            qAux = new Quarto(-1, true,TVcabo.isSelected(),Wifi.isSelected()); 
            Hidromassagem.setSelected(false);
            Colchao.setSelected(false);
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
   
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        
      
        verificaBox();

        if(!(camp_num_quarto.getText().equals("")&&camp_num_quarto.getText().equals(null))){
            qAux.numero = Integer.parseInt(camp_num_quarto.getText());
            qAux.setCama_casal(Integer.parseInt(campC.getText()));
            qAux.setCama_solteiro(Integer.parseInt(campS.getText()));
        }

        qAux.setHospede(hospede);
        

        inicial.hotel.reserva(hospede);

        
        inicial.hotel.AtualizaDados(qAux);   
        inicial.hotel.AtualizaLucro();
        
        inicial.Atualiza();
        this.setVisible(false);
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void PremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiumActionPerformed
        verificaBox();
    }//GEN-LAST:event_PremiumActionPerformed

    private void HidromassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HidromassagemActionPerformed
        verificaBox();
    }//GEN-LAST:event_HidromassagemActionPerformed

    private void ColchaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColchaoActionPerformed
        verificaBox();
    }//GEN-LAST:event_ColchaoActionPerformed

    private void TVcaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TVcaboActionPerformed

    }//GEN-LAST:event_TVcaboActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AdicionaHospede.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelaActionPerformed

    private void AdicionaHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionaHospedeActionPerformed
        int data[] = {Integer.parseInt(campDia.getText()),Integer.parseInt(campMes.getText()),Integer.parseInt(campAno.getText())};
        
        if(!(camp_num_quarto.getText().equals("")&&camp_num_quarto.getText().equals(null))){
            qAux.numero = Integer.parseInt(camp_num_quarto.getText());
            qAux.setCama_casal(Integer.parseInt(campC.getText()));
            qAux.setCama_solteiro(Integer.parseInt(campS.getText()));
        }
        
        novo = new Hospede(campNome.getText(),data ,Integer.parseInt(campEstadia.getText()));
        novo.setCafe_manha(CafeManha.isSelected());
        novo.setQuant_estadia(Integer.parseInt(campEstadia.getText()));
        novo.setCheck_in(checkIn.isSelected());
        
        
        
        novo.setQuarto(qAux);
        
        hospede.add(novo);
        
        JOptionPane.showMessageDialog(null,"Adicionado");
    }//GEN-LAST:event_AdicionaHospedeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionaHospede;
    private javax.swing.JCheckBox CafeManha;
    private javax.swing.JCheckBox Colchao;
    private javax.swing.JButton Confirmar;
    private javax.swing.JCheckBox Hidromassagem;
    private javax.swing.JCheckBox Premium;
    private javax.swing.JCheckBox TVcabo;
    private javax.swing.JCheckBox Wifi;
    private javax.swing.JTextField campAno;
    private javax.swing.JTextField campC;
    private javax.swing.JTextField campDia;
    private javax.swing.JTextField campEstadia;
    private javax.swing.JTextField campMes;
    private javax.swing.JTextField campNome;
    private javax.swing.JTextField campS;
    private javax.swing.JTextField camp_num_quarto;
    private javax.swing.JButton cancela;
    private javax.swing.JCheckBox checkIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaLivres;
    // End of variables declaration//GEN-END:variables

}
