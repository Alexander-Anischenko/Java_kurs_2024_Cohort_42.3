package lesson42.homeWork42.todoapp.dao;

import lesson42.homeWork42.todoapp.model.Task;

public interface ToDoList {
    //abstract methods
    boolean addTask(Task task);//add Task
    Task removeTask(int taskNumber);
    Task findTask(int id, int taskNumber);
    Task editeTask(int taskNumber, String task);
    void viewTasks();
    int quantity();



    
}
