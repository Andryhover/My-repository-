public class Teacher extends User {
    public Teacher(String name, String surname, Integer pinCode) {
        super(name, surname, Role.TEACHER, pinCode);
    }
}
