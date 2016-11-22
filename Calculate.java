public class Calculate{
    public static void main(String[] args) {
        System.out.println("Calculate ...");

        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int sum = first + second;
        int mul = first * second;
        int dif = first - second;
        double div = first/second;
        System.out.println("sum = " + sum);
        System.out.println("mul = " + mul);
        System.out.println("dif = " + dif);
        System.out.println("div = " + div);
    }
}