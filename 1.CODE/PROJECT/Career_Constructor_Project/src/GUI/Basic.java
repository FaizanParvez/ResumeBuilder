package GUI;

import com.itextpdf.text.DocumentException;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logic.SetConnections;
import resume.*;

public class Basic extends javax.swing.JFrame{
Connection con=null;
PreparedStatement preparedStatement=null;
static public String date_declaration;
static public String place_declaration;
static public int age; 
static public String language;
static public String career_obj;
static public int hss_year;
static public int sss_year;
static public float hss_percent;
static public float sss_percent;
static public String[] hobbies;
static public String nationality;
static public String mar_status;
static public String f_name;
static public String[] personal_traits;
static public String sss_name;
static public String sss_board;
static public String hss_name;
static public String hss_board;
    
    public Basic() {
        initComponents();
                  this.getContentPane().setBackground(new Color(0,0,0));
                     this.setLocationRelativeTo(null);
     if(new CareerConstructor().resume==1)
        setConnections();
    }
        public void setConnections()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_resume","root","");
            //System.out.println("connection created");
        }
        catch(Exception e)
	{
            	    JOptionPane.showMessageDialog(this,"No Internet Connection!","OOPS!",
                                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        l = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        ms = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        hp = new javax.swing.JTextField();
        sy = new javax.swing.JTextField();
        hy = new javax.swing.JTextField();
        sp = new javax.swing.JTextField();
        nxt = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        hobby = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        prsnt = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        nxt1 = new javax.swing.JButton();
        nxt2 = new javax.swing.JButton();
        dos = new javax.swing.JTextField();
        pla = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        hb = new javax.swing.JTextField();
        sb = new javax.swing.JTextField();
        sss = new javax.swing.JTextField();
        hss = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton5.setText("add pt");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal and Educational Details");
        setAlwaysOnTop(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/more.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age:");

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aKeyReleased(evt);
            }
        });

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });

        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        hp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hpKeyReleased(evt);
            }
        });

        sy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                syKeyReleased(evt);
            }
        });

        hy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hyKeyReleased(evt);
            }
        });

        sp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spKeyReleased(evt);
            }
        });

        nxt.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        nxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/continue.png"))); // NOI18N
        nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("*hit enter to add more points!");

        hobby.setColumns(20);
        hobby.setRows(5);
        jScrollPane3.setViewportView(hobby);

        prsnt.setColumns(20);
        prsnt.setRows(5);
        jScrollPane4.setViewportView(prsnt);

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*all fields mandatory!");

        nxt1.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        nxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        nxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxt1ActionPerformed(evt);
            }
        });

        nxt2.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        nxt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        nxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxt2ActionPerformed(evt);
            }
        });

        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        dos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dosKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nationality: ");

        jLabel19.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Percentage:  ");

        jLabel20.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Higher Secondary School :");

        jLabel21.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Year:");

        jLabel22.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Board:");

        jLabel23.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Percentage:  ");

        jLabel24.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Senior Secondary School:");

        jLabel25.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Year:");

        jLabel26.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Board:");

        jLabel27.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Father's Name:");

        jLabel28.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Marital Status: ");

        hb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbActionPerformed(evt);
            }
        });
        hb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hbKeyReleased(evt);
            }
        });

        sb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbActionPerformed(evt);
            }
        });
        sb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sbKeyReleased(evt);
            }
        });

        sss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sssActionPerformed(evt);
            }
        });
        sss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sssKeyReleased(evt);
            }
        });

        hss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hssActionPerformed(evt);
            }
        });
        hss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hssKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Languages Known: ");

        jLabel30.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Hobbies:");

        jLabel31.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Personal Traits:");

        jLabel32.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Date of Declaration:");

        jLabel33.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Place of Declaration:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(sy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hy, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sss, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hss, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sb, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(ms)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hb, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(82, 82, 82))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pla, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(hss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(hy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(sy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel32)
                                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel33)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 51, Short.MAX_VALUE)
                                .addComponent(nxt1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nxt2))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void update1() throws SQLException
    {
        
            preparedStatement=con.prepareStatement("update resume1 set age=?,languages=?,hss_year=?,sss_year=?,hss_percent=?,sss_percent=?,hobbies=?,nationality=?,mar_status=?,f_name=?,personal_traits=? order by s_no desc limit 1");
            preparedStatement.setObject(1, a.getText());
            
            preparedStatement.setObject(2, l.getText());
            preparedStatement.setObject(3, hy.getText());
            preparedStatement.setObject(4, sy.getText());
            preparedStatement.setObject(5, hp.getText());
            preparedStatement.setObject(6, sp.getText());
            preparedStatement.setObject(7, hobby.getText());
            preparedStatement.setObject(8, n.getText());
            preparedStatement.setObject(9, ms.getText());
            preparedStatement.setObject(10, fn.getText());
            preparedStatement.setObject(11, prsnt.getText());
            preparedStatement.executeUpdate();
        }
    
    private void nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtActionPerformed
        int z=0;
        if(hb.getText().equals("")||sb.getText().equals("")||hss.getText().equals("")||sss.getText().equals("")||pla.getText().equals("")||dos.getText().equals("")||prsnt.getText().equals("")||hobby.getText().equals("")||fn.getText().equals("")||ms.getText().equals("")||a.getText().equals("")||l.getText().equals("")||hy.getText().equals("")||sy.getText().equals("")||hp.getText().equals("")||sp.getText().equals("")||n.getText().equals(""))
        JOptionPane.showMessageDialog(this,"One or more fields are left empty!","ALL FIELDS MANDATORY!",JOptionPane.ERROR_MESSAGE);
        else
        {
        age=Integer.parseInt(a.getText());
        language=l.getText();
        hss_year=Integer.parseInt(hy.getText());
        sss_year=Integer.parseInt(sy.getText());
        hss_percent=Float.parseFloat(hp.getText());
        sss_percent=Float.parseFloat(sp.getText());
        nationality=n.getText();
        mar_status=ms.getText();
        f_name=fn.getText();
        hobbies= hobby.getText().split("\n");
        personal_traits=prsnt.getText().split("\n");
         date_declaration=dos.getText();
        place_declaration=pla.getText();
        hss_name=hss.getText();
        sss_name= sss.getText();
        hss_board=hb.getText();
        sss_board=sb.getText();
            if(new CareerConstructor().resume==1)
               {try {
                   update1();
               } catch (SQLException ex) {
                   Logger.getLogger(Basic.class.getName()).log(Level.SEVERE, null, ex);
               }
               }
                   if(null != BasicInfo.qualification)
                   switch (BasicInfo.qualification) {
                   case "BE":
                           new BE().setVisible(true);
                       break;
                   case "MBA":
                           new MBA().setVisible(true);
                       break;
                   case "Class 12":
                           new C12().setVisible(true);
                       break;
                    }

               
           this.dispose();
       
    }
    }//GEN-LAST:event_nxtActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void aKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyReleased
        if(evt.getKeyCode()!=KeyEvent.VK_ENTER && evt.getKeyCode()!=KeyEvent.VK_SHIFT && evt.getKeyCode()!=KeyEvent.VK_RIGHT && evt.getKeyCode()!=KeyEvent.VK_LEFT && evt.getKeyCode()!=KeyEvent.VK_TAB && evt.getKeyCode()!=KeyEvent.VK_BACK_SPACE)
        try{
                age=Integer.parseInt(a.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Only numbers allowed for age !","OOPS!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_aKeyReleased

    private void hpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hpKeyReleased
if(evt.getKeyCode()!=KeyEvent.VK_ENTER && evt.getKeyCode()!=KeyEvent.VK_SHIFT && evt.getKeyCode()!=KeyEvent.VK_RIGHT && evt.getKeyCode()!=KeyEvent.VK_LEFT && evt.getKeyCode()!=KeyEvent.VK_TAB && evt.getKeyCode()!=KeyEvent.VK_BACK_SPACE)
        try{
                hss_percent=Float.parseFloat(hp.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Only numbers and/or decimal points allowed for Percentage!","OOPS!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_hpKeyReleased

    private void spKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spKeyReleased
if(evt.getKeyCode()!=KeyEvent.VK_ENTER && evt.getKeyCode()!=KeyEvent.VK_SHIFT && evt.getKeyCode()!=KeyEvent.VK_RIGHT && evt.getKeyCode()!=KeyEvent.VK_LEFT && evt.getKeyCode()!=KeyEvent.VK_TAB && evt.getKeyCode()!=KeyEvent.VK_BACK_SPACE)
        try{
                sss_percent=Float.parseFloat(sp.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Only numbers and/or decimal points allowed for Percentage!","OOPS!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_spKeyReleased

    private void hyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hyKeyReleased
if(evt.getKeyCode()!=KeyEvent.VK_ENTER && evt.getKeyCode()!=KeyEvent.VK_SHIFT && evt.getKeyCode()!=KeyEvent.VK_RIGHT && evt.getKeyCode()!=KeyEvent.VK_LEFT && evt.getKeyCode()!=KeyEvent.VK_TAB && evt.getKeyCode()!=KeyEvent.VK_BACK_SPACE)
        try{
                hss_year=Integer.parseInt(hy.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Only numbers allowed for Year!","OOPS!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_hyKeyReleased

    private void syKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_syKeyReleased
if(evt.getKeyCode()!=KeyEvent.VK_ENTER && evt.getKeyCode()!=KeyEvent.VK_SHIFT && evt.getKeyCode()!=KeyEvent.VK_RIGHT && evt.getKeyCode()!=KeyEvent.VK_LEFT && evt.getKeyCode()!=KeyEvent.VK_TAB && evt.getKeyCode()!=KeyEvent.VK_BACK_SPACE)
        try{
                sss_year=Integer.parseInt(sy.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Only numbers allowed for Year!","OOPS!",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_syKeyReleased

    private void nxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxt1ActionPerformed
this.dispose();
new View().setVisible(true);
    }//GEN-LAST:event_nxt1ActionPerformed

    private void nxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxt2ActionPerformed
       this.dispose();
       JOptionPane.showMessageDialog(this,"Have a nice day ahead!","Bye. Bye!",JOptionPane.CLOSED_OPTION);
       System.exit(0);

    }//GEN-LAST:event_nxt2ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void hbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hbKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_hbKeyReleased

    private void hbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hbActionPerformed

    private void sbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbActionPerformed

    private void sbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_sbKeyReleased

    private void sssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sssActionPerformed

    private void sssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sssKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_sssKeyReleased

    private void hssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hssActionPerformed

    private void hssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hssKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_hssKeyReleased

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosActionPerformed

    private void dosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dosKeyReleased
 if(evt.getKeyCode()!=KeyEvent.VK_ENTER && evt.getKeyCode()!=KeyEvent.VK_SHIFT && evt.getKeyCode()!=KeyEvent.VK_RIGHT && evt.getKeyCode()!=KeyEvent.VK_LEFT && evt.getKeyCode()!=KeyEvent.VK_TAB && evt.getKeyCode()!=KeyEvent.VK_BACK_SPACE)
        try{
                sss_year=Integer.parseInt(sy.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Only numbers allowed for Year!","OOPS!",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_dosKeyReleased

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField dos;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField hb;
    private javax.swing.JTextArea hobby;
    private javax.swing.JTextField hp;
    private javax.swing.JTextField hss;
    private javax.swing.JTextField hy;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField l;
    private javax.swing.JTextField ms;
    private javax.swing.JTextField n;
    private javax.swing.JButton nxt;
    private javax.swing.JButton nxt1;
    private javax.swing.JButton nxt2;
    private javax.swing.JTextField pla;
    private javax.swing.JTextArea prsnt;
    private javax.swing.JTextField sb;
    private javax.swing.JTextField sp;
    private javax.swing.JTextField sss;
    private javax.swing.JTextField sy;
    // End of variables declaration//GEN-END:variables
}
