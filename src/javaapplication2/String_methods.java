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
public class String_methods {

    /**
     * @param args the command line arguments
     */
    //test
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Metni daxil edin:");
        String str = sc.nextLine();
        
        
        int i = str.length();
        System.out.println("Length: "+i);
        
        char ch = str.charAt(3);
        System.out.println("charAt: "+ch);
        
        String sub = str.substring(1, 3);
        System.out.println("substring: "+sub);
        
        boolean boo = str.contains("lan");
        System.out.println("contains 'lan'; "+boo);
        
        boolean boa = str.equals("Java Language");
        System.out.println("equals:"+boa);
        
        boolean ig = str.equalsIgnoreCase("java LanGuaGe");
        System.out.println("equals ignore case: "+ig);
        
        boolean baa = str.isEmpty();
        System.out.println("is empty: "+baa);
        
        boolean le = str.startsWith("Ja");
        System.out.println("starts with Ja: "+le);
        
        boolean end = str.endsWith("ge");
        System.out.println("ends with 'ge': "+end);
        
        String trim = str.trim();
        System.out.println("trim: "+trim);
        
        String lower = str.toLowerCase();
        System.out.println("to lower case: "+lower);
        
        String upper = str.toUpperCase();
        System.out.println("to upper case: "+upper);
        
        int index = str.indexOf("Lan");
        System.out.println("index of Lan: "+index);
        
        int last = str.lastIndexOf("a");
        System.out.println("last index of: "+last);
        
        String replace = str.replace("Java", "JAVA");
        System.out.println("replace: "+ replace);
    }
    
}
