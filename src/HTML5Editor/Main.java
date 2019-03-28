/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTML5Editor;

import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ryan
 *
 * I have to give credit to this answer on Stack Overflow for helping me finally
 * learn how to build a dialog that will let me dynamically create and edit a
 * table!
 * https://stackoverflow.com/questions/26982622/how-to-set-rows-and-columns-of-a-jtable-dynamic
 */
public class Main extends javax.swing.JFrame {

    /*Define the local class variables for the rows and columns to be used by the spinner and the default table model.
    This could be obsolete code, but it was necessary when I was testing other stuff that ended up not working in the end.
     */
    int rows = 0;
    int cols = 0;

    //The boilerplate is the default text in the source code editor in our app. Has the necessary HTML tags and also has some CSS code to style the webpage.
    private final String boilerplate = "<html>"
            + "\n<head>"
            + "\n<title>Your HTML Page</title>"
            + "\n<style>"
            + "\n* {"
            + "\nbox-sizing: border-box;"
            + "\n}"
            + "\nhtml, body {"
            + "\nmargin: 0;"
            + "\n}"
            + "\nimg {"
            + "\nheight: auto;"
            + "\nwidth:100%;"
            + "\n}"
            + "\ntable {\nwidth: 100%;\n}"
            + "\ntable, th, td {"
            + "\nborder: 1px solid black;"
            + "\n}"
            + "\nth {"
            + "\nheight: 50px;"
            + "\n}"
            + "\ntd {"
            + "\nheight: 50px;"
            + "\nvertical-align: bottom;"
            + "\n}"
            + "\nth, td {"
            + "\npadding: 15px;"
            + "\n}"
            + "\nbody {"
            + "\nbackground: light-gray;"
            + "\ntext-align: center;"
            + "\n}"
            + "\n</style>"
            + "\n</head>"
            + "\n<body>"
            + "\n<main>"
            + "\n</main>"
            + "\n</body>"
            + "\n</html>";

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        //Set the boilerplate to be the initial value of the text area variable txtDoc.
        txtDoc.setText(boilerplate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtImageCaption = new javax.swing.JTextField();
        txtImageURL = new javax.swing.JTextField();
        btnAddImage = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRows = new javax.swing.JSpinner();
        txtCols = new javax.swing.JSpinner();
        btnGenerateTable = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLinkDescription = new javax.swing.JTextField();
        txtLinkURL = new javax.swing.JTextField();
        btnAddLink = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddTable = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDoc = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Image Caption");

        jLabel4.setText("Image URL");

        txtImageCaption.setToolTipText("Title/description/caption of the image");

        txtImageURL.setToolTipText("The URL for the iamge.");

        btnAddImage.setText("Add Image");
        btnAddImage.setToolTipText("Add the image to the page.");
        btnAddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImageActionPerformed(evt);
            }
        });

        jLabel5.setText("Rows:");

        jLabel6.setText("Columns:");

        txtRows.setModel(new javax.swing.SpinnerNumberModel(1, -1, null, 1));
        txtRows.setToolTipText("Number of rows in the table.");

        txtCols.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        txtCols.setToolTipText("Number of columns in the table.");

        btnGenerateTable.setText("Generate Table");
        btnGenerateTable.setToolTipText("Generates the table for editing, but doesn't add it to the source code.");
        btnGenerateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateTableActionPerformed(evt);
            }
        });

        jLabel7.setText("Generate Table must be clicked after choosing # of rows & columns! This will generate an Excel like area for you to edit the table. When you are done, then click Add Table.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRows)
                    .addComponent(txtCols))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 889, Short.MAX_VALUE)
                        .addComponent(btnGenerateTable))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCols, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGenerateTable))
        );

        jLabel1.setText("Link Description:");

        jLabel2.setText("Link URL:");

        txtLinkDescription.setToolTipText("What is this link for?");

        txtLinkURL.setToolTipText("Where does this link go?");

        btnAddLink.setText("Add Link");
        btnAddLink.setToolTipText("Add the link to the page.");
        btnAddLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLinkDescription)
                    .addComponent(txtLinkURL)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddLink))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLinkDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLinkURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnAddLink))
        );

        jScrollPane1.setViewportView(jTable1);

        btnAddTable.setText("Add Table");
        btnAddTable.setToolTipText("Add the table to the page.");
        btnAddTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddTable)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddTable))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtImageURL)
                                    .addComponent(txtImageCaption)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAddImage))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 308, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtImageCaption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtImageURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddImage)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 37, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtDoc.setColumns(20);
        txtDoc.setRows(10);
        txtDoc.setToolTipText("The generated source code for the HTML page.");
        txtDoc.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDoc);

        btnSave.setText("Save");
        btnSave.setToolTipText("Save the HTML file to your computer.");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.setToolTipText("Reset everything to the default layout");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImageActionPerformed
        //Code that processes adding an image to the page when the add image button is pressed.
        //If one of the required parameters for inserting an image is blank...
        if (txtImageCaption.getText().length() == 0 || txtImageURL.getText().length() == 0) {
            return;
        }
        try {
            StringBuilder display = new StringBuilder(256);
            display.append("\n<img src=\"");
            display.append(txtImageURL.getText());
            display.append("\"");
            display.append("alt=\"");
            display.append(txtImageCaption.getText());
            display.append("\"");
            display.append(">");
            display.append("\n<div class=\"imageCaption\">");
            display.append("\n<p>");
            display.append("\n<em>");
            display.append(txtImageCaption.getText());
            display.append("</em>");
            display.append("\n</p>");
            display.append("\n</div>");
            txtDoc.insert(display.toString(), txtDoc.getText().indexOf("</main>") - 1);
            txtImageCaption.setText("");
            txtImageURL.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unable to add your image! Missing the </main> tag.");
        }
    }//GEN-LAST:event_btnAddImageActionPerformed

    private void btnAddTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTableActionPerformed
        /*
        Code for adding a table element to the source code of the page when the add table button is pressed.
        
        The idea for the implementation of how to save the table data to an HTML string comes from:
        https://stackoverflow.com/questions/27903525/formatting-jtable-data-on-an-html-file
        
        Additional support:
        https://docs.oracle.com/javase/tutorial/uiswing/components/table.html#data
         */

        TableModel model = jTable1.getModel();
        try {
            StringBuilder sb = new StringBuilder(256);
            sb.append("\n<table>");
            sb.append("\n<tbody>");
            for (int r = 0; r < model.getRowCount(); ++r) {
                sb.append("\n<tr>");
                for (int c = 0; c < model.getColumnCount(); ++c) {
                    sb.append("\n<td>");
                    sb.append(model.getValueAt(r, c).toString());
                    sb.append("</td>");
                }
                sb.append("\n</tr>");
            }
            sb.append("\n</tbody>");
            sb.append("\n</table>");
            txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</main>") - 1);
            //After insert, reset the table editor
            rows = 1;
            cols = 1;
            jTable1.setModel(new DefaultTableModel(rows, cols));
            txtRows.setValue(1);
            txtCols.setValue(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unable to insert table data! Missing </main> tag.");
        }
    }//GEN-LAST:event_btnAddTableActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Reset the HTML source code to it's initial state (the boilerplate).
        txtDoc.setText(boilerplate);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Save the HTML page as a file on the hard drive.
        JFileChooser chooser = new JFileChooser();
        int retValue = chooser.showSaveDialog(this);
        if (retValue == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try {
                FileOutputStream fos = new FileOutputStream(f);
                String str = txtDoc.getText();
                fos.write(str.getBytes());
                fos.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Sorry, we\'re unable to save the file! :(");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLinkActionPerformed
        //Code for adding a link to the page once the add link button is pressed.
        //If one of the required parameters for inserting a link is blank...
        if (txtLinkDescription.getText().length() == 0 || txtLinkURL.getText().length() == 0) {
            return;
        }
        try {
            StringBuilder display = new StringBuilder(256);
            display.append("\n<h3>\n<a href=\"");
            display.append(txtLinkURL.getText());
            display.append("\" target=\"_blank\">");
            display.append(txtLinkDescription.getText());
            display.append("</a>\n</h3>");
            txtDoc.insert(display.toString(), txtDoc.getText().indexOf("</main>") - 1);
            txtLinkDescription.setText("");
            txtLinkURL.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unable to add your link! Missing the </main> tag.");
        }

//        <a href="https://www.w3schools.com/html/">Visit our HTML tutorial</a>
    }//GEN-LAST:event_btnAddLinkActionPerformed

    private void btnGenerateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateTableActionPerformed
        rows = (int) txtRows.getValue();
        cols = (int) txtCols.getValue();
        jTable1.setModel(new DefaultTableModel(rows, cols));
    }//GEN-LAST:event_btnGenerateTableActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImage;
    private javax.swing.JButton btnAddLink;
    private javax.swing.JButton btnAddTable;
    private javax.swing.JButton btnGenerateTable;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner txtCols;
    private javax.swing.JTextArea txtDoc;
    private javax.swing.JTextField txtImageCaption;
    private javax.swing.JTextField txtImageURL;
    private javax.swing.JTextField txtLinkDescription;
    private javax.swing.JTextField txtLinkURL;
    private javax.swing.JSpinner txtRows;
    // End of variables declaration//GEN-END:variables
}
