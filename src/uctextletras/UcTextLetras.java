/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uctextletras;

import javax.swing.JTextField;

/**
 *
 * @author Invitado_PC01
 */
public class UcTextLetras extends JTextField {

    private int n = 25;
    
    private boolean soloLetras;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public void tipoDatoYLongitud(int num,boolean soloLetrasDatos) {
        soloLetras = soloLetrasDatos;
        n = num;
    }

    private void jTextFieldKeyTypedLetras(java.awt.event.KeyEvent evt) {
        char c;
        c = evt.getKeyChar();
        if (!(c < '0' || c > '9') || this.getText().length() >= n) {
            evt.consume();
        }
        evt.setKeyChar(Character.toUpperCase(c));

    }
    
    private void jTextFieldKeyTypedNumeros(java.awt.event.KeyEvent evt) {
        char c;
        c = evt.getKeyChar();
        if ((c < '0' || c > '9') || this.getText().length() >= n) {
            evt.consume();
        }
        evt.setKeyChar(Character.toUpperCase(c));

    }

    public UcTextLetras() {
        this.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                if(soloLetras){
                    jTextFieldKeyTypedLetras(evt);
                }else{
                    jTextFieldKeyTypedNumeros(evt);
                }
            }
        });
    }
}
