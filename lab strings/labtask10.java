public class labtask10 {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(str.length() - 2));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(0, str.length() - 2));
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        for (int i = str.length() - 1; i >= 0; i -= 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println(str.length());
    }
}
