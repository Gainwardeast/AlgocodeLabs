package com.example.testapp

class Scratch {
    public static void main(String[] args) {

        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        doSomething(node1);
    }

    /**
     * Дана голова односвязного списка head,
     * нужно его развернуть,
     * не создавая новый список, и вернуть результат.
     * <p>
     * Пример 1:
     * Ввод: head = [1,2,3,4,5]
     * Вывод: [5,4,3,2,1]
     * Пример 2:
     * Ввод: head = [1,2,3]
     * Вывод: [3,2,1]
     * <p>
     * Пример 3:
     * Ввод: head = [1]
     * Вывод: [1]
     * Ограничения:
     * <p>
     * len(head) >= 0
     */

    static void doSomething(Node node) {
        Node head = swapNodes(node);

//        Node currentNode = node;
//        while (currentNode != null) {
//            System.out.println(currentNode.getValue());
//            currentNode = currentNode.getNext();
//        }

        System.out.println("finish");
    }

    static Node swapNodes(Node headNode) {

        // 1 2 3 4 5
        // 2 1 3 4 5
        // 3 2 1 4 5
        // 4 3 2 1 5
        // 5 4 3 2 1

        Node previousBrick = null;
        Node currentBrick = headNode;
        while (currentBrick != null){
            Node nextBrick = currentBrick.getNext();
            currentBrick.setNext(previousBrick);
            previousBrick = currentBrick;
            currentBrick = nextBrick;
        }

        return previousBrick;
    }

    static class Node {

        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}