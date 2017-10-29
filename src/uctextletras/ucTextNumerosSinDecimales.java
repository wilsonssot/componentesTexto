/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uctextletras;

import javax.swing.JTextField;

/**
 *
 * @author Wilson
 */
public class ucTextNumerosSinDecimales extends JTextField {

    private int n = 25;

    public void longitudTexto(int num) {
        n = num;
    }
    
    public int obtenerNumero(){
        String text = this.getText();
        return Integer.valueOf(text);
    }

    private void jTextFieldKeyTypedNumeros(java.awt.event.KeyEvent evt) {
        char c;
        c = evt.getKeyChar();
        int cont = 0;
        if ((c < '0' || c > '9') || this.getText().length() >= n) {
            evt.consume();
        }else{
            cont++;
            if(cont>0 && (c=='.' || c == ',')){
                evt.consume();
            }
        }
        evt.setKeyChar(Character.toUpperCase(c));

    }

    public ucTextNumerosSinDecimales() {
        this.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldKeyTypedNumeros(evt);

            }
        });
    }
}
