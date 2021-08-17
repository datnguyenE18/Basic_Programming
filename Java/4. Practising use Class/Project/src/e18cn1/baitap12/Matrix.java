package e18cn1.baitap12;

import java.util.Scanner;

public class Matrix {

    Scanner sc = new Scanner(System.in);

    private float[][] a;
    private int rows;
    private int cols;

    public Matrix() {
        a = new float[3][3];
    }

    public Matrix( int rows, int cols ) {
        this.rows = rows;
        this.cols = cols;
        a = new float[rows][cols];
    }

    public Matrix add( Matrix m ) {
        Matrix sum = new Matrix(this.rows, this.cols);
        if ( m.cols != this.cols || m.rows != this.rows )
            System.out.println("Invalid!");
        else
            for ( int i = 0; i < m.rows; i++ )
                for ( int j = 0; j < m.cols; j++ )
                    sum.a[i][j] = this.a[i][j] + m.a[i][j];
        return sum;
    }

    public Matrix sub( Matrix m ) {
        Matrix res = new Matrix(this.rows, this.cols);
        if ( m.cols != this.cols || m.rows != this.rows )
            System.out.println("Invalid!");
        else
            for ( int i = 0; i < m.rows; i++ )
                for ( int j = 0; j < m.cols; j++ )
                    res.a[i][j] = this.a[i][j] - m.a[i][j];
        return res;
    }

    public Matrix neg() {
        Matrix res = new Matrix(this.rows, this.cols);
        for ( int i = 0; i < rows; i++ )
            for ( int j = 0; j < cols; j++ )
                res.a[i][j] = -this.a[i][j];
        return res;
    }

    public Matrix transpose() {
        Matrix res = new Matrix(cols, rows);
        for ( int i = 0; i < rows; i++ )
            for ( int j = 0; j < cols; j++ )
                res.a[j][i] = a[i][j];
        return res;
    }

    public Matrix mul( Matrix m ) {
        Matrix res = new Matrix(rows, m.cols);
        if ( cols != m.rows )
            System.out.println("Invalid!");
        else
            for ( int i = 0; i < rows; i++ )
                for ( int j = 0; j < m.cols; j++ ) {
                    res.a[i][j] = 0;
                    for ( int k = 0; k < cols; k++ )
                        res.a[i][j] += ( a[i][k] * m.a[k][j] );
                }
        return res;
    }

    public void print() {
        for ( int i = 0; i < rows; i++ ) {
            for ( int j = 0; j < cols; j++ )
                System.out.print(a[i][j] + " ");
            System.out.println("");
        }
    }

    public void input() {
        for ( int i = 0; i < rows; i++ )
            for ( int j = 0; j < cols; j++ )
                a[i][j] = sc.nextFloat();;
    }
}
