package ch1;

import org.junit.Test;

public class arrayListTest {
    @Test
    public void test(){
        arrayList<String> stringarrayList = new arrayList<>();
        stringarrayList.add("1");
        stringarrayList.add("2");
        stringarrayList.add("3");
        stringarrayList.add("4");
        stringarrayList.add("5");
        stringarrayList.add("6");
        stringarrayList.add("7");
        stringarrayList.add("8");
        stringarrayList.add("9");
        stringarrayList.add("10");
        stringarrayList.add("11");
        stringarrayList.add("12");
        stringarrayList.add("13");
        stringarrayList.add("14");
        stringarrayList.add("15");
        stringarrayList.add("16");
        stringarrayList.add("17");
        stringarrayList.add("18");

        stringarrayList.remove(1);
        stringarrayList.remove(1);
        stringarrayList.remove(1);

        String res = stringarrayList.get(1);
        System.out.println(res);
    }
}
