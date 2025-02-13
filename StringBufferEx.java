
public class StringBufferEx {

    public static void main(String args[]) {

        //Strng 1 examlpe
        StringBuffer str = new StringBuffer();
        str.append("ABC");
        str.insert(2, "helo");
        str.reverse();
        System.out.println(str);

        // string 2 example 
        StringBuffer str2 = new StringBuffer();
        System.out.println("capacity of str is " + str2.capacity());
        str2.ensureCapacity(15);
        str2.ensureCapacity(14);
        //System.out.println(str2.ensureCapacity(existingcap));

        //String ex 3
        StringBuffer str3 = new StringBuffer();
        str3.append("helo dear how are you");
        str3.deleteCharAt(0);
        System.out.println(str3);

    }
}
