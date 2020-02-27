public class Main {
    public static void main(String[] args) {

        Context c1 = new Context(new Bin());
        System.out.println(c1.executeStrategy(503));

        Context c2 = new Context(new Bin());
        System.out.println(c2.executeStrategy(102));

        Context c3 = new Context(new Bin());
        System.out.println(c3.executeStrategy(13));

    }
}
