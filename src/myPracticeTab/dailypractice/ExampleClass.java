package myPracticeTab.dailypractice;
//STATIC VARIABLE
    public class ExampleClass {
        // Static variable 'count' to keep track of the number of instances created.
        private static int count = 0;

        // Instance variable
        private String name;

        public ExampleClass(String name) {
            this.name = name;
            count++; // Increment the count whenever a new instance is created.
        }

        public String getName() {
            return name;
        }

        public static int getCount() {
            return count;
        }

    public static void main(String[] args) {
        ExampleClass obj1 = new ExampleClass("Object 1");
        ExampleClass obj2 = new ExampleClass("Object 2");
        ExampleClass obj3 = new ExampleClass("Object 3");

        System.out.println("Name of obj1: " + obj1.getName());
        System.out.println("Name of obj2: " + obj2.getName());
        System.out.println("Name of obj3: " + obj3.getName());

        System.out.println("Number of instances created: " + ExampleClass.getCount());
    }

}



