package utils;

import java.util.ArrayList;

public class RoundList<E> extends ArrayList<E> {

    public E get(long index) {

        int sizeTransferred = getSizeTransferred(index);
        return super.get(sizeTransferred);
    }

    public E remove(long index) {

        int sizeTransferred = getSizeTransferred(index);
        return super.remove(sizeTransferred);
    }

    public void add(long index, E element) {

        int sizeTransferred = getSizeTransferred(index);
        super.add(sizeTransferred, element);
    }

    private int getSizeTransferred(long index) {
        if (index < 0) {
            index = index % this.size();
            if (index < 0) {
                index += this.size();
            }
        }

        return (int)(index % this.size());
    }

}
