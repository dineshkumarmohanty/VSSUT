package info.dinesh.mohanty.activity.DEPARTMENT;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;



public class Departments extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnArchitecture,btnChemical,btnchemistry,btnCivil,btnComputer,btnEEE,btnETC,btnHuman,btnMath,btnMecha,btnMetal,btnPhy,btnPro,btnMCA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnArchitecture = (Button) findViewById(R.id.btnArchitecture);
        btnChemical=(Button)findViewById(R.id.btnChemical);
        btnchemistry=(Button)findViewById(R.id.btnChemistry);
        btnCivil=(Button)findViewById(R.id.btnCivil);
        btnComputer=(Button) findViewById(R.id.btnComputer);
        btnEEE=(Button)findViewById(R.id.btnEEE) ;
        btnETC=(Button)findViewById(R.id.btnETC);
        btnHuman=(Button)findViewById(R.id.btnHuman) ;
        btnMath=(Button) findViewById(R.id.btnMath);
        btnMecha=(Button)findViewById(R.id.btnMecha);
        btnMetal=(Button)findViewById(R.id.btnMetal) ;
        btnPhy=(Button)findViewById(R.id.btnPhy) ;
        btnPro =(Button)findViewById(R.id.btnPro);
        btnMCA=(Button) findViewById(R.id.btnMCA);





        btnArchitecture.setOnClickListener(this);
        btnChemical.setOnClickListener(this);
        btnchemistry.setOnClickListener(this);
        btnCivil.setOnClickListener(this);
        btnComputer.setOnClickListener(this);
        btnEEE.setOnClickListener(this);
        btnETC.setOnClickListener(this);
        btnHuman.setOnClickListener(this);
        btnMath.setOnClickListener(this);
        btnMecha.setOnClickListener(this);
        btnMetal.setOnClickListener(this);
        btnPhy.setOnClickListener(this);
        btnPro.setOnClickListener(this);
        btnMCA.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnArchitecture:
                startActivity(new Intent(Departments.this, Architech.class));
                break;
            case R.id.btnChemical:
                startActivity(new Intent(Departments.this, Chemical.class));
                break;
            case R.id.btnChemistry:
                startActivity(new Intent(Departments.this, Chemistry.class));
                break;
            case R.id.btnCivil:
                startActivity(new Intent(Departments.this, Civil.class));
                break;
            case R.id.btnComputer:
                startActivity(new Intent(Departments.this, Computer.class));
                break;
            case R.id.btnEEE:
                startActivity(new Intent(Departments.this, EEE.class));
                break;
            case R.id.btnETC:
                startActivity(new Intent(Departments.this, ETC.class));
                break;
            case R.id.btnHuman:
                startActivity(new Intent(Departments.this, Humanities.class));
                break;
            case R.id.btnMath:
                startActivity(new Intent(Departments.this, Math.class));
                break;
            case R.id.btnMecha:
                startActivity(new Intent(Departments.this, Mecha.class));
                break;
            case R.id.btnMetal:
                startActivity(new Intent(Departments.this, Metal.class));
                break;
            case R.id.btnPhy:
                startActivity(new Intent(Departments.this, Physics.class));
                break;
            case R.id.btnPro:
                startActivity(new Intent(Departments.this, Production.class));
                break;
            case R.id.btnMCA:
                startActivity(new Intent(Departments.this, MCA.class));
                break;
        }
    }
}