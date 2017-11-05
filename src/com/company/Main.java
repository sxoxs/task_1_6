package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
	    String[] strArray = new String[5];

        System.out.println("Введите 5 строк: ");
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = inConsole();
        }
        Arrays.sort(strArray);
        System.out.println("\nСортированный массив строк: ");
        for (String i : strArray) {
            System.out.println(i);
        }
    }

    static String inConsole() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
