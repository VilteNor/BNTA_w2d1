import java.util.ArrayList;

public class Loops_qs {



    public static void main(String[] args) {
    // Question 1:
        // create a for loop which goes from 0 to 10
        // print each value
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

    // QUESTION 2
        // create a for loop which goes from 10 down to 0
        // print each value
        for(int i=10;i>=0;i--){
            System.out.println(i);
        }

    // QUESTION 3
        // create a for loop which goes from 0 to 20
        // print each even value
        for(int i=0;i<=20;i+=2){
            System.out.println("even numbers: "+i);
        }
        // excluding 0
        for(int i=2;i<=20;i+=2){
            System.out.println("even numbers no 0 pt1: "+i);
        }
        // excluding 0
        for(int i=0;i<=20;i+=2){
            if(i==0){
                i+=2;
            }
            System.out.println("even numbers no 0 pt2: "+i);
        }
    // QUESTION 4
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
        Integer[] emptyNumbersArray=new Integer[11]; // initializing empty array which will hold 11 items (0-10)
        ArrayList<Integer> numbers = new ArrayList<>(); // empty arraylist
        for(int i=0;i<=10;i++){
            numbers.add(i);
            emptyNumbersArray[i]=i;
            System.out.println("item in array: "+i);
        }
        System.out.println("arraylist: "+numbers);


    // QUESTION 5
        // using your answer from Question 4, create a for loop that goes through the values
        // print each value individually
        // using arraylist:
        for(int i=0;i< numbers.size();i++){
            System.out.println("listarray item: "+i);
        }


        // using array emptyNumbersArray with a classic for loop
        for(int i=0;i< emptyNumbersArray.length;i++){
            System.out.println("current i= "+i);
            System.out.println("array item: "+emptyNumbersArray[i]);
        }

        // using array 'emptyNumbersArray' with an enhanced for loop
        for (int num:emptyNumbersArray){
            System.out.println("enhanced loop: " +num);
        }




// end of code
    }
}
