package lesson42.homeWork42.todoapp.dao;

import lesson42.homeWork42.todoapp.model.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToDoListImpl implements ToDoList {

    private List<Task> tasks;




    // constructor
    public ToDoListImpl(int capacity){
        tasks = new ArrayList<>(capacity);  // Используем ArrayList с начальной емкостью
    }


    @Override
    public boolean addTask(Task task) {
        if (task == null || task.getTask().isEmpty() || tasks.contains(task)) {
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
        for (Task task : tasks) {
            if (pattern.equals(task)) {
                return task;
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
