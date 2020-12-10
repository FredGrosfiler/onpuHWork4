package com.grosfiler;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task: ");
        int i = scanner.nextInt();

        switch (i){
            case 1: task1();
                break;
            case 2: task2();
                break;
            case 3: task3();
                break;
            case 4: task4();
                break;
            case 5: task5();
                break;
            case 6: task6();
                break;
            case 7: task7();
                break;
            case 8: task8();
                break;
            case 9: task9();
                break;
        }
    }

    private static void task1() {
        int[] sections = new int[35];
        Random random = new Random();

        for (int i = 0; i < sections.length; i++) {
            sections[i] = random.nextInt(6000 + 1);
        }

        int allBooks = 0;

        for (int section: sections) {
            allBooks += section;
        }

        if (allBooks > 99999){
            System.out.println("Number of books in the library is " + allBooks + " and is six figures");
        } else {
            System.out.println("Number of books in the library is " + allBooks + " and is less than six figures");
        }
    }

    private static void task2() {
        final int MinPoints = 600;
        int[] points = new int[10];
        Random random = new Random();

        for (int i = 0; i < points.length; i++) {
            points[i] = random.nextInt(100 + 1);
        }

        int pointSum = 0;

        for (int point: points) {
            pointSum += point;
        }

        if (pointSum > MinPoints){
            System.out.println("Athlete qualified");
        } else {
            System.out.println("Athlete did not qualify");
        }
    }

    private static void task3() {
        int[] points = new int[18];
        Random random = new Random();

        for (int i = 0; i < points.length; i++) {
            points[i] = random.nextInt(100 + 1);
        }

        int obligatoryPointSum = 0, shortPointSum = 0, freePointSum = 0;

        for (int i = 0; i < 6; i++){
            obligatoryPointSum += points[i];
        }

        for (int i = 6; i < 12; i++){
            shortPointSum += points[i];
        }

        for (int i = 12; i < 18; i++){
            freePointSum += points[i];
        }

        int highestSum = obligatoryPointSum;
        if (highestSum < shortPointSum){
            highestSum = shortPointSum;
        }
        if (highestSum < freePointSum){
            highestSum = freePointSum;
        }

        if (highestSum == obligatoryPointSum){
            System.out.println("Athletes best score is " + highestSum + " in obligatory program");
        }else if (highestSum == shortPointSum){
            System.out.println("Athletes best score is " + highestSum + " in short program");
        } else if (highestSum == freePointSum){
            System.out.println("Athletes best score is " + highestSum + " in free program");
        }
    }

    private static void task4() {
        int[] array = new int[] {2,1,2,3,5,1,2,3,4,6,5};
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] + 1 == array[i+1]){
                currentCount++;
                if (currentCount > maxCount){
                    maxCount++;
                }
            } else {
                currentCount = 1;
            }
        }
        System.out.println("The largest number of sequentially located positive numbers is " + maxCount);
    }

    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array dimension: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200 + 1);
        }

        for (int i = 0; i < array.length; i++) {
            if (checkSimple(array[i])){
                System.out.println(i+1 + ": " + array[i]);
            }
        }
    }

    private static void task6() {
        int[] array = new int[] {12, 3, 45, 6, 26, 78, 74, 33, 2, 40, 68, 99, 32};

        int maxValue = array[0];
        int minValue = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxValue > array[i]){
                maxIndex = i;
                maxValue = array[i];
            }
            if (minValue < array[i]){
                minIndex = i;
                minValue = array[i];
            }
        }

        array[maxIndex] = 0;
        array[minIndex] = 0;

        for (int number: array) {
            System.out.print(number + " ");
        }
    }

    private static void task7() {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10 + 1);
        }

        for (int number: array) {
            System.out.print(number + " ");
        }
        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    array[j] = 0;
                }
            }
        }

        for (int number: array) {
            System.out.print(number + " ");
        }
    }

    private static void task8() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("a:");
        int[] arrayA = new int[20];

        for (int i = 0; i < arrayA.length; i++) {
            if (random.nextBoolean()){
                arrayA[i] = random.nextInt(100 + 1) * -1;
            } else {
                arrayA[i] = random.nextInt(100 + 1);
            }
        }

        for (int number: arrayA) {
            System.out.print(number + " ");
        }
        System.out.println("");

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] < 0){
                arrayA[i] = 0;
            }
        }

        for (int number: arrayA) {
            System.out.print(number + " ");
        }
        System.out.println("");

        System.out.println("b:");

        int[] arrayB = new int[20];

        for (int i = 0; i < arrayB.length; i++) {
            if (random.nextBoolean()){
                arrayB[i] = random.nextInt(100 + 1) * -1;
            } else {
                arrayB[i] = random.nextInt(100 + 1);
            }
        }

        for (int number: arrayB) {
            System.out.print(number + " ");
        }
        System.out.println("");

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] > n ) {
                arrayB[i] = 0;
            }
        }

        for (int number: arrayB) {
            System.out.print(number + " ");
        }
        System.out.println("");

        System.out.println("c:");

        int[] arrayC = new int[20];

        for (int i = 0; i < arrayC.length; i++) {
            if (random.nextBoolean()){
                arrayC[i] = random.nextInt(100 + 1) * -1;
            } else {
                arrayC[i] = random.nextInt(100 + 1);
            }
        }

        for (int number: arrayC) {
            System.out.print(number + " ");
        }
        System.out.println("");

        int n1 = 0;
        int n2 = 0;
        do {
            System.out.println("Enter n1 and n2(n1<=n2):");
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
        } while (n1 > n2);

        for (int i = 0; i < arrayC.length; i++) {
            if (arrayC[i] > n1 && arrayC[i] < n2 ) {
                arrayC[i] = 0;
            }
        }

        for (int number: arrayC) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    private static void task9() {
        Random random = new Random();

        System.out.println("a:");
        int[] arrayA = new int[20];

        for (int i = 0; i < arrayA.length; i++) {
            if (random.nextBoolean()){
                arrayA[i] = random.nextInt(100 + 1) * -1;
            } else {
                arrayA[i] = random.nextInt(100 + 1);
            }
        }

        for (int number: arrayA) {
            System.out.print(number + " ");
        }
        System.out.println("");

        for (int i = 0; i < arrayA.length; i = i + 2){
            if ( arrayA[i] % 2 == 0){
                arrayA[i] = 0;
            }
        }

        for (int number: arrayA) {
            System.out.print(number + " ");
        }
        System.out.println("");

        System.out.println("b:");
        int[] arrayB = new int[20];

        for (int i = 0; i < arrayB.length; i++) {
            if (random.nextBoolean()){
                arrayB[i] = random.nextInt(100 + 1) * -1;
            } else {
                arrayB[i] = random.nextInt(100 + 1);
            }
        }

        for (int number: arrayB) {
            System.out.print(number + " ");
        }
        System.out.println("");

        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] % 3 == 0 || arrayB[i] % 5 == 0){
                arrayB[i] = 0;
            }
        }

        for (int number: arrayB) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
    
}
