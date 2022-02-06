


import javax.swing.JOptionPane;



public class Third extends javax.swing.JFrame {

    public Third() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jList1.setBackground(new java.awt.Color(0, 0, 0));
        jList1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 0, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Chocolate", "Vanilia", "Crema", "with fruits", "with milk", "banana cake", "apple cake" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jList1.setVisibleRowCount(12);
        jScrollPane2.setViewportView(jList1);
        jList1.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 60, 430, 150);

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("Your Choise:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 430, 50);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Weight(g):");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(780, 0, 210, 60);

        jComboBox1.setBackground(new java.awt.Color(204, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jComboBox1.setMaximumRowCount(12);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150 g", "250 g", "350 g", "550 g", "650 g", "750 g", "850 g" }));
        jComboBox1.setToolTipText("");
        jComboBox1.setAutoscrolls(true);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.setKeySelectionManager(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(780, 80, 340, 120);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jButton1.setText("BUY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1240, 0, 130, 800);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/thPSLXAY3O.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(630, 320, 290, 230);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 730, 290, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/wc1802401.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-40, -80, 1410, 980);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
  
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String l = jList1.getSelectedValue();
        String c = (String) jComboBox1.getSelectedItem();
        float kilo;
        try{
        switch (l) {
            case "Chocolate":
                kilo = 120f;
                switch (c) {
                    case "150 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/6.66+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "250 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "350 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/2.85+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "550 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.81+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "650 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "750 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.33+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "850 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.17+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    default:
                        break;
                }   break;
            case "Vanilia":
                kilo = 100f;
                switch (c) {
                    case "150 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/6.66+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "250 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "350 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/2.85+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "550 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.81+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "650 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "750 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.33+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "850 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.17+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    default:
                        break;
                }   break;
            case "Crema":
                kilo = 100f;
                switch (c) {
                    case "150 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/6.66+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "250 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "350 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/2.85+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "550 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.81+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "650 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "750 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.33+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "850 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.17+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    default:
                        break;
                }   break;
            case "with fruits":
                kilo = 80f;
                switch (c) {
                    case "150 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/6.66+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "250 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "350 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/2.85+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "550 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.81+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "650 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "750 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.33+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "850 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.17+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    default:
                        break;
                }   break;
            case "with milk":
                kilo = 80f;
                switch (c) {
                    case "150 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/6.66+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "250 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "350 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/2.85+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "550 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.81+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "650 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "750 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.33+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "850 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.17+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    default:
                        break;
                }   break;
            case "banana cake":
                kilo = 90f;
                switch (c) {
                    case "150 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/6.66+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "250 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "350 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/2.85+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "550 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.81+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "650 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "750 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.33+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "850 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.17+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    default:
                        break;
                }   break;
            case "apple cake":
                kilo = 60f;
                switch (c) {
                    case "150 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/6.66+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "250 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "350 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/2.85+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "550 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.81+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "650 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.53+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "750 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.33+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    case "850 g":
                        JOptionPane.showMessageDialog(this,"Your Order Cost "+kilo/1.17+" Ron\n THank You For Your Visit !");
                        dispose();
                        new Final1().setVisible(true);
                        break;
                    default:
                        break;
                }   break;
            default:
                break;
        }
        }
        catch(java.lang.NullPointerException e)
        {
            JOptionPane.showMessageDialog(this, "You Didn't Select Your Choise Yet :) ");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Second().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Third().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables


}
