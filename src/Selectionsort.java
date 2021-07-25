//Selection sort algorithm
public class Selectionsort {
    public static void show(int[] arr){
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr, int i,int j)
    {
        if(i==j)
            return;
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int arr[] = {20,35,-15,7,55,1,-22};

        for(int lastUnsortedindex = arr.length - 1;0<lastUnsortedindex;lastUnsortedindex--)
        {
            int large = 0;
            for(int i = 1;i<=lastUnsortedindex;i++)
            {


                if(arr[i]>arr[large])
                    large = i;

            }
            swap(arr,large,lastUnsortedindex);
            show(arr);
            System.out.println();

        }
        show(arr);

    }
}
