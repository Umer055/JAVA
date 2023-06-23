
public class lab1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 20;
        boolean q = !(x > 10);
        System.out.println("!(x > 10) statement is "+q);
        boolean w = x<=5 || y<15;
        System.out.println("x<=5 || y<15 statement is "+w);
        boolean t = (x != 5 ) && (y != z);
        System.out.println("(x != 5 ) && (y != z) statement is "+t);
        boolean u = x <= z || (x + y >= z);
        System.out.println("x <= z || (x + y >= z) statement is "+u);
        boolean o = (x <=y - 2) && (y >= z) || (z -2 != 20);
        System.out.println("(x <=y - 2) && (y >= z) || (z -2 != 20) statement is "+o);



    }
}
