package lesson35.homeWork33_34.todoapp.dao;

import lesson35.homeWork33_34.todoapp.model.Task;
import lesson37.homeWork37.archive.model.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToDoListImpl implements ToDoList{

    private List<Task> tasks;




    // constructor
    public ToDoListImpl(int capacity){
        tasks = new ArrayList<>(capacity);  // Используем ArrayList с начальной емкостью
    }


    @Override
    public boolean addTask(Task task) {
        if (task == null || task.getTask().isEmpty() || findTask(task.getId(), task.getTaskNumber()) != null) {
            return false;
        }
        tasks.add(task);
        return true;
    }

    @Override
    public Task removeTask(int taskNumber) {
        for (int i = 0; i < tasks.size(); i++) {
           if (tasks.get(i).getTaskNumber() == taskNumber) {
               Task removed = tasks.remove(i);
               for (int j = 0; j < tasks.size(); j++) {
                   tasks.get(j).setTaskNumber(j);
               }
               Collections.sort(tasks);
               return removed;
           }
        }
        return null;
    }

    @Override
    public Task findTask(int id, int taskNumber) {
        Task pattern = new Task(id, taskNumber, null, null);//pattern образец
        for (Task t : tasks) {
            if (pattern.equals(t)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public Task editeTask(int taskNumber, String task) {
        return null;
    }

    @Override
    public void viewTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }
        System.out.println("You have " + tasks.size() + " tasks.");
    }

    @Override
    public int quantity() {
        return tasks.size();
    }
}
