package com.hai.bai2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hai.bai2.R;
import com.hai.bai2.model.Student;

public class StudentsActivity extends AppCompatActivity {
    TextView tvName;
    EditText etBirthday;
    EditText etCountry;
    EditText etClass;
    EditText etCourse;
    EditText etSex;
    Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        tvName = findViewById(R.id.tv_name);
        etBirthday = findViewById(R.id.et_birthday);
        etClass = findViewById(R.id.et_class);
        etCourse = findViewById(R.id.et_course);
        etSex = findViewById(R.id.et_sex);
        etCountry = findViewById(R.id.et_country);

        student = getIntent().getExtras().getParcelable("Student");
        tvName.setText(student.getName());

    }
    public void next(View v){
        student.setBirthday(etBirthday.getText()+"");
        student.setClassRoom(etClass.getText()+"");
        student.setCourse(etCourse.getText()+"");
        student.setSex(etSex.getText()+"");
        student.setCountry(etCountry.getText()+"");

        Intent i =  new Intent(this,StudentInforActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("Student",student);
        i.putExtras(bundle);
        startActivity(i);
    }
}
