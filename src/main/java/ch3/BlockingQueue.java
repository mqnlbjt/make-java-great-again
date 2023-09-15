package ch3;

public interface BlockingQueue<E> extends Queue<E>{

    boolean add(E e);

    boolean offer(E e);

}
