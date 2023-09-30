// Напишите класс "IntList", который содержит в себе расширяющийся массив целых чисел
// Определите над ним операции:
// - void add(int) - добавить элемент в список
// - void remove(int) - удалить элемент из списка по индексу
// - boolean find(int) - ищет данное число в в списке, возвращает false, если не находит
// - int size() - сколько сейчас элементов в списке

public class IntList {

    private static final int INITIAL_CAPACITY = 4;

    private int capacity = INITIAL_CAPACITY;
    private int size;
    private int[] elements = new int[capacity];

    public void add(int number) {
        if (size + 1 >= capacity) {
            resize();
        }
        elements[size] = number;
        size++;
    }

    private void resize() {
        int[] newElements = new int[capacity * 2];
        capacity *= 2;
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public void remove(int idx) {
        assert idx >= 0 && idx < size;

        for (int i = idx + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
    }

    public boolean find(int number) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

}