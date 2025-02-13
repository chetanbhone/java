import java.util.Arrays;

public class StringEx {
    
    public static void v1() {
        String str = "Hello all of you dear";  
        byte[] result = str.getBytes();      
        System.out.println(Arrays.toString(result)
        ); 
    }
    
    public static void main(String args[]) {
        StringEx.v1(); 
    }
}
