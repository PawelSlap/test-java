/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elobec;
 import java.util.Scanner;
 import java.util.Random;
/**
 *
 * @author Paweł
 */
public class EloBec {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int liczba = random.nextInt(100) +1;
        
        Scanner scanner = new Scanner(System.in);
        boolean liczbaOdg = false;
        
        while(!liczbaOdg)
        {
            System.out.println("Podaj Liczbe");
            int dane = scanner.nextInt();
            
            if (dane < liczba )
            {
                System.out.println(" za mało");
                
            }else if(dane > liczba )
            {
                System.out.println("Za duzo");
            }else {
                System.out.println("zgadles");
                break;
            }
            
        }
    }

}
