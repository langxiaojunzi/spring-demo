package com.example.pattern.iterator;

/**
 * <p>create at 2019/5/16</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class NameRepository implements Container {
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }

      // 匿名内部类提取出公共方法 StringArrayIterator
//    private class NameIterator implements Iterator {
//        int index;
//
//        @Override
//        public boolean hasNext() {
//            return index < names.length;
//        }
//
//        @Override
//        public Object next() {
//            if (this.hasNext()) {
//                return names[index++];
//            }
//            return null;
//        }
//    }
}
