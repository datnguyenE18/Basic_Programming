package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public final class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "SQLiteDemo";
    private static final String TABLE_NV = "nhanvien";
    private static final String TABLE_VT = "vitri";
    private static final String ID_NV = "idNV";
    private static final String ID_VT = "idVT";
    private static final String NAME_NV = "nameNV";
    private static final String YEAR_NV = "yearNV";
    private static final String QUE_NV = "queNV";
    private static final String DEG_NV = "degNV";
    private static final String NAME_VT = "nameVT";
    private static final String DESCRIPTION_VT = "descriptionVT";
    private Context context;

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,1);
        Log.d("DB Manager","DB Manager");

        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlQuery = " CREATE TABLE " + TABLE_NV + " (" +
                ID_NV + " integer primary key, " +
                NAME_NV + " TEXT, " +
                YEAR_NV + " TEXT, " +
                QUE_NV + " TEXT, " +
                DEG_NV + " TEXT )";
        db.execSQL(sqlQuery);

        String sqlQuery2 = " CREATE TABLE " + TABLE_VT + " (" +
                ID_VT + " integer primary key, " +
                NAME_VT + " TEXT, " +
                DESCRIPTION_VT + " TEXT )";
        db.execSQL(sqlQuery2);
        Toast.makeText(context, "Create Successfully", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NV);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_VT);
        onCreate(db);
        Toast.makeText(context, "Drop successfully", Toast.LENGTH_SHORT).show();
    }

    public void addNV(NhanVien nhanVien){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME_NV, nhanVien.getName());
        values.put(YEAR_NV, nhanVien.getYear());
        values.put(QUE_NV, nhanVien.getQuequan());
        values.put(DEG_NV, nhanVien.getDegree());

        db.insert(TABLE_NV, null, values);
        db.close();
    }

    public void addVT(ViTri vitri){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME_VT, vitri.getName());
        values.put(DESCRIPTION_VT, vitri.getDescription());

        db.insert(TABLE_VT, null, values);
        db.close();
    }

    public List<NhanVien> getAllNhanVien(){
        List<NhanVien> listNhanVien =new ArrayList<NhanVien>();
        String selectQuery = " SELECT * FROM " + TABLE_NV;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if(cursor.moveToFirst()){
            do{
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId(cursor.getInt(0));
                nhanVien.setName(cursor.getString(1));
                nhanVien.setYear(cursor.getString(2));
                nhanVien.setQuequan(cursor.getString(3));
                nhanVien.setDegree(cursor.getString(4));
                listNhanVien.add(nhanVien);
            } while(cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listNhanVien;
    }

    public List<ViTri> getAllViTri(){
        List<ViTri> listViTri =new ArrayList<ViTri>();
        String selectQuery = " SELECT * FROM " + TABLE_VT;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if(cursor.moveToFirst()){
            do{
                ViTri vitri = new ViTri();
                vitri.setId(cursor.getInt(0));
                vitri.setName(cursor.getString(1));
                vitri.setDescription(cursor.getString(2));
                listViTri.add(vitri);
            } while(cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listViTri;
    }
}
