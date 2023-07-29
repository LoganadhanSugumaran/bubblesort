import java.util.*;

class box{
    int length;
    int breadth;
    int height;
    int volume(){
        return length*breadth*height;
    }
}

public class methods {
    public static void main(String[] args) {
        box blackBox = new box();
        blackBox.length=10;
        blackBox.breadth=12;
        blackBox.height=7;
        System.out.println("blackbox volume is: "+ blackBox.volume());

        box woodenBox = new box();
        woodenBox.length=33;
        woodenBox.breadth=23;
        woodenBox.height=12;
        System.out.println("woodenbox volume is: "+ woodenBox.volume());
    }





}
