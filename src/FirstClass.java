public class FirstClass {
    //Data type
    int a = 1;
    short b = 10;
    long c = 10l;

    double aDouble = 10.0;
    float aFloat = 10.0f;
    boolean aBoolean;
    char aChar;

    String value;
    FirstClass firstClass;
    String name;


    public static void main(String[] args) {
        System.out.println("Hello world");
        FirstClass firstClass = new FirstClass();
        firstClass.a += firstClass.b;
        System.out.println(firstClass.a);
        firstClass.name ="Ronaldinho";
        firstClass.showName();
    }

    public void showName() {
        System.out.println("Brasil 1-----> " + name);
        name = "Neymar";
        System.out.println("Brasil 2-----> " + name);

    }
}
