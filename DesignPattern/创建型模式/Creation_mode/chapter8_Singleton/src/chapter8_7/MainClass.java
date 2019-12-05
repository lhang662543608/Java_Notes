package chapter8_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

/**
 * @author lhang
 * @create 2019-10-17 9:09
 */
public class MainClass extends JFrame {
    private JButton button;
    private JDesktopPane desktopPane;
    private SubFrame iFrame = null;

    public MainClass() {
        super("主窗体");
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        button = new JButton("点击创建一个内部窗体");
        button.addActionListener(new BtListener());
        c.add(button, BorderLayout.SOUTH);
        desktopPane = new JDesktopPane(); //创建 DesktopPane
        c.add(desktopPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.show();
    }

    //事件监听器
    class BtListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (iFrame != null) {
                desktopPane.remove(iFrame);
            }
            iFrame = SubFrame.getFrame();
            desktopPane.add(iFrame);
        }
    }

}
