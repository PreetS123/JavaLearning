package QuestionOnArray;

import java.util.ArrayList;

public class ReverseAnArray {
    public static void main(String[] args) {
        int [] arr={1,9,0,4,-3};
        int n= arr.length;
        ArrayList<Integer> rev= new ArrayList<>();
        for(int i=n-1; i>=0; i--){
//            revArr[i]= arr[n-1]
            rev.add(arr[i]);
        }
        System.out.println(rev);
    }
}
