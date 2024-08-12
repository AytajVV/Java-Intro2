/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author aytaj.veyisli
 */
public class Arrays {
    public static void main(String[] args) {
        boolean b = PolindromCheck("Java");
        System.out.println("b= "+b);
                
    }
    
    
    public static void teksiralimassiv(){
        int[] arr = new int[5];
     //   int[] arr = {1,3,5,4,2,7,8};
       // int elem = arr[3];
        //System.out.println(elem);
       // arr[0]=20;
       // arr[1]=25;
       // arr[2]=55;
        
        System.out.println("eded daxil edilme");
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(i+"ededi daxil edin");
            arr[i]= sc.nextInt();
        }
        
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"."+arr[i]);
        }
    }
    
    
    
    public static void coxsiralimassiv(){
        int[][] arr = new int[2][4];
       // System.out.println(arr.length);
        
     //   int[] arr = {1,3,5,4,2,7,8};
       // int elem = arr[3];
        //System.out.println(elem);
       // arr[0]=20;
       // arr[1]=25;
       // arr[2]=55;
        
        System.out.println("Add array elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                
                Scanner sc = new Scanner(System.in);
                System.out.println(j+". ");
                arr[i][j]= sc.nextInt();
            }
            
        }
        
        
        System.out.println("Print array elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i+", "+arr[i][j]);
            }
        }
    }
    
    public static boolean PolindromCheck(String str){
        
        
        
        
        for (int i = 0; i < str.length(); i++) {
            char sol = str.charAt(i);
            char sag = str.charAt(str.length()-1-i);
            System.out.println("========================");
            System.out.println("sol= "+sol);
            System.out.println("sag= "+sag);
            
            if (sol!=sag) {
                return false;
            }
            
        }
        System.out.println("finished");
        return true;
    }
}
