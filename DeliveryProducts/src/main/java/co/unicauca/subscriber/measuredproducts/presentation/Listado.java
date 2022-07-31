/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.unicauca.subscriber.measuredproducts.presentation;

import co.unicauca.microkernel.common.entities.FabricaProduct;
import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.entities.ProductMedible;
import co.unicauca.subscriber.measuredproducts.infra.ISubscriber;
import co.unicauca.subscriber.measuredproducts.infra.RabbitListener;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanc
 */
public class Listado extends javax.swing.JFrame implements ISubscriber{

    DefaultListModel modelList;
    
    ArrayList<Product> aceptados = new ArrayList<>();
    ArrayList<Product> defectuosos= new ArrayList<>();
    /**
     * Creates new form Listado
     */
    public Listado() {
        initComponents();
        Runnable subscriber = new RabbitListener(this);
        modelList = new DefaultListModel();
        new Thread(subscriber).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTbAceptados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbRechazados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jTbAceptados);

        jScrollPane2.setViewportView(jTbRechazados);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Productos Medidos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Aceptados");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Defectuosos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(123, 123, 123)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
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
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTbAceptados;
    private javax.swing.JTable jTbRechazados;
    // End of variables declaration//GEN-END:variables

    
    public void seleccionarProducto(Product p){
          
       FabricaProduct fc = new FabricaProduct();
       
       ProductMedible pm = (ProductMedible) fc.crearItem();
        
       Medicion m= new Medicion(p,p.getEstado());
       
        System.out.println("Estado Producto:"+p.getEstado());
       
       if(pm.status(m).equals("Aceptado")){
          aceptados.add(p);
       }else{
          defectuosos.add(p);
       }
    }
    
    @Override
    public void onMessage(String msg) {
        Gson gson = new Gson();
        Product product = gson.fromJson(msg, Product.class);
      

        seleccionarProducto(product);
        if(!aceptados.isEmpty()){
                    String colum []={"Referencia","Largo","Diametro","Estado","Producto"};
                    String datos[][] = new String[aceptados.size()][5];
                    for(int j=0;j<aceptados.size();j++){
                        datos[j][0]= ""+aceptados.get(j).getReferencia();
                        datos[j][1]= ""+aceptados.get(j).getLargo();
                        datos[j][2]= ""+aceptados.get(j).getDiametro();
                        datos[j][3]= ""+aceptados.get(j).getEstado();
                        datos[j][4]= ""+aceptados.get(j).getName();
                    }
                    jTbAceptados.setModel(new DefaultTableModel(datos,colum));
        }
        
        if(!defectuosos.isEmpty()){
                    String colum []={"Referencia","Largo","Diametro","Estado","Producto"};
                    String datos[][] = new String[defectuosos.size()][5];
                    for(int j=0;j<defectuosos.size();j++){
                        datos[j][0]= ""+defectuosos.get(j).getReferencia();
                        datos[j][1]= ""+defectuosos.get(j).getLargo();
                        datos[j][2]= ""+defectuosos.get(j).getDiametro();
                        datos[j][3]= ""+defectuosos.get(j).getEstado();
                        datos[j][4]= ""+defectuosos.get(j).getName();
                    }
                    jTbRechazados.setModel(new DefaultTableModel(datos,colum));
        }
    }
}