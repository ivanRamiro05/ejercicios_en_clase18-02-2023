//Ejercicio formula cuadratica

package ejecutable;

import javax.swing.JOptionPane;

public class test {
    
    public static void main(String[] args)
    {
        /*
         * declaracion
         * de
         * variables
         */

    

        // input 
        a =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a en la formula cuadratica"));

        b =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite b en la formula cuadratica"));

        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite c en la formula cuadratica"));

    

        // procesing

        
            JOptionPane.showMessageDialog(null, "primer resultado "+ ((-b+(b-4*a*c)^(1/2))/2*a) );
            JOptionPane.showMessageDialog(null, "segundo resultado "+ ((-b-(b-4*a*c)^(1/2))/2*a) );

        
    }
    }