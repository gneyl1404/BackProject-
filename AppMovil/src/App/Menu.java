/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Servicio.WebService1;
import java.awt.Graphics;
import java.awt.Image;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Jorge Mayorga
 */
public class Menu extends javax.swing.JFrame {

    DefaultTableModel objProductos = new DefaultTableModel();
    FondoPanel fondo = new FondoPanel();
    WebService1 service = new WebService1();
    Pedido objPedido = new Pedido();
    Codigo CodigoObtenido = new Codigo();

    /**
     * Creates new form Menu
     */
    public Menu() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
        String titulos[] = {"Código", "Nombre", "Precio", "Stock"};
        objProductos.setColumnIdentifiers(titulos);
        TablaProductos.setModel(objProductos);
        listaProductos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        btnPedido = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmUsuario = new javax.swing.JMenuItem();
        jmPedidos = new javax.swing.JMenuItem();
        jmComentarios = new javax.swing.JMenuItem();
        jmCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaProductos.setBackground(new java.awt.Color(255, 102, 0));
        TablaProductos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaProductos);

        btnPedido.setBackground(new java.awt.Color(255, 102, 0));
        btnPedido.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnPedido.setText("Realizar Pedido");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/menu-button_icon-icons.com_72989.png"))); // NOI18N

        jmUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user_84308.png"))); // NOI18N
        jmUsuario.setText("Usuario");
        jmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmUsuario);

        jmPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_FoodDelivery-food-delivery-meal-order_6071783.png"))); // NOI18N
        jmPedidos.setText("Pedidos");
        jmPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPedidosActionPerformed(evt);
            }
        });
        jMenu1.add(jmPedidos);

        jmComentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_outlined_comment_4280528.png"))); // NOI18N
        jmComentarios.setText("Comentarios");
        jmComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmComentariosActionPerformed(evt);
            }
        });
        jMenu1.add(jmComentarios);

        jmCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/4115234-login-sign-in_114046.png"))); // NOI18N
        jmCerrar.setText("Cerrar Sesión");
        jmCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(jmCerrar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPedido)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(btnPedido)
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuarioActionPerformed
        this.setVisible(false);
        Usuario abrir = new Usuario();
        abrir.setVisible(true);
    }//GEN-LAST:event_jmUsuarioActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed

        String Stock = objPedido.getStock();

        if (Stock.equals("0")) {
            JOptionPane.showMessageDialog(null, "Agotado", "Aviso", javax.swing.JOptionPane.ERROR_MESSAGE);

        } else {
            int disponible = Integer.parseInt(objPedido.getStock());

            int disponible2 = disponible - 1;

            String Codigo = CodigoObtenido.getCodigoCliente();
            String CodigoProducto = objPedido.getCodigoProducto();
            String Producto = objPedido.getProducto();
            int Precio = Integer.parseInt(objPedido.getPrecio());
            String Respuesta = service.getWebService1Soap().consultaCliente(Codigo);
            String[] parts = Respuesta.split(";");
            String part1 = parts[0];
            String part2 = parts[1];

            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = dateFormat.format(date);

            int numero = ThreadLocalRandom.current().nextInt(1, 1000000 + 1);
            String RespuestaPedido = service.getWebService1Soap().crearPedidos(Codigo, fecha, String.valueOf(numero), part2, CodigoProducto, Producto, Precio, "EN PROCESO", part1);
            JOptionPane.showMessageDialog(null, "Gracias por realizar tu pedido", "Aviso", INFORMATION_MESSAGE);
            String RespuestaProducto = service.getWebService1Soap().actualizarProducto(CodigoProducto, Producto, Precio, disponible2);
            listaProductos();
        }
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        int seleccion = TablaProductos.getSelectedRow();
        objPedido.setCodigoProducto(TablaProductos.getValueAt(seleccion, 0).toString());
        objPedido.setProducto(TablaProductos.getValueAt(seleccion, 1).toString());
        objPedido.setPrecio(TablaProductos.getValueAt(seleccion, 2).toString());
        objPedido.setStock(TablaProductos.getValueAt(seleccion, 3).toString());
    }//GEN-LAST:event_TablaProductosMouseClicked

    private void jmCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCerrarActionPerformed
        this.setVisible(false);
        Login abrir = new Login();
        abrir.setVisible(true);
    }//GEN-LAST:event_jmCerrarActionPerformed

    private void jmPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPedidosActionPerformed
        this.setVisible(false);
        Pedidos o = new Pedidos();
        o.setVisible(true);
    }//GEN-LAST:event_jmPedidosActionPerformed

    private void jmComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmComentariosActionPerformed
        this.setVisible(false);
        Comentarios o = new Comentarios();
        o.setVisible(true);
    }//GEN-LAST:event_jmComentariosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnPedido;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmCerrar;
    private javax.swing.JMenuItem jmComentarios;
    private javax.swing.JMenuItem jmPedidos;
    private javax.swing.JMenuItem jmUsuario;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Recursos/fondo3.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);

        }
    }

    private void listaProductos() {
        SAXBuilder builder = new SAXBuilder();

        String Respuesta = service.getWebService1Soap().listProductos();

        try {

            Document documento = builder.build(new StringReader(Respuesta));
            /*xml manipulable*/
            Element rootNodo = documento.getRootElement();
            /*lista nodos*/
            List list = rootNodo.getChildren("Producto");

            for (int i = 0; i < list.size(); i++) {

                Element nodo = (Element) list.get(i);
                /*fecha, comentario, puntuacion, etc.*/
                String[] datos = new String[4];
                datos[0] = nodo.getChildText("Codigo");
                datos[1] = nodo.getChildText("Nombre");
                datos[2] = nodo.getChildText("Precio");
                datos[3] = nodo.getChildText("Stock");

                objProductos.addRow(datos);

            }

        } catch (Exception e) {
        }

    }

}
