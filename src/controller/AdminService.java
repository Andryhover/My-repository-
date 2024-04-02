package controller;

import model.Admin;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с администраторами системы
 */
public class AdminService {
    List<Admin> admins = new ArrayList<>() {{
        add(new Admin("Дмитрий", "Геннадьевич", 200));
    }};

    public List<Admin> getAdmins() {
        return admins;
    }
}
