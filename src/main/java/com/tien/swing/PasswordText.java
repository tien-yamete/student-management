package com.tien.swing;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PasswordText extends JPasswordField {
    private Icon prefixIcon;
    private Icon suffixIcon;
    private boolean isPasswordVisible = false; // Trạng thái ẩn/hiện mật khẩu
    private String hint = "Password...";
    private int cornerRadius = 30; // Độ bo góc

    public PasswordText() {
        setBorder(new EmptyBorder(10, 10, 10, 10)); // Cách lề
        setSelectionColor(new Color(220, 204, 182));
        setOpaque(false); // Quan trọng để bo góc hiển thị đúng

        // Thêm icon mắt để hiện/ẩn mật khẩu
        setSuffixIcon(new ImageIcon(getClass().getResource("/com/tien/icon/hide2.png")));

        // Xử lý sự kiện click vào icon mắt
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isMouseOnIcon(e)) {
                    togglePasswordVisibility();
                }
            }
        });

        // Xử lý đổi con trỏ chuột khi hover vào icon mắt
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                if (isMouseOnIcon(e)) {
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                } else {
                    setCursor(new Cursor(Cursor.TEXT_CURSOR));
                }
            }
        });
    }

    public void togglePasswordVisibility() {
        isPasswordVisible = !isPasswordVisible;
        setEchoChar(isPasswordVisible ? (char) 0 : '•'); // '•' thay thế cho *

        // Đổi icon mắt
        if (isPasswordVisible) {
            setSuffixIcon(new ImageIcon(getClass().getResource("/com/tien/icon/view1.png")));
        } else {
            setSuffixIcon(new ImageIcon(getClass().getResource("/com/tien/icon/hide2.png")));
        }
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public void setPrefixIcon(Icon prefixIcon) {
        this.prefixIcon = prefixIcon;
        initBorder();
    }

    public void setSuffixIcon(Icon suffixIcon) {
        this.suffixIcon = suffixIcon;
        initBorder();
    }

    private void initBorder() {
        int left = 10;
        int right = 10;
        if (prefixIcon != null) {
            left = prefixIcon.getIconWidth() + 10;
        }
        if (suffixIcon != null) {
            right = suffixIcon.getIconWidth() + 10;
        }
        setBorder(BorderFactory.createEmptyBorder(10, left, 10, right));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Vẽ nền bo tròn
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
        super.paintComponent(g); // Đảm bảo văn bản hiển thị đúng
        paintIcon(g);

        // Hiển thị hint nếu chưa nhập mật khẩu
        if (getPassword().length == 0) {
            int h = getHeight();
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            int c0 = getBackground().getRGB();
            int c1 = getForeground().getRGB();
            int m = 0xfefefefe;
            int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
            g.setColor(new Color(c2, true));
            g.drawString(hint, ins.left, h / 2 + fm.getAscent() / 2 - 2);
        }
    }

    private void paintIcon(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (prefixIcon != null) {
            Image prefix = ((ImageIcon) prefixIcon).getImage();
            int y = (getHeight() - prefixIcon.getIconHeight()) / 2;
            g2.drawImage(prefix, 3, y, this);
        }
        if (suffixIcon != null) {
            Image suffix = ((ImageIcon) suffixIcon).getImage();
            int y = (getHeight() - suffixIcon.getIconHeight()) / 2;
            g2.drawImage(suffix, getWidth() - suffixIcon.getIconWidth() - 3, y, this);
        }
    }

    // Kiểm tra chuột có đang hover vào icon mắt không
    private boolean isMouseOnIcon(MouseEvent e) {
        if (suffixIcon != null) {
            int iconX = getWidth() - suffixIcon.getIconWidth() - 5;
            int iconWidth = suffixIcon.getIconWidth();
            return e.getX() >= iconX && e.getX() <= iconX + iconWidth;
        }
        return false;
    }
}
