package lesson47.classWork47.write_read_file;
//create a few objects

import javax.imageio.IIOException;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class SafeEmployeeToFile {
    public static void main(String[] args) {

        Adderss adderss1 = new Adderss("Wassen", "27211", "Kaiser-str.", 12, 2);
        Adderss adderss2 = new Adderss("Wassen", "27215", "Karl-Marks-str.", 12, 2);

        Employee e1 = new Employee(1, "Peter", "Fogel", 32, 2900, adderss1);
        Employee e2 = new Employee(2, "Michael", "Fischer",35 , 3100, adderss2);

        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);

        File destDir = new File("./dest");
        if (!destDir.exists()){
            destDir.mkdir();
        }

        // Новый объектна базе ObjectOutputStream
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./dest/employee.dat"))) {
            oos.writeObject(employees);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
