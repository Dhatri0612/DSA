package MaxAndMin;

public class main {
    public static void main(String[] args) {
        int arr[]={4,8,2,1,7};
        int max=arr[0];
        int n= arr.length;
        for (int i = 0; i <n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max value is " + max);
        int min=arr[0];
        for (int i = 0; i <n; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("min value is " + min);
    }
}
