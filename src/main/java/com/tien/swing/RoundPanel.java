package com.tien.swing;

import com.formdev.flatlaf.ui.*;
import java.awt.*;
import javax.swing.*;

public class RoundPanel extends JPanel {
    public RoundPanel() {
        setOpaque(false); // Cho phép nhìn thấy góc bo
        setBackground(new Color(100, 150, 255)); // Màu nền tùy chỉnh
        setBorder(new FlatRoundBorder()); // Áp dụng viền bo góc của FlatLaf
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Đảm bảo không bị lỗi hiển thị
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, width, height, 20, 20); // Bo góc 20px

        g2.dispose();
    }
}