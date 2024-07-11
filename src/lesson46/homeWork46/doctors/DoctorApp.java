package lesson46.homeWork46.doctors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DoctorApp {
    public static void main(String[] args) {

        List<Doctor> doctors = getDoctors();

        System.out.println("<======================== Specialties are most popular among doctors ========================>");
        printMostPopularSpecs(doctors);

        System.out.println("<========================  What specialties each doctor has ========================>");
        printMostSkilledDoctors(doctors);

    }

    private static void printMostSkilledDoctors(List<Doctor> doctors) {
        // считаем количество специальностей у каждого доктора count the number of specialties each doctor has
        Map<Integer, List<Doctor>> skilledDoctors = doctors.stream()
                .collect(Collectors.groupingBy(d -> d.getSpecialties().length));

        // устанавливаем максимальное количество специальностей у каждого доктора set the maximum number of specialties for each doctor
        Integer max = skilledDoctors.keySet().stream()
                .max(Integer::compareTo).orElse(0);

        // max присваиваем 0
        max = 0;
        // проводим по циклу всех докторов, выводя в int key цифру количества их специальностей loop through all doctors, outputting in int key the number of their specialties
        for (Doctor doctor : doctors) {
            int key = doctor.getSpecialties().length;
            // в случае увеличения цифры key заносим её в max (тернарный оператор) if key is incremented, we put it into max (ternary operator)
            max = key > max? key: max;
            // если такого значения ещё не было создаем новый ArrayList if such a value has not existed yet, create a new ArrayList
            skilledDoctors.putIfAbsent(key, new ArrayList<>());
            // получаем список докторов с текущим количеством специальностей get the list of doctors with the current number of specialties
            List<Doctor> doctorList = skilledDoctors.get(key);
            // добавляем текущего доктора в соответствующий список add the current doctor to the appropriate list
            doctorList.add(doctor);
        }
        // печатаем карту докторов, сгруппированных по количеству их специальностей print a map of doctors grouped by the number of their specialties
        System.out.println(skilledDoctors);
    }

    private static void printMostPopularSpecs(List<Doctor> doctors) {
        System.out.println("<======================== Print all specialties ========================>");
        // Собираем все специальности в перебираемый список Collecting all specialties into a searchable list
        Iterable<String> specialties = doctors.stream()
                // из потока докторов выделяем поток массива специальностей select the specialty array stream from the doctor stream
                .map(d -> d.getSpecialties())
                // из потока массива специальностей выравниваем в строковый поток специальностей align from the specialties array stream to the specialties string stream
                .flatMap(s -> Arrays.stream(s))
                // терминальная операция получения из строкового потока специальностей список специальностей
                // terminal operation to get a list of specialties from the specialties string stream
                .collect(Collectors.toList());

        System.out.println("<======================== List of specialties ========================>");
        // Создаем поток из перебираемого списка Create a thread from the list to be searched
        StreamSupport.stream(specialties.spliterator(), false)
                // удаляем дубликаты из потока, для создания потока уникальных специальностей remove duplicates from the stream to create a stream of unique specialties
                .distinct()
                // печатаем каждую уникальную специальность printing every unique specialty
                .forEach(System.out::println);

        System.out.println("<======================== Grouping by doctors ========================>");
        // Группируем специальности по их частоте среди всех докторов Grouping specialties by their frequency among all doctors
        Map<String, Long> specFrequency = doctors.stream()
                .map(Doctor::getSpecialties)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(specFrequency);

        // Находим максимальную частоту любой специальности Find the maximum frequency of any specialty
        Long max = specFrequency.values().stream()
                .max(Long::compare).orElse(0L);

        // Печатаем специальности, которые имеют максимальную частоту Print the specialties that have maximum frequency
        specFrequency.entrySet().stream()
                .filter(e -> max.equals(e.getValue()))
                .forEach(e -> System.out.println("Specialties are most popular among doctors ==> " + e.getKey()));
    }

    private static List<Doctor> getDoctors() {
        return List.of(
                new Doctor("Jon", "Therapy", "Cardiology", "Gastroenterology"),
                new Doctor("Camila", "Gynecology", "Endocrinology", "Reproductive Medicine", "Ultrasound Diagnostics"),
                new Doctor("Helene", "Traumatology", "Orthopedics", "Pediatrics"),
                new Doctor("James", "Pediatrics", "Neurology", "Allergology", "Infectious Diseases"),
                new Doctor("Juan", "Urology", "Andrology", "Gastroenterology"),
                new Doctor("Sophie", "Dermatology", "Cosmetology", "Oncology", "Cardiology", "Pediatrics")
        );
    }
}
