/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop;

import java.util.Arrays;

/**
 *
 * @author MSA
 */
public class MyUtils {
    public static float ucgenCevre(float a, float b, float c) {
        float ret = 0;
        ret = a + b + c;
        return ret;
    }

    public static float ucgenAlan(float a, float b, float c) {
        float ret = 0;
        float s = ucgenCevre(a, b, c);
        ret = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return ret;
    }

    public static float cokgenCevre(float... kenar) {
        float ret = 0;
        for(float i:kenar)
           ret+=i;       
        return ret;
    }

    public static float cokgenAlan(float... kenar) {
        float ret = 0;
        float r=(float)((kenar[0])/(2*Math.tan(180/kenar.length*Math.PI/180)));
        ret=0.5f*(cokgenCevre(kenar)*r);
        return ret;
    }
    
    public static double[] ozelFormulHesapla(int[] arr) {
        double[] ret = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i]=(3*arr[i]*arr[i])-(2*Math.pow(Math.E,arr[i])+Math.sqrt(arr[i]));
        }
        return ret;
    }
    
    public static double[] ozelFormulHesapla_2(int[] arr) {
        double[] ret = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i]=(1/(1+Math.exp(arr[i])));
//            ret[i]=(1/(1+Math.pow(Math.E,arr[i])));
        }
        return ret;
    }
    
    public static void main(String[] args) {
        int[] a=new int[201];
        for (int i = -101; i < 100; i++) {
            a[i+101]=i+1;
        }
//        System.out.println("a="+Arrays.toString(a));
        
//        System.out.println("cevre="+ucgenCevre(1, 2, 3));
//        System.out.println("alan=" + ucgenAlan(3, 4, 5));
//        System.out.println("cokgenin cevresi=" + cokgenCevre(3, 4, 5));
//        System.out.println("cokgenin alanı=" + cokgenAlan(10,10,10,10));
        System.out.println("formül sonucu= " + Arrays.toString(ozelFormulHesapla_2(a)));
    }
}
