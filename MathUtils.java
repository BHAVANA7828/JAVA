public class MathUtils {
    int add(int a, int b) {
        return a + b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        int sum = mathUtils.add(5, 10);
        int product = MathUtils.multiply(5, 10);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}