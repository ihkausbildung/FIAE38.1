package factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListFactory {


    public static List<String> create(String typ) {

        if (typ.equalsIgnoreCase("a")) {
            return new ArrayList<>();
        } else if (typ.equalsIgnoreCase("v")) {
            return new Vector<>();
        }

        return null;
    }

}
