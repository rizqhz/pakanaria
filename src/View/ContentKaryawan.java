/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enigma
 */
public class ContentKaryawan extends javax.swing.JInternalFrame {

    /**
     * Creates new form ContentStats
     */
    public ContentKaryawan() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        this.LoadData();
        
        dataKredensial = Model.Kredensial.Get();
        for (HashMap<String, String> data : dataKredensial) {
            cboxKredensial.addItem(data.get("username"));
        }
        cboxKredensial.setSelectedIndex(-1);
    }
    
    private void LoadData() {
        DefaultTableModel table = (DefaultTableModel) TableKaryawan.getModel();
        var data = Model.Pengguna.Get();
        var rows = new Object[7];
        for (HashMap<String, String> item : data) {
            rows[0] = item.get("id");
            rows[1] = item.get("nama_lengkap");
            rows[2] = item.get("alamat");
            rows[3] = item.get("telepon");
            rows[4] = item.get("email");
            rows[5] = item.get("foto");
            rows[6] = item.get("kredensial_id");
            table.addRow(rows);
        }
    }
    
    private void ClearData() {
        DefaultTableModel table = (DefaultTableModel) TableKaryawan.getModel();
        for (int i = table.getRowCount() - 1; i > -1; i--) {
            table.removeRow(i);
        }
    }
    
    private void FieldClear() {
        fieldNama.setText("");
        fieldAlamat.setText("");
        fieldTelepon.setText("");
        fieldEmail.setText("");
        cboxKredensial.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ScrollPanel = new javax.swing.JScrollPane();
        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        fieldNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldAlamat = new javax.swing.JTextArea();
        fieldTelepon = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        lblTelepon = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        lblTelepon1 = new javax.swing.JLabel();
        lblTelepon2 = new javax.swing.JLabel();
        cboxKredensial = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableKaryawan = new View.components.CustomTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(new java.awt.Color(255, 255, 255));
        setFrameIcon(null);
        setMaximumSize(new java.awt.Dimension(980, 700));
        setMinimumSize(new java.awt.Dimension(980, 700));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(980, 700));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        ScrollPanel.setBackground(new java.awt.Color(249, 249, 249));
        ScrollPanel.setBorder(null);
        ScrollPanel.setForeground(new java.awt.Color(249, 249, 249));
        ScrollPanel.setMaximumSize(new java.awt.Dimension(980, 700));
        ScrollPanel.setMinimumSize(new java.awt.Dimension(980, 700));
        ScrollPanel.setPreferredSize(new java.awt.Dimension(980, 700));

        MainPanel.setBackground(new java.awt.Color(249, 249, 249));
        MainPanel.setForeground(new java.awt.Color(249, 249, 249));
        MainPanel.setMaximumSize(new java.awt.Dimension(980, 700));
        MainPanel.setMinimumSize(new java.awt.Dimension(980, 700));
        MainPanel.setPreferredSize(new java.awt.Dimension(980, 700));
        MainPanel.setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setForeground(new java.awt.Color(249, 249, 249));

        fieldNama.setBackground(new java.awt.Color(76, 86, 106));
        fieldNama.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        fieldNama.setForeground(new java.awt.Color(255, 255, 255));
        fieldNama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fieldNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 86, 106), 10));
        fieldNama.setDoubleBuffered(true);
        fieldNama.setMargin(new java.awt.Insets(10, 10, 10, 10));
        fieldNama.setMinimumSize(new java.awt.Dimension(64, 40));
        fieldNama.setOpaque(true);
        fieldNama.setPreferredSize(new java.awt.Dimension(101, 40));

        fieldAlamat.setBackground(new java.awt.Color(76, 86, 106));
        fieldAlamat.setColumns(15);
        fieldAlamat.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        fieldAlamat.setForeground(new java.awt.Color(255, 255, 255));
        fieldAlamat.setLineWrap(true);
        fieldAlamat.setRows(3);
        fieldAlamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 86, 106), 10));
        fieldAlamat.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(fieldAlamat);

        fieldTelepon.setBackground(new java.awt.Color(76, 86, 106));
        fieldTelepon.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        fieldTelepon.setForeground(new java.awt.Color(255, 255, 255));
        fieldTelepon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 86, 106), 10));
        fieldTelepon.setMargin(new java.awt.Insets(10, 10, 10, 10));
        fieldTelepon.setMinimumSize(new java.awt.Dimension(64, 40));
        fieldTelepon.setOpaque(true);
        fieldTelepon.setPreferredSize(new java.awt.Dimension(101, 40));

        fieldEmail.setBackground(new java.awt.Color(76, 86, 106));
        fieldEmail.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        fieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        fieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 86, 106), 10));
        fieldEmail.setMargin(new java.awt.Insets(10, 10, 10, 10));
        fieldEmail.setMinimumSize(new java.awt.Dimension(64, 40));
        fieldEmail.setOpaque(true);
        fieldEmail.setPreferredSize(new java.awt.Dimension(101, 40));

        lblNama.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblNama.setForeground(new java.awt.Color(67, 76, 94));
        lblNama.setText("Nama Lengkap");
        lblNama.setMaximumSize(new java.awt.Dimension(117, 40));
        lblNama.setMinimumSize(new java.awt.Dimension(117, 40));
        lblNama.setPreferredSize(new java.awt.Dimension(117, 40));

        lblAlamat.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblAlamat.setForeground(new java.awt.Color(67, 76, 94));
        lblAlamat.setText("Alamat");
        lblAlamat.setMaximumSize(new java.awt.Dimension(56, 40));
        lblAlamat.setMinimumSize(new java.awt.Dimension(56, 40));
        lblAlamat.setPreferredSize(new java.awt.Dimension(56, 40));

        lblTelepon.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblTelepon.setForeground(new java.awt.Color(67, 76, 94));
        lblTelepon.setText("Nomor Telepon");
        lblTelepon.setMaximumSize(new java.awt.Dimension(119, 40));
        lblTelepon.setMinimumSize(new java.awt.Dimension(119, 40));
        lblTelepon.setPreferredSize(new java.awt.Dimension(119, 40));

        lblEmail.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(67, 76, 94));
        lblEmail.setText("E-mail");
        lblEmail.setMaximumSize(new java.awt.Dimension(49, 40));
        lblEmail.setMinimumSize(new java.awt.Dimension(49, 40));
        lblEmail.setPreferredSize(new java.awt.Dimension(49, 40));

        btnSimpan.setBackground(new java.awt.Color(76, 86, 106));
        btnSimpan.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(249, 249, 249));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 86, 106), 10));
        btnSimpan.setContentAreaFilled(false);
        btnSimpan.setFocusPainted(false);
        btnSimpan.setOpaque(true);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(191, 97, 106));
        btnHapus.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(249, 249, 249));
        btnHapus.setText("Hapus");
        btnHapus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 97, 106), 10));
        btnHapus.setContentAreaFilled(false);
        btnHapus.setFocusPainted(false);
        btnHapus.setOpaque(true);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(76, 86, 106));
        btnUbah.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(249, 249, 249));
        btnUbah.setText("Ubah");
        btnUbah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 86, 106), 10));
        btnUbah.setContentAreaFilled(false);
        btnUbah.setFocusPainted(false);
        btnUbah.setOpaque(true);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(191, 97, 106));
        btnBatal.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(249, 249, 249));
        btnBatal.setText("Batal");
        btnBatal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 97, 106), 10));
        btnBatal.setContentAreaFilled(false);
        btnBatal.setFocusPainted(false);
        btnBatal.setOpaque(true);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        lblTelepon1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblTelepon1.setForeground(new java.awt.Color(67, 76, 94));
        lblTelepon1.setText("Foto");
        lblTelepon1.setMaximumSize(new java.awt.Dimension(119, 40));
        lblTelepon1.setMinimumSize(new java.awt.Dimension(119, 40));
        lblTelepon1.setPreferredSize(new java.awt.Dimension(119, 40));

        lblTelepon2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblTelepon2.setForeground(new java.awt.Color(67, 76, 94));
        lblTelepon2.setText("Kredensial");
        lblTelepon2.setMaximumSize(new java.awt.Dimension(119, 40));
        lblTelepon2.setMinimumSize(new java.awt.Dimension(119, 40));
        lblTelepon2.setPreferredSize(new java.awt.Dimension(119, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAlamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelepon1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(lblTelepon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxKredensial, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelepon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(lblAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelepon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxKredensial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHapus)
                            .addComponent(btnUbah))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        MainPanel.add(jPanel1);

        TableKaryawan.setBackground(new java.awt.Color(236, 239, 244));
        TableKaryawan.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        TableKaryawan.setForeground(new java.awt.Color(76, 86, 106));
        TableKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Lengkap", "Alamat", "Nomor Telepon", "Email", "Foto", "Kredensial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableKaryawan.setToolTipText("");
        TableKaryawan.setDoubleBuffered(true);
        TableKaryawan.setFocusable(false);
        TableKaryawan.setGridColor(new java.awt.Color(67, 76, 94));
        TableKaryawan.setRowHeight(30);
        TableKaryawan.setSelectionBackground(new java.awt.Color(216, 222, 233));
        TableKaryawan.setSelectionForeground(new java.awt.Color(67, 76, 94));
        TableKaryawan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TableKaryawan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TableKaryawan.setShowGrid(false);
        TableKaryawan.setShowHorizontalLines(true);
        TableKaryawan.getTableHeader().setReorderingAllowed(false);
        TableKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableKaryawan);

        MainPanel.add(jScrollPane2);

        ScrollPanel.setViewportView(MainPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(ScrollPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        var nama = fieldNama.getText();
        var alamat = fieldAlamat.getText();
        var telepon = fieldTelepon.getText();
        var email = fieldEmail.getText();
        var kredensial = Model.Kredensial.Get(cboxKredensial.getSelectedItem().toString());
        Model.Pengguna.Add(nama, alamat, telepon, email, null, kredensial.get(0).get("id"));
        this.ClearData();
        this.LoadData();
        this.FieldClear();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin?", "Hapus Data", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            Model.Pengguna.Destroy(key);
            this.ClearData();
            this.LoadData();
            this.FieldClear();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        var nama = fieldNama.getText();
        var alamat = fieldAlamat.getText();
        var telepon = fieldTelepon.getText();
        var email = fieldEmail.getText();
        var kredensial = Model.Kredensial.Get(cboxKredensial.getSelectedItem().toString());
        Model.Pengguna.Edit(key, nama, alamat, telepon, email, null, kredensial.get(0).get("id"));
        this.ClearData();
        this.LoadData();
        this.FieldClear();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void TableKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKaryawanMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TableKaryawan.getModel();
        int idx = TableKaryawan.getSelectedRow();
        key = Integer.parseInt(model.getValueAt(idx, 0).toString());
        fieldNama.setText(model.getValueAt(idx, 1).toString());
        fieldAlamat.setText(model.getValueAt(idx, 2).toString());
        fieldTelepon.setText(model.getValueAt(idx, 3).toString());
        fieldEmail.setText(model.getValueAt(idx, 4).toString());
        cboxKredensial.setSelectedItem(Model.Kredensial.Get(Integer.parseInt(model.getValueAt(idx, 6).toString())).get(0).get("username"));
    }//GEN-LAST:event_TableKaryawanMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.FieldClear();
        TableKaryawan.clearSelection();
    }//GEN-LAST:event_btnBatalActionPerformed

    // reserved object
    private static int key;
    private static ArrayList<HashMap<String, String>> dataKredensial;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JTable TableKaryawan;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cboxKredensial;
    private javax.swing.JTextArea fieldAlamat;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldTelepon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTelepon;
    private javax.swing.JLabel lblTelepon1;
    private javax.swing.JLabel lblTelepon2;
    // End of variables declaration//GEN-END:variables
}