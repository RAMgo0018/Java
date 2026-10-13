
class Power {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int exp = b;

        System.out.println("Base value is " + a);
        System.out.println("Exponent value is " + b);

        int power = 1;
        while (b > 0) {
            power = power * a;
            b--;
        }

        System.out.println("Power of " + a + " raised to " + exp + " is " + power);
    }
}
