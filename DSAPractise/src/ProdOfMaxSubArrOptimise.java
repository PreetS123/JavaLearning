public class ProdOfMaxSubArrOptimise {
    public static void main(String[] args) {
        int [] arr= {-1,2,-6,4,8,0,-9,0,5,17,56};
        int prefix=1;
        int suffix=1;
        int prod=1;
        int n= arr.length;
        for(int i=0; i<arr.length; i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix=prefix*arr[i];
            suffix= suffix* arr[n-1-i];
            if(prefix>prod){
                prod=prefix;
            }
            if(suffix>prod){
                prod= suffix;
            }
        }
        System.out.println(prod);
    }
}
