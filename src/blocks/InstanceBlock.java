package blocks;

//used for information most probably not used in automation
public class InstanceBlock {
    String eName;

    {
        //instance block
        System.out.println("Instance block");
        eName = "Prime";
    }

    public InstanceBlock() {
        System.out.println("This is a constructor");

    }

    void display(){
        System.out.println(eName);
    }
    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        obj.display();
    }

}
