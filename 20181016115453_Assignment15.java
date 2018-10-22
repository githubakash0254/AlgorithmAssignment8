/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment15;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 1794147
 */
public class Assignment15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers?");
        int val=scan.nextInt();
        for(int i=0;i<val;i++)
        {
            
            Random randomObj=new Random();
            int j=randomObj.nextInt(1000);
            if(j%2==0){
                System.out.println(j+" is even");
            }
            else{
                System.out.println(j+" is odd");
            }
        }
    }
    
}
