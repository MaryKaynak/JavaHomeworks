package aaOcaDeneme1;
class CD{
	int r;
	CD(int r){
		this.r=r;
	}
}
class DVD extends CD{
	int c;
	DVD(int r, int c){
		super(r);
		this.c=c;		
	}
}
public class Q109 {

	public static void main(String[] args) {
		
DVD dvd=new DVD(10, 20);
System.out.println(dvd.r+":"+ dvd.c);
	}

}
