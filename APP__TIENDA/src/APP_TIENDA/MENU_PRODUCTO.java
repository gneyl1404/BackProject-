package APP_TIENDA;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RECIMET
 */
public class MENU_PRODUCTO extends javax.swing.JFrame {

    /**
     * Creates new form MENU_PRODUCTO
     */
    public MENU_PRODUCTO() {
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

        CREAR = new javax.swing.JButton();
        CARTA = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        CREAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CREAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/3592815-compose-create-edit-edit-file-office-pencil-writing_107734.png"))); // NOI18N
        CREAR.setText("CREAR PRODUCTO");
        getContentPane().add(CREAR);
        CREAR.setBounds(310, 40, 310, 150);

        CARTA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CARTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/business_packages_boxes_products_sellingproducts_thereport_2344.png"))); // NOI18N
        CARTA.setText("MENÚ DEGUSTACIÓN");
        getContentPane().add(CARTA);
        CARTA.setBounds(315, 220, 305, 160);

        REGRESAR.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        REGRESAR.setText("←");
        getContentPane().add(REGRESAR);
        REGRESAR.setBounds(540, 390, 73, 23);

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/tortilla-fresca-envuelta-espacio-copia_23-2148614465.jpg"))); // NOI18N
        getContentPane().add(FONDO);
        FONDO.setBounds(0, 0, 626, 417);

        setSize(new java.awt.Dimension(642, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MENU_PRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_PRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_PRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_PRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_PRODUCTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CARTA;
    private javax.swing.JButton CREAR;
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton REGRESAR;
    // End of variables declaration//GEN-END:variables
}
