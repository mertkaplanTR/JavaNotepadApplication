
package texteditor;
import java.util.regex.*;
import java.awt.Color;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;


public class textEditorGui extends javax.swing.JFrame {

    String filename;
    String outputForResult;
    public textEditorGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        replaceField = new javax.swing.JTextField();
        replaceButton = new javax.swing.JButton();
        regularExpessionTextField = new javax.swing.JTextField();
        regularExpressionButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exitFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        pasteText = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));

        searchButton.setText("Find");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        replaceButton.setText("Replace");
        replaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceButtonActionPerformed(evt);
            }
        });

        regularExpessionTextField.setText("\\s[A-Za-z]{2,20}\\s");

        regularExpressionButton.setText("Regular");
        regularExpressionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularExpressionButtonActionPerformed(evt);
            }
        });

        resultTextArea.setColumns(20);
        resultTextArea.setRows(5);
        jScrollPane2.setViewportView(resultTextArea);

        jLabel1.setText("Result:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(regularExpessionTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(replaceField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(replaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(regularExpressionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replaceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replaceButton))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regularExpessionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regularExpressionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);

        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        exitFile.setText("Exit");
        exitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileActionPerformed(evt);
            }
        });
        jMenu1.add(exitFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Other");

        pasteText.setText("About");
        pasteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextActionPerformed(evt);
            }
        });
        jMenu2.add(pasteText);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        // TODO add your handling code here:
        textArea.setText("");
        setTitle(filename);
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog=new FileDialog(textEditorGui.this,"Open File",FileDialog.LOAD);
        fileDialog.setVisible(true);
        if(fileDialog.getFile()!=null)
        {
        filename=fileDialog.getDirectory()+fileDialog.getFile();
            setTitle(filename);
        }
        try{
            BufferedReader bufferReader = new BufferedReader(new FileReader(filename));
            StringBuilder stringBuilder= new StringBuilder();
            String line=null;
            while((line=bufferReader.readLine())!=null)
            {
                stringBuilder.append(line+"\n");
                textArea.setText(stringBuilder.toString());
            }
        bufferReader.close();
        
        }
        catch(IOException e){
        System.out.println("File not found!");
        }
    }//GEN-LAST:event_openFileActionPerformed

    
    ///Save ederken newline kullanmali
    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        FileDialog fileDialog=new FileDialog(textEditorGui.this,"Save File",FileDialog.SAVE);
        fileDialog.setVisible(true);
        if(fileDialog.getFile()!=null)
        {
        filename=fileDialog.getDirectory()+fileDialog.getFile();
            setTitle(filename);
        }
        try {
             FileWriter fileWriter=new FileWriter(filename);
             fileWriter.write(textArea.getText());
             setTitle(filename);
             fileWriter.close();
        } catch (IOException e) {
        }System.out.println("File Cannot Write!");
    }//GEN-LAST:event_saveFileActionPerformed

    private void exitFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitFileActionPerformed

    private void pasteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Created By Mert Kaplan - Istanbul Kultur University Notepad Project","Info",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_pasteTextActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchTextArea(textArea, searchField.getText());
         
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void replaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceButtonActionPerformed
        // TODO add your handling code here:
        String a=searchField.getText();
        String b=replaceField.getText();
        String c=textArea.getText();
        String d=c.replaceAll(a, b);
        textArea.setText(d);
        
        
    }//GEN-LAST:event_replaceButtonActionPerformed

    String alinanexpression;
    
    private void regularExpressionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularExpressionButtonActionPerformed
        // TODO add your handling code here:
        String a=regularExpessionTextField.getText();
        String b=textArea.getText();
        regexChecker(a, b);
        resultTextArea.setText(alinanexpression);
        
    }//GEN-LAST:event_regularExpressionButtonActionPerformed

        
public void getTextAlinan(String _text)
{
    alinanexpression=_text;
    
}

    
    
    public  void regexChecker(String theRegex, String str2Check){
        String a;
             Pattern checkRegex = Pattern.compile(theRegex);
             Matcher regexMatcher = checkRegex.matcher( str2Check );
            while ( regexMatcher.find() ){
	            if (regexMatcher.group().length() != 0){
//	                System.out.println( regexMatcher.group().trim() );
//	                System.out.println( "Start Index: " + regexMatcher.start());
//	                System.out.println( "Start Index: " + regexMatcher.end());
               a = regexMatcher.group().trim()+" Start Index: " + regexMatcher.start()+" Start Index: " + regexMatcher.end();
               
                 System.out.println(a);
                 getTextAlinan(a);
                    }
                    else
                        a=" ";
	        }
	        System.out.println();
                
	    }
    
    

    
  class myHighlighter extends DefaultHighlighter.DefaultHighlightPainter{
  
      public myHighlighter(Color color)
      {
          super(color);
      }
  }
  
  DefaultHighlighter.HighlightPainter highlighter=new myHighlighter(Color.yellow);
  Highlighter highlight;
  Highlighter removeHighLight;
  Highlighter.Highlight[] remove;
  
  public void removeHighLighter(JTextComponent textComp)
  {
  removeHighLight=textComp.getHighlighter();
  remove=removeHighLight.getHighlights();
  
  for(int i=0; i<remove.length; i++)
  {
     
      
      if(remove[i].getPainter() instanceof myHighlighter)
      {
          removeHighLight.removeHighlight(remove[i]);
          
      }
  }
  }
  
  
  


  
  public void searchTextArea(JTextComponent textComp, String textString)
  {
      removeHighLighter(textComp);
      try {
            highlight=textComp.getHighlighter();
            Document doc=textComp.getDocument();
            String text=doc.getText(0,doc.getLength());
            int pos=0;
            while((pos=text.toUpperCase().indexOf(textString.toUpperCase(),pos))>=0)
            {
            highlight.addHighlight(pos, pos+textString.length(), highlighter);
            pos+=textString.length();
            }
      } catch (Exception e) {
          
      }
  }
    
    
    
    
    public static void main(String args[]) {
        
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem pasteText;
    private javax.swing.JTextField regularExpessionTextField;
    private javax.swing.JButton regularExpressionButton;
    private javax.swing.JButton replaceButton;
    private javax.swing.JTextField replaceField;
    private javax.swing.JTextArea resultTextArea;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
