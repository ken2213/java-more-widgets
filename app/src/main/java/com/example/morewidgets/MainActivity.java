package com.example.morewidgets;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    RadioGroup radioGroup;
    Spinner spinner;
    TimePicker timePicker;
    DatePicker datePicker;
    Button btn;
    ProgressBar progressBar;

    int progress = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    //  // Checkbox
    //        checkBox = findViewById(R.id.checkbox);
    //
    //        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    //            @Override
    //            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    //
    //                if (isChecked) {
    //                    // Code to execute when checkbox is checked
    //                    Toast.makeText(
    //                            MainActivity.this,
    //                            "The Checkbox is checked",
    //                            Toast.LENGTH_SHORT
    //                    ).show();
    //                } else {
    //                    // Code to execute when checkbox is unchecked
    //                    Toast.makeText(
    //                            MainActivity.this,
    //                            "The Checkbox is not checked",
    //                            Toast.LENGTH_SHORT
    //                    ).show();
    //                }
    //            }
    //        });

    // // Radio Group
    //        radioGroup = findViewById(R.id.radioGroup);
    //        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    //            @Override
    //            public void onCheckedChanged(RadioGroup group, int checkedId) {
    //                RadioButton radioButton = findViewById(checkedId);
    //                Toast.makeText(
    //                        MainActivity.this,
    //                        "You Select: " + radioButton.getText().toString(),
    //                        Toast.LENGTH_SHORT
    //                ).show();
    //            }
    //        });




    // // Spinner
    //        spinner = findViewById(R.id.spinner);
    //
    //        // Data Source:
    //        String[] courses = {"C++", "Java", "Kotlin", "Python"};
    //
    //        // ArrayAdapter: used to populate the 'Spinner' with
    //        //               items from a string array resource
    //
    //        ArrayAdapter<String> adapter = new ArrayAdapter<>(
    //                this,
    //                android.R.layout.simple_spinner_item,
    //                courses
    //        );
    //
    //        // Apply the adapter to the spinner
    //        spinner.setAdapter(adapter);


    //        // Time Picker
    //        timePicker = findViewById(R.id.timePicker);
    //        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
    //            @Override
    //            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
    //                // Handle Time Chamge
    //                Toast.makeText(
    //                        MainActivity.this,
    //                        "Hour: " + hourOfDay + "  Minute: " + minute,
    //                        Toast.LENGTH_SHORT
    //                ).show();
    //            }
    //        });

    //        // Date Picker
    //        datePicker = findViewById(R.id.datePicker);
    //        btn = findViewById(R.id.btn);
    //
    //        btn.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //                String day = "Day " + datePicker.getDayOfMonth();
    //                String month = "Month " + (datePicker.getMonth() + 1);
    //                String year = "Year " + datePicker.getYear();
    //
    //                Toast.makeText(
    //                        MainActivity.this,
    //                        day + ", " + month + ", " + year,
    //                        Toast.LENGTH_LONG
    //                ).show();
    //            }
    //        });

    // // Progress Bar
//        btn = findViewById(R.id.btn);
//        progressBar = findViewById(R.id.progressbar);
//
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                progress = progress + 10;
//
//                progressBar.setProgress(progress);
//            }
//        });


    }


}