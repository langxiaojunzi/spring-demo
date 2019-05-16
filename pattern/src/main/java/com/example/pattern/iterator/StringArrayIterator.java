package com.example.pattern.iterator;

/**
 * <p>create at 2019/5/16</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class StringArrayIterator implements Iterator {
    private String[] args;
    private int index;

    public StringArrayIterator(String[] argTemp) {
        this.args = argTemp;
    }

    @Override
    public boolean hasNext() {
        return index < args.length;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return args[index++];
        }
        return null;
    }

}
