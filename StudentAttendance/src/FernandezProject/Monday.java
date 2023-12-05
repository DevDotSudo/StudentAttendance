
package FernandezProject;


import  java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class Monday extends javax.swing.JFrame {

    static StudentList s;
    public Monday() {
        initComponents();
        s = new StudentList();
        monday();
    }
    
    public void monday(){
        try{
        DefaultTableModel det =  (DefaultTableModel) mondayTb.getModel();
        det.setRowCount(0);
        
        Statement st = s.con.createStatement();
        s.rs = st.executeQuery("SELECT * FROM mondaydate");
        
        while(s.rs.next()){
            Vector vec = new Vector();
            
            vec.add(s.rs.getString(1));
            
            
            det.addRow(vec);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mondayTb = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mondayTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Monday"
            }
        ));
        jScrollPane1.setViewportView(mondayTb);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, -1, 428));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 480));

        setSize(new java.awt.Dimension(464, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
        showR show = new showR();
        show.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monday().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mondayTb;
    // End of variables declaration//GEN-END:variables
}
