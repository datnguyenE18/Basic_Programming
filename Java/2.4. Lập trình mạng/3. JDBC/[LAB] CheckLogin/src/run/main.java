package run;

import controller.LoginControl;
import view.LoginView;

public class main {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginControl controller = new LoginControl();
        view.setVisible(true);
    }
}
