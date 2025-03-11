package com.tien.swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class UserText extends JTextField {
    private Icon prefixIcon;
    private Icon suffixIcon;
    private String hint = "Username...";
    private int cornerRadius = 30; // Độ bo góc

    public UserText() {
        setOpaque(false); // Đảm bảo bo góc hiển thị đúng
        setBorder(new EmptyBorder(10, 10, 10, 10)); // Cách lề
        setSelectionColor(new Color(220, 204, 182)); // Màu khi chọn text
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public void setPrefixIcon(Icon prefixIcon) {
        this.prefixIcon = prefixIcon;
        updateBorder();
    }

    public void setSuffixIcon(Icon suffixIcon) {
        this.suffixIcon = suffixIcon;
        updateBorder();
    }

    private void updateBorder() {
        int left = 10;
        int right = 10;
        if (prefixIcon != null) {
            left = prefixIcon.getIconWidth() + 15;
        }
        if (suffixIcon != null) {
            right = suffixIcon.getIconWidth() + 15;
        }
        setBorder(BorderFactory.createEmptyBorder(10, left, 10, right));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Vẽ nền bo góc
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, width, height, cornerRadius, cornerRadius);

        // Vẽ viền khi focus
        if (isFocusOwner()) {
            g2.setColor(new Color(100, 150, 255)); // Viền xanh khi focus
        } else {
            g2.setColor(new Color(150, 150, 150)); // Viền xám khi không focus
        }
        g2.drawRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);

        g2.dispose();
        super.paintComponent(g);
        paintIcons(g);

        // Hiển thị hint khi trống
        if (getText().isEmpty()) {
            Graphics2D gHint = (Graphics2D) g;
            gHint.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            gHint.setColor(new Color(150, 150, 150)); // Màu hint
            gHint.drawString(hint, getInsets().left, getHeight() / 2 + gHint.getFontMetrics().getAscent() / 2 - 2);
        }
    }

    private void paintIcons(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (prefixIcon != null) {
            Image prefix = ((ImageIcon) prefixIcon).getImage();
            int y = (getHeight() - prefixIcon.getIconHeight()) / 2;
            g2.drawImage(prefix, 5, y, this);
        }
        if (suffixIcon != null) {
            Image suffix = ((ImageIcon) suffixIcon).getImage();
            int y = (getHeight() - suffixIcon.getIconHeight()) / 2;
            g2.drawImage(suffix, getWidth() - suffixIcon.getIconWidth() - 5, y, this);
        }
    }
}
