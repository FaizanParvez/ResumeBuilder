/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resume;

import GUI.BE;
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;
import com.sun.pdfview.PagePanel;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import GUI.BasicInfo;
import GUI.BasicInfo;
import GUI.C12;
import GUI.MBA;
import GUI.Save_Print_Mail;
import GUI.View;
import static GUI.View.RESULT;
import resume.BE1;

/**
 *
 * @author om
 */
public class MyResume extends javax.swing.JFrame {

    int z=1;
    int p;
    static PagePanel panel = new PagePanel();
    static JFrame frame;
 

    public void view()
    {
        try {
            
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame = new JFrame("My Resume...");
            frame.setVisible(true);
            
            
            //JFrame frame = new JFrame("PDF Test");
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Dimension expectedDimension = new Dimension(650, 650);

        panel.setPreferredSize(expectedDimension);
        panel.setMaximumSize(expectedDimension);
        panel.setMinimumSize(expectedDimension);
            Box box = new Box(BoxLayout.Y_AXIS);

        box.add(Box.createVerticalGlue());
        box.add(panel);     
        box.add(Box.createVerticalGlue());
        frame.add(box);
            frame.pack();
            frame.setLocationRelativeTo(null);
            this.getContentPane().setBackground(new Color(0,0,0));
            
            //load a pdf from a byte buffer
            File file = new File(RESULT);
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            FileChannel channel = raf.getChannel();
            ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY,
                    0, channel.size());
            PDFFile pdffile = new PDFFile(buf);
            p= pdffile.getNumPages();
            PDFPage page = pdffile.getPage(0);
            panel.showPage(page) ;

        }
        catch( IOException e)
        {
            
        }
    }
        public void viewS()
    {
        try {
            
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame = new JFrame("My Resume...");
            frame.setVisible(true);
            
            
            //JFrame frame = new JFrame("PDF Test");
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Dimension expectedDimension = new Dimension(650, 650);

        panel.setPreferredSize(expectedDimension);
        panel.setMaximumSize(expectedDimension);
        panel.setMinimumSize(expectedDimension);
            Box box = new Box(BoxLayout.Y_AXIS);

        box.add(Box.createVerticalGlue());
        box.add(panel);     
        box.add(Box.createVerticalGlue());
        frame.add(box);
            frame.pack();
            frame.setLocationRelativeTo(null);
            
            this.getContentPane().setBackground(new Color(0,0,0));
            //load a pdf from a byte buffer
            File file = new File(RESULT);
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            FileChannel channel = raf.getChannel();
            ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY,
                    0, channel.size());
            PDFFile pdffile = new PDFFile(buf);
            p= pdffile.getNumPages();
            PDFPage page = pdffile.getPage(z);
            panel.showPage(page) ;

        }
        catch( IOException e)
        {
            
        }
    }

     public MyResume() {
        initComponents();
        this.getContentPane().setBackground(new Color(0,0,0));
        view();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nxt = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View My Resume");

        jButton1.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/continue.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nxt.setFont(new java.awt.Font("Vani", 3, 11)); // NOI18N
        nxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pgUp.png"))); // NOI18N
        nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtActionPerformed(evt);
            }
        });

        prev.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pgDown.png"))); // NOI18N
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nxt)
                    .addComponent(prev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtActionPerformed
   if(z<p&&z>=0)
        {      nxt.setEnabled(true);
z=z+1;
frame.dispose();
if(z!=0)
viewS();  } 
    }//GEN-LAST:event_nxtActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
if(z> 0&&z<=p)
        {    prev.setEnabled(true);
        z=z-1;
        frame.dispose();
        viewS();  
        }
    }//GEN-LAST:event_prevActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
 frame.dispose();
new Save_Print_Mail().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
if(null != BasicInfo.qualification)
        switch (BasicInfo.qualification) {
        case "BE":
                new BE().setVisible(true);
            break;
        case "MBA":
                new MBA().setVisible(true);
            break;
        case "12":
                new C12().setVisible(true);
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.dispose();
       JOptionPane.showMessageDialog(this,"Have a nice day ahead!","Bye. Bye!",JOptionPane.CLOSED_OPTION);
       System.exit(0);

    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton nxt;
    private javax.swing.JButton prev;
    // End of variables declaration//GEN-END:variables
}