import java.sql.Array;
import java.util.ArrayList;

public class ProductOfMaxSubArray {
    public static void main(String[] args) {
        int [] arr = {-1,2,-6,4,8,0};
        int max=0;
        for(int i=0; i<arr.length; i++){
           for(int j=i; j<arr.length; j++){
               int prod=1;
               for(int k=i; k<j; k++){
                   prod=prod*arr[k];
               }
//               System.out.println(prod);
               if(prod>max){
                   max=prod;
               }
           }
        }
        System.out.println(max);
    }
}
