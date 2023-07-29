package dhoni;


import java.util.LinkedList;
import java.util.Queue;

public class BBQ {
    public static void main(String[] args) {
        Queue<String> bbqLine = new LinkedList<String>();
        bbqLine.add("logu");
        bbqLine.add("raju");
        bbqLine.add("sam");

        System.out.println(bbqLine.poll());
        System.out.println(bbqLine);
    }

}
