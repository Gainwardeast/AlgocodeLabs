package com.example.testapp.algos_and_data_structure;

class Scratch2 {
    public static void main(String[] args) {
        // nums1 = [-3,2,2,5,8,19,31],
        // nums2 = [1,2,2,2,6,19,52]4
        // "a",":","-",")","b",":","-",")",")",")","c"
        // List<Character> before = Arrays.asList('a', ':', '-', ')', 'b', ':', '-', ')', ')', ')', 'c');
        // 1,2,3,4,5

        Node head4 = new Node();
        head4.setValue(5);

        Node head3 = new Node();
        head3.setValue(4);
        head3.setNextNode(head4);

        Node head2 = new Node();
        head2.setValue(3);
        head2.setNextNode(head3);

        Node head1 = new Node();
        head1.setValue(2);
        head1.setNextNode(head2);

        Node head0 = new Node();
        head0.setValue(1);
        head0.setNextNode(head1);


        doSomething(head0);
    }

    /*
        Дана голова односвязного списка head,
        нужно его развернуть,
        не создавая новый список, и вернуть результат.

        Пример 1:
        Ввод: head = [1,2,3,4,5]
        Вывод: [5,4,3,2,1]
        Пример 2:
        Ввод: head = [1,2,3]
        Вывод: [3,2,1]
    * */

    private static void doSomething(Node head) {

        Node current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.nextNode;
        }
    }

    static class Node {
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getPrevNode() {
            return prevNode;
        }

        public void setPrevNode(Node prevNode) {
            this.prevNode = prevNode;
        }

        int value;
        Node nextNode;
        Node prevNode;
    }
}