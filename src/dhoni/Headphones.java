package dhoni;

public class Headphones {
    String charge = "micro usb";
    String[] controls ={"power","volume","skip","play/pause"};
    String colour ="black and red";
    static boolean power = false;
    static int volume =0;


    public static void powerOn(){
        power = true;

    }
    public static void  powerOff(){
        power = false;


    }
    public static boolean volumeUp(){
        volume++;
        return false;
    }
    public static  boolean volumeDown(){
        volume--;
        return false;
    }

}
