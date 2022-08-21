// *******   extra practice with arrays  *******

public class loops_arrays_extra {

    public static void main(String[] args) {

        Integer[] numArray_2=new Integer[6]; // initializing empty array which will hold 6 items (0,2,4,6,8,10)
        // but from 0 to 10, therefore need to consider 11 items

        for(int i=0;i<numArray_2.length;i++){
            numArray_2[i]=i*2;
        }
        for (int num:numArray_2) {
            System.out.println("enhanced loop_2: " + num);
        }
// using array numArray_2 with a classic for loop
        for(int i=0;i< numArray_2.length;i++){  // int i=numArray_2[0] = here passing the actual value '0' in this case.
            // but need to start from the index '0', instead.
            System.out.println("current i= "+i);
            System.out.println("array item: "+numArray_2[i]);
        }
//        end of code
    }
}
