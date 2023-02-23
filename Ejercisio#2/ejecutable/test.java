//Ejercicio de la llamada

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
        int minutos_de_llamada;
    

        // input 
        minutos_de_llamada = Integer.parseInt(JOptionPane.showInputDialog("Digite los minutos usados en la llamada:"));




        // procesing
        if (minutos_de_llamada<3)
        {
     
           JOptionPane.showMessageDialog(null, "Total a pagar : "+300);
           
        }
        else;
            JOptionPane.showMessageDialog(null, "Total a pagar : "+ ( (minutos_de_llamada-3)*50+300));
    }
    }