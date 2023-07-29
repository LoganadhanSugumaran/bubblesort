package dhoni;

public class Shirt {

        public static String colour;
        public static char size;

        public static void putOn() {
            System.out.println("shirt is on");

        }
        public static void takeOff(){

            System.out.println("shirt is off");
        }
        public static void setColour(String newColour){

            colour = newColour;
            System.out.println(colour);
        }
        public static void setSize(char newSize){

            size=newSize;
            System.out.println(size);
        }
    }


