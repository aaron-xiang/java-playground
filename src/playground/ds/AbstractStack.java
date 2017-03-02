package playground.ds;

/**
 * Created by henry on 3/1/17.
 */
public interface AbstractStack<E> {
    void push(E input);

    E peek();

    E pop();

    int size();
}
