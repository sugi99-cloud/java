/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudang;

import java.util.ArrayList;
import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author sugi
 */
public class Gudang implements Comparable<Gudang> {

    String nmBrg;
    double stokBrg;
    double hargaBrg;
    int pil;
    int kdBrg;
    static ArrayList<Gudang> gudangArr = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Gudang(int kdBrg, String nmBrg, double stokBrg, double hargaBrg) {
        this.kdBrg = kdBrg;
        this.nmBrg = nmBrg;
        this.stokBrg = stokBrg;
        this.hargaBrg = hargaBrg;
    }

    public String getNmBrg() {
        return nmBrg;
    }

    public double getStokBrg() {
        return stokBrg;
    }

    public void setKdBrg(int kdBrg) {
        this.kdBrg = kdBrg;
    }

    public double getHargaBrg() {
        return hargaBrg;
    }
    public int getKdBrg() {
        return kdBrg;
    }
    
    public int compareTo(Gudang o) {
        return this.kdBrg - o.kdBrg;
    }

    public void tambahData(){
       
        System.out.println("Kode Barang       : "+String.valueOf(gudangArr.size()+1));
        setKdBrg(gudangArr.size()+1);
       try{
        System.out.print("Masukan Nama Barang  : ");
        nmBrg=(scan.next());
        System.out.print("Masukan Stok Barang  : ");
        stokBrg=(scan.nextDouble());
        System.out.print("Masukan Harga Barang : ");
        hargaBrg=(scan.nextDouble());
       }catch(InputMismatchException ime){
           System.err.print("Inputan Tidak Sesuai Tipe Data");
       }
        gudangArr.add(new Gudang(0,nmBrg,stokBrg,hargaBrg));

    }  
    public void tampilData(){
        System.out.println("Data Barang Sebelum Diurutkan");
        System.out.println("======================================");
        System.out.println("            Data Barang               ");
        System.out.println("======================================");
      for(int i=0; i<gudangArr.size(); i++){
            System.out.println("Nama Barang  : "+gudangArr.get(i).getNmBrg());
            System.out.println("Stok Barang  : "+gudangArr.get(i).getStokBrg());      
            System.out.println("Harga Barang : "+gudangArr.get(i).getHargaBrg());
            System.out.println("======================================");
        }
    }
    
}