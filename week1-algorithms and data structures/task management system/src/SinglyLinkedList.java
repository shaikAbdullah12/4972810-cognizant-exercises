public class SinglyLinkedList {
    private class Node {
        Task task;
        Node next;
        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }
    private Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }
    // Method to traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println("Task ID: " + current.task.getTaskId() +
                    ", Task Name: " + current.task.getTaskName() +
                    ", Status: " + current.task.getStatus());
            current = current.next;
        }
    }
    // Method to delete a task by taskId
    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Task not found.");
        }
    }
}
