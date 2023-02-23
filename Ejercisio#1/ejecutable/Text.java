//Hallar el mayor de tres numeros

package ejecutable;

import javax.swing.JOptionPane;

public class Text

{
    /**
     * @param args
     */
    public static void main(String[] args)
     {
        /*Declaracion
         * de 
         * Variables
         */
        int a;
        int b;
        int c;

        //input
        a= Integer.parseInt(JOptionPane.showInputDialog("Digite a: "));
        b= Integer.parseInt(JOptionPane.showInputDialog("Digite b: "));
        c= Integer.parseInt(JOptionPane.showInputDialog("Digite c: "));
       

        //processing
       
         if    (a >b ||a>c);
        {
            JOptionPane.showMessageDialog(null, "El Numero mayor es : "+a);
        }
         if (b>a||b>c);
        {    
            JOptionPane.showMessageDialog(null, "El Numero mayor es : "+ b);
        }
         if (c>a ||c>b);
        {        
            JOptionPane.showMessageDialog(null, "El Numero mayor es : "+ c);
        }    
    }


}