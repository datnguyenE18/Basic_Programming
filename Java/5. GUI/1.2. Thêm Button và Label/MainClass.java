package jvprj;

import java.awt.*;

import javax.swing.*;

public class MainClass extends JFrame {

    public static void main( String[] args ) {

        // TODO Auto-generated method stub
        MainClass mainWindow = new MainClass();

    }

    public MainClass() {

        // tạo một đối tượng JPanel
        JPanel panel = new JPanel(new FlowLayout());

        // Thêm hai điều khiển đến panel
        panel.add(new JLabel("Test Button: "));

        panel.add(new JButton("Click me!"));

        // Thiết lập nội dung hiện tại cho panel
        this.setContentPane(panel);

        // thiết lập kích thước cửa sổ
        this.setSize(640, 480);

        // thiết lập thao tác đóng cửa sổ
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // cho phép cửa sổ hiển thị
        this.setVisible(true);

    }

}
