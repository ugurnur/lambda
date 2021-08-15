package lambdacourse;

import java.util.ArrayList;
import java.util.List;

public class FuncitonalPrgrammin03 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        printUppercase1 (l);
        System.out.println();
        printUppercase2 (l);
    }
    //1) Create a method to print all list elements in uppercase
    //1.Way :
    public static void printUppercase1 ( List<String> l){

              l.stream().
                map(String::toUpperCase).
                forEach(Utils::printInTheSameLineWithASpace);
    }
    //2.Way :
    public static void printUppercase2 ( List<String> l){
        l.replaceAll(String::toUpperCase);
        System.out.println(l);

    }
}
