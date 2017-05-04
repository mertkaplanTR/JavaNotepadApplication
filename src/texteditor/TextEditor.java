
package texteditor;

import javax.swing.JFrame;

public class TextEditor {


    public static void main(String[] args) {
      textEditorGui _edit = new textEditorGui();
      _edit.setBounds(0,0,700,700);
      _edit.setResizable(false);
      _edit.setTitle("Mert Kaplan | mertkaplanblog.wordpress.com");
       _edit.setVisible(true);
      _edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
