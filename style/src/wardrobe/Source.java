package wardrobe;


import java.awt.Component;
import java.beans.XMLDecoder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
//C:\Users\KULDEEP\AppData\Local\NetBeans\Cache\8.2
public class Source {

    public int confirm(Component e, String message) {
        int x = 0;
        x = JOptionPane.showConfirmDialog(e, message, "Title", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        return x;
    }

    public void close() {
        Runtime.getRuntime().exit(0);
    }

    public void Checkbox(JCheckBox box, JPasswordField password) {

        if (box.isSelected()) {
            password.setEchoChar((char) 0);

        } else {
            password.setEchoChar('*');
        }

    }

    public void uppercase(JTextField text) {
        switch (text.getText()) {
            case "":
                text.setText("");
                break;
            default:
                String name = text.getText();
                String result = name.substring(0, 1).toUpperCase() + name.substring(1);
                text.setText(result);
        }

    }

    public void uppercase1(JPasswordField password) {
        switch (password.getText()) {
            case "":
                password.setText("");
                break;
            default:
                String name = password.getText();
                String result = name.substring(0, 1).toUpperCase() + name.substring(1);
                password.setText(result);
        }

    }

    public void change(JPanel start, JPanel start1, JPanel start2, JPanel start3, JPanel start4, JPanel start6, JPanel start7, JPanel start8) {
        start.setVisible(true);
        start1.setVisible(false);
        start2.setVisible(false);
        start3.setVisible(false);
        start4.setVisible(false);
        start6.setVisible(false);
        start7.setVisible(false);
        start8.setVisible(false);

    }
JLabel fromString(String str) {
    XMLDecoder d = new XMLDecoder(new ByteArrayInputStream(str.getBytes()));
    JLabel label = (JLabel) d.readObject();
    d.close();
    return label;}
    public static Connection mycon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wardrobe", "root", "root@123"+ "");
            return con;

        } catch (ClassNotFoundException | SQLException x) {
            System.out.println(x);
            return null;
        }}

    public InputStream getBlobAsBinaryStream(ResultSet rs, int columnIndex) throws SQLException {
  Blob blob = rs.getBlob(columnIndex);
  if (blob == null) {
    return null;
  }
  return blob.getBinaryStream();
}

   
    
public void delete(JTextField del1, JTextField del2, JTextField del3, JTextField del4 ,JTextField del5
        ) {
        del1.setText("");
        del2.setText("");
        del3.setText("");
        del4.setText("");
        del5.setText("");

      
   
    }
public void delete(JTextField del1, JTextField del2, JTextField del3, JTextField del4 ,JTextField del5,JTextField del6,JTextField del7
        ) {
        del1.setText("");
        del2.setText("");
        del3.setText("");
        del4.setText("");
        del5.setText("");
        del6.setText("");
        del7.setText("");
        
      
   
    }
public void delete(JTextField del1, JTextField del2, JTextField del3, JTextField del4) {
        del1.setText("");
        del2.setText("");
        del3.setText("");
        del4.setText("");
        }
public void delete(JTextField del1, JTextField del2) {
        del1.setText("");
        del2.setText("");
        
        }

}



