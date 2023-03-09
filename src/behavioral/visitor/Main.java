package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<IPlace> places = new ArrayList<>();

        places.add(new Zoo());
        places.add(new Cinema());
        places.add(new Circus());

        for (IPlace place : places){
            Vacation vac = new Vacation();
            place.accept(vac);
            System.out.println(vac.place);
        }
    }
}
