package com.tien.main;
import com.formdev.flatlaf.*;
import com.tien.form.LoginForm;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());  // Chọn giao diện sáng
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("Không thể khởi tạo FlatLaf");
        }

        SwingUtilities.invokeLater(() -> {
            LoginForm frame = new LoginForm();
            frame.setDefaultCloseOperation(LoginForm.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null); // Frame Center
            frame.setResizable(false);
        });
    }
}
