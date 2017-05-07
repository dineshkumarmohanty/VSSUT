package info.dinesh.mohanty.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;

import info.dinesh.mohanty.R;
import info.dinesh.mohanty.activity.ABOUT.AboutVSSUT;
import info.dinesh.mohanty.activity.Academic.Academics;
import info.dinesh.mohanty.activity.Alumni.Alumni;
import info.dinesh.mohanty.activity.CLUB.Clubs;
import info.dinesh.mohanty.activity.COMPANY.Company;
import info.dinesh.mohanty.activity.CONTACTS.Contact;
import info.dinesh.mohanty.activity.DEPARTMENT.Departments;
import info.dinesh.mohanty.activity.FEST.Fest;
import info.dinesh.mohanty.activity.Fascility.Fascility;
import info.dinesh.mohanty.activity.Food.Food;
import info.dinesh.mohanty.activity.Noticeboard.NoticeBoard;
import info.dinesh.mohanty.activity.TNP.TNP;
import info.dinesh.mohanty.activity.Visit.Visit;

public class Starts extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnAbout, btnAcademic, btnVisit, btnFoods, btnClubs, btnTNP, btnDepartment, btncgpa, btnfest, btnFacility, btnnotice, btnAlumni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OneSignal.startInit(this)
                .setNotificationOpenedHandler(new ExampleNotificationOpenedHandler())
                .init();

        setContentView(R.layout.activity_starts);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAbout = (Button) findViewById(R.id.btnAbout);
        btnAcademic = (Button) findViewById(R.id.btnAcademic);
        btnVisit = (Button) findViewById(R.id.btnVisit);
        btnFoods = (Button) findViewById(R.id.btnFoods);
        btnClubs = (Button) findViewById(R.id.btnClubs);
        btnTNP = (Button) findViewById(R.id.btnTNP);
        btnDepartment = (Button) findViewById(R.id.btnDepartment);
        btncgpa = (Button) findViewById(R.id.btncgpa);
        btnfest = (Button) findViewById(R.id.btnfest);
        btnFacility = (Button) findViewById(R.id.btnFacility);
        btnnotice = (Button) findViewById(R.id.btnnotice);
        btnAlumni = (Button) findViewById(R.id.btnAlumni);

        btnAbout.setOnClickListener(this);
        btnAcademic.setOnClickListener(this);
        btnVisit.setOnClickListener(this);
        btnFoods.setOnClickListener(this);
        btnClubs.setOnClickListener(this);
        btnTNP.setOnClickListener(this);
        btnDepartment.setOnClickListener(this);
        btncgpa.setOnClickListener(this);
        btnfest.setOnClickListener(this);
        btnFacility.setOnClickListener(this);
        btnnotice.setOnClickListener(this);
        btnAlumni.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Starts.this,
                        Company.class));

            }
        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAbout:
                startActivity(new Intent(Starts.this, AboutVSSUT.class));
                break;
            case R.id.btnAcademic:
                startActivity(new Intent(Starts.this, Academics.class));
                break;
            case R.id.btnVisit:
                startActivity(new Intent(Starts.this, Visit.class));
                break;
            case R.id.btnFoods:
                startActivity(new Intent(Starts.this, Food.class));
                break;
            case R.id.btnClubs:
                startActivity(new Intent(Starts.this, Clubs.class));
                break;
            case R.id.btnTNP:
                startActivity(new Intent(Starts.this, TNP.class));
                break;
            case R.id.btnDepartment:
                startActivity(new Intent(Starts.this, Departments.class));
                break;
            case R.id.btncgpa:
                startActivity(new Intent(Starts.this, Contact.class));
                break;
            case R.id.btnfest:
                startActivity(new Intent(Starts.this, Fest.class));
                break;
            case R.id.btnFacility:
                startActivity(new Intent(Starts.this, Fascility.class));
                break;
            case R.id.btnnotice:
                startActivity(new Intent(Starts.this, NoticeBoard.class));
                break;
            case R.id.btnAlumni:
                startActivity(new Intent(Starts.this, Alumni.class));
                break;


        }
    }

    private class ExampleNotificationOpenedHandler implements OneSignal.NotificationOpenedHandler {
        @Override
        public void notificationOpened(OSNotificationOpenResult result) {
            OSNotificationAction.ActionType actionType = result.action.type;
            JSONObject data = result.notification.payload.additionalData;
            String customKey;

            if (data != null) {
                customKey = data.optString("customkey", null);
                if (customKey != null)
                    Log.i("OneSignalExample", "customkey set with value: " + customKey);
            }

            if (actionType == OSNotificationAction.ActionType.ActionTaken)
                Log.i("OneSignalExample", "Button pressed with id: " + result.action.actionID);


            Intent intent = new Intent(Starts.this , NoticeBoard.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);



        }
    }

}
