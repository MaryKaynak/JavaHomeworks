package Sorular51;

public class S64 {
void readCard(int cardNo) //throws Exception 
{
	System.out.println("Reading Card");
}
void checkCard(int cardNo) //throws RuntimeException
{
	System.out.println("Checking Card");
}
 public static void main (String[] args) {
	 S64 ex= new S64();
	 int cardNo= 12344;
	 ex.checkCard(cardNo);
	 ex.readCard(cardNo);
 }
}

