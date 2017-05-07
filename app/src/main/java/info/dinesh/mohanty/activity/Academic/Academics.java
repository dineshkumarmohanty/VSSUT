package info.dinesh.mohanty.activity.Academic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class Academics extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnRegulation, btnResult, btnSyllabus, btnHolidayList, btnAcademiccalander,btnCourses,btnScholarship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnRegulation = (Button) findViewById(R.id.btnRegulation);
        btnResult = (Button) findViewById(R.id.btnResult);
        btnSyllabus = (Button) findViewById(R.id.btnSyllabus);
        btnHolidayList = (Button) findViewById(R.id.btnHolidayList);
        btnAcademiccalander = (Button) findViewById(R.id.btnAcademiccalander);
        btnCourses=(Button)findViewById(R.id.btnCourses);
        btnScholarship=(Button)findViewById(R.id.btnScholarship);

        btnRegulation.setOnClickListener(this);
        btnSyllabus.setOnClickListener(this);
        btnHolidayList.setOnClickListener(this);
        btnCourses.setOnClickListener(this);
        btnScholarship.setOnClickListener(this);

        btnResult.setOnClickListener(this);
        btnAcademiccalander.setOnClickListener(new View.OnClickListener(){
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openAcademic(Academics.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );



    }

    public static Intent openAcademic(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://www.vssut.ac.in/documents/notice_1482335372.pdf"));}


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnRegulation:
                startActivity(new Intent(Academics.this, Regulations.class));
                break;
            case R.id.btnSyllabus:
                startActivity(new Intent(Academics.this, Syllabus.class));
                break;
            case R.id.btnHolidayList:
                startActivity(new Intent(Academics.this, Holidaylist.class));
                break;
            case R.id.btnCourses:
                startActivity(new Intent(Academics.this, Courses.class));
                break;
            case R.id.btnScholarship:
                startActivity(new Intent(Academics.this, Scholarship.class));
                break;
            case R.id.btnResult:
                startActivity(new Intent(Academics.this, Result.class));
                break;
        }
    }
}
