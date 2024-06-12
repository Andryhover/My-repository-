package controller;

import model.user.Admin;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с администраторами системы
 */
public class AdminController {
    List<Admin> admins = new ArrayList<>() {{
        add(new Admin(1L, "Дмитрий", "Геннадьевич", 200));
    }};
    public List<Admin> getAdmins() {
        return admins;
    }
}
