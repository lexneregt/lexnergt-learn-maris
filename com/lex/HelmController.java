package com.lex;

import java.util.Locale;

public class HelmController {
    public static void main(String[] args){
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);  //指定本地sad为德国（GERMANY）
    }
}
