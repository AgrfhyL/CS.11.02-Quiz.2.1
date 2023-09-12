public class Main {
    public static void main(String[] args) {
        int resultOne = add(1,1);
        System.out.println(resultOne);
        String resultTwo = greeting("Andy");
        System.out.println(resultTwo);
        int resultThree = add(1,1,1,1);
        System.out.println(resultThree);
        String toBePrinted = printMe("Hi");
        System.out.println(toBePrinted);
    }
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static String greeting(String name){
        return "\"" + "Bonjour, " + name + "!" + "\"";
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        return add(numOne, add(numTwo, add(numThree, numFour)));
    }
    public static String printMe(String toBePrinted){
        return toBePrinted;
    }
}
