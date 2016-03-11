package com.dev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by john-orr on 11/03/16.
 */
public class Josephus {

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> removeOrder = new ArrayList<>();

        Iterator<T> iterator = items.listIterator();

        while (!items.isEmpty()) {
            T t = null;
            for (int i = 0; i < k; i++) {
                if (!iterator.hasNext()) {
                    iterator = items.iterator();
                }
                t = iterator.next();
            }
            removeOrder.add(t);
            iterator.remove();
        }

        return removeOrder;
    }
}
