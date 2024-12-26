public class MInMax {
    public static void main(String[] args) {
        int [] arr= {-6,2,0,-10,1};
        int min=arr[0],max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min= arr[i];
            }
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("min "+ min +" , "+"max "+max);
    }
}
