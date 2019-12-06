/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudang;

import static gudang.Gudang.gudangArr;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author sugi
 */
public class Sorting extends Gudang{
    Scanner getdata=new Scanner(System.in);
    public Sorting(int kdBrg, String nmBrg, double stokBrg, double hargaBrg) {
        super(kdBrg, nmBrg, stokBrg, hargaBrg);
    }
    public void Ascending(){
//        gudangArr.add(new Gudang(0,nmBrg,stokBrg,hargaBrg));
        
        System.out.println("Sorted by Nama"); 
        NameSorter nama = new NameSorter();
        Collections.sort(gudangArr, nama);
        for (Gudang x: gudangArr)
            System.out.println(x.getNmBrg()   + " " + 
                               x.getStokBrg() + " " + 
                               x.getHargaBrg());
        	
        
        System.out.println("\nSorted by Stok"); 
        StokSorter stok = new StokSorter(); 
        Collections.sort(gudangArr, stok); 
        for (Gudang x: gudangArr) 
            System.out.println(x.getStokBrg() + " " + 
                               x.getNmBrg()   + " " + 
                               x.getHargaBrg());    
        
        
        System.out.println("\nSorted by Harga"); 
        HargaSorter harga = new HargaSorter(); 
        Collections.sort(gudangArr, harga); 
        for (Gudang x: gudangArr) 
            System.out.println(x.getHargaBrg() + " " + 
                               x.getNmBrg()    + " " + 
                               x.getStokBrg());
           
    
    }
    public void Descending(){
        System.out.println("Sorted Descending Nama: ");
        Collections.sort(gudangArr, Collections.reverseOrder(new NameSorter()));
        for (Gudang x : gudangArr) 
            System.out.println(x.getNmBrg()   + " " + 
                               x.getStokBrg() + " " + 
                               x.getHargaBrg());
        
        
        System.out.println("\nSorted Descending Stok: ");
        Collections.sort(gudangArr, Collections.reverseOrder(new StokSorter()));
        for (Gudang x: gudangArr) 
            System.out.println(x.getStokBrg() + " " + 
                               x.getNmBrg()   + " " + 
                               x.getHargaBrg());
 
        
        System.out.println("\nSorted Descending Harga: ");
        Collections.sort(gudangArr, Collections.reverseOrder(new HargaSorter()));
        for (Gudang x: gudangArr) 
            System.out.println(x.getHargaBrg() + " " + 
                               x.getNmBrg()    + " " + 
                               x.getStokBrg());
    }
    public void Searching(){
        
        System.out.print("\nMasukkan nama yang dicari : ");
        nmBrg=(scan.next());
        for(Gudang x: gudangArr){
            if(nmBrg.equals(x.getNmBrg())){
                System.out.println("Nama Barang :"+x.getNmBrg());
                System.out.println("Stok Barang :"+x.getStokBrg());
                System.out.println("Harga Barang:"+x.getHargaBrg()); 
            }
        }
    }
}
class NameSorter implements Comparator<Gudang> 
{
    public int compare(Gudang o1, Gudang o2) 
    {
        return o1.getNmBrg().compareTo(o2.getNmBrg());
        
    }
}
class StokSorter implements Comparator<Gudang> 
{
    public int compare(Gudang o1, Gudang o2) 
    { 
        if (o1.getStokBrg() < o2.getStokBrg()) return -1; 
        if (o1.getStokBrg() > o2.getStokBrg()) return 1; 
        else return 0; 
    }
}
class HargaSorter implements Comparator<Gudang> 
{
    public int compare(Gudang o1, Gudang o2) 
    { 
        if (o1.getHargaBrg() < o2.getHargaBrg()) return -1; 
        if (o1.getHargaBrg() > o2.getHargaBrg()) return 1; 
        else return 0; 
    } 
}
