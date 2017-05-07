package info.dinesh.mohanty.activity.Food;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class Food extends AppCompatActivity implements View.OnClickListener{
    private Toolbar toolbar;
    private Button btnlazziz,btnkedia,btnMaaMetakani,btnDwaraka,btnSahid,btnSwarup,btnGocool,btnIcepoint,btnGObe,btnAFC,btncg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnlazziz = (Button) findViewById(R.id.btnlazziz);
        btnkedia = (Button) findViewById(R.id.btnkedia);
        btnMaaMetakani =(Button) findViewById(R.id.btnMaaMetakani);
        btnDwaraka=(Button) findViewById(R.id.btnDwaraka);
        btnSahid=(Button)findViewById(R.id.btnSahid) ;
        btnSwarup=(Button)findViewById(R.id.btnSwarup);
        btnGocool=(Button) findViewById(R.id.btnGocool);
        btnIcepoint=(Button)findViewById(R.id.btnIcepoint);
        btnGObe=(Button)findViewById(R.id.btnGObe);
        btnAFC=(Button)findViewById(R.id.btnAFC);
        btncg=(Button)findViewById(R.id.btncg);

        btnlazziz.setOnClickListener(this);
        btnkedia.setOnClickListener(this);
        btnMaaMetakani.setOnClickListener(this);
        btnDwaraka.setOnClickListener(this);
        btnSahid.setOnClickListener(this);
        btnSwarup.setOnClickListener(this);
        btnGocool.setOnClickListener(this);
        btnIcepoint.setOnClickListener(this);
        btnGObe.setOnClickListener(this);
        btnAFC.setOnClickListener(this);
        btncg.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnlazziz:
                startActivity(new Intent(Food.this, Lazziz.class));
                break;
            case R.id.btnkedia:
                startActivity(new Intent(Food.this, Kedia.class));
                break;
            case R.id.btnMaaMetakani:
                startActivity(new Intent(Food.this, MaaMetakani.class));
                break;
            case R.id.btnDwaraka:
                startActivity(new Intent(Food.this, Dwaraka.class));
                break;

            case R.id.btnSahid:
                startActivity(new Intent(Food.this, Sahid.class));
                break;
            case R.id.btnSwarup:
                startActivity(new Intent(Food.this, Swarup.class));
                break;
            case R.id.btnGocool:
                startActivity(new Intent(Food.this, Gocool.class));
                break;
            case R.id.btnIcepoint:
                startActivity(new Intent(Food.this, Icepoint.class));
                break;
            case R.id.btnGObe:
                startActivity(new Intent(Food.this, Gocoolbe.class));
                break;
            case R.id.btnAFC:
                startActivity(new Intent(Food.this, AFC.class));
                break;
            case R.id.btncg:
                startActivity(new Intent(Food.this, CG.class));
                break;
        }
    }
}
