package blocks;

public class Blocks {
    {
        System.out.println("Instance Block");

    }

    static {
        System.out.println("Static Block");

    }

    public Blocks() {
        System.out.println("This is 0-args constructor");
    }

    public Blocks(int a) {
        System.out.println("This is 1-args constructor" + a);

    }


    public static void main(String[] args) {
        new Blocks();//nameless object
        new Blocks(10);// create Instance block and constructor
    }


}
