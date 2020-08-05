package Mymath.Myrand;
import java.util.Random;
class RandGen
{
	
    private int rand_int = RandObj.rand.nextInt(10000);
    public String toString()
	{
		return rand_int+" ";
	}
	public int getRand()
	{
		return rand_int;
	}
}

class RandObj
{
	public static final Random rand = new Random();
}