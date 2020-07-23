class Cse implements dept{
  int i;
  public void count()
  {  int i;
  	System.out.println("Number of CSE students "+i);
  }
}
 class It implements dept{
	  int i;
	  public void count()
	  {  int i;
	  	System.out.println("Number of IT students "+i);
	  }
	}
 
//Dry Principle
//single responsibility
public class sec {
public static boolean checkdept(String a) {
	if(a.equals("cse")||a.equals("eee")||a.equals("ece")||a.equals("etm")||a.equals("it"))
		return true;
	else 
		return false;
	
}
}
