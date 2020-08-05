package tester;


import hr.*;
import  hr.senior.*;
import  inv.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      hr.Policy  hob = new hr.Policy();
      hob.showPolicy();

      inv.Policy  hob1 = new inv.Policy();
      hob1.showPolicy();
      
//      inv.Policy  iob = new inv.Policy();
  //    iob.showPolicy();
      
      
      SrPolicy  sob  = new SrPolicy();
      sob.showSrPolicy();
	}

}
