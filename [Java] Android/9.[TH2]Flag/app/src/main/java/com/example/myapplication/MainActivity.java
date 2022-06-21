package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private TextView lblSelectLanguage;
    private Spinner spnLanguage;
    private Button btnSave;
    private TextView txtCountryName;
    private ImageView imgFlag;
    String[] selectedCountryTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ArrayAdapter<CharSequence> spnAdapter = ArrayAdapter.createFromResource(this, R.array.language, R.layout.support_simple_spinner_dropdown_item);
        spnLanguage.setAdapter(spnAdapter);
        spnLanguage.setOnItemSelectedListener(this);
        btnSave.setOnClickListener(this);
        imgFlag.setImageResource(getResources().getIdentifier("vi_flag", "drawable", getPackageName()));
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        spnLanguage.setSelection(preferences.getInt("SpnSelectedPosition", -1));
    }

    private void initView() {
        lblSelectLanguage = findViewById(R.id.lbl_language_select);
        spnLanguage = findViewById(R.id.spn_language_select);
        btnSave = findViewById(R.id.btn_save);
        txtCountryName = findViewById(R.id.txt_country_name);
        imgFlag = findViewById(R.id.img_country_flag);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                selectedCountryTexts = getResources().getStringArray(R.array.vi);
                updateView();
                break;
            case 1:
                selectedCountryTexts = getResources().getStringArray(R.array.en);
                updateView();
                break;
            case 2:
                selectedCountryTexts = getResources().getStringArray(R.array.fr);
                updateView();
                break;
            case 3:
                selectedCountryTexts = getResources().getStringArray(R.array.es);
                updateView();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor prefsEditor = preferences.edit();
        prefsEditor.putInt("SpnSelectedPosition", spnLanguage.getSelectedItemPosition());
        prefsEditor.apply();
    }

    private void updateView() {
        lblSelectLanguage.setText(selectedCountryTexts[0]);
        txtCountryName.setText(selectedCountryTexts[1]);
        btnSave.setText(selectedCountryTexts[2]);
        imgFlag.setImageResource(getResources().getIdentifier(selectedCountryTexts[3], "drawable", getPackageName()));
    }
}
