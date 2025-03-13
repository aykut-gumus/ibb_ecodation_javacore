package com.aykutgumus._1_part_javatypes;

public class _05_Operators {

    public static void main(String[] args) {
        // operator
        // +, -, *, /
        // %
        // ++
        // --
        int number1=23, number2=7;
        int addition = number1+number2;
        int substraction = number1-number2;
        int multiplication = number1*number2;
        int division = number1/number2;
        int modules = number1%number2;

        System.out.println("Toplam: "+addition);
        System.out.println("Çıkarma: "+substraction);
        System.out.println("Çarpma: "+multiplication);
        System.out.println("Bölme: "+division);
        System.out.println("Kalan: "+modules);

        // Mantıksal Operators: &&=VE ||=VEYA !=değil
        // ++ 1 artır  -- 1 azalt
    }
}
