//Making Generic Class

class Demo1
{
    public static void main(String[] args) 
    {
        Pair<Integer,String> p=new Pair<Integer,String>(23,"Twenty-Three");
        System.out.println(p.getFirst()+" "+p.getSecond());
    }
}
class Pair<T,V>
{
    private T first;
    private V second;
    public Pair(T first,V second)
    {
        this.first=first;
        this.second=second;
    }
    public Pair(){}
    public T getFirst()
    {
        return first;
    }
    public V getSecond()
    {
        return second;
    }
}