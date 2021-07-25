//Insertion sort algorithm implementation.
//Time complexity is O(n^2)
public class Insertionsort {
    public static void swap(int[] arr, int i,int j)
    {
        if(i==j)
            return;
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void show(int[] arr){
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {20,35,-15,7,55,1,-22};
        for(int firstunsortedindex = 1; firstunsortedindex<arr.length;firstunsortedindex++)
        {
            int i;
            int newElement = arr[firstunsortedindex]; //This is the first unsorted  element.
            for(i = firstunsortedindex;i>0 && arr[i-1]>newElement;i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
        show(arr);

    }
}
