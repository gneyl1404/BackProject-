/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import Servicio.WebService1;
import java.awt.Graphics;
import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
/**
 *
 * @author Oswaldo Morales
 */
public class Comentarios extends javax.swing.JFrame {
int x,p;
String res, fecha,chismesito,itpo;

    FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form Comentarios
     */
    public Comentarios() {
        this.setContentPane(fondo);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        chisme = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        c6 = new javax.swing.JCheckBox();
        c7 = new javax.swing.JCheckBox();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUE TAL FUE NUESTRO SERVICIO?");

        c1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setText("1");

        c2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setText("2");

        c3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c3.setForeground(new java.awt.Color(255, 255, 255));
        c3.setText("3");

        c4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c4.setForeground(new java.awt.Color(255, 255, 255));
        c4.setText("4");

        c5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c5.setForeground(new java.awt.Color(255, 255, 255));
        c5.setText("5");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_020_-_Star_2792946.png"))); // NOI18N
        jLabel2.setText("CUANTAS ESTRELLAS NOS DAS");

        chisme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chismeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_overhear_ear_hear_secretly_listen_gossip_buzz_2701103.png"))); // NOI18N
        jLabel3.setText("CUENTANOS TU EXPERIENCIA");

        jButton2.setText("ENVIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("REGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        c6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        c6.setForeground(new java.awt.Color(255, 255, 255));
        c6.setText("QUEJA");

        c7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        c7.setForeground(new java.awt.Color(255, 255, 255));
        c7.setText("COMENTARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chisme, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(c1)
                                        .addGap(29, 29, 29)
                                        .addComponent(c2)
                                        .addGap(36, 36, 36)
                                        .addComponent(c3)
                                        .addGap(35, 35, 35)
                                        .addComponent(c4)
                                        .addGap(39, 39, 39)
                                        .addComponent(c5)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c6)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(c7)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1)
                    .addComponent(c2)
                    .addComponent(c3)
                    .addComponent(c4)
                    .addComponent(c5))
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(chisme, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6)
                    .addComponent(c7))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chismeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chismeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chismeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        WebService1 servi = new WebService1();
        if(c1.isSelected()){
          x=1;  
        } else if(c2.isSelected()) {
            x=2;
        }else if(c3.isSelected()){
            x=3;
        }else if(c4.isSelected()){
            x=4;
        }else if(c5.isSelected()){
            x=5;
        }else {
            x=6;
        }
        chismesito=chisme.getText();
        
        if(c6.isSelected()){
            p=1;
            itpo = "QUEJA";
        }else if(c7.isSelected()){
            p=2;
            itpo="COMENTARIO";
        }else{
            p=3;
        }
 Calendar c = new GregorianCalendar();
String dia = Integer.toString(c.get(Calendar.DATE));
String mes = Integer.toString(c.get(Calendar.MONTH));
String año = Integer.toString(c.get(Calendar.YEAR));
fecha = dia +"/"+ mes +"/"+ año;
        
if ((x!=6)&&(p!=3)){
    
    res = servi.getWebService1Soap().añadirComentario(fecha, itpo, chismesito, x);
     JOptionPane.showMessageDialog(null, res, "Aviso", INFORMATION_MESSAGE);
    
} else {
    JOptionPane.showMessageDialog(null, res+" NO INGRESO LOS DATOS CORRECTAMENTE", "Aviso", javax.swing.JOptionPane.ERROR_MESSAGE);
}
        
        
        
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu o = new Menu();
        o.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Comentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comentarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c7;
    private javax.swing.JTextField chisme;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Recursos/fondo1.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);

        }
    }
}
