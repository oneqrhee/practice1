package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        int money;

        System.out.println("액수 : ");
        money = sc.nextInt();

        System.out.println("money     result");
        System.out.println(money+"     "+solution(money));
    }

    private static List solution(int price){

        List<Integer> list = new ArrayList<>(Arrays.asList(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1));
        List<Integer> answer = new ArrayList();

        int a = price%50000;
        answer.add(price/50000);

        for(int i=1; i<list.size(); i++){

            answer.add(a/list.get(i));
            a = a%list.get(i);

        }
        return answer;
    }
}
