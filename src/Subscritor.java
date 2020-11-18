import java.awt.Color;
import javax.swing.JOptionPane;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;


public class Subscritor extends javax.swing.JFrame {

    MqttClient subscritor;
    
    public Subscritor() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        telaComp = new javax.swing.JPanel();
        conectar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tela = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        telaTele = new javax.swing.JPanel();
        telaCelu = new javax.swing.JPanel();
        computador = new javax.swing.JRadioButton();
        celular = new javax.swing.JRadioButton();
        televisao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Telas");

        jLabel2.setText("Brilho: ");

        telaComp.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout telaCompLayout = new javax.swing.GroupLayout(telaComp);
        telaComp.setLayout(telaCompLayout);
        telaCompLayout.setHorizontalGroup(
            telaCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        telaCompLayout.setVerticalGroup(
            telaCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Dispositivo:");

        jLabel5.setText("Status:");

        status.setText("Offline");

        telaTele.setBackground(new java.awt.Color(0, 0, 255));
        telaTele.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout telaTeleLayout = new javax.swing.GroupLayout(telaTele);
        telaTele.setLayout(telaTeleLayout);
        telaTeleLayout.setHorizontalGroup(
            telaTeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        telaTeleLayout.setVerticalGroup(
            telaTeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        telaCelu.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout telaCeluLayout = new javax.swing.GroupLayout(telaCelu);
        telaCelu.setLayout(telaCeluLayout);
        telaCeluLayout.setHorizontalGroup(
            telaCeluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        telaCeluLayout.setVerticalGroup(
            telaCeluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        buttonGroup1.add(computador);
        computador.setText("Computador");
        computador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computadorActionPerformed(evt);
            }
        });

        buttonGroup1.add(celular);
        celular.setText("Celular");

        buttonGroup1.add(televisao);
        televisao.setText("Televisão");
        televisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                televisaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conectar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(computador))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telaTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(televisao))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telaCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celular))
                                .addGap(40, 40, 40))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computador)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(televisao)
                        .addComponent(celular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(telaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telaTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(telaCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGap(29, 29, 29)
                .addComponent(conectar)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        MqttCallback ClienteCallBack = new MqttCallback(){
            @Override
            public void connectionLost(Throwable thrwbl) {
                JOptionPane.showMessageDialog(null, "conexâo perdida!");
            }

            @Override
            public void messageArrived(String string, MqttMessage mm) throws Exception {
                String taxaBrilho = mm.toString();
                
                if(string.equals("/computador")){
                    telaComp.setBackground(new Color(255, Integer.parseInt(taxaBrilho)*2, Integer.parseInt(taxaBrilho)*2));
                }else if(string.equals("/televisao")){
                    telaTele.setBackground(new Color(Integer.parseInt(taxaBrilho)*2, Integer.parseInt(taxaBrilho)*2, 255));
                }else if(string.equals("/celular")){
                    telaCelu.setBackground(new Color(255, 255, Integer.parseInt(taxaBrilho)*2));
                }
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken imdt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        try {
            subscritor = new MqttClient("tcp://localhost:1883", "subscritor");    
            
            if(computador.isSelected()){
                subscritor.connect();
                subscritor.subscribe("/computador", 1);
                subscritor.setCallback(ClienteCallBack);
                status.setText("Online");
                JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
            }else if(celular.isSelected()){
                subscritor.connect();
                subscritor.subscribe("/celular", 1);
                subscritor.setCallback(ClienteCallBack);
                status.setText("Online");
                JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
            }else if(televisao.isSelected()){
                subscritor.connect();
                subscritor.subscribe("/televisao", 1);
                subscritor.setCallback(ClienteCallBack);
                status.setText("Online");
                JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
            }else{
                JOptionPane.showMessageDialog(null, "Selecione algum dispositivo!");
            }
                 
        } catch (MqttException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o Broker!");
        }

    }//GEN-LAST:event_conectarActionPerformed

    private void televisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_televisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_televisaoActionPerformed

    private void computadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_computadorActionPerformed

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
            java.util.logging.Logger.getLogger(Subscritor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subscritor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subscritor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subscritor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subscritor().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton celular;
    private javax.swing.JRadioButton computador;
    private javax.swing.JButton conectar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel status;
    private javax.swing.JLabel tela;
    private javax.swing.JPanel telaCelu;
    private javax.swing.JPanel telaComp;
    private javax.swing.JPanel telaTele;
    private javax.swing.JRadioButton televisao;
    // End of variables declaration//GEN-END:variables
}