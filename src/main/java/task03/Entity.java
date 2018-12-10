package task03;

public class Entity {
    @Secured(mandatory = 10)
    private void printEntityFullInfo() {
        System.out.println("EntityFullInfo");
    }

    @Secured(mandatory = 20, optional = "noStrict")
    public void printValues(int one, String two) {
        System.out.println(one + " " + two);;
    }

    @Deprecated
    static int returnValue(int number) {
        return number;
    }
}
