import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Teacher {
    private String name;
    private Map<Integer, Set<Student>> studentMap = new HashMap<>();

    public Teacher() {
    }

    public Teacher(String name, Map<Integer, Set<Student>> studentMap) {
        this.name = name;
        this.studentMap = studentMap;
    }

    public void addStudent(Student student) {
        int studentAge = student.getAge();
        if (this.studentMap.containsKey(studentAge)) {
            studentMap.get(studentAge).add(student);
        } else {
            studentMap.put(studentAge, new HashSet<Student>() {{
                add(student);
            }});
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Set<Student>> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Integer, Set<Student>> studentMap) {
        this.studentMap = studentMap;
    }
}
