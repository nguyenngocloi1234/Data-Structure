package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> sets = new TreeSet<>();
        sets.add("Loi");
        sets.add("Lan");
        sets.add(null);
        for(String s:sets)
            System.out.println(s);
    }
}
