package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] strArray = new String[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 строк: ");
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = br.readLine();
        }

        Comparator<String> stringLengthComparator = new StringLengthSort();
        Arrays.sort(strArray, stringLengthComparator);

        System.out.println("\nСортированный массив строк: ");
        for (String line : strArray) {
            System.out.println(line);
        }
    }
}
