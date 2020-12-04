package test.tap_then;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Them {
    public static void main(String[] args) {
        persion luong,lam;
        luong= new persion();
        lam = new persion();
        System.out.println(luong.toString()+" "+lam.toString());



         }

     static class persion{
        private String name;
         private String id;
         private float cnm;

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public String getId() {
             return id;
         }

         public void setId(String id) {
             this.id = id;
         }

         public float getCnm() {
             return cnm;
         }

         public void setCnm(float cnm) {
             this.cnm = cnm;
         }


     }
}






