package org.example;

public class Calc {
    public int summ(int a, int b){
        int result;
        result = a + b;
   System.out.println("Сумма"  + a  + "и"  +  b  + "равно"  + result);
   return result;
    }
    public int subtract(int a, int b) {
        int result;
        result = a - b;
        System.out.println("Вычитание" + a + "и" + b + "равно" + result);
        return result;
    }
}