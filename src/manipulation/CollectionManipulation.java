package manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class CollectionManipulation {
    public void replaceArrayMaxMinValue() {
        final int arrayLength = 25;
        int[] randomArray = new int[arrayLength];

        int minIndex = 0;
        int minValue = 0;

        int maxIndex = 0;
        int maxValue = 0;

        for (int index = 0; index < arrayLength; index++) {
            randomArray[index] = (int) (Math.random() * 100);

            System.out.print(randomArray[index] + "\t");

            if (minValue > randomArray[index] || index == 0) {
                minIndex = index;
                minValue = randomArray[index];
            }

            if (maxValue < randomArray[index] || index == 0) {
                maxIndex = index;
                maxValue = randomArray[index];
            }
        }

        System.out.println("\nIndex of max: " + maxIndex + "\nIndex of min: " + minIndex);

        randomArray[minIndex] = maxValue;
        randomArray[maxIndex] = minValue;

        for (int item : randomArray) {
            System.out.print(item + "\t");
        }
    }

    public void sortArray() {
        final int arrayLength = 25;
        int[] randomArray = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            randomArray[index] = (int) (Math.random() * 100);

            System.out.print(randomArray[index] + "\t");
        }

        System.out.println("\n");

        Arrays.sort(randomArray);

        for (int item : randomArray) {
            System.out.print(item + "\t");
        }
    }

    public void findMiddleArrayItem() {
        final int arrayLength = 19;

        int[] randomArray = new int[arrayLength];

        if (randomArray.length % 2 == 0) {
            System.out.println("Sorry, array should have odd length items");

            return;
        }

        for (int index = 0; index < arrayLength; index++) {
            randomArray[index] = (int) (Math.random() * 100);

            System.out.print(randomArray[index] + "\t");
        }

        Arrays.sort(randomArray);

        System.out.println("\n" + randomArray[9]);
    }

    public void calculateArrayItems() {
        final int arrayLength = 30;

        int[] randomArray = new int[arrayLength];

        int oddSum = 0;
        int noOddSum = 0;

        for (int index = 0; index < arrayLength; index++) {
            randomArray[index] = (int) (Math.random() * 100);

            System.out.print(randomArray[index] + "\t");

            if (randomArray[index] % 2 != 0) {
                noOddSum += randomArray[index];
            } else {
                oddSum += randomArray[index];
            }
        }

        System.out.println("\nNo odd: " + noOddSum + "\nOdd: " + oddSum);
    }

    public void printMatrix() {
        int[] itemOfMatrix = new int[15];

        for (int cal = 0; cal < 3; cal++) {
            for (int row = 0; row < 5; row++) {
                int itemValue = (int) (Math.random() * 10);

                System.out.print(itemValue + "\t");

                itemOfMatrix[cal * 5 + row] = itemValue;
            }

            System.out.println("\n");
        }

        System.out.println("Max item is " + this.calculateMaxItemOfMatrix(itemOfMatrix));
    }

    public void stringConcatenation() {
        String[] stringList = new String[5];

        Scanner input = new Scanner(System.in);

        for (int iteration = 0; iteration < 5; iteration++) {
            stringList[iteration] = input.nextLine();
        }

        if (stringList[3].equals(stringList[4])) {
            System.out.println(stringList[0] + stringList[1]);
        } else  {
            System.out.println(stringList[0] + stringList[2]);
        }
    }

    private int calculateMaxItemOfMatrix(int[] array) {
        int maxValue = 0;

        for (int item : array) {
            maxValue = item > maxValue ? item : maxValue;
        }

        return maxValue;
    }

}
