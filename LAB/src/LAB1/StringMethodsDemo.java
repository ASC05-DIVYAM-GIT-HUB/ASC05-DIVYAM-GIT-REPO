package LAB1;

public class StringMethodsDemo {

    public static void main(String[] args) {

        String str1 = "  Hello Java World  ";
        String str2 = "hello java world";

        System.out.println("charAt(6): " + str1.charAt(6));
        System.out.println("contains(\"Java\"): " + str1.contains("Java"));
        System.out.println("length(): " + str1.length());
        System.out.println("indexOf('J'): " + str1.indexOf('J'));
        System.out.println("equals(str2): " + str1.equals(str2));
        System.out.println("equalsIgnoreCase(str2): " + str1.trim().equalsIgnoreCase(str2));
        String joined = String.join(" - ", "Java", "Python", "C++");
        System.out.println("join(): " + joined);
        System.out.println("lastIndexOf('o'): " + str1.lastIndexOf('o'));
        System.out.println("substring(2, 7): " + str1.substring(2, 7));
        System.out.println("toLowerCase(): " + str1.toLowerCase());
        System.out.println("toUpperCase(): " + str1.toUpperCase());
        System.out.println("trim(): [" + str1.trim() + "]");
    }
}
