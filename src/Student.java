public class Student extends User {
    private Teacher teacher;

    public Student(String name, String surname, Teacher teacher, Integer pinCode) {
        super(name, surname, Role.STUDENT, pinCode);
        this.teacher = teacher;
    }
        public Teacher getTeacher () {
            return teacher;
        }
    }
