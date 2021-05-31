//public class Main {
//    public static void main(String[] args) {
//        Game g = new Game();
//        g.run();
//    }
//}


import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        String s = "Use 1";
//        ArrayList <String> l = new ArrayList();
        s = "UP" + "\n" +
            "DOWN" + "\n" +
            "LEFT" + "\n" +
            "RIGHT" + "\n";

        for (int i=0; i < s.split("\n").length; i++){
            System.out.println(s.split("\n")[i]);
        };
    };
}