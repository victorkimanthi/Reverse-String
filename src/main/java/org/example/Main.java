package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a sentence");
            String sentence = scanner.nextLine();
            char[] charArray = sentence.toCharArray();
            StringReversal stringReversal = new StringReversal();
            stringReversal.reverseString(charArray);
            System.out.println(charArray);
        }
    }
}