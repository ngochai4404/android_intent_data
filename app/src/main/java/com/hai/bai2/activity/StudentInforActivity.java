package com.hai.bai2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.hai.bai2.R;
import com.hai.bai2.model.Student;

public class StudentInforActivity extends AppCompatActivity {
    TextView tvName;
    TextView tvBirthday;
    TextView tvCountry;
    TextView tvClass;
    TextView tvCourse;
    TextView tvSex;
    Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        tvName = findViewById(R.id.tv_name);
        tvBirthday = findViewById(R.id.tv_birthday);
        tvClass = findViewById(R.id.tv_class);
        tvCourse = findViewById(R.id.tv_course);
        tvSex = findViewById(R.id.tv_sex);
        tvCountry = findViewById(R.id.tv_country);

        student = getIntent().getExtras().getParcelable("Student");
        tvName.setText(student.getName());
        tvBirthday.setText(student.getBirthday());
        tvClass.setText(student.getClassRoom());
        tvCourse.setText(student.getCourse());
        tvSex.setText(student.getSex());
        tvCountry.setText(student.getCountry());
    }
}
