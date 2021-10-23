package bubblesort;

public class BubbleSortDemo {
    public static void main(String[] args) {
        bubblesort.BubbleArray bubbleArray = new BubbleArray(6);
        bubbleArray.fill();
        System.out.print("Array before sorting: ");
        bubbleArray.show();
        bubbleArray.bubbleSorter();
        System.out.print("Array after sorting: ");
        bubbleArray.show();
    }
}
