import java.net.PasswordAuthentication;

public class S34 {

	public static void main(String[] args) {
		String names[]= {"Thomas", "Peters", "Joseph"};
		String pwd[]= new String[3];
		int idx=0;
		try{
		 for(String n:names) {
			 pwd[idx]= n.substring(2, 6);
			 //System.out.println(pwd[idx]);
			 idx++; }
		  }
		 catch( Exception e) {
			 System.out.println("Invalid name");
		 }
		
		for (String p: pwd) {
			System.out.println(p);
		}
		
		
	}

}
