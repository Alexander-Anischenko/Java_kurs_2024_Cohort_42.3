package lesson42.homeWork42.todoapp.tests;

import lesson42.homeWork42.todoapp.dao.ToDoList;
import lesson42.homeWork42.todoapp.dao.ToDoListImpl;
import lesson42.homeWork42.todoapp.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class ToDoListImplTest {
    ToDoList toDoList;
    List<Task> t;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        toDoList = new ToDoListImpl(7);
        t = new ArrayList<>();

        t.add(new Task(1, 1, "7:00 to go to work", now.minusDays(2)));
        t.add(new Task(2, 2, "15:00 to go to the shop", now.minusDays(3)));
        t.add(new Task(3, 3, "16:00 to go to day care to pick up the baby", now.minusDays(5)));
        t.add(new Task(4, 4, "17:00 dinner", now.minusDays(7)));
        t.add(new Task(5, 5, "18:00 free time", now.minusDays(7)));
        t.add(new Task(6, 6, "21:00 bedtime", now.minusDays(7)));

        //put tasks into toDoList
        for (Task task : t) {
            toDoList.addTask(task);
        }
    }

    @Test
    void addTask() {
    }

    @Test
    void removeTask() {
    }

    @Test
    void editeTask() {
    }

    @Test
    void viewTasks() {
    }

    @Test
    void quantity() {
    }
}