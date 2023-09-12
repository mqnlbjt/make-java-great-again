package ch1;

import java.util.Arrays;

public class arrayList<E> implements List<E>{

    private static final int DEFAULT_CAPACITY = 10;
    //初始容量 设置为10

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    //空元素

    transient Object[] elementData;
    //缓存存放数据

    private int size;

    public arrayList(){
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }


    @Override
    public boolean add(E e) {
        int minCapacity = size + 1;
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }

        if (minCapacity - elementData.length > 0) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity - minCapacity < 0) {
                newCapacity = minCapacity;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
        elementData[size++] = e;
        return true;
    }

    @Override
    public E remove(int index) {
        E oldValue = (E) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            // 从原始数组的某个位置，拷贝到目标对象的某个位置开始后n个元素
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null; // clear to let GC do its work
        return oldValue;
    }

    @Override
    public E get(int index) {
        return (E)elementData[index];
    }

    @Override
    public String toString() {
        return "arrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }


}
