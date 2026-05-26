public class ArrayLargest {
    public static void main(String args[]) {
        int arr[] = {10, 20, 40, 80, 50};
        int largest = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.print("Largest Element: "+largest);
    }
}