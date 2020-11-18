
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.gt;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;


public class Publicador extends javax.swing.JFrame {
    
    JSlider deslizante = new JSlider(0, 50);
    MqttClient cliente;
    MqttMessage msg;
    
    String topico;
    
    public Publicador() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        conectar = new javax.swing.JButton();
        controle = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        televisao = new javax.swing.JRadioButton();
        computador = new javax.swing.JRadioButton();
        celular = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Luminosidade");

        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        controle.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                controleStateChanged(evt);
            }
        });
        controle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controleMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("100  -  90  -  80  -  70  -  60  -  50  -  40  -  30  -  20  -  10  -  0");

        jLabel3.setText("HIGH");

        jLabel4.setText("LOW");

        jLabel5.setText("l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l l");

        jLabel6.setText("Status:");

        status.setText("OffLine");

        buttonGroup1.add(televisao);
        televisao.setText("Televisão");
        televisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                televisaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(computador);
        computador.setText("Computador");
        computador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computadorActionPerformed(evt);
            }
        });

        buttonGroup1.add(celular);
        celular.setText("Celular");
        celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(status))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(celular)
                                    .addComponent(televisao)
                                    .addComponent(computador)
                                    .addComponent(conectar))
                                .addGap(100, 100, 100)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(controle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(controle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(status))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(televisao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(computador)
                        .addGap(3, 3, 3)
                        .addComponent(celular)
                        .addGap(18, 18, 18)
                        .addComponent(conectar)
                        .addGap(35, 35, 35))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed

        try {
            if(televisao.isSelected()){
                cliente = new MqttClient("tcp://localhost:1883", "publisher");
                cliente.connect();
                topico = "/televisao";
                JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
                status.setText("Online");
              
            }else if(computador.isSelected()){
                cliente = new MqttClient("tcp://localhost:1883", "publisher");
                cliente.connect();
                topico = "/computador";
                JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
                status.setText("Online");
                
            }else if(celular.isSelected()){
                cliente = new MqttClient("tcp://localhost:1883", "publisher");
                cliente.connect();
                topico = "/celular";
                JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
                status.setText("Online");
                
            }else{
                JOptionPane.showMessageDialog(null, "Selecione algum dispositivo!");    
            }
            
        } catch (MqttException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o Broker!");
        }
    }//GEN-LAST:event_conectarActionPerformed

    private void computadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_computadorActionPerformed

    private void televisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_televisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_televisaoActionPerformed

    private void celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularActionPerformed

    private void controleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controleMouseClicked
    
    }//GEN-LAST:event_controleMouseClicked

    private void controleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_controleStateChanged
        int valor = controle.getValue() ;
            msg = new MqttMessage((Integer.toString(valor)).getBytes() );
            msg.setQos(1);
        try {
            cliente.publish(topico, msg);
        } catch (MqttException ex) {
            JOptionPane.showMessageDialog(null, "Erro no envio da informação!");
        }
            System.out.println(topico);
            System.out.println(valor);
    }//GEN-LAST:event_controleStateChanged

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Publicador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton celular;
    private javax.swing.JRadioButton computador;
    private javax.swing.JButton conectar;
    private javax.swing.JSlider controle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel status;
    private javax.swing.JRadioButton televisao;
    // End of variables declaration//GEN-END:variables
}
