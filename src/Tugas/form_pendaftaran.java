package Tugas;


import com.placeholder.PlaceHolder;
import java.awt.Font;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class form_pendaftaran extends javax.swing.JFrame { 

    
    public form_pendaftaran() {
        initComponents();
        //Placeholder
        PlaceHolder holder1 = new PlaceHolder (Nama, "Masukkan Nama Lengkap");
        PlaceHolder holder2 = new PlaceHolder (panggilan, "Masukkan Nama Panggilan");
        PlaceHolder holder3 = new PlaceHolder (lahir, "Tempat Lahir ");
        PlaceHolder holder4 = new PlaceHolder (alamat, "Masukkan Alamat Anda");
        PlaceHolder holder5 = new PlaceHolder (tampilan, "Hasilnya Akan Keluar di sini ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        agama = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        pria = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        Agama1 = new javax.swing.JComboBox<>();
        panggilan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tampilan = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        olahraga = new javax.swing.JCheckBox();
        travelling = new javax.swing.JCheckBox();
        seni = new javax.swing.JCheckBox();
        lahir = new javax.swing.JTextField();
        tanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(0, 179, 179));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("TypoUpright BT", 3, 60)); // NOI18N
        jLabel2.setText("Formulir Pendaftaran");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 610, 60));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel1.setText("Nama lengkap");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel3.setText("Nama Panggilan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel4.setText("Tempat Tanggal Lahir ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 30));

        agama.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        agama.setText("Agama");
        jPanel1.add(agama, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel8.setText(":");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 30, -1));

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel9.setText(":");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 30, -1));

        jLabel11.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel11.setText(":");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 30, 30));

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel12.setText(":");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 30, -1));

        jLabel13.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel13.setText(":");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 30, -1));

        Nama.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        jPanel1.add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 350, 30));

        Group.add(pria);
        pria.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        pria.setText("Pria");
        jPanel1.add(pria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 80, -1));

        Group.add(perempuan);
        perempuan.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        perempuan.setText("Perempuan");
        jPanel1.add(perempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 150, -1));

        jLabel14.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel14.setText(":");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 30, -1));

        data.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 590, 30));

        Agama1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        Agama1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Islam", "Kristen", "Hindu", "Budha", "Khatolik", " " }));
        Agama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agama1ActionPerformed(evt);
            }
        });
        jPanel1.add(Agama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 190, 30));

        panggilan.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        panggilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panggilanActionPerformed(evt);
            }
        });
        jPanel1.add(panggilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 350, 30));

        jButton1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jButton1.setText("Kirim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 110, -1));

        jButton2.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        alamat.setColumns(20);
        alamat.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        alamat.setRows(5);
        jScrollPane2.setViewportView(alamat);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 350, 50));

        tampilan.setEditable(false);
        tampilan.setColumns(20);
        tampilan.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        tampilan.setRows(5);
        jScrollPane1.setViewportView(tampilan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 610, 190));

        jLabel16.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel16.setText("Alamat");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, 30));

        jLabel17.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel17.setText("Hobi");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 140, 30));

        jLabel15.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel15.setText(":");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 30, -1));

        olahraga.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        olahraga.setText("Olah Raga");
        olahraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olahragaActionPerformed(evt);
            }
        });
        jPanel1.add(olahraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        travelling.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        travelling.setText("Travelling");
        travelling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travellingActionPerformed(evt);
            }
        });
        jPanel1.add(travelling, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        seni.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        seni.setText("Seni");
        seni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seniActionPerformed(evt);
            }
        });
        jPanel1.add(seni, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        lahir.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        lahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lahirActionPerformed(evt);
            }
        });
        jPanel1.add(lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 140, 30));

        tanggal.setDateFormatString("tanggal, bulan, tahun");
        jPanel1.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 200, 30));

        getContentPane().add(jPanel1);

        setSize(new java.awt.Dimension(706, 719));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Reset
        Nama.setText("");
        panggilan.setText("");
        lahir.setText("");
        Agama1.getEditor();
        alamat.setText("");
        tampilan.setText("");
        PlaceHolder holder1 = new PlaceHolder (Nama, "Masukkan Nama Lengkap");
        PlaceHolder holder2 = new PlaceHolder (panggilan, "Masukkan Nama Panggilan");
        PlaceHolder holder3 = new PlaceHolder (lahir, "Tempat Lahir");
        PlaceHolder holder4 = new PlaceHolder (alamat, "Masukkan Alamat Anda");
        PlaceHolder holder5 = new PlaceHolder (tampilan, "Hasilnya Akan Keluar di sini ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Tombol Kirim
        String hasil, agama, tgl;
        
        //Untuk Jneis kelamin
        if(pria.isSelected()){
            hasil = "Pria";
        }else{
            hasil = "Perempuan";
        }
                                                                                                                                                                    
        //untuk Hobbi
        String hobi = null;
        if(travelling.isSelected()){
           hobi ="Travelling";
        }if(olahraga.isSelected()){
            hobi ="Olah Raga";
        } if(seni.isSelected()){
            hobi ="Seni";
        }
        
        // untuk agama
        agama = Agama1.getSelectedItem().toString();
        //untuk Kalender
        tgl = tanggal.getDate().toString();
        //untuk menampilkan dalam text area
        tampilan.setText(" Nama Lengkap\t: " +Nama.getText()
            +"\n Nama Panggilan\t: " +panggilan.getText()
            +"\n Tempat Tanggal Lahir\t: " +lahir.getText() +" "+tgl
            +"\n Jenis Kelamin\t \t: " +hasil
            + "\n Agama\t \t: " +agama
            +"\n Hobi\t \t: " +hobi
            +"\n Alamat\t \t: " +alamat.getText() 
            
        ); 
        //Untuk pesan 
        data.setText("Terimakasih Data Yang Anda Masukan Telah Tersimpan");         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panggilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panggilanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panggilanActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        
    }//GEN-LAST:event_NamaActionPerformed

    private void lahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lahirActionPerformed

    private void seniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seniActionPerformed
    
    }//GEN-LAST:event_seniActionPerformed

    private void olahragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olahragaActionPerformed
        
    }//GEN-LAST:event_olahragaActionPerformed

    private void travellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travellingActionPerformed

    }//GEN-LAST:event_travellingActionPerformed

    private void Agama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Agama1ActionPerformed

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
            java.util.logging.Logger.getLogger(form_pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_pendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Agama1;
    private javax.swing.ButtonGroup Group;
    private javax.swing.JTextField Nama;
    private javax.swing.JLabel agama;
    private javax.swing.JTextArea alamat;
    private javax.swing.JLabel data;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lahir;
    private javax.swing.JCheckBox olahraga;
    private javax.swing.JTextField panggilan;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JRadioButton pria;
    private javax.swing.JCheckBox seni;
    private javax.swing.JTextArea tampilan;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JCheckBox travelling;
    // End of variables declaration//GEN-END:variables
}
