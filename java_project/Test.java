import java.util.Properties;

class Test{
    public static void printSystemProperties(){
        System.out.println("Printing system properties");
        Properties prop = System.getProperties();
        System.out.println(prop);
    }

    public static void main(String[] args) {
        System.out.println("Java program strated...");
        printSystemProperties();
    }
}