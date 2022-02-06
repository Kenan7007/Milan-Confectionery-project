
import javax.swing.JOptionPane;


public class Second extends javax.swing.JFrame {

  
    public Second() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MyRadioButton1 = new javax.swing.JRadioButton();
        MyRadioButton2 = new javax.swing.JRadioButton();
        MyRadioButton3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome To ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 0, 320, 58);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Milan Confectionery");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 0, 500, 58);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"chocolate", "    1 kg", "  120 Ron"},
                {"vanilia", "    1 kg   ", "  100 Ron"},
                {"crema", "    1 kg", "  100 Ron"},
                {"with milk", "    1 kg", "   80 Ron"},
                {"with fruits", "    1 kg", "   80 Ron"},
                {"banana cake", "    1 kg ", "   90 Ron"},
                {"Apple cake", "    1 kg", "   60 Ron"}
            },
            new String [] {
                "Type", "Weight", "Prise"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setDragEnabled(true);
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(22);
        jTable1.setRowMargin(2);
        jTable1.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 870, 190);

        MyRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(MyRadioButton1);
        MyRadioButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        MyRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
        MyRadioButton1.setText("ONE DELICIOS CAKE (1 kg)");
        MyRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(MyRadioButton1);
        MyRadioButton1.setBounds(360, 270, 290, 31);

        MyRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(MyRadioButton2);
        MyRadioButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        MyRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        MyRadioButton2.setText("Three+ 1 [BONUS] (3 kg + 1 kg)");
        MyRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(MyRadioButton2);
        MyRadioButton2.setBounds(360, 330, 320, 31);

        MyRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(MyRadioButton3);
        MyRadioButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        MyRadioButton3.setForeground(new java.awt.Color(255, 0, 0));
        MyRadioButton3.setText("FELIE (g)");
        MyRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(MyRadioButton3);
        MyRadioButton3.setBounds(360, 390, 200, 31);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("For Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 330, 190, 100);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PRIVATE :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 300, 113, 25);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1040, 0, 100, 850);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/AC Milan Wallpaper 65.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, -110, 1240, 1010);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(MyRadioButton1.isSelected()){
            dispose();
            new OneDeleciosCake().setVisible(true);
        }
        else if(MyRadioButton2.isSelected()){
            dispose();
            new Bonus().setVisible(true);
        }
        else if(MyRadioButton3.isSelected()){
            dispose();
            new Third().setVisible(true);
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Please Select Your Order!");
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new PrivatLogin().setVisible(true);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MyRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyRadioButton2ActionPerformed
       
    }//GEN-LAST:event_MyRadioButton2ActionPerformed

    private void MyRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyRadioButton1ActionPerformed
        
    }//GEN-LAST:event_MyRadioButton1ActionPerformed

    private void MyRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyRadioButton3ActionPerformed
       
    }//GEN-LAST:event_MyRadioButton3ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Second().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton MyRadioButton1;
    private javax.swing.JRadioButton MyRadioButton2;
    private javax.swing.JRadioButton MyRadioButton3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
