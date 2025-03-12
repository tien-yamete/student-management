package com.tien.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropdownMenuExample extends JFrame {
    public DropdownMenuExample() {
        setTitle("Dropdown Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20)); // Căn phải giống UI trong hình

        // Tạo icon giả lập hình avatar (bạn có thể thay bằng hình ảnh thực tế)
        Icon avatarIcon = new ImageIcon("avatar.png"); // Thay bằng đường dẫn ảnh thực tế

        // Nút avatar (giống như hình tròn chứa chữ T)
        JButton profileButton = new JButton(avatarIcon);
        profileButton.setPreferredSize(new Dimension(40, 40));
        profileButton.setBackground(new Color(200, 100, 120)); // Màu nền tương tự
        profileButton.setFocusPainted(false);
        profileButton.setBorder(BorderFactory.createEmptyBorder());
        profileButton.setOpaque(true);
        
        // Tạo menu dropdown
        JPopupMenu menu = new JPopupMenu();

        JMenuItem accountItem = new JMenuItem("Account");
        JMenuItem profileItem = new JMenuItem("Profile");
        JMenuItem upgradeItem = new JMenuItem("Upgrade to Premium");
        JMenuItem supportItem = new JMenuItem("Support");
        JMenuItem privateSessionItem = new JMenuItem("Private session");
        JMenuItem settingsItem = new JMenuItem("Settings");
        JMenuItem logoutItem = new JMenuItem("Log out");

        // Thêm icon góc (mô phỏng icon trong hình)
        accountItem.setIcon(new ImageIcon("external_link_icon.png")); // Thay icon phù hợp
        supportItem.setIcon(new ImageIcon("external_link_icon.png"));

        // Thêm các mục vào menu
        menu.add(accountItem);
        menu.add(profileItem);
        menu.add(upgradeItem);
        menu.add(supportItem);
        menu.add(privateSessionItem);
        menu.add(settingsItem);
        menu.addSeparator(); // Thêm dòng phân cách
        menu.add(logoutItem);

        // Xử lý sự kiện khi bấm vào profile button
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.show(profileButton, 0, profileButton.getHeight());
            }
        });

        add(profileButton);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
