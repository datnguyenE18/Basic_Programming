package iofile;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JFrame {

    private DefaultTableModel table; // DefaultTableModel lưu trữ dữ liệu cho JTable trong một Vectơ
    private String file = "SinhVien.txt";
    private List<SinhVien> list;

    public View() {
        initComponents();
	this.setLocationRelativeTo(null); // Căn giữa
        
        // Tạo cấu trúc bảng:
        String[] cols = {"Name", "Code", "Team"};
        table = new DefaultTableModel(cols, 0);
        jTList.setModel(table);

        // Hiển thị danh sách:
        list = Control.read(file);
        for (SinhVien i : list) {
            table.addRow(i.toObject());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTList = new javax.swing.JTable();
        jLName = new javax.swing.JLabel();
        jTFName = new javax.swing.JTextField();
        jLCode = new javax.swing.JLabel();
        jTFCode = new javax.swing.JTextField();
        jLTeam = new javax.swing.JLabel();
        jTFTeam = new javax.swing.JTextField();
        jBAdd = new javax.swing.JButton();
        jBSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Code", "Class"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTList);

        jLName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLName.setText("Full Name");

        jTFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNameActionPerformed(evt);
            }
        });

        jLCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCode.setText("Code");

        jTFCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodeActionPerformed(evt);
            }
        });

        jLTeam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTeam.setText("Team");

        jBAdd.setText("Add");
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });

        jBSave.setText("Save");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jBAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)
                                .addComponent(jBSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLName)
                                    .addComponent(jLCode)
                                    .addComponent(jLTeam))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFName)
                                    .addComponent(jTFCode)
                                    .addComponent(jTFTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName)
                    .addComponent(jTFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCode)
                    .addComponent(jTFCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTeam)
                    .addComponent(jTFTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAdd)
                    .addComponent(jBSave))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNameActionPerformed
    }//GEN-LAST:event_jTFNameActionPerformed

    private void jTFCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodeActionPerformed
    }//GEN-LAST:event_jTFCodeActionPerformed

    // NÚT THÊM (ADD)
    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        String name = jTFName.getText();
        String code = jTFCode.getText();
        String teamString = jTFTeam.getText();
        boolean check = true;

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a Name!");
            check = false;
        } else if (code.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a Code!");
            check = false;
        } else if (teamString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a Class!");
            check = false;
        }

        for (char c : teamString.toCharArray()) { // ???
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(this, "Class is Invalid!");
                check = false;
                break;
            }
        }

        if (check) {
            int team = Integer.parseInt(teamString); // Chuyển String sang Int
            SinhVien sv = new SinhVien(name, code, team);
            table.addRow(sv.toObject()); // ???

            // Xóa thông tin đã nhập trước đó:
            jTFName.setText("");
            jTFCode.setText("");
            jTFTeam.setText("");
        }
    }//GEN-LAST:event_jBAddActionPerformed

    //NÚT LƯU (SAVE):
    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        list = new ArrayList<>();
        for (int i = 0; i < table.getRowCount(); i++) {
            String name = (String) table.getValueAt(i, 0);
            String code = (String) table.getValueAt(i, 1);
            int team = Integer.parseInt(table.getValueAt(i, 2).toString());
            SinhVien sv = new SinhVien(name, code, team);
            list.add(sv);
        }
        Control.write(file, list);
    }//GEN-LAST:event_jBSaveActionPerformed

    // Main:
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBSave;
    private javax.swing.JLabel jLCode;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLTeam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCode;
    private javax.swing.JTextField jTFName;
    private javax.swing.JTextField jTFTeam;
    private javax.swing.JTable jTList;
    // End of variables declaration//GEN-END:variables
}
