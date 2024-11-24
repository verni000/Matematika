/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args){
        MatematikaCanggih call = new MatematikaCanggih();
        call.pertambahan(7, 8);
        System.out.println("pertambahan 7 + 8 =" + call.mat);
        call.perkalian(2, 5);
        System.out.println("perkalian 2 * 5 =" + call.mat);
        call.modulus(10, 3);
        System.out.println("modulus 10 % 3 =" + call.mat);
         }
}
