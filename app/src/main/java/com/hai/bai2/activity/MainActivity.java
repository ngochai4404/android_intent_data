package com.hai.bai2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.hai.bai2.R;
import com.hai.bai2.model.Student;

/**
 * Created by Hai on 03/07/2018.
 */

public class MainActivity extends AppCompatActivity {
    EditText etName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.et_name);
    }
    public void next(View v){
        Student student = new Student();
        student.setName(etName.getText()+"");
        Intent i =  new Intent(this,StudentsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("Student",student);
        i.putExtras(bundle);
        startActivity(i);

    }
}
