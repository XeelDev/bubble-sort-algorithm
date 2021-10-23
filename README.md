
# Bubble sort algorithm

## Description
This project provides a pretty simple and detailed explanation of Bubble sort algorithm. 

So, if you were looking for information on this topic, but other sources did not give you a complete understanding, then I hope this project will help you.

## Getting Started

### Package description

* An implementation of the algorithm is given in the file [BubbleArray.java](https://github.com/AlexCodePlace/bubble-sort-algorithm/blob/master/src/bubblesort/BubbleArray.java) 
* Мethod "bubbleSorter" performs sorting of the array by the Bubble sort algorithm. The detailed explanation of this method realization is given below. 
* A demonstration of the algorithm work is given in the file [BubbleSortDemo.java](https://github.com/AlexCodePlace/bubble-sort-algorithm/blob/master/src/bubblesort/BubbleSortDemo.java)

### Key ideas
Here is the key ideas of the method bubbleSorter realization according to the example below. Look at the illustrations and read the explanation.

* In the example on the pictures we have array with 6 elements {15, 8, 23, 16, 42, 4}.

* Algorithm makes iterations in **outer loop** and **inner loop**. For each iteration in **outer loop** the algorithm iterates from the first element to the last **in inner loop**. The last element is bounded by the **__“__array out border__”__**,  that moved by **outer loop** after its each iteration. 

* At the beginning, in **inner loop** algorithm iterates for 5 times comparing each element with the next element and swapping them if the next element is less.

* After each iteration in **outer loop**, at least one element moves at the end, where it should be.

* Therefore, step by step each element comes on its place.

!['BubbleSortImg1](https://user-images.githubusercontent.com/81437286/138553286-54fc415d-97eb-41ee-89e1-aabf6494acaa.PNG)

!['BubbleSortImg2](https://user-images.githubusercontent.com/81437286/138553138-18a12427-0f34-4041-a0c7-1c97407767a6.PNG)

!['BubbleSortImg3](https://user-images.githubusercontent.com/81437286/138553181-f3b34ff8-0182-4562-9e4b-6bc1d56a39b3.PNG)

## Author

[AlexCodePlace](https://github.com/AlexCodePlace)
