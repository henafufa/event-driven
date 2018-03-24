
package edit;

import java.awt.FlowLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hena
 */
public class msForm extends javax.swing.JFrame {

  String text;
 
    public msForm() {
          super( "Salary-Calculating-System" ); 
          setLayout( new FlowLayout() );
            setContentPane(new JLabel(new ImageIcon( getClass().getResource("log.jpg"))));
//            
         setVisible( true );
         
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        bold = new javax.swing.JButton();
        under = new javax.swing.JButton();
        italic = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        open = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 480));

        input.setColumns(20);
        input.setFont(new java.awt.Font("Sylfaen", 0, 17)); // NOI18N
        input.setRows(5);
        jScrollPane1.setViewportView(input);

        bold.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        bold.setText("B");
        bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldActionPerformed(evt);
            }
        });

        under.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        under.setText("U");
        under.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underActionPerformed(evt);
            }
        });

        italic.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        italic.setText("I");
        italic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Sylfaen", 1, 17)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        save1.setFont(new java.awt.Font("Sylfaen", 1, 17)); // NOI18N
        save1.setText("Save as");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        open.setFont(new java.awt.Font("Sylfaen", 1, 17)); // NOI18N
        open.setText("Open File");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(under)
                    .addComponent(bold)
                    .addComponent(italic, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(bold)
                        .addGap(18, 18, 18)
                        .addComponent(under)
                        .addGap(30, 30, 30)
                        .addComponent(italic))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldActionPerformed
        text=input.getText();
        input.setFont(new Font("serif",Font.BOLD,17));
        input.setText(text);
        this.text=text;
       
    }//GEN-LAST:event_boldActionPerformed

    private void underActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underActionPerformed
        text=input.getText();
        input.setFont(new Font(Font.DIALOG_INPUT,Font.TYPE1_FONT,17));
        input.setText(text);
    }//GEN-LAST:event_underActionPerformed

    private void italicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicActionPerformed
//         Font font = new Font();
//    font.setStyle(Font.UNDERLINE);
        text=input.getText();
        input.setFont(new Font("sans_serif",Font.ITALIC,17));
        
        input.setText(text);
    }//GEN-LAST:event_italicActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
            input.setText(null);
            input.setFont(new Font("Sylfaen",Font.PLAIN,17));
    }//GEN-LAST:event_clearActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
             
          // TODO add your handling code here:
//            text=input.getText();
           JFileChooser saver=new JFileChooser("./");
//          saver.setFileFilter(new Text_Filter());
          int returnVal=saver.showSaveDialog(this);
          File file=saver.getSelectedFile();
          BufferedWriter fileout=null;
          if(returnVal== JFileChooser.APPROVE_OPTION){
               try {
          BufferedWriter fileOut=new BufferedWriter(new FileWriter(file.getAbsolutePath()));
          
          fileOut.write(text);
          
          fileOut.close();
          JOptionPane.showMessageDialog(this,"The file saved","success!",JOptionPane.INFORMATION_MESSAGE);
          System.out.println(fileOut);
          
      } catch (IOException ex) {
          JOptionPane.showMessageDialog(this,"The file not saved","Error!",JOptionPane.INFORMATION_MESSAGE);
          
      }
      }
    }//GEN-LAST:event_save1ActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
       
         
           input.setText("");
          JFileChooser saver=new JFileChooser("./");
//          saver.setFileFilter(new Text_Filter());
          int returnVal=saver.showOpenDialog(this);
         
          BufferedReader filein=null;
          if(returnVal== JFileChooser.APPROVE_OPTION){
               try {
                    File file= new File(saver.getSelectedFile().getPath());
           filein=new BufferedReader(new FileReader(file));
           String s;
           while(( s= filein.readLine())!=null){
                input.append(s);
//          filein.read();
                    
           }    
          filein.close();
           
               
          
      } catch (IOException ex) {
          JOptionPane.showMessageDialog(this,"The message not saved","Error!",JOptionPane.INFORMATION_MESSAGE);
          
      
      }
    }//GEN-LAST:event_openActionPerformed
}
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
            java.util.logging.Logger.getLogger(msForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(msForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(msForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(msForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new msForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bold;
    private javax.swing.JButton clear;
    private javax.swing.JTextArea input;
    private javax.swing.JButton italic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton open;
    private javax.swing.JButton save1;
    private javax.swing.JButton under;
    // End of variables declaration//GEN-END:variables
}
