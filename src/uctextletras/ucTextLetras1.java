/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uctextletras;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Invitado_PC01
 */
public class ucTextLetras1 extends JTextField {
    
    public void SetTextAsString(int texto){
        String text = String.valueOf(texto);
        this.setText(text);
    }
    public int GetTextAsInteger(){
        int retorno=0;
        if(this.getText()==null){
            return 0;
        }
        else{
            retorno=Integer.valueOf(this.getText());
            return retorno;
        }
    }

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {
        this.setBorder(new LineBorder(Color.RED));
    }

    public ucTextLetras1() {
        this.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        this.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
    }
    
}
