package exercicio06;


public class Interface_ex6 {
    public static void main(String[] args) {
        CustomCollection<Object> collection = new CustomCollection<Object>();
        collection.add("Item 1");
        collection.add("Item 2");
        collection.add("Item 3");

        for (Object item : collection) {
            System.out.println(item);
        }
    }
}

