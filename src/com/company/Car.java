package com.company;

public class Car{

    public void func1(){
        System.out.println("Masinlar siyahisi");
    }

    public void toplama(int x, int y){
        System.out.println("Cem: "+(x+y));
    }

    public String istifadeciAdi(){
        return "Salam YENI Istifadeci";
    }

    public int vurma(int x, int y){
        int hasil = x*y;
        return hasil;
    }
}
