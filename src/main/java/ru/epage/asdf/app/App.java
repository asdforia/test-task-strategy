package ru.epage.asdf.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fiveth");
        list.add("sixth");
        list.add("seventh");

        Collections.shuffle(list);

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(list.get((int)(Math.random() * list.size())));
        System.out.println(list.get((int)(Math.random() * list.size())));
        System.out.println(list.get((int)(Math.random() * list.size())));

    }
}
