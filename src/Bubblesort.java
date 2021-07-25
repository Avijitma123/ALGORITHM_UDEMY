//Bubble sort implementation

public class Bubblesort {
    //Swap method takes three parameter and perform a swap operation.
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
        for(int lastUnsortedindex = arr.length - 1;0<lastUnsortedindex;lastUnsortedindex--)
        {
            for(int i =0;i<lastUnsortedindex;i++)
                if(arr[i]>arr[i+1])
                    swap(arr,i,i+1);
                    show(arr);
                    System.out.println();

        }

    }
}
