package raman.Oops.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(23);
        list2.add(78);
        list2.add(55);

        System.out.println(list2);

    }

}
