package kg.tima.extteds;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Almaz almaz = new Almaz();
        Almaz aika = new Aika();
        Almaz tima = new Tima();
        Almaz aya = new Aya();

        List<Almaz> baibekovy = Arrays.asList(almaz, aika, tima, aya);
        for (Almaz a : baibekovy){
            a.information(); // полиморфизм
        }


    }

}
