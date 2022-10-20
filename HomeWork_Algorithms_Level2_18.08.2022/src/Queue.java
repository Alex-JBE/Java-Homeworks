package telran;

public class Queue {

    private Stack stack1;   // ��������, ��� �������� ������
    private Stack stack2;   // ���������������, ��� ��������

    public Queue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void add(int item) {
        stack1.push(item);
    }

    public int delete() {
        // ������������� ��� �������� �� stack1 � stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        // �� ������� stack2 ��������� ��� �������, ������� ��� �����
        // ��������� ���� ������� � ���������
        int result = stack2.pop();
        // ������������� �������� ������� � stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

}

