/*
 * Muhammad Faisal Amir
 * f.miir117@gmail.com
 * id.amirisback.bandung
 * Copyright 2017
 */
package dnb;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faisal Amir
 */
public class list_masakan_admin extends javax.swing.JFrame {
    connection conn = new connection();
    private DefaultTableModel list;
    private Object get_id;
    private String sql = "";
    private String user, pw, nama, telp, email;
    /**
     * Creates new form index
     */
    public list_masakan_admin() {
        initComponents();
        conn.ConnectToDB();
        createTable();
        getData();
    }
    
    public void createTable() {
        list = new DefaultTableModel();
        tabel_makanan.setModel(list);
        list.addColumn("No.");
        list.addColumn("Kode Masakan");
        list.addColumn("Pulau");
        list.addColumn("Nama Masakan");
    }
    
        public void getData() {
        list.getDataVector().removeAllElements();
        list.fireTableDataChanged();
        try {
            sql = "Select * from data_masakan natural join table_pulau order by id_masakan asc";
            conn.setStatement(conn.getConnect().createStatement());
            conn.setResultSet(conn.getStatement().executeQuery(sql));
            int i = 1;
            while (conn.getResultSet().next()) {
                Object[] isi = new Object[4];
                isi[0] = i + ".";
                isi[1] = conn.getResultSet().getString("id_masakan");
                isi[2] = conn.getResultSet().getString("nama_masakan");
                isi[3] = conn.getResultSet().getString("nama_pulau");
                list.addRow(isi);
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_makanan = new javax.swing.JTable();
        DetailPet = new javax.swing.JButton();
        UpdatePet = new javax.swing.JButton();
        DeletePet = new javax.swing.JButton();
        txt_pulau = new javax.swing.JLabel();
        DetailPet11 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel2.setText("Dapur Nusantara Bunda");

        jLabel3.setText("Copyright || Dapur Nusantara Bunda 2017");

        jPanel3.setBackground(new java.awt.Color(255, 248, 206));

        tabel_makanan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel_makanan);

        DetailPet.setBackground(new java.awt.Color(121, 85, 72));
        DetailPet.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        DetailPet.setForeground(new java.awt.Color(255, 255, 255));
        DetailPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dnb/Icon/icons8_More_Details_25px.png"))); // NOI18N
        DetailPet.setText("DETAIL");
        DetailPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailPetActionPerformed(evt);
            }
        });

        UpdatePet.setBackground(new java.awt.Color(0, 0, 255));
        UpdatePet.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        UpdatePet.setForeground(new java.awt.Color(255, 255, 255));
        UpdatePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dnb/Icon/icons8_Edit_25px.png"))); // NOI18N
        UpdatePet.setText("UBAH");
        UpdatePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePetActionPerformed(evt);
            }
        });

        DeletePet.setBackground(new java.awt.Color(255, 51, 51));
        DeletePet.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        DeletePet.setForeground(new java.awt.Color(255, 255, 255));
        DeletePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dnb/Icon/icons8_Trash_25px.png"))); // NOI18N
        DeletePet.setText("DELETE");
        DeletePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePetActionPerformed(evt);
            }
        });

        txt_pulau.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_pulau.setText("Data Semua Masakan");

        DetailPet11.setBackground(new java.awt.Color(0, 102, 0));
        DetailPet11.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        DetailPet11.setForeground(new java.awt.Color(255, 255, 255));
        DetailPet11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dnb/Icon/icons8_Plus_25px.png"))); // NOI18N
        DetailPet11.setText("TAMBAH");
        DetailPet11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailPet11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt_pulau, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DetailPet11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailPet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeletePet)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeletePet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UpdatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DetailPet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_pulau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(DetailPet11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DetailPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailPetActionPerformed
        // TODO add your handling code here:
//        int row = tabel_makanan.getSelectedRow();
//        get_id = list.getValueAt(row, 1);
//        Petugas_Detail classDetail = new Petugas_Detail(get_id);
//        classDetail.setVisible(true);
//        this.dispose();

    }//GEN-LAST:event_DetailPetActionPerformed

    private void UpdatePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePetActionPerformed
        // TODO add your handling code here:
        int row = tabel_makanan.getSelectedRow();
        get_id = list.getValueAt(row, 1);
        editMakanan editClass = new editMakanan(get_id);
        editClass.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_UpdatePetActionPerformed

    private void DeletePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePetActionPerformed
        // TODO add your handling code here:
        int row = tabel_makanan.getSelectedRow();
        get_id = list.getValueAt(row, 1);

        if (row != -1) {
            try {
                sql = "Delete from data_masakan where id_masakan = '" + get_id + "'";
                conn.setPreStatement(conn.getConnect().prepareStatement(sql));
                conn.getPreStatement().executeUpdate();
            } catch (Exception e) {
                System.out.println(e);
            }
            list.removeRow(row);
            list.fireTableDataChanged();
            getData();
        } else {
            System.out.println("GAGAL HAPUS");
        }
    }//GEN-LAST:event_DeletePetActionPerformed

    private void DetailPet11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailPet11ActionPerformed
        // TODO add your handling code here:
        addMakanan add = new addMakanan();
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DetailPet11ActionPerformed

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
            java.util.logging.Logger.getLogger(list_masakan_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(list_masakan_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(list_masakan_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(list_masakan_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new list_masakan_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletePet;
    private javax.swing.JButton DetailPet;
    private javax.swing.JButton DetailPet1;
    private javax.swing.JButton DetailPet10;
    private javax.swing.JButton DetailPet11;
    private javax.swing.JButton DetailPet2;
    private javax.swing.JButton DetailPet3;
    private javax.swing.JButton DetailPet4;
    private javax.swing.JButton DetailPet5;
    private javax.swing.JButton DetailPet6;
    private javax.swing.JButton DetailPet7;
    private javax.swing.JButton DetailPet8;
    private javax.swing.JButton DetailPet9;
    private javax.swing.JButton UpdatePet;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_makanan;
    private javax.swing.JLabel txt_pulau;
    // End of variables declaration//GEN-END:variables
}
