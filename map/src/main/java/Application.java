import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        hand();
    }

    public static void hand() {
        Teacher teacher = new Teacher("Bob", new HashMap<Integer, Set<Student>>() {{
            put(18, new HashSet<Student>() {{
                add(new Student("Linda", 18));
            }});
            put(19, new HashSet<Student>() {{
                add(new Student("Cindy", 19));
                add(new Student("Mary", 19));
            }});
        }}
        );
        teacher.addStudent(new Student("Ben", 19));
        teacher.addStudent(new Student("Solider", 20));
        for (Map.Entry<Integer, Set<Student>> entry : teacher.getStudentMap().entrySet()) {
            for (Student student : entry.getValue()) {
                System.out.println(student);
            }
        }
    }

}
