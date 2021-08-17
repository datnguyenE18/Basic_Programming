package e18cn1.baitap15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.*;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static void main( String[] args ) throws IOException {
        Scanner sc = new Scanner(Paths.get("SV.INP"), "UTF8");
        int maSV = 0;
        String ten = "", lop = "";
        double dtb = 0;

        // Nhập dữ liệu và lưu vào mảng:
        int dem = 0, kt = 0;
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        while ( sc.hasNextLine() ) {
            if ( dem == 4 ) {
                dem = 1;
                kt = 0;
            } else
                dem++;

            // Đọc & xử lý dòng thứ 1 - mã SV:
            if ( dem == 1 ) {
                try {
                    maSV = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                }
                if ( kt1(maSV) )
                    kt++;
            } // Đọc & xử lý dòng thứ 2 - tên:
            else if ( dem == 2 ) {
                ten = sc.nextLine();
                if ( kt2(ten) )
                    kt++;
            } // Đọc & xử lý dòng thứ 3 - lớp
            else if ( dem == 3 ) {
                lop = sc.nextLine();
                if ( kt3(lop) )
                    kt++;
            } // Cuối cùng là điểm trung bình:
            else {
                try {
                    dtb = Double.parseDouble(sc.nextLine());
                } catch (NumberFormatException e) {
                }
                if ( kt4(dtb) )
                    kt++;
                if ( dem == 4 && kt == 4 ) {
                    SinhVien sv = new SinhVien(maSV, ten, lop, dtb);
                    sinhViens.add(sv);
                }
            }
        }
        sc.close();
    }

    private static boolean kt1( int maSV ) {
        if ( maSV >= 1000 && maSV <= 9999 )
            return true;
        return false;
    }

    private static boolean kt2( String ten ) {
        if ( ten.length() == 0 )
            return false;
        String[] tmp = ten.split(" ");
        if ( tmp.length < 2 )
            return false;
        return true;
    }

    private static boolean kt3( String lop ) {
        String regex = "^[dD]{1}\\d{2}[cC]{1}[qQ]{1}[qQvVmMcCnNaAtTdDpPkK]{2}\\d{2}[-bBnN]{2}$";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(lop);
        if ( mat.find() )
            return true;
        return false;
    }

    private static boolean kt4( double dtb ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
