package blocks;

public class StaticBlock {

    static  String eName;
    static  int eID;

    static {
        eName = "Raju";
        eID = 100;
        System.out.println("This is static block");
    }

    public static void main(String[] args) {
        System.out.println(eName);
        System.out.println(eID);

    }
}
