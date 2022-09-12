/*
 Pedir números hasta que se teclee uno negativo y mostrar cuantos números se han introducido
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, contador = 0;
        
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        while (numero>=0){
            contador++;
            
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        
        }
        System.out.println("Has introducido "+contador+" numeros no negativos");
        
    }
    
}
