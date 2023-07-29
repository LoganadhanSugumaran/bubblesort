package dhoni;

public class pen {
    String type = "gel";
    String colour ="blue";
    double point = 0.1;
    static boolean clicked = false;
    public static void click(){
        clicked = true;
    }
    public static void unclick(){
        clicked = false;

    }

}
