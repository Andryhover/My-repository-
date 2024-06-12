package model.user;

/**
 * Общие свойства пользователя системы
 */
public abstract class User {
    private Long id;
    private String name;
    private String surname;
    private Role role;
    private int pinCode;

    public User(Long id, String name, String surname, Role role, Integer pinCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.pinCode = pinCode;
    }
    public Long getId() {
        return this.id;
    }
    public Long setId(){
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public Role getRole() {
        return this.role;
    }
    public int getPinCode() {
        return this.pinCode;
    }
    @Override
    public String toString() {
        return "model.user.User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role=" + role +
                '}';
    }
}
