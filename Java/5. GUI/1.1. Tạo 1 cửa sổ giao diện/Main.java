import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
//Đối tượng JFrame là một cửa sổ (window) cho phép chúng ta đóng, thay đổi kích thước và có thể đặt các điều khiển.

    public static void main( String[] args ) {
        // Tạo một đối tượng cửa sổ giao diện:
        Main window = new Main();
    }

    public Main() {
        // thiết lập kích thước cửa sổ
        this.setSize(640, 480);

        // thiết lập thao tác đóng cửa sổ
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // cho phép cửa sổ hiển thị
        this.setVisible(true);
    }
}
