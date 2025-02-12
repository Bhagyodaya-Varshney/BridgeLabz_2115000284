class TaskScheduler {
    public static void main(String[] args) {
        Task task = null;

        task = Task.addTaskAtBeginning(101001, "Physics", 4, "25-02-2025", task);
        task = Task.addTaskAtBeginning(102000, "Chemistry", 2, "22-02-2025", task);
        task = Task.addTaskAtBeginning(103010, "Math", 1, "11-02-2025", task);
        task = Task.addTaskAtEnd(101002, "Biology", 3, "01-02-2025", task);

        task.displayTasks();

        task = Task.removeTask(102000, task);
        task.displayTasks();

        task.searchTaskByPriority(1);

        task.viewCurrentTask();
        task.moveToNextTask();
        task.viewCurrentTask();
    }
}

class Task {
    int TaskID, Priority;
    String TaskName, DueDate;
    Task next;
    static Task currentTask;

    Task(int TaskID, String TaskName, int Priority, String DueDate) {
        this.TaskID = TaskID;
        this.TaskName = TaskName;
        this.Priority = Priority;
        this.DueDate = DueDate;
        this.next = this;
        if (currentTask == null)
            currentTask = this;
    }

    public static Task addTaskAtBeginning(int TaskID, String TaskName, int Priority, String DueDate, Task head) {
        Task newTask = new Task(TaskID, TaskName, Priority, DueDate);
        if (head == null)
            return newTask;

        Task temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newTask;
        newTask.next = head;
        return newTask;
    }

    public static Task addTaskAtEnd(int TaskID, String TaskName, int Priority, String DueDate, Task head) {
        Task newTask = new Task(TaskID, TaskName, Priority, DueDate);
        if (head == null)
            return newTask;

        Task temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newTask;
        newTask.next = head;
        return head;
    }

    public static Task removeTask(int TaskID, Task head) {
        if (head == null)
            return null;

        Task temp = head, prev = null;

        if (head.TaskID == TaskID) {
            Task last = head;
            while (last.next != head)
                last = last.next;

            if (head.next == head)
                return null;

            last.next = head.next;
            return head.next;
        }

        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head && temp.TaskID != TaskID);

        if (temp == head)
            return head;

        prev.next = temp.next;
        return head;
    }
	
    public void searchTaskByPriority(int priority) {
        Task temp = this;
        boolean found = false;
        do {
            if (temp.Priority == priority) {
                System.out.println("Task Id: " + temp.TaskID);
                System.out.println("Task Name: " + temp.TaskName);
                System.out.println("Task Priority: " + temp.Priority);
                System.out.println("Due Date: " + temp.DueDate);
                System.out.println();
                found = true;
            }
            temp = temp.next;
        } while (temp != this);

        if (!found)
            System.out.println("No tasks found with priority " + priority);
    }

    public void displayTasks() {
        System.out.println("Task List:");
		Task temp = this;
		do { 
			System.out.println("Task Id: " + temp.TaskID);
			System.out.println("Task Name: " + temp.TaskName);
			System.out.println("Task Priority: " + temp.Priority);
			System.out.println("Due Date: " + temp.DueDate);
			System.out.println();
			temp = temp.next;
		} while (temp != this);
    }

    public void viewCurrentTask() {
        if (currentTask == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current Task:");
        System.out.println("Task Id: " + currentTask.TaskID);
        System.out.println("Task Name: " + currentTask.TaskName);
        System.out.println("Task Priority: " + currentTask.Priority);
        System.out.println("Due Date: " + currentTask.DueDate);
        System.out.println();
    }

    public void moveToNextTask() {
        if (currentTask != null)
            currentTask = currentTask.next;
    }
}
