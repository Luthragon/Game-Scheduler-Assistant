package personal.game.scheduler.assistant;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author farha
 */
public class Assistant extends javax.swing.JFrame {
//merupakan main program
    
    
    public Assistant() {
        koneksi con = new koneksi();
        
        initComponents();
        isicombo();
        
    }
private void isicombo(){ //untuk mengisi combobox
  try{

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gameschedulerassistant","root","");
Statement st=con.createStatement();
String q="Select namagame from gameinfo;";
ResultSet rs = st.executeQuery(q);
while(rs.next()){
    String namagamecombo = rs.getString("namagame");
    combobox.addItem(namagamecombo);
    }
} 
catch(Exception a){
JOptionPane.showMessageDialog(null, a);
}
  
} 


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jud = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gen1 = new javax.swing.JLabel();
        gen2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ket = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        wktuusr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jadwalbtn = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        radioutama = new javax.swing.JRadioButton();
        radiocomplt = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        hasiljadwal = new javax.swing.JLabel();
        hasiljadwal3 = new javax.swing.JLabel();
        hasiljadwal2 = new javax.swing.JLabel();
        hasiljadwal4 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        gambr = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assistant");
        setBackground(new java.awt.Color(102, 255, 204));

        jTabbedPane1.setBackground(new java.awt.Color(102, 255, 204));

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jud.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jud.setText("Judul");

        jLabel3.setText("Keterangan");

        jLabel5.setText("Genre");

        gen1.setText("genre1");

        gen2.setText("genre2");

        jLabel8.setText("Game Time");

        jLabel9.setText("Utama");

        jLabel10.setText("Completionist");

        time1.setText("gametimemain");

        time2.setText("gametimeex");

        ket.setColumns(20);
        ket.setLineWrap(true);
        ket.setRows(5);
        ket.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(ket);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(time2)))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jud)
                    .addComponent(jLabel3))
                .addGap(208, 208, 208))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time1)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gen1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(gen2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jud)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(gen1)
                    .addComponent(gen2))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1)
                    .addComponent(time2))
                .addGap(88, 88, 88))
        );

        jTabbedPane1.addTab("Game Infromation", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setText("Masukan Waktu Luang Per Hari (Jam)");

        jLabel2.setText("Hari Luang (Bulan yang Sama)");

        jadwalbtn.setText("Jadwalkan");
        jadwalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadwalbtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Sampai");

        radioutama.setText("Utama");
        radioutama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioutamaActionPerformed(evt);
            }
        });

        radiocomplt.setText("Completionist");
        radiocomplt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiocompltActionPerformed(evt);
            }
        });

        jLabel6.setText("Pilih Tipe Gameplay");

        hasiljadwal.setText("Hasil");

        hasiljadwal3.setText("Hasil 3");

        hasiljadwal2.setText("Hasil 2");

        hasiljadwal4.setText("Hasil 4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasiljadwal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jadwalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wktuusr, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(radioutama)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radiocomplt))))
                            .addComponent(hasiljadwal2)
                            .addComponent(hasiljadwal3)
                            .addComponent(hasiljadwal4))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(wktuusr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioutama)
                    .addComponent(radiocomplt)
                    .addComponent(jLabel6))
                .addGap(79, 79, 79)
                .addComponent(jadwalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(hasiljadwal)
                .addGap(11, 11, 11)
                .addComponent(hasiljadwal2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hasiljadwal3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hasiljadwal4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Scheduler", jPanel2);

        jCalendar1.setBackground(new java.awt.Color(153, 255, 204));
        jTabbedPane1.addTab("Calendar", jCalendar1);

        gambr.setBackground(new java.awt.Color(255, 102, 153));
        gambr.setText("Gambar");

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Game" }));
        combobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gambr)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(gambr)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxItemStateChanged
 
        try{

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gameschedulerassistant","root","");
Statement st=con.createStatement();
String select="Select * from gameinfo;";
ResultSet rs = st.executeQuery(select);

while(rs.next()){
    
 if(combobox.getSelectedItem().toString().equals("Xenoblade Chronicles 2")){ 
    rs.absolute(14);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);

break;
     
 }  
else if(combobox.getSelectedItem().toString().equals("Resident Evil 2 : Remake")){
 rs.absolute(9);
  String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);

break;
}
else if(combobox.getSelectedItem().toString().equals("Resident Evil 3 : Remake")){ 
  rs.absolute(10);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);

break;
 } 
else if(combobox.getSelectedItem().toString().equals("Fire Emblem: Three Houses")){ 
     rs.absolute(6);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);


break;
 }
 else if(combobox.getSelectedItem().toString(). equals("Doom (2016)")){
 rs.absolute(5);
  String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);

break;
}
else if(combobox.getSelectedItem().toString(). equals("The Witcher 3: Wild Hunt")){
 rs.absolute(12);
  String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);

break;
}

else if(combobox.getSelectedItem().toString().equals("Animal Crossing: New Horizons")){ 
  rs.absolute(1);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);

break; 
}
 
else if(combobox.getSelectedItem().toString().equals("Total War: Shogun 2")){ 
     rs.absolute(13);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);


break;
 }
 
 else if(combobox.getSelectedItem().toString().equals("Assassin's Creed Odyssey")){ 
     rs.absolute(2);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);


break;
 }
 
 else if(combobox.getSelectedItem().toString().equals("Final Fantasy XV")){ 
     rs.absolute(7);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);


break;
 }
 
  else if(combobox.getSelectedItem().toString().equals("Shadow of the Tomb Raider")){ 
     rs.absolute(11);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);


break;
 }
 
   else if(combobox.getSelectedItem().toString().equals("Celeste")){ 
     rs.absolute(4);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);


break;
 }
 
 
    else if(combobox.getSelectedItem().toString().equals("The Legend of Zelda: Breath of the Wild")){ 
     rs.absolute(3);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);


break;
 }
 
     else if(combobox.getSelectedItem().toString().equals("Red Dead Redemption 2")){ 
     rs.absolute(8);
     String juduls = rs.getString("namagame");
     jud.setText(juduls);
     String keterangs = rs.getString("keterangan");
     ket.setText(keterangs);
     String geni = rs.getString("genre1");
     gen1.setText(geni);
     String genii = rs.getString("genre2");
     gen2.setText(genii);
     String gameut = rs.getString("gametimemain");
     time1.setText(gameut+" Jam");
     String gameex = rs.getString("gametimeex");
     time2.setText(gameex+" Jam");
     
byte[] gambar = rs.getBytes("gambargame");
ImageIcon image = new ImageIcon(gambar);
gambr.setText("");
gambr.setIcon(image);


break;
 }
 
}
 
   con.close();
   st.close();
   rs.close();
    } 
catch(Exception a){
JOptionPane.showMessageDialog(null, "Silahkan Pilih Dengan Benar");

} 
     
      
    }//GEN-LAST:event_comboboxItemStateChanged

    private void jadwalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadwalbtnActionPerformed

    SimpleDateFormat sdf = new SimpleDateFormat("dd", Locale.getDefault());
    int date1 = Integer.parseInt(sdf.format(jDateChooser1.getDate()));
    int date2 = Integer.parseInt(sdf.format(jDateChooser2.getDate()));
    int dhasil = date2-date1+1;
    int wktuuser = Integer.parseInt(wktuusr.getText()) ;
    int wktuusertot=wktuuser*dhasil;
    try{
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gameschedulerassistant","root","");
Statement st2=conn.createStatement();
String q="Select * from gameinfo;";
ResultSet rst = st2.executeQuery(q);
while(rst.next()){
if(combobox.getSelectedItem().toString().equals("Xenoblade Chronicles 2")){
    rst.absolute(14);
    int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}
else if(combobox.getSelectedItem().equals("Resident Evil 2 : Remake")){
    rst.absolute(9);
     int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}

else if(combobox.getSelectedItem().equals("Resident Evil 3 : Remake")){
    rst.absolute(10);
    int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}
else if(combobox.getSelectedItem().equals("Fire Emblem: Three Houses")){
    rst.absolute(6);
      int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}
else if(combobox.getSelectedItem().equals("Doom (2016)")){
    rst.absolute(5);
     int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}

else if(combobox.getSelectedItem().equals("The Witcher 3: Wild Hunt")){
    rst.absolute(12);
     int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}

else if(combobox.getSelectedItem().equals("Animal Crossing: New Horizons")){
    rst.absolute(1);
     int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}
else if(combobox.getSelectedItem().equals("Total War: Shogun 2")){
    rst.absolute(13);
      int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}

else if(combobox.getSelectedItem().equals("Assassin's Creed Odyssey")){
    rst.absolute(2);
   int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}
else if(combobox.getSelectedItem().equals("Final Fantasy XV")){
    rst.absolute(7);
    int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}

else if(combobox.getSelectedItem().equals("Shadow of the Tomb Raider")){
    rst.absolute(11);
    int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}

else if(combobox.getSelectedItem().equals("Celeste")){
    rst.absolute(4);
    int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}

 else if(combobox.getSelectedItem().equals("The Legend of Zelda: Breath of the Wild")){
    rst.absolute(3);
   int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}
 
   else if(combobox.getSelectedItem().equals("Red Dead Redemption 2")){
    rst.absolute(8);
    int gametimeutama = Integer.parseInt(rst.getString("gametimemain"));
    int gametimecomplt =  Integer.parseInt(rst.getString("gametimeex"));
        if(radioutama.isSelected()){
        int hasiljadi = gametimeutama-wktuusertot; 
        int hasiljadi2 = hasiljadi/wktuuser;
        JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode utama");
        hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
        hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
        hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
        hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode utama");
  break;
}
    else{
        
       int hasiljadi = gametimecomplt-wktuusertot;    
       int hasiljadi2= hasiljadi/wktuuser;
     JOptionPane.showMessageDialog(null,"Anda butuh "+ hasiljadi+" jam lagi untuk menyelesaikan game pada mode completionist");
     hasiljadwal.setText("Anda memiliki "+dhasil+" hari luang" );
     hasiljadwal2.setText("Anda memiliki total waktu luang "+wktuusertot+" jam");
     hasiljadwal3.setText("Anda butuh menyisakan waktu "+hasiljadi+" jam lagi untuk menyelesaikan game");
     hasiljadwal4.setText("Anda butuh meluangkan "+hasiljadi2+" hari lagi untuk menyelesaikan pada mode completionist");  
    }
    
    break;
}
 

else{
    JOptionPane.showMessageDialog(null, "Silahkan Pilih dan Isi dengan benar");
}
}


   conn.close();
   st2.close();
   rst.close();
 

}
catch(Exception a){
JOptionPane.showMessageDialog(null, "Silahkan Pilih dan Isi dengan benar");
}



    
    }//GEN-LAST:event_jadwalbtnActionPerformed

    private void radioutamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioutamaActionPerformed
      if(radioutama.isSelected())
            radiocomplt.setSelected(false); 
        
    }//GEN-LAST:event_radioutamaActionPerformed

    private void radiocompltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiocompltActionPerformed
     if(radiocomplt.isSelected())
    radioutama.setSelected(false);   
    }//GEN-LAST:event_radiocompltActionPerformed

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Assistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assistant().setVisible(false);
            }
           
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JLabel gambr;
    private javax.swing.JLabel gen1;
    private javax.swing.JLabel gen2;
    private javax.swing.JLabel hasiljadwal;
    private javax.swing.JLabel hasiljadwal2;
    private javax.swing.JLabel hasiljadwal3;
    private javax.swing.JLabel hasiljadwal4;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jadwalbtn;
    private javax.swing.JLabel jud;
    private javax.swing.JTextArea ket;
    private javax.swing.JRadioButton radiocomplt;
    private javax.swing.JRadioButton radioutama;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    private javax.swing.JTextField wktuusr;
    // End of variables declaration//GEN-END:variables
}
