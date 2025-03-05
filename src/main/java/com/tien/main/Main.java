package com.tien.main;
import com.formdev.flatlaf.*;
import com.tien.model.LoginForm;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());  // Chọn giao diện sáng
        } catch (Exception e) {
            System.err.println("Không thể khởi tạo FlatLaf");
        }

        SwingUtilities.invokeLater(() -> {
            LoginForm frame = new LoginForm();
            frame.setDefaultCloseOperation(LoginForm.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
