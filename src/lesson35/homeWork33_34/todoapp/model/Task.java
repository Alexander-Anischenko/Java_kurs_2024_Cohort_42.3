package lesson35.homeWork33_34.todoapp.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task> {

    // fields
    private int id;
    private int taskNumber;
    private String task;
    private LocalDateTime creationTime;

    // constructor


    public Task(int id, int taskNumber, String task, LocalDateTime creationTime) {
        this.id = id;
        this.taskNumber = taskNumber;
        this.task = task;
        this.creationTime = creationTime;
    }

    public int getId() {
        return id;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public String getTask() {
        return task;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskNumber=" + taskNumber +
                ", task='" + task + '\'' +
                ", creationTime=" + creationTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return id == task.id && taskNumber == task.taskNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskNumber);
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(taskNumber, o.taskNumber);
    }
}
