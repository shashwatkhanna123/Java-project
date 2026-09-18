import java.util.*;
public class InputUtil {
    private static final Scanner sc=new Scanner(System.in);
    public static int readInt(String msg){while(true){try{System.out.print(msg);return Integer.parseInt(sc.nextLine());}catch(Exception e){System.out.println("Enter a valid number.");}}}
    public static String readString(String msg){System.out.print(msg);return sc.nextLine();}
}
