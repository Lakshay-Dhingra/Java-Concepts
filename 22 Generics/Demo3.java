//Bound Generic Types
interface MyPrint
{
    public void print();
}
class MyInteger implements MyPrint
{
    private int x;
    MyInteger(int i)
    {
        x=i;
    }
    MyInteger()
    {
        x=0;
    }
    public void set(int i)
    {
        x=i;
    }
    public void print()
    {
        System.out.print(x);
    }
} 
class Demo3
{
    public static<T extends MyPrint> void printArray(T[] arr)
    {
        for(T x:arr)
        {
            x.print();
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        MyInteger[] arr=new MyInteger[10];
        //error if I use int instead of Integer
        for(int i=0;i<10;i++)
        {
            try
            {
                arr[i]=new MyInteger(i+1);
                // System.out.println(arr[i]);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        printArray(arr);
    }
}