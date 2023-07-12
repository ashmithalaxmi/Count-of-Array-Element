import java.util.Scanner;

public class CountArrayElements {
    public static int elementCount(int n, int[] arr){
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                count++;
            }
        }
        return n-count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int count = elementCount(n, arr);
        System.out.println(count);
    }

}
