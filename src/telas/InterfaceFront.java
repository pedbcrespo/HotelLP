package telas;
import classes.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfaceFront extends javax.swing.JFrame {
    
    public Hotel hotel = new Hotel();
    
    public InterfaceFront() {
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPrincipal = new javax.swing.JTable();
        lucroAtual = new javax.swing.JLabel();
        adicionar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        infoQuarto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campNumQuarto = new javax.swing.JTextField();
        jData = new javax.swing.JLabel();
        Altera = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RemoveHospede = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        DesktopPane.setBackground(new java.awt.Color(51, 153, 255));

        tabelaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Tipo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaPrincipal);
        if (tabelaPrincipal.getColumnModel().getColumnCount() > 0) {
            tabelaPrincipal.getColumnModel().getColumn(0).setResizable(false);
            tabelaPrincipal.getColumnModel().getColumn(1).setResizable(false);
            tabelaPrincipal.getColumnModel().getColumn(2).setResizable(false);
        }

        lucroAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lucroAtual.setText("Lucro atual $: 0,00");

        adicionar.setText("Novo Hospede");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        remover.setText("Finalizar/Cancelar estadia quarto");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        infoQuarto.setText("Informação do quarto");
        infoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoQuartoActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero de quarto:");

        jData.setText("Data:");

        Altera.setText("Alterar informções de hospedagem");
        Altera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlteraActionPerformed(evt);
            }
        });

        jLabel2.setText("Lucro Atual");

        RemoveHospede.setText("Finalizar estadia hospede");
        RemoveHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveHospedeActionPerformed(evt);
            }
        });

        DesktopPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(lucroAtual, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(adicionar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(remover, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(infoQuarto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(campNumQuarto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(jData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(Altera, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(RemoveHospede, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remover)
                            .addComponent(adicionar)
                            .addComponent(Altera)
                            .addComponent(RemoveHospede))
                        .addGap(72, 72, 72))
                    .addGroup(DesktopPaneLayout.createSequentialGroup()
                        .addGroup(DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesktopPaneLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DesktopPaneLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(infoQuarto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(DesktopPaneLayout.createSequentialGroup()
                .addGroup(DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPaneLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jData))
                    .addGroup(DesktopPaneLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lucroAtual)))
                .addContainerGap(696, Short.MAX_VALUE))
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jData)
                .addGap(19, 19, 19)
                .addGroup(DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPaneLayout.createSequentialGroup()
                        .addComponent(adicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Altera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RemoveHospede))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoQuarto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lucroAtual)
                .addGap(145, 145, 145))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void imprimeTabela(int i){
        
        if(i!=hotel.quartos.size()){
            DefaultTableModel tbl = (DefaultTableModel) tabelaPrincipal.getModel();
            String status = "Livre", Classe = ""+hotel.quartos.get(i).getClass();
            if(hotel.quartos.get(i).isOcupado()){
                status = "Ocupado";
            }
            if(Classe.equals("class classes.QuartoPremium")){
                Classe = "Premium";
            }
            else{
                Classe = "Normal";
            }
            
            Object[] dados = {hotel.quartos.get(i).numero, Classe ,status};
            tbl.addRow(dados);
            imprimeTabela(i+1);
        }
        
    }
      
    public void Atualiza(){
        DefaultTableModel tbl = (DefaultTableModel) tabelaPrincipal.getModel();
        tbl.setRowCount(0);
        
        imprimeTabela(0);
        lucroAtual.setText(""+hotel.getTotal_arrecadado());
    }    
    
    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        AdicionaHospede novo_hospede = new AdicionaHospede();
        DesktopPane.add(novo_hospede);
        novo_hospede.MostraTela(this);
        
    }//GEN-LAST:event_adicionarActionPerformed

    private void infoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoQuartoActionPerformed
       JOptionPane.showMessageDialog(null,hotel.infoHospedeQuarto(Integer.parseInt(campNumQuarto.getText())));
    }//GEN-LAST:event_infoQuartoActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        String res = JOptionPane.showInputDialog(null, "Numero do quarto ");
        if(res!=null){
            hotel.rmv_reserva(hotel.buscaQuarto(Integer.parseInt(res)));
            Atualiza();
        }
        else
            JOptionPane.showMessageDialog(null, "Hospede não encontrado");
    }//GEN-LAST:event_removerActionPerformed

    private void AlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlteraActionPerformed
        String nomeHospede = JOptionPane.showInputDialog(null,"Hospede: ");
        if(nomeHospede!=null || nomeHospede!=""){
            AlteraInfo telaAltera = new AlteraInfo();
            DesktopPane.add(telaAltera);
            telaAltera.MostraTela(this, hotel.buscaHospede(nomeHospede));
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalido");
        }
          
    }//GEN-LAST:event_AlteraActionPerformed

    private void RemoveHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveHospedeActionPerformed
        String nome = JOptionPane.showInputDialog(null, "Hospede: ");
        
        if(nome != null || nome != ""){
           hotel.rmv_reserva(hotel.buscaHospede(nome));
           Atualiza(); 
        }
        else
           JOptionPane.showMessageDialog(null,"Invalido"); 
        
        
        
    }//GEN-LAST:event_RemoveHospedeActionPerformed

    //Metodo que pega a data atual apresentada no PC.
    public void mostra_data(){
        LocalDate n = java.time.LocalDate.now();
        jData.setText(""+n);
    }


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Altera;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JButton RemoveHospede;
    private javax.swing.JButton adicionar;
    private javax.swing.JTextField campNumQuarto;
    private javax.swing.JButton infoQuarto;
    private javax.swing.JLabel jData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lucroAtual;
    private javax.swing.JButton remover;
    private javax.swing.JTable tabelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
