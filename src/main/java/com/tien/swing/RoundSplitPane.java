package com.tien.swing;

import com.formdev.flatlaf.ui.FlatRoundBorder;
import java.awt.*;
import javax.swing.*;

public class RoundSplitPane extends JSplitPane {
    private int cornerRadius = 20;
    private int minLeftSize = 75; // Kích thước tối thiểu cho panel trái
    private int minRightSize = 400; // Kích thước tối thiểu cho panel phải

    public RoundSplitPane() {
        setOpaque(false);
        setBorder(new FlatRoundBorder());
        setDividerSize(8); // Kích thước thanh chia
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, width, height, cornerRadius, cornerRadius);

        g2.dispose();
    }

    @Override
    public void setDividerLocation(int location) {
        int maxLocation = getWidth() - minRightSize;
        if (location < minLeftSize) {
            location = minLeftSize;
        } else if (location > maxLocation) {
            location = maxLocation;
        }
        super.setDividerLocation(location);
    }
}