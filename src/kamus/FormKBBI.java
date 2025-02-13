package kamus;

public class FormKBBI extends javax.swing.JFrame {

    Kamus kms;
    boolean hps_data = false;

    /** Creates new form FormKBBI */
    public FormKBBI() {
        kms = new Kamus();
        initComponents();
        btnHapus.setVisible(false);
        txtKata.requestFocus();
        int loop = 0;
        while (loop < 800) {
            setLocation(loop, 300);
            loop++;
        }
        while (loop > 400) {
            setLocation(loop, 300);
            loop--;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKata = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listArti = new javax.swing.JTextArea();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Masukkan kata yg ingin dicari :");

        txtKata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKataActionPerformed(evt);
            }
        });
        txtKata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKataKeyPressed(evt);
            }
        });

        listArti.setColumns(20);
        listArti.setRows(5);
        jScrollPane1.setViewportView(listArti);

        btnHapus.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 78)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("KBBI Apps");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCari)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtKata, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKata, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCari)
                            .addComponent(btnHapus)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKataKeyPressed
        //listArti.setText(kms.kamus(txtKata.getText()));
    }//GEN-LAST:event_txtKataKeyPressed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        listArti.setText(kms.search(txtKata.getText()));
        btnHapus.setVisible(true);
        //btnHapus.setLocation(50,50);
        btnCari.setVisible(false);
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtKataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKataActionPerformed
        listArti.setText(kms.search(txtKata.getText()));
        btnHapus.setVisible(true);
        //btnHapus.setLocation(50,50);
        btnCari.setVisible(false);
    }//GEN-LAST:event_txtKataActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        txtKata.setText("");
        listArti.setText("");
        btnCari.setVisible(true);
        //btnCari.setLocation(50,50);
        btnHapus.setVisible(false);
        txtKata.requestFocus();
    }//GEN-LAST:event_btnHapusActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormKBBI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listArti;
    private javax.swing.JTextField txtKata;
    // End of variables declaration//GEN-END:variables
}