package com.mycitrus;


public class Main {

    public static void main(String[] args) {
        // create main class instance
        Main newClass = new Main();

        // use function to make a list of random numbers
        double[] outputList = newClass.createRandomList(20);

        // print list first time for comparison purposes
        System.out.print("Pre-sorted List: ");
        newClass.printDoubleList(outputList);

        // use function to bubble sort the list
        newClass.sortDoubleList(outputList);

        // print out the list to check the results
        System.out.println();
        System.out.print("Sorted List: ");
        newClass.printDoubleList(outputList);
    }

    // this function creates a list of n random numbers
    public double[] createRandomList(int length){
        double[] new_list = new double[length];
        for (int i = 0; i < length; i++){
            double new_number = Math.random() * 100;
            new_list[i] = (int) new_number;
        }
        return new_list;
    }

    // this function prints out our list of doubles
    public void printDoubleList(double[] inputList){
        int finalIndex = inputList.length - 1;
        int printIndex = 0;
        // modified for function makes machine output easier to read
        for(double n: inputList){
            if (printIndex != finalIndex) {
                System.out.print(n + " ,");
                printIndex++;
            } else {
                System.out.println(n + ";");
            }
        }
    }

    // this function sorts our list into numerical order via the insertion sort method
    public void sortDoubleList(double[] inputList){
        // this variable stores the list length
        int listLength = inputList.length;

        // this for loop combs through the input list
        for (int i = 1; i < listLength; i++){
            double holdValue = inputList[i]; // the current list value at "i"
            int previousIndex = i - 1;// the previous index before "i"
            while ((previousIndex > -1) && (inputList[previousIndex] > holdValue)){
                inputList[previousIndex + 1] = inputList[previousIndex];// set current index to previous index
                previousIndex--;// decrement x
            }
            inputList[previousIndex + 1] = holdValue; // assign index before "i" with hold value
        }
    }
}
