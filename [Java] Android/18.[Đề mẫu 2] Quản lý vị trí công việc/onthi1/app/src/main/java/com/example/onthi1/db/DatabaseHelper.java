package com.example.onthi1.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.onthi1.model.CongViec;
import com.example.onthi1.model.NhanVien;
import com.example.onthi1.model.ViTri;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    private Context context;
    private static final String DBNAME="QLCongViec.db";
    private static final int DBVERSION=1;


    public DatabaseHelper(@Nullable Context context) {
        super(context, DBNAME, null, DBVERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query1 =
                "CREATE TABLE nhanvien(" +
                "id integer primary key autoincrement," +
                "ten text," +
                "namsinh integer," +
                "quequan text," +
                "trinhdo text" +
                ")";

        String query2 = "CREATE TABLE vitri(" +
                "id integer primary key autoincrement," +
                "ten text," +
                "mota text" +
                ")";

        String query3 = "CREATE TABLE congviec(" +
                "id integer primary key autoincrement," +
                "manv integer," +
                "mavt integer," +
                "thoidiem datetime default current_timestamp," +
                "mota text," +
                "FOREIGN KEY (manv) REFERENCES nhanvien(id)," +
                "FOREIGN KEY (mavt) REFERENCES vitri(id)"+
                ")";

        sqLiteDatabase.execSQL(query1);
        sqLiteDatabase.execSQL(query2);
        sqLiteDatabase.execSQL(query3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS nhanvien");
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS vitri");
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS congviec");
//
//        onCreate(sqLiteDatabase);
    }

    public ArrayList<NhanVien> getAllNhanVien(){
        String query = "SELECT * FROM nhanvien";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor c = null;
        if (db!=null){
            c = db.rawQuery(query,null);
        }

        ArrayList<NhanVien> nvList = new ArrayList<>();

        while(c.moveToNext()){
            NhanVien nv = new NhanVien();
            nv.setId(c.getInt(0));
            nv.setTen(c.getString(1));
            nv.setNamSinh(c.getInt(2));
            nv.setQue(c.getString(3));
            nv.setTrinhdo(c.getString(4));
            nvList.add(nv);
        }

        return nvList;
    }

    public long addNhanVien(NhanVien nv){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("ten", nv.getTen());
        cv.put("namsinh", nv.getNamSinh());
        cv.put("quequan",nv.getQue());
        cv.put("trinhdo", nv.getTrinhdo());

        long result = db.insert("nhanvien",null,cv);
        if(result==-1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Added Successfully", Toast.LENGTH_SHORT).show();
        }

        return result;
    }

    public ArrayList<ViTri> getAllVitri(){
        ArrayList<ViTri> list = new ArrayList<>();

        String query = "Select * from vitri";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor c = null;
        if(db!=null){
            c = db.rawQuery(query,null);
        }

        while (c.moveToNext()){
            int id = c.getInt(0);
            String ten = c.getString(1);
            String mota = c.getString(2);

            ViTri vt = new ViTri(id,ten,mota);
            list.add(vt);
        }

        return list;
    }

    public long addViTri(ViTri vt){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("ten",vt.getTen());
        cv.put("mota",vt.getMota());

        long result = db.insert("vitri",null,cv);

        if(result==-1){
            Toast.makeText(context,"Failed",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Added Successfully", Toast.LENGTH_SHORT).show();
        }

        return result;
    }

    public long addCongViec(CongViec cv){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cval = new ContentValues();
        cval.put("manv",cv.getIdNV());
        cval.put("mavt", cv.getIdVT());
//        cval.put("thoidiem", cv.getTime());
        cval.put("mota", cv.getMota());

        long res = db.insert("congviec",null,cval);

        if (res != -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Added Successfully", Toast.LENGTH_SHORT).show();
        }

        return res;
    }

    public ArrayList<CongViec> getAllCongviec(){
        String query = "Select * from congviec";
        ArrayList<CongViec> list = new ArrayList<>();

        Cursor c = null;

        SQLiteDatabase db = this.getReadableDatabase();

        if(db != null){
            c = db.rawQuery(query,null);
        }

        while (c.moveToNext()){
            int id = c.getInt(0);
            int idNV = c.getInt(1);
            int idVT = c.getInt(2);
            String time = c.getString(3);
            String mota = c.getString(4);

            CongViec cv = new CongViec(id,idNV,idVT,time,mota);
            list.add(cv);
        }

        return list;
    }
}
