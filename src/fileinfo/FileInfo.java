/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinfo;

/**
 *
 * @author daaariaspa
 */
import java.io.*;
import java.util.*;

public class FileInfo {

    
    public static void listar(File x){
        if(x.isDirectory()){
            String lista[]= x.list();
            for(String nombre:lista){
                System.out.println(nombre);
                File y = new File(x.getName()+ "/" + nombre);
                if(y.isDirectory()){
                    listar(y);
                }
            }
        }
    }
    
    public static void CountWords(File x)throws FileNotFoundException{
       
        Scanner input = new Scanner(new File (x.getName()));
        int count = 0;
        while (input.hasNext()){
            String word = input.next();
            count++;
            System.out.println(word);
        }
        System.out.println("total words " + count);
    }
    
    public static void LeerEnteros(File x)throws FileNotFoundException{
       
        Scanner input = new Scanner(new File (x.getName()));
        int count = 0;
        while (input.hasNext()){
            String word = input.next();
            count++;
            System.out.println(word);
        }
        System.out.println("total words " + count);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File ("hamlet.txt");
        File s= new File ("x/jg");
        File x = new File("x");
        /**System.out.println("Exists returns " + s.exists());
        System.out.println("caRead returns " + s.canRead());
        System.out.println("length returns " + s.length());
        System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
        System.out.println("isDirectory returns " + x.isDirectory());
        System.out.println("list returns " + x.list());

        listar(x);*/
        try{
            CountWords(f);
        }catch(FileNotFoundException g){
            System.out.println("No");
        }
       
        
    }
    
}
