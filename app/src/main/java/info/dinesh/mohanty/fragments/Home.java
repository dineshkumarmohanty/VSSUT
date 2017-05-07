package info.dinesh.mohanty.fragments;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class Home extends AppCompatActivity  {

    private Toolbar toolbar;
    private Button btnSimpleTabs, btnScrollableTabs, btnIconTextTabs, btnIconTabs, btnCustomIconTextTabs;
        public Home(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabs);
        btnScrollableTabs = (Button) findViewById(R.id.btnScrollableTabs);
        btnIconTextTabs = (Button) findViewById(R.id.btnIconTextTabs);
        btnIconTabs = (Button) findViewById(R.id.btnIconTabs);
        btnCustomIconTextTabs = (Button) findViewById(R.id.btnCustomIconTabs);



    }
         public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_home, container, false);
        }

}
