package wardrobe;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Login extends javax.swing.JFrame {
        Source source = new Source();
       
       WardrobeManager home=new WardrobeManager();
        Source method = new Source();
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        SignUpPage = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        Continuee = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Signup = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        LoginPage = new javax.swing.JPanel();
        Done = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        UserPhotoName = new javax.swing.JTextField();
        Continue = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(213, 255, 255));
        setUndecorated(true);

        jPanel4.setForeground(new java.awt.Color(51, 255, 255));
        jPanel4.setLayout(new java.awt.CardLayout());

        SignUpPage.setBackground(new java.awt.Color(213, 232, 212));
        SignUpPage.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setText("User name");

        jLabel8.setText("Password");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        Continuee.setText("Continue");
        Continuee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueeActionPerformed(evt);
            }
        });

        jLabel9.setText("New to the wardrobe manger");

        Signup.setText("sign up");
        Signup.setToolTipText("");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignUpPageLayout = new javax.swing.GroupLayout(SignUpPage);
        SignUpPage.setLayout(SignUpPageLayout);
        SignUpPageLayout.setHorizontalGroup(
            SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPageLayout.createSequentialGroup()
                .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpPageLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(78, 78, 78)
                        .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(password)))
                    .addGroup(SignUpPageLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(Continuee))
                    .addGroup(SignUpPageLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel9))
                    .addGroup(SignUpPageLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Signup)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        SignUpPageLayout.setVerticalGroup(
            SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPageLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(Continuee)
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addComponent(Signup)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanel4.add(SignUpPage, "card2");

        LoginPage.setBackground(new java.awt.Color(213, 232, 212));
        LoginPage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoginPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        LoginPage.add(Done, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 80, 30));

        jLabel2.setText("User name");
        LoginPage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        LoginPage.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 120, -1));

        jLabel4.setText("User Photo Name");
        LoginPage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel5.setText("You have alredy finished the registration?");
        LoginPage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel10.setText("Password");
        LoginPage.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        LoginPage.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, -1));

        UserPhotoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserPhotoNameActionPerformed(evt);
            }
        });
        LoginPage.add(UserPhotoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 120, -1));

        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        LoginPage.add(Continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 389, -1, 30));

        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        LoginPage.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jPanel4.add(LoginPage, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents




            

    
    
    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed

    }//GEN-LAST:event_NameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void ContinueeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueeActionPerformed
 //To check the password is the same as stored in the database
        if (username.getText().isEmpty()&& password.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "username and password is empty");
         }          
        else if (username.getText().isEmpty()){
               JOptionPane.showMessageDialog(rootPane, "Username is empty");
                    }
        else if (password.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Password is empty"); 
        }
        else{
            try {

            Statement state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery("select Pname,Password from user_detail where Pname = '"
                    +username.getText()+"' && Pid = 1 && Password = '"+password.getText()+"'");// fetching the data of the first id from the table of the database
            
            if(rs.next()) {
                home.setVisible(true);
                dispose();
            }else{
               JOptionPane.showMessageDialog(rootPane, "Username and Password does not matched!!");// error handling
               username.setText("");
               password.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
         String query = "SELECT * FROM user_detail WHERE Pid = 1"; // fetching the data from the user setail table and displaying it in the home panel
        try {
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
            while(rs.next())
            {   String image1 = rs.getString("photoName");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            home.jLabel51.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                String Name=rs.getString("Pname");
                home.jLabel131.setText(Name);
                Image image = img.getImage().getScaledInstance(home.jLabel51.getWidth(), home.jLabel51.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);
                        home.jLabel51.setIcon(newicon);
           }
           
            
   

   
        } catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_ContinueeActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
  
LoginPage.setVisible(true);
SignUpPage.setVisible(false);
       
        
    }//GEN-LAST:event_SignupActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
      
    }//GEN-LAST:event_passwordActionPerformed

    private void UserPhotoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserPhotoNameActionPerformed

    }//GEN-LAST:event_UserPhotoNameActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        //Adding the log in values if the information was not entered
        if(Name.getText().isEmpty() || Password.getText().isEmpty() || UserPhotoName.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(rootPane, "Please fill up all the information");
        }else{
            try {
                Statement state = Source.mycon().createStatement();
                
                state.executeUpdate("insert into user_detail(Pname,`Password`,`PhotoName`) values ('" + Name.getText() + "','" + Password.getText() + "','" +UserPhotoName.getText()+"')");

                method.delete(Name,UserPhotoName);
                JOptionPane.showMessageDialog(rootPane, "Successfully saved");
                SignUpPage.setVisible(true);
        LoginPage.setVisible(false);
            } catch (Exception x) {
                System.out.println(x.getMessage());
            }}
    }//GEN-LAST:event_DoneActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
      SignUpPage.setVisible(true);
        LoginPage.setVisible(false);
   
    }//GEN-LAST:event_ContinueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// copying the name of the selected photo from the device
        JFileChooser fileChooser = new JFileChooser();

        // Set the file filter to allow only image files (you can customize this as needed)
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(null);

       File selectedFile=fileChooser.getSelectedFile();

                if (selectedFile != null) {
                    UserPhotoName.setText(selectedFile.getName());
                } else {
                    System.out.println("File selection canceled by user.");
                }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JButton Continuee;
    private javax.swing.JButton Done;
    private javax.swing.JPanel LoginPage;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel SignUpPage;
    private javax.swing.JButton Signup;
    private javax.swing.JTextField UserPhotoName;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
