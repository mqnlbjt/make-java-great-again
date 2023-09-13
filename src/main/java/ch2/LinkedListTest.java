package ch2;

import org.junit.Test;

public class LinkedListTest {
    @Test
    public void test(){
        List<String> list = new LinkedList<>();
        list.printLinkList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        list.addLast("1");
        list.printLinkList();
        list.addFirst("10086");

        list.remove("3");
        list.printLinkList();
    }
}
