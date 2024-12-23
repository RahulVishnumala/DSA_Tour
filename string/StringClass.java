package string;

import javax.print.DocFlavor;

public class StringClass {
    public void meth1(){
        String str = "Java";
        StringBuffer buffer = new StringBuffer("Java");
        StringBuilder builder = new StringBuilder("Java");

        System.out.println(str);
        System.out.println(buffer);
        System.out.println(builder);

        str.concat(" is awesome");
        buffer.append(" is awesome");
        builder.append(" is awesome");

        System.out.println("\nAfter Modifications");
        System.out.println("str: "+str);
        System.out.println("buffer: "+buffer);
        System.out.println("builder: "+builder);


    }
    public static void main(String[] args) {
        StringClass obj = new StringClass();
        obj.meth1();
    }
}
