package aaJavaOcaPrep.Chapter3;

public class StringBuild2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same=sb.append("+end");
        System.out.println(same);

        StringBuilder a=new StringBuilder("abc");
        StringBuilder b= a.append("de");
        b=b.append("f").append("g");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
