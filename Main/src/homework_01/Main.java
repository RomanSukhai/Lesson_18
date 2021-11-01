package homework_01;

import homework_02.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main  {        /* Versoin #1*/




    //We can created new method in which We can contain List and then We will be adding new values in him
    static void addlist(List s ){
        s.add("wew");
        s.add("werrwqw");
        s.add("wecka");
    }

    public static void main(String[] args) {
        List integer = new ArrayList<Integer>();
        addlist(integer);
        System.out.println(integer);
/* Version #2
            //If we are use library for JDK class Arrays else we can add values from List<Integer> change them to List<String>
 */
        System.out.println();
        List<String> strings = Arrays.asList(integer.toString().replaceAll("\\[(.*)\\]", "$1").split(", "));
        for(String s : strings)System.out.println("{"+s+"} Class: "+s.getClass());





    }
}
