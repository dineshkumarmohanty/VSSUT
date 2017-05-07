package info.dinesh.mohanty.activity.Visit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;





public class Visit extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnPlaces,  btnBus, btnBusTicket,btnTrain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnPlaces = (Button) findViewById(R.id.btnPlaces);
        btnTrain = (Button) findViewById(R.id.btnIconTabs1);
        btnBus = (Button) findViewById(R.id.btnBus);
        btnBusTicket = (Button) findViewById(R.id.btnIconTabs);


        btnPlaces.setOnClickListener(this);
        btnTrain.setOnClickListener(this);
        btnBus.setOnClickListener(this);
        btnBusTicket.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnPlaces:
                startActivity(new Intent(Visit.this, Places.class));
                break;

            case R.id.btnBus:
                startActivity(new Intent(Visit.this, Bus.class));
                break;
            case R.id.btnIconTabs:
                startActivity(new Intent(Visit.this, BusTicket.class));
                break;
            case R.id.btnIconTabs1:
                startActivity(new Intent(Visit.this, Train.class));
                break;
        }
    }

}
