/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package water;
import java.util.Scanner;
        
/**
 *
 * @author besad0473
 */
public class Water {

 Scanner keyedInput = new Scanner (System.in);
 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double C;
        final double WATER = 1.5;
        double WC;
          Scanner keyedInput = new Scanner (System.in);
        System.out.println("How many moniters and computers");
           C = keyedInput.nextInt();
           WC = WATER + C;
           
        System.out.println( WC + " tons of water will be use" );
           
        // TODO code application logic here
    }
    
}
