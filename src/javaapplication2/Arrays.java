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
        int[] arr = {1,3,5,4,2,7,8};
        int elem = arr[3];
        //System.out.println(elem);
        arr[0]=20;
        arr[1]=25;
        arr[2]=55;
        
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
}
