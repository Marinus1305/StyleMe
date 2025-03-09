package wardrobe;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.sql.SQLException;



/*chaneg
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */

public class PopUp extends javax.swing.JFrame {
    
    private Source method=new Source();
    public PopUp() {
        initComponents();
        setLocationRelativeTo(null);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        PopUp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Continuation = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Item = new javax.swing.JLabel();
        ItemBuyDate = new javax.swing.JTextField();
        ItemBrand = new javax.swing.JTextField();
        ItemDescription = new javax.swing.JTextField();
        ItemType1 = new javax.swing.JComboBox<>();
        ItemColour1 = new javax.swing.JComboBox<>();
        ItemWear1 = new javax.swing.JComboBox<>();
        ItemType = new javax.swing.JTextField();
        ItemColour = new javax.swing.JTextField();
        ItemWear = new javax.swing.JTextField();
        ItemPhoto = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        ItemId = new javax.swing.JTextField();

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
        setUndecorated(true);

        PopUp.setBackground(new java.awt.Color(213, 232, 212));
        PopUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Item Description");
        PopUp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel11.setText("Item Type");
        PopUp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel14.setText("Item Brand");
        PopUp.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel15.setText("Item Colour");
        PopUp.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PopUp.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 120, 40));

        jLabel17.setText("Item Buy Date");
        PopUp.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        jLabel18.setText("Item Wear");
        PopUp.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, 30));

        jButton2.setText("DONE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PopUp.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 100, 40));

        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PopUp.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 110, 40));

        Continuation.setText("Are you done or you wish to continue?");
        PopUp.add(Continuation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel20.setText("Item Photo ");
        PopUp.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        Item.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Item.setText("Clothes");
        PopUp.add(Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 200, 20));

        ItemBuyDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuyDateActionPerformed(evt);
            }
        });
        PopUp.add(ItemBuyDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 170, 30));

        ItemBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBrandActionPerformed(evt);
            }
        });
        PopUp.add(ItemBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 170, 30));

        ItemDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescriptionActionPerformed(evt);
            }
        });
        PopUp.add(ItemDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 170, 30));

        ItemType1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ItemType1FocusGained(evt);
            }
        });
        ItemType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemType1ActionPerformed(evt);
            }
        });
        PopUp.add(ItemType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, 30));

        ItemColour1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ItemColour1FocusGained(evt);
            }
        });
        ItemColour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemColour1ActionPerformed(evt);
            }
        });
        ItemColour1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ItemColour1KeyPressed(evt);
            }
        });
        PopUp.add(ItemColour1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 170, 30));

        ItemWear1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ItemWear1FocusGained(evt);
            }
        });
        ItemWear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemWear1ActionPerformed(evt);
            }
        });
        PopUp.add(ItemWear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, 30));

        ItemType.setVisible(false);
        ItemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTypeActionPerformed(evt);
            }
        });
        PopUp.add(ItemType, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 30, 10));

        ItemColour.setVisible(false);
        PopUp.add(ItemColour, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 20, 20));

        ItemWear.setVisible(false);
        ItemWear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemWearActionPerformed(evt);
            }
        });
        PopUp.add(ItemWear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 40, 20));

        ItemPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPhotoActionPerformed(evt);
            }
        });
        PopUp.add(ItemPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 170, -1));

        jButton4.setText("Choose");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PopUp.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        ItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemIdActionPerformed(evt);
            }
        });
        ItemId.setVisible(false);
        PopUp.add(ItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 20, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PopUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //storing the information and continuing to create the information
    // for only create has this option
        if(ItemDescription.getText().isEmpty() ||   ItemBuyDate.getText().isEmpty()
                ||  ItemBrand.getText().isEmpty() ){
             JOptionPane.showMessageDialog(rootPane, "Please fill up all the information");// displying error if the there is something left to fill
        }else{
              
        try {
                Statement state = Source.mycon().createStatement();
               state.executeUpdate("insert into item_detail (ItemDes,`ItemType`,`ItemBrand`,`Itemcolour`,`ItemWear`,`ItemBuyDate`,ItemPhoto) values ('" +
        ItemDescription.getText() + "','" + ItemType.getText() +"','" + ItemBrand.getText() + "','" + ItemColour.getText()+"','" +
        ItemWear.getText() + "','" + ItemBuyDate.getText() + "','" + ItemPhoto.getText()+"')");
                 method.delete(ItemDescription,ItemBrand,ItemBuyDate,ItemPhoto);
                JOptionPane.showMessageDialog(rootPane, "Successfully saved");//Storing the detials that is provided by the user tothe datavase
                  
            } catch (HeadlessException | SQLException x) {
                System.out.println(x);
            }  
       }
          
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Storing the information created, updated or deleting the information.
        if(ItemDescription.getText().isEmpty() ||   ItemBuyDate.getText().isEmpty()
                ||  ItemBrand.getText().isEmpty() ){
             JOptionPane.showMessageDialog(rootPane, "Please fill up all the information");// displying error if the there is something left to fill
        }else{
            if(Item.getText().equals("Add Clothing Items"))  
            {    
        try {
                Statement state = Source.mycon().createStatement();
               state.executeUpdate("insert into item_detail (ItemDes,`ItemType`,`ItemBrand`,`Itemcolour`,`ItemWear`,`ItemBuyDate`,ItemPhoto) values ('" +
        ItemDescription.getText() + "','" + ItemType.getText() +"','" + ItemBrand.getText() + "','" + ItemColour.getText()+"','" +
        ItemWear.getText() + "','" + ItemBuyDate.getText() + "','" + ItemPhoto.getText()+"')");
                JOptionPane.showMessageDialog(rootPane, "Successfully saved");// Adding the details that is provided by the user to the database
                  method.delete( ItemId,ItemDescription,ItemBrand,ItemBuyDate,ItemPhoto);
                dispose();
            } catch (Exception x) {
                System.out.println(x.getMessage());
            }  
       }  else if(Item.getText().equals("Update Clothing Items")){
                try {
                Statement state = Source.mycon().createStatement();
               state.executeUpdate("update item_detail set  ItemDes = '" + ItemDescription.getText() + "' , ItemType = '" + ItemType.getText()+
               "', ItemBrand = '" +ItemBrand.getText() + "', Itemcolour = '" + ItemColour.getText()+ "', ItemWear = '" +ItemWear.getText() 
                + "',ItemBuyDate = '" +  ItemBuyDate.getText()+  "', ItemPhoto = '" +ItemPhoto.getText() + "' where ItemId = '" + ItemId.getText()+  "'");
                JOptionPane.showMessageDialog(rootPane, "Successfully update!!");// Updating the details that user selected and provided to the database
                method.delete( ItemId,ItemDescription,ItemBrand,ItemBuyDate,ItemPhoto);
                dispose();
            } catch (Exception x) {
                System.out.println(x.getMessage());
            }         
       }else if(Item.getText().equals("Delete Clothing Items")){
                try {
                Statement state = Source.mycon().createStatement();
                state.executeUpdate("delete from item_detail where ItemId = '" + ItemId.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Successfully Deleted!!");
                method.delete( ItemId,ItemDescription,ItemBrand,ItemBuyDate,ItemPhoto);
                dispose();// Deleting the details that the user selected from the database.
            } catch (Exception x) {
                System.out.println(x.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      //Canceling option
       method.delete( ItemId,ItemDescription,ItemBrand,ItemBuyDate,ItemPhoto);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ItemBuyDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuyDateActionPerformed

    }//GEN-LAST:event_ItemBuyDateActionPerformed

    private void ItemBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBrandActionPerformed

    }//GEN-LAST:event_ItemBrandActionPerformed

    private void ItemDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescriptionActionPerformed

    }//GEN-LAST:event_ItemDescriptionActionPerformed
  
    private void ItemType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemType1ActionPerformed
//copying the code of the type to the text field to store the information
        String query = "SELECT cloth_code FROM item_type where cloth_type='"+ItemType1.getSelectedItem()+"'";
        
       try{ Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
            while(rs.next())
            {   
         String Type1=rs.getString("cloth_code");
         ItemType.setText(Type1);//setting the code of the type to a different text field
            }
       }
       
        catch(Exception e)
            {
        System.out.println("Error"+e);
    }
    }//GEN-LAST:event_ItemType1ActionPerformed

    private void ItemType1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ItemType1FocusGained
    // Fetching the data from the database to display on Combo box of item type 
    String query = "SELECT cloth_type FROM item_type";
        try {
            Statement state;
            state = Source.mycon().createStatement();// connection to the database
            ResultSet rs = state.executeQuery(query);
        while(rs.next()){
        ItemType1.addItem(rs.getString(1));}}
    

    catch(Exception e)
    {
        System.out.println("Error"+e);
    }
       
    }//GEN-LAST:event_ItemType1FocusGained

    private void ItemColour1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ItemColour1FocusGained
      // Fetching the data from the database to display on Combo box of colour
        String query = "SELECT colour FROM colour";
        try {
            Statement state;
            state = Source.mycon().createStatement();// connection to the database
            ResultSet rs = state.executeQuery(query);
        while(rs.next()){                            
        ItemColour1.addItem(rs.getString(1));}}// adding the colour to the combo box
    catch(Exception e)
    {
        System.out.println("Error"+e);
    }
    }//GEN-LAST:event_ItemColour1FocusGained

    private void ItemWear1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ItemWear1FocusGained
     // Fetching the data from the database to display on Combo box of item wear 
        String query = "SELECT Owear FROM outfit_type";
        try {
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
        while(rs.next()){                            
        ItemWear1.addItem(rs.getString(1));}}
    

    catch(Exception e)
    {
        System.out.println("Error"+e);
    }
       
    }//GEN-LAST:event_ItemWear1FocusGained

    private void ItemColour1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemColour1KeyPressed
       
    }//GEN-LAST:event_ItemColour1KeyPressed

    private void ItemColour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemColour1ActionPerformed
//copying the code of the typeolour to the text field to store the information
        String query = "SELECT colour_code FROM colour where colour='"+ItemColour1.getSelectedItem()+"'";
        
       try{ Statement state;
            state = Source.mycon().createStatement();//database connection
            ResultSet rs = state.executeQuery(query);
            while(rs.next())
            { 
         String Type2=rs.getString("colour_code");
         ItemColour.setText(Type2);//setting the code of the colour to a different text field
            }
       }
       
        catch(Exception e)
            {
        System.out.println("Error"+e);
    }
    }//GEN-LAST:event_ItemColour1ActionPerformed

    private void ItemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTypeActionPerformed
       
    }//GEN-LAST:event_ItemTypeActionPerformed

    private void ItemWearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemWearActionPerformed
        
    }//GEN-LAST:event_ItemWearActionPerformed

    private void ItemWear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemWear1ActionPerformed
    //copying the code of the wear to the text field to store the information
        String query = "SELECT Oid FROM outfit_type where Owear='"+ItemWear1.getSelectedItem()+"'";
        
       try{ Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
            while(rs.next())
            {
         String Type3=String.valueOf(rs.getInt("Oid"));
         ItemWear.setText(Type3);//setting the code of theitem eear to a different text field
            }
       }

        catch(Exception e)
            {
        System.out.println("Error"+e);
    }
    }//GEN-LAST:event_ItemWear1ActionPerformed

    private void ItemPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPhotoActionPerformed

    }//GEN-LAST:event_ItemPhotoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//To choose the name of the image
        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");// the file filter to allow only image files
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(null);

       File selectedFile=fileChooser.getSelectedFile();

                if (selectedFile != null) {
                    ItemPhoto.setText(selectedFile.getName());
                } else {
                    System.out.println("File selection canceled by user.");
                }
           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemIdActionPerformed

    }//GEN-LAST:event_ItemIdActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUp().setVisible(true);
            }
        });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel Continuation;
    public javax.swing.JLabel Item;
    protected javax.swing.JTextField ItemBrand;
    protected javax.swing.JTextField ItemBuyDate;
    public javax.swing.JTextField ItemColour;
    protected javax.swing.JComboBox<String> ItemColour1;
    protected javax.swing.JTextField ItemDescription;
    public javax.swing.JTextField ItemId;
    protected javax.swing.JTextField ItemPhoto;
    private javax.swing.JTextField ItemType;
    protected javax.swing.JComboBox<String> ItemType1;
    protected javax.swing.JTextField ItemWear;
    protected javax.swing.JComboBox<String> ItemWear1;
    public javax.swing.JPanel PopUp;
    protected javax.swing.JButton jButton1;
    protected javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
