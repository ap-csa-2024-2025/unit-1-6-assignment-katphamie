public class Problem2
{
    public static void main(String[] args)
    {
        double one = 32.6382;
        double two = 64.3241;
        System.out.println("Two original numbers:");
        System.out.println(one);
        System.out.println(two);
        int roundone = (int) (one + 0.5);
        int roundtwo = (int) (two + 0.5);
        System.out.println("Answer: " + roundone + " + " + roundtwo + " = " + (roundone + roundtwo));
    }
}
