package aaOcaDeneme1;

public class Q49 {
    String myStr="7007";
    public void doStuff(String str){
        int myNum=0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }catch(NumberFormatException ne){
            System.out.println("Eror");
        }
        System.out.println("myStr: "+myStr+" myNum: "+myNum);
    }

    public static void main(String[] args) {
    Q49 obj= new Q49();
    obj.doStuff("9009");
    }
}
