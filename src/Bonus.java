
import javax.swing.JOptionPane;


public class Bonus extends javax.swing.JFrame {

    
    public Bonus() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1100, 620, 110, 37);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("BUY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1099, 10, 110, 600);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"chocolate (4 kg) ", "360 Ron"},
                {"vanilia (4 kg)", "300 Ron"},
                {"crema (4 kg) ", "300 Ron"},
                {"with milk (4 kg) ", "240 Ron"},
                {"with fruits (4 kg)  ", "240 Ron"},
                {"banana cake (4 kg) ", "270 Ron"},
                {"Apple cake (4 kg)", "180 Ron"}
            },
            new String [] {
                "Type", "Prise()"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setDragEnabled(true);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(20);
        jTable1.setRowMargin(3);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1090, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/AC Milan Wallpaper 55.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-9, -24, 1230, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Second().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        int i = jTable1.getSelectedRow();
        int j = jTable1.getSelectedColumn();

        if((i == 0 && j == 0) || (i == 0 && j == 1)){
            JOptionPane.showMessageDialog(null, "Your Order Cost 360 Ron\nThank you For Your Visit!");
            dispose();
            new Final1().setVisible(true);
        }
        else if((i == 1 && j == 0) || (i == 1 && j == 1)){
            JOptionPane.showMessageDialog(null, "Your Order Cost 300 Ron\nThank you For Your Visit!");
            dispose();
            new Final1().setVisible(true);
        }
        else if((i == 2 && j == 0) || (i == 2 && j == 1)){
            JOptionPane.showMessageDialog(null, "Your Order Cost 300 Ron\nThank you For Your Visit!");
            dispose();
            new Final1().setVisible(true);
        }
        else if((i == 3 && j == 0) || (i == 3 && j == 1)){
            JOptionPane.showMessageDialog(null, "Your Order Cost 240 Ron\nThank you For Your Visit!");
            dispose();
            new Final1().setVisible(true);
        }
        else if((i == 4 && j == 0) || (i == 4 && j == 1)){
            JOptionPane.showMessageDialog(null, "Your Order Cost 240 Ron\nThank you For Your Visit!");
            dispose();
            new Final1().setVisible(true);
        }
        else if((i == 5 && j == 0) || (i == 5 && j == 1)){
            JOptionPane.showMessageDialog(null, "Your Order Cost 270 Ron\nThank you For Your Visit!");
            dispose();
            new Final1().setVisible(true);
        }
        else if((i == 6 && j == 0) || (i == 6 && j == 1)){
            JOptionPane.showMessageDialog(null, "Your Order Cost 180 Ron\nThank you For Your Visit!");
            dispose();
            new Final1().setVisible(true);
        }

        else
        {
            JOptionPane.showMessageDialog(null, "Please Select Your Order First Or press Back!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bonus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
