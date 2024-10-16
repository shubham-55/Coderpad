package gs.coderpad.NewProject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(4, 5),
                Arrays.asList(6, 1),
                Arrays.asList(4, 5),
                Arrays.asList(6, 1)
        );
        removeDuplicate(list);
    }
    public static void removeDuplicate(List<List<Integer>> list){
        Set<List<Integer>> set= new HashSet<>();
        for(List<Integer> l: list){
            set.add(l);
        }
        System.out.println(set);
    }
}
