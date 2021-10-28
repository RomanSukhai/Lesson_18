package homework_01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Main  {
    public static void main(String[] args) {
        List<Integer > integer = new ArrayList<>();
        integer.add(3);
        integer.add(2);
        //Created new List in order to add all values there
        List<String> strings = new ArrayList<>();
        for (Integer s : integer)strings.add(s.toString());
        for (String e : strings)System.out.println(e+" <-----"+e.getClass());


    }
}
