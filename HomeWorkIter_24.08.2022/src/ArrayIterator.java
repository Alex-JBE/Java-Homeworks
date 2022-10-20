import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private T[] array;     // ������, �� �������� ���� ��������
    private int index = 0;  // ������� ��������� ���������

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if (index < array.length) {
            return array[index++];

        } else {
            System.out.println("No such element!");
            return null;
        }
    }

    @Override
    public void remove() {
        // ����������� ���� ������ �������� �� �������
        int i = index - 1;
        array[i] = null;
    }
}
