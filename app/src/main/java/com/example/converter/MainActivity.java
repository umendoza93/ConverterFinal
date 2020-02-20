package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKM, txtMI, txtKG, txtLB, txtLI, txtGL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKM = findViewById(R.id.txtKM);
        txtMI = findViewById(R.id.txtMI);
        txtKG = findViewById(R.id.txtKG);
        txtLB = findViewById(R.id.txtLB);
        txtLI = findViewById(R.id.txtLI);
        txtGL = findViewById(R.id.txtGL);


        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (txtF.hasFocus()) {
                    String f = txtF.getText().toString();
                    Log.i("Converter","String of txtF = " + f);
                    if (f.length() == 0) {
                        Log.e("Error", "String of txtF is empty!");
                        return;
                    }
                    double valF = Double.parseDouble(f);
                    double valC = (valF - 32) * 5/9;

                    String c = String.format("%.2f", valC);
                    Log.i("Converter", "String of textC = " + c);
                    txtC.setText(c);
                }

            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (txtC.hasFocus()) {
                    String c = txtC.getText().toString();
                    Log.i("Converter","String of txtC = " + c);
                    if (c.length() == 0) {
                        Log.e("Error","String of txtC is empty!");
                        return;
                    }

                    double valC = 32;
                    try {
                        valC = Double.parseDouble(c);
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                        Log.e("Error", "String of txtC is not parsable");
                        return;
                    }
                    double valF = (valC * 9/5) + 32;

                    String f = Double.toString(valF);
                    Log.i("Converter", "String of txtF = " + f);
                    txtF.setText(f);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {}
        });


        txtKM.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (txtKM.hasFocus()) {
                    String k = txtKM.getText().toString();
                    Log.i("Converter", "String of txtKM = " + k);
                    if (k.length() == 0) {
                        Log.e("Error", "String of k is empty!");
                        return;
                    }
                    double valKM = Double.parseDouble(k);
                    double valMI = (valKM / 1.609);

                    String m = String.format("%.3f", valMI);
                    Log.i("Converter", "String of txtMI = " + m);
                    txtMI.setText(m);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        txtMI.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (txtMI.hasFocus()) {
                    String m = txtMI.getText().toString();
                    Log.i("Converter","String of txtMI = " + m);
                    if (m.length() == 0) {
                        Log.e("Error","String of m is empty!");
                        return;
                    }
                    double valMI = Double.parseDouble(m);
                    double valKM = (valMI * 1.609);

                    String km = String.format("%.3f",valKM);
                    Log.i("Converter","String of txtKM = " + km);
                    txtKM.setText(km);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        txtKG.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (txtKG.hasFocus()) {
                    String kg = txtKG.getText().toString();
                    Log.i("Converter", "String of txtKG = " + kg);
                    if (kg.length() == 0) {
                        Log.e("Error", "String of kg is empty!");
                        return;
                    }
                    double valKG = Double.parseDouble(kg);
                    double valLB = (valKG * 2.205);

                    String lb = String.format("%.3f", valLB);
                    Log.i("Converter", "String of txtLB = " + lb);
                    txtLB.setText(lb);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        txtLB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (txtLB.hasFocus()) {
                    String lb = txtLB.getText().toString();
                    Log.i("Converter","String of txtLB = " + lb);
                    if (lb.length() == 0) {
                        Log.e("Error", "String of lb is empty!");
                        return;
                    }
                    double valLB = Double.parseDouble(lb);
                    double valKG = (valLB / 2.205);

                    String kg = String.format("%.3f", valKG);
                    Log.i("Converter", "String of txtKG = " + kg);
                    txtKG.setText(kg);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        txtLI.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (txtLI.hasFocus()) {
                    String li = txtLI.getText().toString();
                    Log.i("Converter", "String of li = " + li);
                    if (li.length() == 0) {
                        Log.e("Error", "String of li is empty!");
                        return;
                    }
                    double valLI = Double.parseDouble(li);
                    double valGL = (valLI/3.785);

                    String gl = String.format("%.3f", valGL);
                    Log.i("Converter", "String of gl = " + gl);
                    txtGL.setText(gl);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        txtGL.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (txtGL.hasFocus()) {
                    String gl = txtGL.getText().toString();
                    Log.i("Converter", "String of gl = " + gl);
                    if (gl.length() == 0) {
                        Log.e("Error", "String of gl is empty!");
                        return;
                    }
                    double valGL = Double.parseDouble(gl);
                    double valLI = (valGL * 3.785);

                    String li = String.format("%.3f",valLI);
                    Log.i("Converter", "String of li = " + li);
                    txtLI.setText(li);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
