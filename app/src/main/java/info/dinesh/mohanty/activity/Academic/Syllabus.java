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

public class Syllabus extends AppCompatActivity {
    Button btnSArchitecture,btnSChemical,btnSCivil,btnSComputer,btnSEEE,btnSEE,btnSETC,btnSIT,btnSMechanical,btnSMME,btnSProduction;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnSArchitecture =(Button)findViewById(R.id.btnSArchitecture);
        btnSChemical =(Button)findViewById(R.id.btnSChemical);
        btnSCivil =(Button)findViewById(R.id.btnSCivil);
        btnSComputer =(Button)findViewById(R.id.btnSComputer);
        btnSEEE =(Button)findViewById(R.id.btnSEEE);
        btnSEE =(Button)findViewById(R.id.btnSEE);
        btnSETC =(Button)findViewById(R.id.btnSETC);
        btnSIT =(Button)findViewById(R.id.btnSIT);
        btnSMechanical=(Button)findViewById(R.id.btnSMechanical);
        btnSMME=(Button)findViewById(R.id.btnSMME);
        btnSProduction=(Button)findViewById(R.id.btnSProduction);



        btnSArchitecture.setOnClickListener(new View.OnClickListener(){
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnSArchitecture(Syllabus.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnSChemical.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnSChemical(Syllabus.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnSCivil.setOnClickListener(new View.OnClickListener(){
                                                @Override
                                                public void onClick(View v) {
                                                    Intent btnrRegBtechIntent = openbtnSCivil(Syllabus.this);
                                                    startActivity(btnrRegBtechIntent);
                                                }

                                            }
        );

        btnSComputer.setOnClickListener(new View.OnClickListener(){
                                                @Override
                                                public void onClick(View v) {
                                                    Intent btnrRegBtechIntent = openbtnSComputer(Syllabus.this);
                                                    startActivity(btnrRegBtechIntent);
                                                }

                                            }
        );
        btnSEEE.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnSEEE(Syllabus.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnSEE.setOnClickListener(new View.OnClickListener(){
                                                @Override
                                                public void onClick(View v) {
                                                    Intent btnrRegBtechIntent = openbtnSEE(Syllabus.this);
                                                    startActivity(btnrRegBtechIntent);
                                                }

                                            }
        );
        btnSETC.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnSEE(Syllabus.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnSIT.setOnClickListener(new View.OnClickListener(){
                                                @Override
                                                public void onClick(View v) {
                                                    Intent btnrRegBtechIntent = openbtnSIT(Syllabus.this);
                                                    startActivity(btnrRegBtechIntent);
                                                }

                                            }
        );
        btnSMechanical.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnSMechanical(Syllabus.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnSMME.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent btnrRegBtechIntent = openbtnSMME(Syllabus.this);
                                                  startActivity(btnrRegBtechIntent);
                                              }

                                          }
        );
        btnSProduction.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnSProduction(Syllabus.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );

    }
    public static Intent openbtnSArchitecture(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/ARCHITECTURE-NEW.pdf"));}
    public static Intent openbtnSChemical(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/CHEMICAL-NEW.pdf"));}
    public static Intent openbtnSCivil(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/CIVIL-NEW.pdf"));}
    public static Intent openbtnSComputer(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/COMPUTER-SCIENCE-NEW.pdf"));}
    public static Intent openbtnSEEE(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/ELECTRICAL-ELECTRONICS-NEW.pdf"));}
    public static Intent openbtnSEE(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/ELECTRICAL-NEW.pdf"));}
    public static Intent openbtnSETC(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/ELECTRONICS-TC-NEW.pdf"));}
    public static Intent openbtnSIT(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/INFORMATION-TECHNOLOGY-NEW.pdf"));}
    public static Intent openbtnSMechanical(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/MECHNICAL-NEW.pdf"));}
    public static Intent openbtnSMME(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/METALLURGY-MATERIALS-NEW.pdf"));}
    public static Intent openbtnSProduction(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/PRODUCTION-NEW.pdf"));}




}
