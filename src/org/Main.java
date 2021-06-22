package org;

public class Main {

    public static int div(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) sum += (number % i) == 0 ? i : 0;
        return sum;
    }

    public static void main(String[] args) {
        int a = 100000;
        int[] array = new int[a];
        for (int i = 1; i < a; i++){
            int div = div(i);
            if (div < a && array[div] == i) System.out.println(div + "--" + i + " - Дружественные числа");
            array[i] = div;
        }
    }
}