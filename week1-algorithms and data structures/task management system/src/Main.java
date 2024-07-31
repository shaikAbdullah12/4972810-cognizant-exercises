//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();
        taskList.addTask(new Task("T001", "Design database", "In Progress"));
        taskList.addTask(new Task("T002", "Develop API", "Not Started"));
        taskList.addTask(new Task("T003", "Test application", "Completed"));
        taskList.addTask(new Task("T004", "Deploy to production", "Not Started"));
        System.out.println("All tasks:");
        taskList.traverseTasks();
        System.out.println("\nSearching for task T002:");
        Task task = taskList.searchTask("T002");
        if (task != null) {
            System.out.println("Found: Task ID: " + task.getTaskId() +
                    ", Task Name: " + task.getTaskName() +
                    ", Status: " + task.getStatus());
        } else {
            System.out.println("Task not found.");
        }
        System.out.println("\nDeleting task T003:");
        taskList.deleteTask("T003");

        System.out.println("\nAll tasks after deletion:");
        taskList.traverseTasks();
    }
}