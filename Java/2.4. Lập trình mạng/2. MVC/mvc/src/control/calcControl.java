package control;

import model.calcModel;
import view.calcView;

public class calcControl {

    private calcModel model;
    private calcView view;

    public boolean checkNumber(String value) {
        int count = 0;
        for (char c : value.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c != '.') {
                    return false;
                }
                count++;
            }
        }
        if (count > 1) {
            return false;
        }
        return true;
    }

    public double cal(double num1, double num2, int TYPE) {
        model = new calcModel(num1, num2);
        switch (TYPE) {
            case 0:
                return model.Plus();
            case 1:
                return model.Subtract();
            case 2:
                return model.Mult();
            default:
                return model.Dive();
        }
    }
}
