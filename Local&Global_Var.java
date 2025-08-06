public class GlobalAndLocalVariables {
    // Global variables
    int instanceVar = 100;          // Instance variable
    static int staticVar = 200;     // Static variable

    public void show() {
        int localVar = 50;          // Local variable
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
        GlobalAndLocalVariables obj = new GlobalAndLocalVariables();
        obj.show();
    }
}
