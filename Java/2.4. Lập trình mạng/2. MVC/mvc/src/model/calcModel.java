package model;

public class calcModel {

    private double num1;
    private double num2;

    public calcModel(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public calcModel() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double Plus() {
        return num1 + num2;
    }

    public double Subtract() {
        return num1 - num2;
    }

    public double Mult() {
        return num1 * num2;
    }

    public double Dive() {
        return num1 / num2;
    }
}
