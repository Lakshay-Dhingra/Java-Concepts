//Making Generic Methods

class Demo2
{
    public static<T> void printArray(T[] arr)
    {
        for(T x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Integer arr[]=new Integer[10];
        //error if I use int instead of Integer
        for(int i=0;i<10;i++)
        {
            arr[i]=i+1;
        }
        printArray(arr);
    }
}