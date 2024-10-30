package RemoveSpecificNo;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};
        int ridx=arr[2];
        int n= arr.length;
        for(int i=0;i< n;i++) {
            if(ridx== arr[i]){
                for(int j=i;j< n-1;j++){
                    arr[j]=arr[j+1];
                }
                n--;
            }
        }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
