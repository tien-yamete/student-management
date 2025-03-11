package com.tien.swing;

import java.awt.*;
import javax.swing.*;
public class RoundPanelShadow extends JPanel {
    private int shadowSize = 15; // Kích thước bóng
    private int cornerRadius = 25; // Bo góc

    public RoundPanelShadow() {
        setOpaque(false); // Quan trọng để thấy bóng
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Tạo gradient cho bóng đổ
        for (int i = shadowSize; i > 0; i--) {
            float opacity = (float) i / (shadowSize * 2); // Mờ dần
            g2.setColor(new Color(255, 255, 255, (int) (opacity * 50))); // Màu đen trong suốt
            g2.fillRoundRect(i, i, width - i * 2, height - i * 2, cornerRadius, cornerRadius);
        }

        // Vẽ nền panel
        g2.setColor(new Color(30, 30, 30, 180)); // Màu tối cho login form
        g2.fillRoundRect(shadowSize, shadowSize, width - shadowSize * 2, height - shadowSize * 2, cornerRadius, cornerRadius);

        g2.dispose();
        super.paintComponent(g);
    }
}