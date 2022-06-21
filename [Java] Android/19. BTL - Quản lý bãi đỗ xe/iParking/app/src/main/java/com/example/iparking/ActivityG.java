package com.example.iparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivityG extends AppCompatActivity implements View.OnClickListener{

    private TextView thoigianguixe;

    private EditText hangxe, bienso;

    private Button dangkyguixe, buttonDecrease, buttonIncrease;

    private TextClock textClock2;

    private SeekBar seekBar;

    private CheckBox a1, a2, a3, a4, a5 ,a6, a7, a8, a9;

    private CheckBox b1, b2, b3, b4, b5, b6,b7, b8, b9;

    private int time1;

    private static int DELTA_VALUE = 1;

    private static final String LOGTAG = "SeekBarDemo";

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("Users").child("pNKj9fJScJeQB8rfgYqH0E6Gc902").child("ticket1");

        hangxe = (EditText) findViewById(R.id.hangxe);
        bienso = (EditText) findViewById(R.id.bienso);

        this.textClock2 = (TextClock) this.findViewById(R.id.myTextClock2);
        this.textClock2.setFormat12Hour(null);

        thoigianguixe = (TextView) findViewById(R.id.thoigianguixe);

        this.seekBar = (SeekBar) findViewById(R.id.seekBar );

        this.buttonDecrease= (Button) findViewById(R.id.button_decrease);
        this.buttonIncrease= (Button) findViewById(R.id.button_increase);

        this.a1 = (CheckBox) this.findViewById(R.id.a1);
        this.a2 = (CheckBox) this.findViewById(R.id.a2);
        this.a3 = (CheckBox) this.findViewById(R.id.a3);
        this.a4 = (CheckBox) this.findViewById(R.id.a4);
        this.a5 = (CheckBox) this.findViewById(R.id.a5);
        this.a6 = (CheckBox) this.findViewById(R.id.a6);
        this.a7 = (CheckBox) this.findViewById(R.id.a7);
        this.a8 = (CheckBox) this.findViewById(R.id.a8);
        this.b1 = (CheckBox) this.findViewById(R.id.b1);
        this.b2 = (CheckBox) this.findViewById(R.id.b2);
        this.b3 = (CheckBox) this.findViewById(R.id.b3);
        this.b4 = (CheckBox) this.findViewById(R.id.b4);
        this.b5 = (CheckBox) this.findViewById(R.id.b5);
        this.b6 = (CheckBox) this.findViewById(R.id.b6);
        this.b7 = (CheckBox) this.findViewById(R.id.b7);
        this.b8 = (CheckBox) this.findViewById(R.id.b8);

        dangkyguixe = (Button) findViewById(R.id.dangkyguixe);
        dangkyguixe.setOnClickListener(this);

        this.thoigianguixe.setText("Thời gian đỗ " + seekBar.getProgress() + "/" + seekBar.getMax() + " (giờ)");

        this.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress = progressValue;
                time1 = progress;
                thoigianguixe.setText("Thời gian đỗ " + progressValue + "/" + seekBar.getMax() + " (giờ)");
                Log.i(LOGTAG, "Thời gian đỗ đã thay đổi");
                Toast.makeText(getApplicationContext(), "Thời gian đỗ đã thay đổi", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                thoigianguixe.setText("Thời gian đỗ " + progress + "/" + seekBar.getMax() + " (giờ)");
                time1 = progress;
            }
        });

        this.buttonDecrease.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreateProgress();
            }
        });

        this.buttonIncrease.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                increateProgress();
            }
        });
    }

    private void increateProgress() {
        int progress= this.seekBar.getProgress();
        if(progress + DELTA_VALUE > this.seekBar.getMax())  {
            this.seekBar.setProgress(0);
        }else {
            this.seekBar.setProgress(progress + DELTA_VALUE);
        }
        thoigianguixe.setText("Thời gian đỗ " + seekBar.getProgress()+ "/" + seekBar.getMax() + " (giờ)");
        time1 = seekBar.getProgress();
    }

    private void decreateProgress() {
        int progress= this.seekBar.getProgress();
        if(progress - DELTA_VALUE < 0)  {
            this.seekBar.setProgress(0);
        } else  {
            this.seekBar.setProgress(progress - DELTA_VALUE);
        }
        thoigianguixe.setText("Thời gian đỗ " + seekBar.getProgress()+ "/" + seekBar.getMax() + " (giờ)");
        time1 = seekBar.getProgress();
    }

    @Override
    public void onClick(View view) {
        themxemoi();
    }

    public void themxemoi() {
        int a = 0;
        String message = null;
        if(this.a1.isChecked()){
            message = this.a1.getText().toString();
            a = a+1;
        }
        if(this.a2.isChecked()){
            message = this.a2.getText().toString();
            a = a+1;
        }
        if(this.a3.isChecked()){
            message = this.a3.getText().toString();
            a = a+1;
        }
        if(this.a4.isChecked()){
            message = this.a4.getText().toString();
            a = a+1;
        }
        if(this.a5.isChecked()){
            message = this.a5.getText().toString();
            a = a+1;
        }
        if(this.a6.isChecked()){
            message = this.a6.getText().toString();
            a = a+1;
        }
        if(this.a7.isChecked()){
            message = this.a7.getText().toString();
            a = a+1;
        }
        if(this.a8.isChecked()){
            message = this.a8.getText().toString();
            a = a+1;
        }

        if(this.b1.isChecked()){
            message = this.b1.getText().toString();
            a = a+1;
        }
        if(this.b2.isChecked()){
            message = this.b2.getText().toString();
            a = a+1;
        }
        if(this.b3.isChecked()){
            message = this.b3.getText().toString();
            a = a+1;
        }
        if(this.b4.isChecked()){
            message = this.b4.getText().toString();
            a = a+1;
        }
        if(this.b5.isChecked()){
            message = this.b5.getText().toString();
            a = a+1;
        }
        if(this.b6.isChecked()){
            message = this.b6.getText().toString();
            a = a+1;
        }
        if(this.b7.isChecked()){
            message = this.b7.getText().toString();
            a = a+1;
        }
        if(this.b8.isChecked()){
            message = this.b8.getText().toString();
            a = a+1;
        }

        if(a==1) {
            message = message == null ? "Hãy chọn vị trí gửi xe" : "" + message;
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(ActivityG.this, "Bạn chỉ được chọn 1 vị trí", Toast.LENGTH_LONG).show();
            return;
        }

        String bienso1 = bienso.getText().toString().trim();
        String hangxe1 = hangxe.getText().toString().trim();
        String timestart1 = textClock2.getText().toString().trim();
        String place1 = message.trim();

        Vehical vehical = new Vehical(bienso1,hangxe1,timestart1, time1, place1);

        String pathObject = String.valueOf(vehical.getBienso1());

        firebaseDatabase.getReference().child("Users").child("pNKj9fJScJeQB8rfgYqH0E6Gc902").child("ticket1").child(pathObject).setValue(vehical);

        startActivity(new Intent(ActivityG.this, ActivityI.class));
    }
}