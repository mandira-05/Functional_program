public class Quadratic {
    public static void main(String[] args) {
        int a=4;
        int b=7;
        int c=2;
        float root1 = (float) ((-b + Math.sqrt((b*b-4*a*c)))/(2*a));
        float root2 = (float) ((-b - Math.sqrt((b*b-4*a*c)))/(2*a));
        System.out.println("Answer for root 1 is " +root1);
        System.out.println("Answer for root 2 is " +root2);
    }
}
