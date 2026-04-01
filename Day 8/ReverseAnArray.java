//Program to print the reverse of an array.
public class ReverseAnArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        System.out.println("The reverse array : ");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
