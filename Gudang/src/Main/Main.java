/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import gudang.Gudang;
import gudang.Sorting;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author sugi
 */
public class Main {
    static ArrayList<Gudang> gudangArr = new ArrayList<>();
    public static void main(String[]args){
        int menu=0,pil;
        Scanner scan = new Scanner(System.in);
        Gudang x = new Gudang(1,"",0,0);
        Sorting sort = new Sorting(1,"",0,0);
    while(menu!=5){
        System.out.println("Menu");
        System.out.print("1.Input\n2.View\n3.Sorting\n4.Searching\n5.Exit\n : ");
        menu = scan.nextInt();
        if(menu==1){
            
            x.tambahData();
        }
        else if(menu==2){
            
            x.tampilData();
        }
        else if(menu==3){
            
            System.out.println("1.Sort Ascending");
            System.out.println("2.Sort Descending");
            System.out.print("\nPilih : ");
            pil=scan.nextInt();
            if(pil==1)
                sort.Ascending();
            else if(pil==2)
                sort.Descending();
        }
        else if(menu==4){
            sort.Searching();
        }
            
        else if(menu==5){
            System.out.println("Keluar");
        }
        else System.out.println("Salah");
            System.out.println();                 
        }
    }
}
   
