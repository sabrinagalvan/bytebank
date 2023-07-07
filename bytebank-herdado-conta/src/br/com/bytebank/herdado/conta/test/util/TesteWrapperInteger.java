package br.com.bytebank.herdado.conta.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {
        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); //Autoboxing
        System.out.println(idadeRef.doubleValue()); //Unboxing
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        int valor = idadeRef.intValue(); //Unboxing
        String s = args[0];//"10"
        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing
    }
}