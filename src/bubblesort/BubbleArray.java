package bubblesort;

import java.util.Arrays;

public class BubbleArray {
    private final long[] array;

    // The constructor
    public BubbleArray(int arraySize){
        array = new long[arraySize];
    }

    /*
    The method for Bubble sorting.
    The detail explanation of this method provided in README file on
     */
    public void bubbleSorter(){
        for (int arrayOutBorder = array.length - 1; arrayOutBorder >= 1; arrayOutBorder--){ // Outer loop
            for (int arrayElement = 0; arrayElement < arrayOutBorder; arrayElement++){  // Inner loop
                if(array[arrayElement] > array[arrayElement + 1]){ // "If" statement
                    swap(arrayElement,arrayElement+1); // Swap method usage
                }
            }
        }
    }

    // The method to fill the array with random numbers (int) in the range 1..100
    // You can use it if you don't want to fill the array by your own
    public void fill(){
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 100) + 1);
        }
    }

    // The method to show the array
    public void show(){
        System.out.println(Arrays.toString(array));
    }

    // The method to swap two income elements
    private void swap(int first, int second){
        long variable = array[first];
        array[first] = array[second];
        array[second] = variable;
    }


    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

