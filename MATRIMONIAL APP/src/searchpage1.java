import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * searchpage1.java
 *
 * Created on Oct 26, 2017, 9:52:07 PM
 */

/**
 *
 * @author admin
 */
public class searchpage1 extends javax.swing.JFrame {
public static String q,w,e,r,t,p,ab,bc,cd,de;

/** Creates new form searchpage1 */
    public searchpage1() {
        initComponents();
    }
    public searchpage1(String i,String j,String k,String l,String m,String s)
    {
        q=i;
        w=j;
        e=k;
        r=l;
        t=m;
  p=s;
   initComponents();
         btn1.doClick();
          btn1.setVisible(false);
    }
 public searchpage1(String y,String z)
    {
        ab=y;
        bc=z;
     initComponents();
         btn1.doClick();
          btn1.setVisible(false);
    }
 public searchpage1(String x)
    {
        cd=x;
        initComponents();
         btn1.doClick();
          btn1.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jt11 = new javax.swing.JTextField();
        jt12 = new javax.swing.JTextField();
        jt13 = new javax.swing.JTextField();
        jt14 = new javax.swing.JTextField();
        jt15 = new javax.swing.JTextField();
        jt21 = new javax.swing.JTextField();
        jt22 = new javax.swing.JTextField();
        jt23 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jrb1 = new javax.swing.JRadioButton();
        jrb2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Algerian", 3, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GO N GRAB YOUR MATCH");
        jLabel1.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("SEARCH YOUR MATCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setText("ABOUT US");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jtb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "firstname", "lastname", "qualfication"
            }
        ));
        jScrollPane1.setViewportView(jtb1);

        jt11.setEditable(false);

        jt12.setEditable(false);
        jt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt12ActionPerformed(evt);
            }
        });

        jt13.setEditable(false);

        jt14.setEditable(false);

        jt15.setEditable(false);

        jt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt22ActionPerformed(evt);
            }
        });
        jt22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jt22FocusLost(evt);
            }
        });

        jLabel2.setText("FIRST NAME");

        jLabel4.setText("LAST NAME");

        jLabel5.setText("QUALIFICATION");

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setText("GET DETAILS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setText("CHANGE PASSWORD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bernard MT Condensed", 3, 24));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WELCOME,");
        jLabel6.setOpaque(true);

        jLabel8.setText("YOUR D.O.B        --");

        jLabel9.setText("YOUR QUALIFICATION --");

        jLabel10.setText("YOUR CONTACT NO.  --");

        jLabel11.setText("YOUR GENDER   --");

        buttonGroup1.add(jrb1);
        jrb1.setText("SAME QUALIFICATION");

        buttonGroup1.add(jrb2);
        jrb2.setText("SAME CAST");

        jLabel7.setBackground(new java.awt.Color(255, 153, 102));
        jLabel7.setFont(new java.awt.Font("Algerian", 3, 14));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LIST");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jt15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt14, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(45, 45, 45)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btn1)
                                .addGap(51, 51, 51)
                                .addComponent(jButton2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(73, 73, 73)
                                                    .addComponent(jrb1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jrb2))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel5))
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jt23, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                                    .addComponent(jt22)
                                                    .addComponent(jt21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4)))
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(264, 264, 264)))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb1)
                    .addComponent(jrb2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String a,b,c,d,dd;
String u,v;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DefaultTableModel p=(DefaultTableModel)jtb1.getModel();
u=jt15.getText();
v=jt13.getText();
       if (u.compareTo("male")==0&&jrb1.isSelected()==true)
       try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/aditya","root","123");
    Statement stmt=con.createStatement();
    String query="(select * from bride where qualification='"+v+"');";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())
    {
         a=rs.getString("firstname");
         b=rs.getString("lastname");
         c=rs.getString("dateofbirth");
         dd=rs.getString("qualification");
          d=rs.getString("contactno");
        Object[] ob1={a,b,dd};
          p.addRow(ob1);
        }
rs.close();
stmt.close();
con.close();
    }catch(Exception l)
{
        JOptionPane.showMessageDialog(null,l);
}
       else 
           if(u.compareTo("female")==0&&jrb1.isSelected()==true)
                try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/aditya","root","123");
    Statement stmt=con.createStatement();
    String query="(select * from groom where qualification='"+v+"');";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())
    {
         a=rs.getString("firstname");
         b=rs.getString("lastname");
         c=rs.getString("dateofbirth");
          dd=rs.getString("qualification");
         d=rs.getString("contactno");
        Object[] ob1={a,b,dd};
          p.addRow(ob1);
    }
rs.close();
stmt.close();
con.close();
    }catch(Exception l)
{
JOptionPane.showMessageDialog(null,l);
}
           else
                if(u.compareTo("male")==0&&jrb2.isSelected()==true)
                try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/aditya","root","123");
    Statement stmt=con.createStatement();
    String query="(select * from bride where lastname='"+w+"');";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())
    {
         a=rs.getString("firstname");
         b=rs.getString("lastname");
         c=rs.getString("dateofbirth");
          dd=rs.getString("qualification");
         d=rs.getString("contactno");
        Object[] ob1={a,b,dd};
          p.addRow(ob1);
    }
rs.close();
stmt.close();
con.close();
    }catch(Exception l)
{
JOptionPane.showMessageDialog(null,l);
}
           else
                if(u.compareTo("female")==0&&jrb2.isSelected()==true)
                try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/aditya","root","123");
    Statement stmt=con.createStatement();
    String query="(select * from groom where lastname='"+w+"');";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())
    {
         a=rs.getString("firstname");
         b=rs.getString("lastname");
         c=rs.getString("dateofbirth");
                   dd=rs.getString("qualification");
         d=rs.getString("contactno");
        Object[] ob1={a,b,dd};
          p.addRow(ob1);
    }
rs.close();
stmt.close();
con.close();
    }catch(Exception l)
{
JOptionPane.showMessageDialog(null,l);
}
                else
                { if(u.compareTo("female")==0)
                try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/aditya","root","123");
    Statement stmt=con.createStatement();
    String query="(select * from groom);";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())
    {
         a=rs.getString("firstname");
         b=rs.getString("lastname");
         c=rs.getString("dateofbirth");
                   dd=rs.getString("qualification");
         d=rs.getString("contactno");
        Object[] ob1={a,b,dd};
          p.addRow(ob1);
    }
rs.close();
stmt.close();
con.close();
    }catch(Exception l)
{
JOptionPane.showMessageDialog(null,l);
}
                  else
                      if(u.compareTo("male")==0)
               try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/aditya","root","123");
    Statement stmt=con.createStatement();
    String query="(select * from bride );";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())
    {
         a=rs.getString("firstname");
         b=rs.getString("lastname");
         c=rs.getString("dateofbirth");
                   dd=rs.getString("qualification");
d=rs.getString("contactno");
        Object[] ob1={a,b,dd};
          p.addRow(ob1);
    }
rs.close();
stmt.close();
con.close();
    }catch(Exception l)
{
JOptionPane.showMessageDialog(null,l);
}
                }
                     // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
new welcome1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
new aboutus1().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt12ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jt12ActionPerformed

    private void jt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt22ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jt22ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    String x,y,z,g=null,h=null,i=null,j=null,k=null;
    x=jt21.getText();
    y=jt22.getText();
    z=jt23.getText();
    if(u.compareTo("male")==0)
     try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/aditya","root","123");
    Statement stmt=con.createStatement();
    String query="(select * from bride where firstname='"+x+"' && lastname='"+y+"' && qualification='"+z+"');";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())
    {
         g=rs.getString("firstname");
         h=rs.getString("lastname");
         i=rs.getString("dateofbirth");
         j=rs.getString("qualification");
          k=rs.getString("contactno");
           
        
           }
rs.close();
stmt.close();
con.close();
    }catch(Exception l)
{
JOptionPane.showMessageDialog(null,l);
}
    else
     if(u.compareTo("female")==0)
     try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/aditya","root","123");
    Statement stmt=con.createStatement();
    String query="(select * from groom where firstname='"+x+"' && lastname='"+y+"' && qualification='"+z+"');";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())
    {
         g=rs.getString("firstname");
         h=rs.getString("lastname");
         i=rs.getString("dateofbirth");
          j=rs.getString("qualification");
         k=rs.getString("contactno");
                  
}
rs.close();
stmt.close();
con.close();
    }catch(Exception l)
{
    JOptionPane.showMessageDialog(null,l);
}
    this.setVisible(false);
    new personaldetails1(g,h,i,j,k).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
jt11.setText(q+" "+w);
jt12.setText(e);
jt13.setText(r);
jt14.setText(t);
jt15.setText(p);
// TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void jt22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jt22FocusLost
jt23.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jt22FocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.setVisible(false);
new changepassword(p).setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchpage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton jrb1;
    private javax.swing.JRadioButton jrb2;
    public static javax.swing.JTextField jt11;
    public static javax.swing.JTextField jt12;
    public static javax.swing.JTextField jt13;
    public static javax.swing.JTextField jt14;
    public static javax.swing.JTextField jt15;
    private javax.swing.JTextField jt21;
    private javax.swing.JTextField jt22;
    private javax.swing.JTextField jt23;
    private javax.swing.JTable jtb1;
    // End of variables declaration//GEN-END:variables

}
