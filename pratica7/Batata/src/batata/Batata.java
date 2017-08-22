/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batata;


import java.util.Scanner;
import java.util.ArrayList;


public class Batata {
    

    /*private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];*/
    
    public static void main(String[] args) {
        
        /*System.out.println("Digite 10 inteiros:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Digite 12 inteiros:");
        getInput();
        printArray(baseData);*/
        
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista2 = new ArrayList<String>();
        
        lista.add("bata");
        lista.add("batata");
        lista.add("batatata");
        printList(lista);
        
        lista.set(1, "batatatata");
        printList(lista);
        
        lista.remove(1);
        printList(lista);
        
        lista2.add("ovo");
        lista2.add("ovovo");
        lista2.add("ovovovo");
        lista2.addAll(lista);
        printList(lista2);
        
        System.out.println(lista2.indexOf("ovovo"));
             
    }
    
    public static void printList(ArrayList<String> arrayLista){
        System.out.println("---------------------");
        for(int i = 0 ; i < arrayLista.size() ; i++){
            System.out.println(arrayLista.get(i));
        }
        System.out.println("---------------------\n");
    }
    
    
    
    /*private static void getInput()
    {
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    private static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void resizeArray()
    {
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }*/
    
}
