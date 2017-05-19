public class Main {
    public static void main(String[] args) {
        Stack2 s = new Stack2();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(3);
        System.out.println(s.min);
        s.pop();
        System.out.println(s.min);
    }
}