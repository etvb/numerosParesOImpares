/*
* HAcer un programa que tome dos números y digan si ambos son pares o impares.
*/
package pat.pkg22.pkg6.numerosparesoimpares;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PAT226NumerosParesOImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        short num1, num2;
        
        num1 = Short.parseShort(JOptionPane.showInputDialog("Ingresa el primer nuemro"));
        num2 = Short.parseShort(JOptionPane.showInputDialog("Ingresa el SEGUNDO numero"));
        
        if ( (num1%2) == 0  && (num2%2) == 0) {
            JOptionPane.showMessageDialog(null, "Ambos Son pares");
        }else{
            JOptionPane.showMessageDialog(null, "No son pares");
        }
    }
    
}
