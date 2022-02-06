
import javax.swing.JOptionPane;

public class OneDeleciosCake extends javax.swing.JFrame {

    public OneDeleciosCake() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"chocolate (1kg) ",  new Integer(120)},
                {"vanilia (1kg)",  new Integer(100)},
                {"crema (1kg)",  new Integer(100)},
                {"with milk (1kg)",  new Integer(80)},
                {"with fruits (1kg)",  new Integer(80)},
                {"banana cake (1kg)",  new Integer(90)},
                {"Apple cake (1kg)",  new Integer(60)}
            },
            new String [] {
                "Type", "Prise()"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setBounds(0, 0, 1228, 180);

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
        jButton1.setBounds(1290, 0, 110, 760);

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1110, 240, 117, 57);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/AC Milan Wallpaper 66.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-16, -10, 1430, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1398, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        int i = jTable1.getSelectedRow();
        int j = jTable1.getSelectedColumn();
        
        if((i == 0 && j == 0) || (i == 0 && j == 1)){
        JOptionPane.showMessageDialog(null, "Your Order(Chocolate) Cost 120 Ron\nThank you For Your Visit!");
        dispose();
        new Final1().setVisible(true); 
        }
        else if((i == 1 && j == 0) || (i == 1 && j == 1)){
        JOptionPane.showMessageDialog(null, "Your Order(Vanilia) Cost 100 Ron\nThank you For Your Visit!");
        dispose();
        new Final1().setVisible(true);
        }
        else if((i == 2 && j == 0) || (i == 2 && j == 1)){
        JOptionPane.showMessageDialog(null, "Your Order(Crema) Cost 100 Ron\nThank you For Your Visit!");
        dispose();
        new Final1().setVisible(true); 
        }
        else if((i == 3 && j == 0) || (i == 3 && j == 1)){
        JOptionPane.showMessageDialog(null, "Your Order(with milk) Cost 80 Ron\nThank you For Your Visit!");
        dispose();
        new Final1().setVisible(true);
        }
        else if((i == 4 && j == 0) || (i == 4 && j == 1)){
        JOptionPane.showMessageDialog(null, "Your Order(with fruits) Cost 80 Ron\nThank you For Your Visit!");
        dispose();
        new Final1().setVisible(true); 
        }
        else if((i == 5 && j == 0) || (i == 5 && j == 1)){
        JOptionPane.showMessageDialog(null, "Your Order(banana cake) Cost 90 Ron\nThank you For Your Visit!");
        dispose();
        new Final1().setVisible(true);
        }
        else if((i == 6 && j == 0) || (i == 6 && j == 1)){
        JOptionPane.showMessageDialog(null, "Your Order(apple cake) Cost 60 Ron\nThank you For Your Visit!");
        dispose();
        new Final1().setVisible(true);
        }
        
        else
        {
        JOptionPane.showMessageDialog(null, "Please Select Your Order First Or press Back!");
        }
       
     
   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Second().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OneDeleciosCake().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
