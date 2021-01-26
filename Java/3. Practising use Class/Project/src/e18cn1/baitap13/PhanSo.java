package e18cn1.baitap13;

import java.util.Scanner;

public class PhanSo {

    private int ts;
    private int ms;

    public PhanSo() {
        this.ts = 0;
        this.ms = 1;
    }

    public PhanSo( int ts, int ms ) {
        this.ts = ts;
        this.ms = ms;
    }

    public PhanSo cong( PhanSo sp2 ) {
        PhanSo p = new PhanSo();
        if ( this.ms == sp2.ms ) {
            p.ms = this.ms;
            p.ts = this.ts + sp2.ts;
        } else {
            int a = this.ts;
            int b = this.ms;
            p.ts = a * sp2.ms + sp2.ts * b;
            p.ms = b * sp2.ms;
        }
        return p.toiGian();
    }

    public PhanSo tru( PhanSo sp2 ) {
        PhanSo p = new PhanSo();
        if ( this.ms == sp2.ms ) {
            p.ms = this.ms;
            p.ts = this.ts - sp2.ts;
        } else {
            int a = this.ts;
            int b = this.ms;
            p.ts = a * sp2.ms - sp2.ts * b;
            p.ms = b * sp2.ms;
        }
        return p.toiGian();
    }

    public PhanSo nhan( PhanSo sp2 ) {
        PhanSo p = new PhanSo();
        p.ts = this.ts * sp2.ts;
        p.ms = this.ms * sp2.ms;
        return p.toiGian();
    }

    public PhanSo chia( PhanSo sp2 ) {
        PhanSo p = sp2.Nghichdao();
        PhanSo kq = new PhanSo();
        kq.ts = this.ts * p.ts;
        kq.ms = this.ms * p.ms;
        return kq.toiGian();
    }

    public PhanSo Nghichdao() {
        PhanSo p = new PhanSo();
        p.ts = this.ms;
        p.ms = this.ts;
        return p;
    }

    public PhanSo doiDau() {
        PhanSo p = new PhanSo();
        p.ts = -this.ts;
        p.ms = this.ms;
        return p;
    }

    public PhanSo toiGian() {
        PhanSo p = new PhanSo();
        if ( ucln() != 1 ) {
            p.ts = this.ts / ucln();
            p.ms = this.ms / ucln();
        } else
            p = this;
        return p;
    }

    private int ucln() {
        int a = this.ts;
        int b = this.ms;
        if ( a < 0 )
            a = -a;
        if ( b < 0 )
            b = -b;
        int tmp;
        while ( b != 0 ) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public boolean bangNhau( PhanSo sp2 ) {
        int a = this.ts;
        int b = this.ms;
        if ( a * sp2.ms == b * sp2.ts )
            return true;
        return false;
    }

    public boolean lonHon( PhanSo sp2 ) {
        int a = this.ts;
        int b = this.ms;
        if ( a * sp2.ms > b * sp2.ts )
            return true;
        return false;
    }

    public boolean nhoHon( PhanSo sp2 ) {
        int a = this.ts;
        int b = this.ms;
        if ( a * sp2.ms < b * sp2.ts )
            return true;
        return false;
    }

    public void hien() {
        System.out.println(ts + "/" + ms);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split("/");
        ts = Integer.parseInt(ss[0]);
        ms = Integer.parseInt(ss[1]);
    }
}
