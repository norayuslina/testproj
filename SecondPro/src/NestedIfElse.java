// Nested if...else Statement
class NestedIfElse {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 =  Integer.parseInt(args[2]);
        int largestNumber;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }

        System.out.println("Number are" + n1 + "," + n2 + "," + n3);
        System.out.println("Largest number is " + largestNumber);
    }
}