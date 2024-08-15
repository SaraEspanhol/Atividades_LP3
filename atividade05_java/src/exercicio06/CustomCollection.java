package exercicio06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CustomCollection<T> implements Iterable<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}