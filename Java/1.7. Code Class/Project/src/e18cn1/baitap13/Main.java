package e18cn1.baitap13;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static void main( String[] args ) {
        PhanSo[] p = new PhanSo[2];
        p[0] = new PhanSo();
        p[1] = new PhanSo();
        System.out.println("Nhập phân số thứ nhất: ");
        p[0].nhap();
        System.out.println("Nhập phấn số thứ hai: ");
        p[1].nhap();
        System.out.println("Tổng hai phân số: ");
        PhanSo kqt = p[0].cong(p[1]);
        kqt.hien();
        System.out.println("Hiệu hai phân số: ");
        PhanSo kqh = p[0].tru(p[1]);
        kqh.hien();
        System.out.println("Tích hai phân sô: ");
        PhanSo kqtich = p[0].nhan(p[1]);
        kqtich.hien();
        System.out.println("Thương hai phân số: ");
        PhanSo kqthuong = p[0].chia(p[1]);
        kqthuong.hien();
        PhanSo tg1 = p[0].toiGian();
        PhanSo tg2 = p[1].toiGian();
        System.out.println("Tối giản của phân số thứ nhất: ");
        tg1.hien();
        System.out.println("Tối giản của phân số thứ hai: ");
        tg2.hien();
        if ( p[0].lonHon(p[1]) )
            System.out.println("Phân số thứ nhất lớn hơn!");
        else if ( p[0].nhoHon(p[1]) )
            System.out.println("Phân số thứ hai lớn hơn!");
        else
            System.out.println("Hai phân số bằng nhau!");
    }
}
