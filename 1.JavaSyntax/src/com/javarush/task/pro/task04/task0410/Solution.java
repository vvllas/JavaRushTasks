package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        int mn = Integer.MAX_VALUE;
        int mn2 = Integer.MAX_VALUE;
        while (s.hasNextInt()) {
            int x = s.nextInt();
            // В этом первом условии выбираем минимальное число из всех возможных.
            // Если новое считанное значение x меньше текущего mn, мы меняем mn на него.
            if (x < mn) {
                mn2 = mn;
                mn = x;
            }
            // Если первое условие не выполнилось (x < mn), то это означает,
            // что значение x больше либо равно mn (x >= mn).
            // Таким образом этот x может подойти на роль второго минимального.
            // Но нас на самом деле не интересуют значения x == mn из условия (x >= mn).
            // Это потому что повторяющиеся значения из введенных данных нас не интересуют.
            // Поэтому мы пишем (x > mn).
            else if (x > mn){
                // Среди всех чисел, которые попали сюда нас интересует минимальное. Оно и будет вторым.
                if (x < mn2)
                    mn2 = x;
            }
        }

        System.out.println(mn + " " + mn2);
    }
}