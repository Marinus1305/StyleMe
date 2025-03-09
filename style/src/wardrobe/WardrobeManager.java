package wardrobe;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class WardrobeManager extends javax.swing.JFrame {

    private PopUp pop= new PopUp();
    
    public WardrobeManager() {
        initComponents();
        
        
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        OverallPanel = new javax.swing.JPanel();
        CombinedPanel = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Continue = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        SuggOrMng = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        SuggChoose = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        ItemColour2 = new javax.swing.JComboBox<>();
        jButton29 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        MangChoose = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        ItemColour1 = new javax.swing.JComboBox<>();
        jButton25 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        Combinationchoosing1 = new javax.swing.JPanel();
        ItemColour3 = new javax.swing.JComboBox<>();
        jButton30 = new javax.swing.JButton();
        TypeOrWear = new javax.swing.JLabel();
        Code = new javax.swing.JLabel();
        BUTTON = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        TablePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        SuggestPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        Skip = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        SelectPanel = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        Photo = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Description = new javax.swing.JTextField();
        Type = new javax.swing.JTextField();
        Brand = new javax.swing.JTextField();
        Wear = new javax.swing.JTextField();
        BuyDate = new javax.swing.JTextField();
        Colour = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        CombinationChoosing2 = new javax.swing.JPanel();
        ItemColour4 = new javax.swing.JComboBox<>();
        jButton31 = new javax.swing.JButton();
        TypeOrWear1 = new javax.swing.JLabel();
        Code1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Bottom = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        OverallPanel.setLayout(new java.awt.BorderLayout());

        CombinedPanel.setMinimumSize(new java.awt.Dimension(1040, 540));
        CombinedPanel.setPreferredSize(new java.awt.Dimension(1010, 699));
        CombinedPanel.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(250, 215, 172));
        Home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        Home.setPreferredSize(new java.awt.Dimension(32767, 32767));
        Home.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Vivaldi", 3, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome,");
        Home.add(jLabel7);
        jLabel7.setBounds(310, 150, 149, 33);

        jLabel8.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Manage your Wardrobe");
        Home.add(jLabel8);
        jLabel8.setBounds(387, 215, 394, 101);

        Continue.setBackground(new java.awt.Color(0, 51, 102));
        Continue.setFont(new java.awt.Font("SimSun", 0, 25)); // NOI18N
        Continue.setForeground(new java.awt.Color(255, 255, 255));
        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        Home.add(Continue);
        Continue.setBounds(300, 330, 193, 39);

        Home.add(jLabel51);
        jLabel51.setBounds(90, 50, 148, 133);

        jLabel131.setFont(new java.awt.Font("Vivaldi", 1, 30)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("Kamal");
        Home.add(jLabel131);
        jLabel131.setBounds(440, 150, 106, 33);

        jButton21.setBackground(new java.awt.Color(0, 51, 102));
        jButton21.setFont(new java.awt.Font("SimSun", 0, 25)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Exit");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        Home.add(jButton21);
        jButton21.setBounds(570, 330, 193, 39);

        jLabel23.setForeground(new java.awt.Color(51, 0, 51));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/1.jpg"))); // NOI18N
        jLabel23.setText("jLabel23");
        jLabel23.setPreferredSize(new java.awt.Dimension(1986, 780));
        Home.add(jLabel23);
        jLabel23.setBounds(0, -20, 1986, 1120);

        CombinedPanel.add(Home, "card5");

        SuggOrMng.setBackground(new java.awt.Color(250, 215, 172));
        SuggOrMng.setLayout(null);

        jButton5.setBackground(new java.awt.Color(61, 150, 180));
        jButton5.setText("Suggest the outfit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        SuggOrMng.add(jButton5);
        jButton5.setBounds(418, 23, 254, 112);

        jButton6.setBackground(new java.awt.Color(61, 150, 180));
        jButton6.setText("Manage the outfit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        SuggOrMng.add(jButton6);
        jButton6.setBounds(418, 173, 254, 107);

        jButton15.setBackground(new java.awt.Color(0, 51, 102));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Back");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        SuggOrMng.add(jButton15);
        jButton15.setBounds(500, 440, 59, 25);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/2.jpg"))); // NOI18N
        jLabel24.setDoubleBuffered(true);
        SuggOrMng.add(jLabel24);
        jLabel24.setBounds(0, -60, 1986, 1180);

        CombinedPanel.add(SuggOrMng, "card4");

        SuggChoose.setBackground(new java.awt.Color(250, 215, 172));
        SuggChoose.setLayout(null);

        jButton12.setBackground(new java.awt.Color(61, 150, 180));
        jButton12.setText("Party wear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        SuggChoose.add(jButton12);
        jButton12.setBounds(110, 320, 219, 126);

        jButton13.setBackground(new java.awt.Color(61, 150, 180));
        jButton13.setText("Formal Wear");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        SuggChoose.add(jButton13);
        jButton13.setBounds(110, 20, 219, 125);

        jButton14.setBackground(new java.awt.Color(61, 150, 180));
        jButton14.setText("Casual wear");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        SuggChoose.add(jButton14);
        jButton14.setBounds(110, 170, 219, 126);

        jButton16.setBackground(new java.awt.Color(0, 51, 102));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("back");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        SuggChoose.add(jButton16);
        jButton16.setBounds(450, 489, 59, 25);

        ItemColour2.setBackground(new java.awt.Color(0, 51, 102));
        ItemColour2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ItemColour2FocusGained(evt);
            }
        });
        ItemColour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemColour2ActionPerformed(evt);
            }
        });
        ItemColour2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ItemColour2KeyPressed(evt);
            }
        });
        SuggChoose.add(ItemColour2);
        ItemColour2.setBounds(645, 222, 170, 22);

        jButton29.setBackground(new java.awt.Color(0, 51, 102));
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("colour");
        jButton29.setToolTipText("");
        jButton29.setActionCommand("");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        SuggChoose.add(jButton29);
        jButton29.setBounds(697, 267, 67, 25);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/3.jpg"))); // NOI18N
        jLabel25.setText("jLabel25");
        SuggChoose.add(jLabel25);
        jLabel25.setBounds(-10, -50, 1986, 1170);

        CombinedPanel.add(SuggChoose, "card6");

        MangChoose.setBackground(new java.awt.Color(250, 215, 172));
        MangChoose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MangChooseKeyReleased(evt);
            }
        });
        MangChoose.setLayout(null);

        jButton8.setBackground(new java.awt.Color(61, 150, 180));
        jButton8.setText("Casual");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        MangChoose.add(jButton8);
        jButton8.setBounds(40, 320, 219, 126);

        jButton9.setBackground(new java.awt.Color(61, 150, 180));
        jButton9.setText("Formal Wear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        MangChoose.add(jButton9);
        jButton9.setBounds(40, 17, 219, 125);

        jButton10.setBackground(new java.awt.Color(61, 150, 180));
        jButton10.setText("Party");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        MangChoose.add(jButton10);
        jButton10.setBounds(40, 160, 219, 126);

        jButton18.setBackground(new java.awt.Color(0, 51, 102));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("back");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        MangChoose.add(jButton18);
        jButton18.setBounds(471, 456, 59, 25);

        jButton22.setBackground(new java.awt.Color(61, 150, 180));
        jButton22.setText("Bottom");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        MangChoose.add(jButton22);
        jButton22.setBounds(341, 161, 219, 125);

        jButton23.setBackground(new java.awt.Color(61, 150, 180));
        jButton23.setText("Foot Wear");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        MangChoose.add(jButton23);
        jButton23.setBounds(341, 321, 219, 125);

        jButton24.setBackground(new java.awt.Color(61, 150, 180));
        jButton24.setText("Top");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        MangChoose.add(jButton24);
        jButton24.setBounds(341, 17, 219, 125);

        ItemColour1.setBackground(new java.awt.Color(0, 51, 102));
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
        MangChoose.add(ItemColour1);
        ItemColour1.setBounds(660, 170, 170, 22);

        jButton25.setBackground(new java.awt.Color(0, 51, 102));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("colour");
        jButton25.setToolTipText("");
        jButton25.setActionCommand("");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        MangChoose.add(jButton25);
        jButton25.setBounds(716, 284, 67, 25);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/3.jpg"))); // NOI18N
        jLabel26.setText("jLabel25");
        MangChoose.add(jLabel26);
        jLabel26.setBounds(-10, -40, 1986, 1160);

        CombinedPanel.add(MangChoose, "card2");

        Combinationchoosing1.setBackground(new java.awt.Color(250, 215, 172));
        Combinationchoosing1.setLayout(null);

        ItemColour3.setBackground(new java.awt.Color(0, 51, 102));
        ItemColour3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ItemColour3FocusGained(evt);
            }
        });
        ItemColour3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemColour3ActionPerformed(evt);
            }
        });
        ItemColour3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ItemColour3KeyPressed(evt);
            }
        });
        Combinationchoosing1.add(ItemColour3);
        ItemColour3.setBounds(460, 220, 170, 22);

        jButton30.setBackground(new java.awt.Color(0, 51, 102));
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("colour");
        jButton30.setToolTipText("");
        jButton30.setActionCommand("");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        Combinationchoosing1.add(jButton30);
        jButton30.setBounds(580, 300, 120, 30);

        TypeOrWear.setVisible(false);
        TypeOrWear.setText("TypeOrWear");
        Combinationchoosing1.add(TypeOrWear);
        TypeOrWear.setBounds(454, 17, 73, 16);

        Code.setText("Code");
        Code.setVisible(false);
        Combinationchoosing1.add(Code);
        Code.setBounds(338, 93, 29, 16);

        BUTTON.setBackground(new java.awt.Color(0, 51, 102));
        BUTTON.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON.setText("CONTINUE");
        BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTONActionPerformed(evt);
            }
        });
        Combinationchoosing1.add(BUTTON);
        BUTTON.setBounds(380, 300, 93, 25);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/3.jpg"))); // NOI18N
        jLabel28.setText("jLabel28");
        Combinationchoosing1.add(jLabel28);
        jLabel28.setBounds(0, -45, 1986, 1160);

        CombinedPanel.add(Combinationchoosing1, "card9");

        TablePanel.setBackground(new java.awt.Color(250, 215, 172));
        TablePanel.setMinimumSize(new java.awt.Dimension(0, 0));
        TablePanel.setPreferredSize(new java.awt.Dimension(1400, 749));
        TablePanel.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_20px_1.png"))); // NOI18N
        TablePanel.add(jLabel4);
        jLabel4.setBounds(360, 20, 20, 20);

        searchBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });
        TablePanel.add(searchBox);
        searchBox.setBounds(430, 20, 158, 18);

        Table.setAutoCreateRowSorter(true);
        Table.setBackground(new java.awt.Color(37, 52, 57));
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Des", "Item Type", "Item Brand", "Item colour", "Item Wear", "Item Buy Date", "Item Photo"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        TablePanel.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 1020, 390);

        Update.setBackground(new java.awt.Color(0, 51, 102));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        TablePanel.add(Update);
        Update.setBounds(340, 480, 79, 25);

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        TablePanel.add(jButton1);
        jButton1.setBounds(200, 480, 79, 25);

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REFRESH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        TablePanel.add(jButton4);
        jButton4.setBounds(650, 480, 85, 25);

        delete.setBackground(new java.awt.Color(0, 51, 102));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        TablePanel.add(delete);
        delete.setBounds(500, 480, 75, 30);

        jButton17.setBackground(new java.awt.Color(0, 51, 102));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Back");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        TablePanel.add(jButton17);
        jButton17.setBounds(440, 530, 59, 25);

        jLabel27.setForeground(new java.awt.Color(51, 0, 51));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/1.jpg"))); // NOI18N
        jLabel27.setText("jLabel23");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablePanel.add(jLabel27);
        jLabel27.setBounds(0, -60, 1986, 1180);

        CombinedPanel.add(TablePanel, "card3");

        SuggestPanel.setBackground(new java.awt.Color(250, 215, 172));
        SuggestPanel.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("The suggested outfits are here");
        SuggestPanel.add(jLabel6);
        jLabel6.setBounds(154, 96, 290, 40);
        SuggestPanel.add(jLabel9);
        jLabel9.setBounds(400, 160, 162, 153);
        SuggestPanel.add(jLabel10);
        jLabel10.setBounds(100, 160, 162, 153);
        SuggestPanel.add(jLabel11);
        jLabel11.setBounds(700, 160, 162, 153);

        jButton19.setBackground(new java.awt.Color(0, 51, 102));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Back");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        SuggestPanel.add(jButton19);
        jButton19.setBounds(731, 358, 59, 25);

        Skip.setBackground(new java.awt.Color(0, 51, 102));
        Skip.setForeground(new java.awt.Color(255, 255, 255));
        Skip.setText("Skip");
        Skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkipActionPerformed(evt);
            }
        });
        SuggestPanel.add(Skip);
        Skip.setBounds(232, 358, 57, 25);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/4.jpg"))); // NOI18N
        jLabel29.setText("jLabel29");
        SuggestPanel.add(jLabel29);
        jLabel29.setBounds(-3, -89, 1986, 1250);

        CombinedPanel.add(SuggestPanel, "card6");

        SelectPanel.setBackground(new java.awt.Color(37, 52, 57));

        jButton20.setBackground(new java.awt.Color(0, 51, 102));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Back");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(37, 52, 57));

        jScrollPane2.setBackground(new java.awt.Color(37, 52, 57));

        jList1.setBackground(new java.awt.Color(37, 52, 57));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(37, 52, 57));

        Photo.setForeground(new java.awt.Color(255, 255, 255));
        Photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/blank.jpeg"))); // NOI18N

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Item Id");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Item Description");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Item Type");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Item Brand");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Item Colour");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Item Wear");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Item Buy Date");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Item Photo");

        jLabel30.setText("jLabel30");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(133, 133, 133)
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(111, 111, 111)
                        .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel22)
                        .addGap(440, 440, 440)
                        .addComponent(jLabel30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Brand, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Colour, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Wear, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(201, 201, 201)
                        .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(BuyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(28, 28, 28)
                        .addComponent(Colour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(Wear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21))
                    .addComponent(BuyDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jSplitPane1.setRightComponent(jPanel1);

        javax.swing.GroupLayout SelectPanelLayout = new javax.swing.GroupLayout(SelectPanel);
        SelectPanel.setLayout(SelectPanelLayout);
        SelectPanelLayout.setHorizontalGroup(
            SelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectPanelLayout.createSequentialGroup()
                .addGroup(SelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SelectPanelLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jButton20))
                    .addGroup(SelectPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(687, 687, 687))
        );
        SelectPanelLayout.setVerticalGroup(
            SelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20))
        );

        CombinedPanel.add(SelectPanel, "card8");

        CombinationChoosing2.setBackground(new java.awt.Color(250, 215, 172));
        CombinationChoosing2.setLayout(null);

        ItemColour4.setBackground(new java.awt.Color(0, 51, 102));
        ItemColour4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ItemColour4FocusGained(evt);
            }
        });
        ItemColour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemColour4ActionPerformed(evt);
            }
        });
        ItemColour4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ItemColour4KeyPressed(evt);
            }
        });
        CombinationChoosing2.add(ItemColour4);
        ItemColour4.setBounds(379, 231, 170, 22);

        jButton31.setBackground(new java.awt.Color(0, 51, 102));
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("colour");
        jButton31.setToolTipText("");
        jButton31.setActionCommand("");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        CombinationChoosing2.add(jButton31);
        jButton31.setBounds(506, 302, 67, 25);

        TypeOrWear1.setVisible(false);
        TypeOrWear1.setText("TypeOrWear");
        CombinationChoosing2.add(TypeOrWear1);
        TypeOrWear1.setBounds(415, 50, 73, 16);

        Code1.setVisible(false);
        Code1.setText("Code");
        CombinationChoosing2.add(Code1);
        Code1.setBounds(179, 172, 29, 16);

        jButton11.setBackground(new java.awt.Color(0, 51, 102));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Continue");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        CombinationChoosing2.add(jButton11);
        jButton11.setBounds(150, 302, 83, 25);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/1.jpg"))); // NOI18N
        jLabel31.setText("jLabel31");
        CombinationChoosing2.add(jLabel31);
        jLabel31.setBounds(-1, -27, 1986, 1080);

        CombinedPanel.add(CombinationChoosing2, "card10");

        OverallPanel.add(CombinedPanel, java.awt.BorderLayout.CENTER);

        MenuBar.setBackground(new java.awt.Color(0, 51, 51));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        MenuBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("List");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        MenuBar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });
        MenuBar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Vivaldi", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Wardrobe");
        MenuBar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/Screenshot 2024-01-07 155407.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel5KeyPressed(evt);
            }
        });
        MenuBar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 70, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/Screenshot 2024-01-07 160155.png"))); // NOI18N
        jLabel14.setMaximumSize(new java.awt.Dimension(66, 60));
        jLabel14.setMinimumSize(new java.awt.Dimension(66, 60));
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 60));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jLabel14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel14KeyPressed(evt);
            }
        });
        MenuBar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 3, 60, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wardrobe/Screenshot 2024-01-07 160206.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        MenuBar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 7, -1, -1));

        OverallPanel.add(MenuBar, java.awt.BorderLayout.PAGE_START);

        Bottom.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout BottomLayout = new javax.swing.GroupLayout(Bottom);
        Bottom.setLayout(BottomLayout);
        BottomLayout.setHorizontalGroup(
            BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BottomLayout.setVerticalGroup(
            BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        OverallPanel.add(Bottom, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(OverallPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 // the popup to type in the information
        pop.setVisible(true);
        pop.Item.setText("Add Clothing Items");
      pop.jButton1.setVisible(true);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
//copying the data to pop up
if(searchBox.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Click one form the table");
        }else{
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            int r = Table.getSelectedRow();
            String[] Array = {table.getValueAt(r, 0).toString(),//storing the data of the table into an array
                table.getValueAt(r, 1).toString(),
                table.getValueAt(r, 2).toString(),
                table.getValueAt(r, 3).toString(),
                table.getValueAt(r, 4).toString(),
                table.getValueAt(r, 5).toString(), 
                table.getValueAt(r, 6).toString(),
                table.getValueAt(r, 7).toString()
                };
             //displaying the data in the text fields
            pop.ItemId.setText(Array[0]);
            pop.ItemDescription.setText(Array[1]);
            pop.ItemType1.setSelectedItem(Array[2]);
            pop.ItemBrand.setText(Array[3]);
            pop.ItemColour1.setSelectedItem(Array[4]);
            pop.ItemWear1.setSelectedItem(Array[5]);
            pop.ItemBuyDate.setText(Array[6]);
            pop.ItemPhoto.setText(Array[7]);

            pop.setVisible(true);
             pop.Continuation.setVisible(false);// setting the visibility of the qusetion of continuity for create option
       pop.jButton1.setVisible(false);
            pop.Item.setText("Update Clothing Items");}
    }//GEN-LAST:event_UpdateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
 //copying the data to pop up 
        if(searchBox.getText().equals("")){

            JOptionPane.showMessageDialog(null, "Click one form the table");

        }else{
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            int r = Table.getSelectedRow();

              String[] Array = {table.getValueAt(r, 0).toString(),//storing the data of the table into an array
                table.getValueAt(r, 1).toString(),
                table.getValueAt(r, 2).toString(),
                table.getValueAt(r, 3).toString(),
                table.getValueAt(r, 4).toString(),
                table.getValueAt(r, 5).toString(), 
                table.getValueAt(r, 6).toString(),
                table.getValueAt(r, 7).toString()

                };
            
             //displaying the data in the text fields
            pop.ItemId.setText(Array[0]);
            pop.ItemDescription.setText(Array[1]);
            pop.ItemType1.setSelectedItem(Array[2]);
            pop.ItemBrand.setText(Array[3]);
            pop.ItemColour1.setSelectedItem(Array[4]);
            pop.ItemWear1.setSelectedItem(Array[5]);
            pop.ItemBuyDate.setText(Array[6]);
            pop.ItemPhoto.setText(Array[7]);
            
            pop.setVisible(true);
            pop.Item.setText("Delete Clothing Items");
            pop.Continuation.setVisible(false);
       pop.jButton1.setVisible(false);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  // Refreshing the table(displaying the newest data of clothing)
        searchBox.setText("");
        try {
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
            Statement state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM `item_detail`INNER JOIN `colour`,`item_type`,`outfit_type`"
                    + "WHERE cloth_code=ItemType && colour_code=Itemcolour && Oid=ItemWear");//jining the tables with inner join to display the information not just codes of it
            while (rs.next()) {

                  Object o[] = { rs.getString("ItemId"),rs.getString("ItemDes"), rs.getString("cloth_type"),
                    rs.getString("ItemBrand"), rs.getString("colour"), rs.getString("OWear"), 
                    rs.getString("ItemBuyDate"),rs.getString("ItemPhoto")};// displaying the information by fetching the detaols from the database
                table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
 int t = Table.getSelectedRow();
        String ItemId = Table.getValueAt(t, 0).toString();
        searchBox.setText(ItemId);
    }//GEN-LAST:event_TableMouseClicked

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

    }//GEN-LAST:event_formKeyReleased

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed

    }//GEN-LAST:event_searchBoxActionPerformed

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
// Displaying the select panel and showing the data of the selected ID from the leftside of the splitpane   
        SelectPanel.setVisible(true);
         SuggChoose.setVisible(false);
         MangChoose.setVisible(false);
         TablePanel.setVisible(false);
         CombinationChoosing2.setVisible(false);
         Combinationchoosing1.setVisible(false);
         SuggOrMng.setVisible(false);
         SuggestPanel.setVisible(false);
         Home.setVisible(false);
         String query = "SELECT ItemId FROM item_detail"; // statement to retrieve the data from database
         DefaultListModel model = new DefaultListModel(); //create a new list model
    try{
    Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query); //run your query

    while (rs.next()) //go through each row that your query returns
    {
        String itemCode = rs.getString("ItemId"); //get the element in column "item_code"
        model.addElement(itemCode); //add each item to the model
    }
    jList1.setModel(model);

    rs.close();
   state.close();}
    
   
    catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    jList1.getSelectionModel().addListSelectionListener(e ->{
        String query1= "SELECT * FROM item_detail WHERE ItemId='"+jList1.getSelectedValue()+"'";
        try{
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs1 = state.executeQuery(query1);
            while(rs1.next()){
              Id.setText(String.valueOf(rs1.getInt("ItemId")));//displaying the information of the clothing item in the textfield 
              Description.setText(rs1.getString("ItemDes")); 
              Brand.setText(rs1.getString("ItemBrand"));
              BuyDate.setText(rs1.getString("ItemBuyDate"));
              String itemType=rs1.getString("ItemType");//assigning the value of the clothing item of combobox to the itemtype
              String itemColour=rs1.getString("ItemColour");
              String itemWear=rs1.getString("ItemWear");
              String image2 = rs1.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image2);
            Photo.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image2));
                Image image = img.getImage().getScaledInstance(Photo.getWidth(), Photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);
                        Photo.setIcon(newicon);
              String query2="SELECT colour FROM colour WHERE colour_code='"+itemColour+"'";// retreiving the colour from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs2 = state.executeQuery(query2);
                while(rs2.next()){
                    Colour.setText(rs2.getString("colour"));//displaying the colour information in the clothig item in the textfield
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }   String query3="SELECT cloth_type FROM item_type WHERE cloth_code='"+itemType+"'";// retreiving the type from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
                while(rs3.next()){
                    Type.setText(rs3.getString("cloth_type"));
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);}   
         String query4="SELECT Owear FROM outfit_type WHERE Oid='"+itemWear+"'";// retreiving the wear from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs4 = state.executeQuery(query4);
                while(rs4.next()){
                    Wear.setText(rs4.getString("Owear"));
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }        
            }
}catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
    //Displayong the all the data of the clothing in a table    
        SelectPanel.setVisible(false);
        SuggChoose.setVisible(false);
        MangChoose.setVisible(false);
        TablePanel.setVisible(true);
        SuggOrMng.setVisible(false);
        SuggestPanel.setVisible(false);
        CombinationChoosing2.setVisible(false);
        Home.setVisible(false);
        Combinationchoosing1.setVisible(false);
         searchBox.setText("");
         try {
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
            Statement state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM `item_detail`INNER JOIN `colour`,`item_type`,`outfit_type`"
                    + "WHERE cloth_code=ItemType && colour_code=Itemcolour && Oid=ItemWear");//jining the tables with inner join to display the information not just codes of it
            while (rs.next()) {

                  Object o[] = { rs.getString("ItemId"),rs.getString("ItemDes"), rs.getString("cloth_type"),
                    rs.getString("ItemBrand"), rs.getString("colour"), rs.getString("OWear"), 
                    rs.getString("ItemBuyDate"),rs.getString("ItemPhoto")};// displaying the information by fetching the detaols from the database
                table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
       
        }   
        
    }//GEN-LAST:event_jLabel2KeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
// Displaying the select panel and showing the data of the selected ID from the leftside of the splitpane in the right side of the split oane 
               SelectPanel.setVisible(true);
         SuggChoose.setVisible(false);
         MangChoose.setVisible(false);
         TablePanel.setVisible(false);
         CombinationChoosing2.setVisible(false);
         Combinationchoosing1.setVisible(false);
         SuggOrMng.setVisible(false);
         SuggestPanel.setVisible(false);
         Home.setVisible(false);
         String query = "SELECT ItemId FROM item_detail"; // statement to retrieve the data from database
         DefaultListModel model = new DefaultListModel(); //create a new list model
    try{
    Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query); //run your query

    while (rs.next()) //go through each row that your query returns
    {
        String itemCode = rs.getString("ItemId"); //get the element in column "item_code"
        model.addElement(itemCode); //add each item to the model
    }
    jList1.setModel(model);

    rs.close();
   state.close();}
    
   
    catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    jList1.getSelectionModel().addListSelectionListener(e ->{
        String query1= "SELECT * FROM item_detail WHERE ItemId='"+jList1.getSelectedValue()+"'";
        try{
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs1 = state.executeQuery(query1);
            while(rs1.next()){
              Id.setText(String.valueOf(rs1.getInt("ItemId")));//displaying the information of the clothing item in the textfield 
              Description.setText(rs1.getString("ItemDes")); 
              Brand.setText(rs1.getString("ItemBrand"));
              BuyDate.setText(rs1.getString("ItemBuyDate"));
              String itemType=rs1.getString("ItemType");//assigning the value of the clothing item of combobox to the itemtype
              String itemColour=rs1.getString("ItemColour");
              String itemWear=rs1.getString("ItemWear");
              String image2 = rs1.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image2);
            Photo.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image2));
                Image image = img.getImage().getScaledInstance(Photo.getWidth(), Photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);
                        Photo.setIcon(newicon);
              String query2="SELECT colour FROM colour WHERE colour_code='"+itemColour+"'";// retreiving the colour from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs2 = state.executeQuery(query2);
                while(rs2.next()){
                    Colour.setText(rs2.getString("colour"));//displaying the colour information in the clothig item in the textfield
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }   String query3="SELECT cloth_type FROM item_type WHERE cloth_code='"+itemType+"'";// retreiving the type from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
                while(rs3.next()){
                    Type.setText(rs3.getString("cloth_type"));
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);}   
         String query4="SELECT Owear FROM outfit_type WHERE Oid='"+itemWear+"'";// retreiving the wear from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs4 = state.executeQuery(query4);
                while(rs4.next()){
                    Wear.setText(rs4.getString("Owear"));
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }        
            }
}catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //Displayong the all the data of the clothing in a table    
        SelectPanel.setVisible(false);
        SuggChoose.setVisible(false);
        MangChoose.setVisible(false);
        TablePanel.setVisible(true);
        SuggOrMng.setVisible(false);
        SuggestPanel.setVisible(false);
        CombinationChoosing2.setVisible(false);
        Home.setVisible(false);
        Combinationchoosing1.setVisible(false);
         searchBox.setText("");
       try {
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
            Statement state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM `item_detail`INNER JOIN `colour`,`item_type`,`outfit_type`"
                    + "WHERE cloth_code=ItemType && colour_code=Itemcolour && Oid=ItemWear");//jining the tables with inner join to display the information not just codes of it
            while (rs.next()) {

                  Object o[] = { rs.getString("ItemId"),rs.getString("ItemDes"), rs.getString("cloth_type"),
                    rs.getString("ItemBrand"), rs.getString("colour"), rs.getString("OWear"), 
                    rs.getString("ItemBuyDate"),rs.getString("ItemPhoto")};// displaying the information by fetching the detaols from the database
                table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());}
          

   
           
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
SuggOrMng.setVisible(false);
SuggChoose.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MangChoose.setVisible(true);
        SuggOrMng.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
//Taking to the home panel
        Home.setVisible(true);
SuggChoose.setVisible(false);
 MangChoose.setVisible(false);
        TablePanel.setVisible(false);
        SuggOrMng.setVisible(false);
         SuggestPanel.setVisible(false);
         SelectPanel.setVisible(false);
         CombinationChoosing2.setVisible(false);
         Combinationchoosing1.setVisible(false);
    }//GEN-LAST:event_jLabel3KeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // Taking to the home panel
        Home.setVisible(true);
         SuggChoose.setVisible(false);
         MangChoose.setVisible(false);
         CombinationChoosing2.setVisible(false);
         Combinationchoosing1.setVisible(false);
         TablePanel.setVisible(false);
         SuggOrMng.setVisible(false);
         SuggestPanel.setVisible(false);
         SelectPanel.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void MangChooseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MangChooseKeyReleased

    }//GEN-LAST:event_MangChooseKeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //setting the code and distinguishing between the type and the wear
        MangChoose.setVisible(false);
        Combinationchoosing1.setVisible(true);
        TypeOrWear.setText("Wear");
        Code.setText("3");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //setting the code and distinguishing between the type and the wear
        MangChoose.setVisible(false);
        Combinationchoosing1.setVisible(true);
        TypeOrWear.setText("Wear");
        Code.setText("1");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
              //setting the code and distinguishing between the type and the wear
        MangChoose.setVisible(false);
        Combinationchoosing1.setVisible(true);
        TypeOrWear.setText("Wear");
        Code.setText("2");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      //setting the code and distinguishing between the type and the wear
        CombinationChoosing2.setVisible(true);
        SuggChoose.setVisible(false);
        TypeOrWear1.setText("Wear");
        Code1.setText("2");     
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //setting the code and distinguishing between the type and the wear
        CombinationChoosing2.setVisible(true);
        SuggChoose.setVisible(false);
        TypeOrWear1.setText("Wear");
        Code1.setText("1");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
//setting the code and distinguishing between the type and the wear
       SuggChoose.setVisible(false);
        CombinationChoosing2.setVisible(true);
        TypeOrWear1.setText("Wear");
        Code1.setText("3");       
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    //back option
    Home.setVisible(true);
    SuggOrMng.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
   //sugg option
        SuggOrMng.setVisible(true); 
    SuggChoose.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      //back option
        MangChoose.setVisible(true);
        TablePanel.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
//back option
        SuggOrMng.setVisible(true);
        MangChoose.setVisible(false);
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
 //Back option and setting all the label as empty wardrobe image       
        SuggChoose.setVisible(true);
         SuggestPanel.setVisible(false);

        
               String image1 = ("empty.jpeg");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
          jLabel10.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
            Image image = img.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                      jLabel10.setIcon(newicon);
                      
                      
                      jLabel9.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
               
                Image image3 = img.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon1= new ImageIcon(image3);// adjusting the image size with the label size
                      jLabel9.setIcon(newicon1);
                      
         
                      jLabel11.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
               
                Image image4 = img.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon2= new ImageIcon(image4);// adjusting the image size with the label size
                      jLabel11.setIcon(newicon2);

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
         //back option
        Home.setVisible(true);
         SelectPanel.setVisible(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        //Continue button
        SuggOrMng.setVisible(true);
        Home.setVisible(false);
    }//GEN-LAST:event_ContinueActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
//setting the code and distinguishing between the type and the wear
        MangChoose.setVisible(false);
        Combinationchoosing1.setVisible(true);
        TypeOrWear.setText("Type");
        Code.setText("C2");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
//setting the code and distinguishing between the type and the wear
        MangChoose.setVisible(false);
        Combinationchoosing1.setVisible(true);
        TypeOrWear.setText("Type");
        Code.setText("C3");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
 //setting the code and distinguishing between the type and the wear
        MangChoose.setVisible(false);
        Combinationchoosing1.setVisible(true);
        TypeOrWear.setText("Type");
        Code.setText("C1");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void ItemColour1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ItemColour1FocusGained
      // showing the colour in the combo box
        String query = "SELECT colour FROM colour";
        try {
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
            while(rs.next()){
                ItemColour1.addItem(rs.getString(1));}}

        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }//GEN-LAST:event_ItemColour1FocusGained

    private void ItemColour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemColour1ActionPerformed
       //copying the colour code to variable from the actual colour using database
        String query = "SELECT colour_code FROM colour where colour='"+ItemColour1.getSelectedItem()+"'";

        try{ Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
            while(rs.next())
            {
                String Type2=rs.getString("colour_code");
            }
        }

        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }//GEN-LAST:event_ItemColour1ActionPerformed

    private void ItemColour1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemColour1KeyPressed

    }//GEN-LAST:event_ItemColour1KeyPressed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
 // Choosing the colour option(display all the clothing with chosen colour)
        String query = "SELECT colour_code FROM colour where colour='"+ItemColour1.getSelectedItem()+"'";

        try{ Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
            while(rs.next())
            {
                String Type2=rs.getString("colour_code");
                MangChoose.setVisible(false);
                TablePanel.setVisible(true);
                
        searchBox.setText(String.valueOf(ItemColour1.getSelectedItem()));
try {
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
            
            ResultSet rs1 = state.executeQuery("SELECT * FROM `item_detail` INNER JOIN `colour`,`item_type`,`outfit_type` WHERE colour_code=Itemcolour && cloth_code=ItemType && Oid=ItemWear && Itemcolour = '"+Type2+"'");
//joining the tables with inner join to display the information not just codes of it
            while (rs1.next()) {

                  Object o[] = { rs.getString("ItemId"),rs.getString("ItemDes"), rs.getString("cloth_type"),
                    rs.getString("ItemBrand"), rs.getString("colour"), rs.getString("OWear"), 
                    rs.getString("ItemBuyDate"),rs.getString("ItemPhoto")};// displaying the information by fetching the detaols from the database
                table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        
        }
            }
        }

        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void ItemColour2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ItemColour2FocusGained
// showing the colour in the combo box
String query = "SELECT colour FROM colour";
        try {
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
        while(rs.next()){                            
        ItemColour2.addItem(rs.getString(1));}}
    

    catch(Exception e)
    {
        System.out.println("Error"+e);
    }
    }//GEN-LAST:event_ItemColour2FocusGained

    private void ItemColour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemColour2ActionPerformed

    }//GEN-LAST:event_ItemColour2ActionPerformed

    private void ItemColour2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemColour2KeyPressed

    }//GEN-LAST:event_ItemColour2KeyPressed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
// displaying the suggestion based on chosen colour
int i=0;
Boolean C1=false;
Boolean C2=false;
Boolean C3=false;
        SuggestPanel.setVisible(true);
        SuggChoose.setVisible(false);
        while(i<3){
        
    String query = "SELECT colour_code FROM colour where colour='"+ItemColour2.getSelectedItem()+"'";
        
        try{ Statement state;
            state = Source.mycon().createStatement();
            String itemtype=null;
            
                while(itemtype==null){         
          Random rand = new Random();//generates random number 
                int randomNumber = rand.nextInt(100);
              String query4="SELECT ItemType FROM item_detail where ItemId='"+randomNumber+"'";// assigning id as a random number
               ResultSet rs4 = state.executeQuery(query4);
               
               while(rs4.next()){
              itemtype=rs4.getString("ItemType");// fetching the item type of the random id's number 
                }}
                
            ResultSet rs = state.executeQuery(query);
            while(rs.next())
            {
                String Type2=rs.getString("colour_code");
                
    if(itemtype.equalsIgnoreCase("C2")){
        
 if(C2==false){
    
           C2=true;
            i=i+1;
            String query3="SELECT * FROM `item_detail` WHERE Itemcolour = '"+Type2+"' && ItemType= 'C2'";// selecting the item photo of the respective chosen colour and bottom type

             try {
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel9.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                Image image = img.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                        jLabel9.setIcon(newicon);
           }} 
             catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
}
} else if(itemtype.equalsIgnoreCase("C1")){
             if(C1==false){ 
                 i=i+1;
                   C1=true;
            
            String query3="SELECT * FROM `item_detail` WHERE Itemcolour = '"+Type2+"' && ItemType='C1'";// selecting the item photo of the respective chosen colour and top type

             try {
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel10.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
               
                Image image = img.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                        jLabel10.setIcon(newicon);
           }
            } catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
                    }}
else if(itemtype.equalsIgnoreCase("C3")){ 
    if(C3==false){
        i=i+1;
    C3=true;
           
            
            String query3="SELECT * FROM `item_detail` WHERE Itemcolour = '"+Type2+"'&& ItemType='C3'";// selecting the item photo of the respective chosen colour and foot wear 

             try {
                  
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel11.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
                
                Image image = img.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                        jLabel11.setIcon(newicon);
           }   
} catch(Exception e)
        {
            System.out.println("Error"+e);
        }  }

            }}}
        catch(Exception e)
        {
            System.out.println("Error"+e);}
}
    }//GEN-LAST:event_jButton29ActionPerformed

    private void ItemColour3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ItemColour3FocusGained
 // showing the colour in the combo box
        String query = "SELECT colour FROM colour";
        try {
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
        while(rs.next()){                            
        ItemColour3.addItem(rs.getString(1));}}
    catch(Exception e)
    {
        System.out.println("Error"+e);
    }
    }//GEN-LAST:event_ItemColour3FocusGained

    private void ItemColour3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemColour3ActionPerformed

    }//GEN-LAST:event_ItemColour3ActionPerformed

    private void ItemColour3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemColour3KeyPressed

    }//GEN-LAST:event_ItemColour3KeyPressed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
// Choosing Wear or Type and the colour option(display all the clothing with chosen colour)
String query = "SELECT colour_code FROM colour where colour='"+ItemColour3.getSelectedItem()+"'";
        TablePanel.setVisible(true);
        searchBox.setText(String.valueOf(ItemColour3.getSelectedItem()));
        Combinationchoosing1.setVisible(false);
        try{ Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next())
            {
               //copying the colour code of the chosen colour to variable Type2
                String Type2=rs.getString("colour_code");
    String typeorwear=TypeOrWear.getText();
        if(typeorwear.equalsIgnoreCase("Wear")){
try {
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
            
            ResultSet rs1 = state.executeQuery("SELECT * FROM `item_detail` INNER JOIN `colour`,`item_type`,`outfit_type` WHERE cloth_code=ItemType && colour_code=Itemcolour && Oid=ItemWear && Itemcolour = '"+Type2+"' && ItemWear='"+Code.getText()+"'");
//joining the tables with inner join to display the information not just codes of it
            while (rs1.next()) {

                Object o[] = { rs1.getString("ItemId"),rs1.getString("ItemDes"), rs1.getString("cloth_type"),
                    rs1.getString("ItemBrand"), rs1.getString("colour"), rs1.getString("OWear"), 
                    rs1.getString("ItemBuyDate"),rs1.getString("ItemPhoto")};//displaying the information
                table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }searchBox.setText(String.valueOf(ItemColour3.getSelectedItem())+" And "+Code.getText());
    }else {
                try {
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
            
            ResultSet rs1 = state.executeQuery("SELECT * FROM `item_detail` INNER JOIN `colour`,`item_type`,`outfit_type` WHERE cloth_code=ItemType && colour_code=Itemcolour && Oid=ItemWear && Itemcolour = '"+Type2+"' && ItemType='"+Code.getText()+"'");
//joining the tables with inner join to display the information not just codes of it
            while (rs1.next()) {

                Object o[] = {rs1.getString("ItemId"), rs1.getString("ItemDes"), rs1.getString("cloth_type"),
                    rs1.getString("ItemBrand"), rs1.getString("colour"), rs1.getString("OWear"), 
                    rs1.getString("ItemBuyDate"), rs1.getString("ItemPhoto")};//displaying the information
                                 table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }searchBox.setText(String.valueOf(ItemColour3.getSelectedItem())+" And "+Code.getText());
                }
        }}
      

        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void ItemColour4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ItemColour4FocusGained
// showing the colour in the combo box
        String query = "SELECT colour FROM colour";
        try {
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query);
        while(rs.next()){                            
        ItemColour4.addItem(rs.getString(1));}}
    

    catch(Exception e)
    {
        System.out.println("Error"+e);
    }
    }//GEN-LAST:event_ItemColour4FocusGained

    private void ItemColour4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemColour4ActionPerformed

    }//GEN-LAST:event_ItemColour4ActionPerformed

    private void ItemColour4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemColour4KeyPressed

    }//GEN-LAST:event_ItemColour4KeyPressed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
//displaying the suggestion based on chosen colour And Wear
      int i=0;
Boolean C1=false;
Boolean C2=false;
Boolean C3=false;
while(i<3){
String query = "SELECT colour_code FROM colour where colour='"+ItemColour4.getSelectedItem()+"'";
         try{ Statement state;
            state = Source.mycon().createStatement();
            
     ResultSet rs = state.executeQuery(query);
            while(rs.next())
            {
                 //copying the colour code of the chosen colour to variable Type2
                String Type2=rs.getString("colour_code");
                
        SuggestPanel.setVisible(true);
        CombinationChoosing2.setVisible(false);
       
            String itemtype=null;
            
                while(itemtype==null ){
                
         
          Random rand = new Random();
                int randomNumber = rand.nextInt(100);//generates random number 
              String query4="SELECT ItemType FROM item_detail where ItemId='"+randomNumber+"'&& ItemWear='"+Code1.getText()+"'&& Itemcolour='"+Type2+"'";// checking and looping untill the random id has selected item wear and item colour
               ResultSet rs4 = state.executeQuery(query4);
               while(rs4.next()){
              itemtype=rs4.getString("ItemType");}// fetching the item type of the random id's number 
              
    if(itemtype.equalsIgnoreCase("C2")){
 if(C2==false){
    
           C2=true;
            i=i+1;
            String query3="SELECT * FROM `item_detail` WHERE ItemId='"+randomNumber+"'&& ItemType= 'C2'";// Chosing the item photo based on the information user has chosen
            try { 
                 ImageIcon img11=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+"empty.jpeg");
            jLabel9.setIcon(img11);
                
                Image image12 = img11.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon1= new ImageIcon(image12);// adjusting the image size with the label size
                        jLabel9.setIcon(newicon1);
        
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel9.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
                
                Image image = img.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                        jLabel9.setIcon(newicon);
           }
        } catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
}
} else if(itemtype.equalsIgnoreCase("C1")){
             if(C1==false){ 
                 i=i+1;
                   C1=true;
           
            String query3="SELECT * FROM `item_detail` WHERE ItemId='"+randomNumber+"'&& ItemType='C1'";// Chosing the item photo based on the information user has chosen

             try {
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel10.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                Image image = img.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                        jLabel10.setIcon(newicon);
           }
             } catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
                    }}
else if(itemtype.equalsIgnoreCase("C3")){ 
    if(C3==false){
        i=i+1;
    C3=true;
            String query3="SELECT * FROM `item_detail` WHERE ItemId='"+randomNumber+"'&& ItemType='C3'";// Chosing the item photo based on the information user has chosen

             try {
                  
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel11.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
                
                Image image = img.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                        jLabel11.setIcon(newicon);
           }
           
    
} catch(Exception e)
        {
            System.out.println("Error"+e);
        }  }}

            }}
       
        }catch(Exception e)
        {
            System.out.println("Error"+e);}}
  
    }//GEN-LAST:event_jButton31ActionPerformed

    private void BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTONActionPerformed
       // Displaying the clothing information based on Type or WEAR
        TablePanel.setVisible(true);
        searchBox.setText(String.valueOf(ItemColour3.getSelectedItem()));
        Combinationchoosing1.setVisible(false); 
       String typeorwear=TypeOrWear.getText();
        if(typeorwear.equalsIgnoreCase("Wear")){
try {
    Statement state;
            state = Source.mycon().createStatement();
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
     //joining the tables with inner join to display the actual colour wear and type instead of their Id and codes in the table panel
        String query ="SELECT * FROM `item_detail` INNER JOIN `colour`,`item_type`,`outfit_type` WHERE colour_code=Itemcolour && cloth_code=ItemType && Oid=ItemWear && ItemWear='"+Code.getText()+"'";
            
        ResultSet rs1 = state.executeQuery(query);

            while (rs1.next()) {

                 Object o[] = { rs1.getString("ItemId"),rs1.getString("ItemDes"), rs1.getString("cloth_type"),
                    rs1.getString("ItemBrand"), rs1.getString("colour"), rs1.getString("OWear"), 
                    rs1.getString("ItemBuyDate"),rs1.getString("ItemPhoto")};
                table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }searchBox.setText(String.valueOf(ItemColour3.getSelectedItem())+" And "+Code.getText());
    }else {
                try { Statement state;
            state = Source.mycon().createStatement();
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
             //joining the tables with inner join to display the actual colour wear and type instead of their Id and codes in the table panel
            ResultSet rs1 = state.executeQuery("SELECT * FROM `item_detail`INNER JOIN `colour`,`item_type`,`outfit_type`WHERE  colour_code=Itemcolour && cloth_code=ItemType && Oid=ItemWear && cloth_code='"+Code.getText()+"'");

            while (rs1.next()) {

                                Object o[] = {rs1.getString("ItemId"), rs1.getString("ItemDes"), rs1.getString("cloth_type"),
                    rs1.getString("ItemBrand"), rs1.getString("colour"), rs1.getString("OWear"), 
                    rs1.getString("ItemBuyDate"), rs1.getString("ItemPhoto")};
                                 table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }searchBox.setText(String.valueOf(Code.getText()));
                }
    }//GEN-LAST:event_BUTTONActionPerformed

    private void SkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkipActionPerformed
// Displaying the next set of information based on the type of Wear chosen
        int i=0;
Boolean C1=false;
Boolean C2=false;
Boolean C3=false;
        while(i<3){
        
   
        SuggestPanel.setVisible(true);
        CombinationChoosing2.setVisible(false);
        try{ Statement state;
            state = Source.mycon().createStatement();
            String itemtype=null;
            
                while(itemtype==null ){
                
         
          Random rand = new Random();
                int randomNumber = rand.nextInt(100);//generates random number 
              String query4="SELECT ItemType FROM item_detail where ItemId='"+randomNumber+"'&& ItemWear='"+Code1.getText()+"'";
               ResultSet rs4 = state.executeQuery(query4);
               while(rs4.next()){
              itemtype=rs4.getString("ItemType");}// fetching the item type of the random id's number 
    if(itemtype.equalsIgnoreCase("C2")){
 if(C2==false){
    
           C2=true;
            i=i+1;
            String query3="SELECT * FROM `item_detail` WHERE ItemId='"+randomNumber+"'&& ItemType= 'C2'";// Chosing the item photo based on the information user has chosen
             try { 
                 ImageIcon img11=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+"empty.jpeg");
            jLabel9.setIcon(img11);
                
                Image image12 = img11.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon1= new ImageIcon(image12);// adjusting the image size with the label size
                        jLabel9.setIcon(newicon1);
        
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel9.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
                
                Image image = img.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                        jLabel9.setIcon(newicon);
           }
        } catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
}
} else if(itemtype.equalsIgnoreCase("C1")){
             if(C1==false){ 
                 i=i+1;
                   C1=true;
           
            String query3="SELECT * FROM `item_detail` WHERE ItemId='"+randomNumber+"'&& ItemType='C1'";// Chosing the item photo based on the information user has chosen

             try {
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel10.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                Image image = img.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                        jLabel10.setIcon(newicon);
           }
             } catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
                    }}
else if(itemtype.equalsIgnoreCase("C3")){ 
    if(C3==false){
        i=i+1;
    C3=true;
            String query3="SELECT * FROM `item_detail` WHERE ItemId='"+randomNumber+"'&& ItemType='C3'";// Chosing the item photo based on the information user has chosen

             try {
                  
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel11.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
                
                Image image = img.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);// adjusting the image size with the label size
                        jLabel11.setIcon(newicon);
           }
           
    
} catch(Exception e)
        {
            System.out.println("Error"+e);
        }  }

            }}}
        catch(Exception e)
        {
            System.out.println("Error"+e);}
        }
    }//GEN-LAST:event_SkipActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
//displaying the suggestion based on chosen Wear
int i=0;
Boolean C1=false;
Boolean C2=false;
Boolean C3=false;
Statement state;

        while(i<3){//Looping three times for three different types
        
   
        SuggestPanel.setVisible(true);
        CombinationChoosing2.setVisible(false);
        try{ 
            state = Source.mycon().createStatement();
            String itemtype=null;
            
                while(itemtype==null ){
          Random rand = new Random();
                int randomNumber = rand.nextInt(100);
              String query4="SELECT ItemType FROM item_detail where ItemId='"+randomNumber+"'&& ItemWear='"+Code1.getText()+"'";// choosing Id as random 
               ResultSet rs4 = state.executeQuery(query4);
               while(rs4.next()){
              itemtype=rs4.getString("ItemType");}
    if(itemtype.equalsIgnoreCase("C2")){// Checking if the selected clothes is C2 
 if(C2==false){
    
           C2=true;
            i=i+1;
            String query3="SELECT * FROM `item_detail` WHERE ItemId='"+randomNumber+"'&& ItemType= 'C2'";// searching for clothes which has is type 2 and Id is randomnumber
             try { 
                 ImageIcon img11=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+"empty.jpeg");
            jLabel9.setIcon(img11);
                
                Image image12 = img11.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon1= new ImageIcon(image12);
                        jLabel9.setIcon(newicon1);
        
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel9.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
                
                Image image = img.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);
                        jLabel9.setIcon(newicon);
           }
        } catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
}
} else if(itemtype.equalsIgnoreCase("C1")){// Checking if the selected clothes is C1
             if(C1==false){ 
                 i=i+1;
                   C1=true;
           
            String query3="SELECT * FROM `item_detail` WHERE ItemId='"+randomNumber+"'&& ItemType='C1'";

             try {
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel10.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                Image image = img.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);
                        jLabel10.setIcon(newicon);
           }
             } catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
                    }}
else if(itemtype.equalsIgnoreCase("C3")){ // Checking if the selected clothes is C3 
    if(C3==false){
        i=i+1;
    C3=true;
            String query3="SELECT * FROM `item_detail` WHERE ItemId='"+randomNumber+"'&& ItemType='C3'";

             try {
                  
            
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
            while(rs3.next())
            {   String image1 = rs3.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1);
            jLabel11.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image1));
                
                
                Image image = img.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);
                        jLabel11.setIcon(newicon);
           }
           
    
} catch(Exception e)
        {
            System.out.println("Error"+e);
        }  }

            }}}
        catch(Exception e)
        {
            System.out.println("Error"+e);}
        }
        

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jLabel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyPressed
// displaying to selection page and the information in the right side of the splitpane which id is chosen from the left side of the splitpane
        SelectPanel.setVisible(true);
         SuggChoose.setVisible(false);
         MangChoose.setVisible(false);
         TablePanel.setVisible(false);
         CombinationChoosing2.setVisible(false);
         Combinationchoosing1.setVisible(false);
         SuggOrMng.setVisible(false);
         SuggestPanel.setVisible(false);
         Home.setVisible(false);
         String query = "SELECT ItemId FROM item_detail"; // statement to retrieve the data from database
         DefaultListModel model = new DefaultListModel(); //create a new list model
    try{
    Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query); //run your query

    while (rs.next()) //go through each row that your query returns
    {
        String itemCode = rs.getString("ItemId"); //get the element in column "item_code"
        model.addElement(itemCode); //add each item to the model
    }
    jList1.setModel(model);

    rs.close();
   state.close();}
    
   
    catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    jList1.getSelectionModel().addListSelectionListener(e ->{
        String query1= "SELECT * FROM item_detail WHERE ItemId='"+jList1.getSelectedValue()+"'";
        try{
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs1 = state.executeQuery(query1);
            while(rs1.next()){
              Id.setText(String.valueOf(rs1.getInt("ItemId")));//displaying the information of the clothing item in the textfield 
              Description.setText(rs1.getString("ItemDes")); 
              Brand.setText(rs1.getString("ItemBrand"));
              BuyDate.setText(rs1.getString("ItemBuyDate"));
              String itemType=rs1.getString("ItemType");//assigning the value of the clothing item of combobox to the itemtype
              String itemColour=rs1.getString("ItemColour");
              String itemWear=rs1.getString("ItemWear");
              String image2 = rs1.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image2);
            Photo.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image2));
                Image image = img.getImage().getScaledInstance(Photo.getWidth(), Photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);
                        Photo.setIcon(newicon);
              String query2="SELECT colour FROM colour WHERE colour_code='"+itemColour+"'";// retreiving the colour from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs2 = state.executeQuery(query2);
                while(rs2.next()){
                    Colour.setText(rs2.getString("colour"));//displaying the colour information in the clothig item in the textfield
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }   String query3="SELECT cloth_type FROM item_type WHERE cloth_code='"+itemType+"'";// retreiving the type from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
                while(rs3.next()){
                    Type.setText(rs3.getString("cloth_type"));
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);}   
         String query4="SELECT Owear FROM outfit_type WHERE Oid='"+itemWear+"'";// retreiving the wear from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs4 = state.executeQuery(query4);
                while(rs4.next()){
                    Wear.setText(rs4.getString("Owear"));
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }        
            }
}catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    }//GEN-LAST:event_jLabel5KeyPressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
//displaying to select panel and the information in the right side of the splitpane which id is chosen from the left side of the splitpane
        SelectPanel.setVisible(true);
         SuggChoose.setVisible(false);
         MangChoose.setVisible(false);
         TablePanel.setVisible(false);
         CombinationChoosing2.setVisible(false);
         Combinationchoosing1.setVisible(false);
         SuggOrMng.setVisible(false);
         SuggestPanel.setVisible(false);
         Home.setVisible(false);
         String query = "SELECT ItemId FROM item_detail"; // statement to retrieve the data from database
         DefaultListModel model = new DefaultListModel(); //create a new list model
    try{
    Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery(query); //run your query

    while (rs.next()) //go through each row that your query returns
    {
        String itemCode = rs.getString("ItemId"); //get the element in column "item_code"
        model.addElement(itemCode); //add each item to the model
    }
    jList1.setModel(model);

    rs.close();
   state.close();}
    
   
    catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    jList1.getSelectionModel().addListSelectionListener(e ->{
        String query1= "SELECT * FROM item_detail WHERE ItemId='"+jList1.getSelectedValue()+"'";
        try{
            Statement state;
            state = Source.mycon().createStatement();
            ResultSet rs1 = state.executeQuery(query1);
            while(rs1.next()){
              Id.setText(String.valueOf(rs1.getInt("ItemId")));//displaying the information of the clothing item in the textfield 
              Description.setText(rs1.getString("ItemDes")); 
              Brand.setText(rs1.getString("ItemBrand"));
              BuyDate.setText(rs1.getString("ItemBuyDate"));
              String itemType=rs1.getString("ItemType");//assigning the value of the clothing item of combobox to the itemtype
              String itemColour=rs1.getString("ItemColour");
              String itemWear=rs1.getString("ItemWear");
              String image2 = rs1.getString("ItemPhoto");
                ImageIcon img=new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image2);
            Photo.setIcon(new ImageIcon("C://CS-IBDP//Wardrobe IA//Images//"+image2));
                Image image = img.getImage().getScaledInstance(Photo.getWidth(), Photo.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newicon= new ImageIcon(image);
                        Photo.setIcon(newicon);
              String query2="SELECT colour FROM colour WHERE colour_code='"+itemColour+"'";// retreiving the colour from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs2 = state.executeQuery(query2);
                while(rs2.next()){
                    Colour.setText(rs2.getString("colour"));//displaying the colour information in the clothig item in the textfield
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }   String query3="SELECT cloth_type FROM item_type WHERE cloth_code='"+itemType+"'";// retreiving the type from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs3 = state.executeQuery(query3);
                while(rs3.next()){
                    Type.setText(rs3.getString("cloth_type"));
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);}   
         String query4="SELECT Owear FROM outfit_type WHERE Oid='"+itemWear+"'";// retreiving the wear from the assigned value above
              try{
            state = Source.mycon().createStatement();
            ResultSet rs4 = state.executeQuery(query4);
                while(rs4.next()){
                    Wear.setText(rs4.getString("Owear"));
                }   
              }catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }        
            }
}catch (SQLException ex) {
            Logger.getLogger(WardrobeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        SelectPanel.setVisible(false);
        SuggChoose.setVisible(false);
        MangChoose.setVisible(false);
        TablePanel.setVisible(true);
        SuggOrMng.setVisible(false);
        SuggestPanel.setVisible(false);
        CombinationChoosing2.setVisible(false);
        Home.setVisible(false);
        Combinationchoosing1.setVisible(false);
         searchBox.setText("");
        try {
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
            Statement state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM `item_detail`INNER JOIN `colour`,`item_type`,`outfit_type`"
                    + "WHERE cloth_code=ItemType && colour_code=Itemcolour && Oid=ItemWear");//jining the tables with inner join to display the information not just codes of it
            while (rs.next()) {

                  Object o[] = { rs.getString("ItemId"),rs.getString("ItemDes"), rs.getString("cloth_type"),
                    rs.getString("ItemBrand"), rs.getString("colour"), rs.getString("OWear"), 
                    rs.getString("ItemBuyDate"),rs.getString("ItemPhoto")};// displaying the information by fetching the detaols from the database
                table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
       
        }   
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Home.setVisible(true);
        SuggChoose.setVisible(false);
        MangChoose.setVisible(false);
        CombinationChoosing2.setVisible(false);
        Combinationchoosing1.setVisible(false);
        TablePanel.setVisible(false);
        SuggOrMng.setVisible(false);
        SuggestPanel.setVisible(false);
        SelectPanel.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel14KeyPressed
    SelectPanel.setVisible(false);
        SuggChoose.setVisible(false);
        MangChoose.setVisible(false);
        TablePanel.setVisible(true);
        SuggOrMng.setVisible(false);
        SuggestPanel.setVisible(false);
        CombinationChoosing2.setVisible(false);
        Home.setVisible(false);
        Combinationchoosing1.setVisible(false);
         searchBox.setText("");
         try {
            DefaultTableModel table = (DefaultTableModel) Table.getModel();
            table.setRowCount(0);
            Statement state = Source.mycon().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM `item_detail`INNER JOIN `colour`,`item_type`,`outfit_type`"
                    + "WHERE cloth_code=ItemType && colour_code=Itemcolour && Oid=ItemWear");//jining the tables with inner join to display the information not just codes of it
            while (rs.next()) {

                  Object o[] = { rs.getString("ItemId"),rs.getString("ItemDes"), rs.getString("cloth_type"),
                    rs.getString("ItemBrand"), rs.getString("colour"), rs.getString("OWear"), 
                    rs.getString("ItemBuyDate"),rs.getString("ItemPhoto")};// displaying the information by fetching the detaols from the database
                table.addRow(o);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
       
        }      
    }//GEN-LAST:event_jLabel14KeyPressed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton21ActionPerformed

    public static void main(String args[]) {
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WardrobeManager().MangChoose.setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTTON;
    private javax.swing.JPanel Bottom;
    private javax.swing.JTextField Brand;
    private javax.swing.JTextField BuyDate;
    private javax.swing.JLabel Code;
    private javax.swing.JLabel Code1;
    private javax.swing.JTextField Colour;
    private javax.swing.JPanel CombinationChoosing2;
    private javax.swing.JPanel Combinationchoosing1;
    public javax.swing.JPanel CombinedPanel;
    private javax.swing.JButton Continue;
    private javax.swing.JTextField Description;
    private javax.swing.JPanel Home;
    private javax.swing.JTextField Id;
    protected javax.swing.JComboBox<String> ItemColour1;
    protected javax.swing.JComboBox<String> ItemColour2;
    protected javax.swing.JComboBox<String> ItemColour3;
    protected javax.swing.JComboBox<String> ItemColour4;
    public javax.swing.JPanel MangChoose;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPanel OverallPanel;
    private javax.swing.JLabel Photo;
    private javax.swing.JPanel SelectPanel;
    private javax.swing.JButton Skip;
    private javax.swing.JPanel SuggChoose;
    private javax.swing.JPanel SuggOrMng;
    private javax.swing.JPanel SuggestPanel;
    public javax.swing.JTable Table;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JTextField Type;
    private javax.swing.JLabel TypeOrWear;
    private javax.swing.JLabel TypeOrWear1;
    private javax.swing.JButton Update;
    private javax.swing.JTextField Wear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JTextField searchBox;
    // End of variables declaration//GEN-END:variables
    }
