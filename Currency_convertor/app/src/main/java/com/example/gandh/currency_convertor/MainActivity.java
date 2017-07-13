package com.example.gandh.currency_convertor;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    EditText et1;
    EditText et2;
    RadioGroup rg1;
    RadioGroup rg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         et1 = (EditText) findViewById(R.id.input_amount);
         et2 = (EditText) findViewById(R.id.output_amount);
        Button b1 = (Button) findViewById(R.id.button_convert);
         rg1 = (RadioGroup) findViewById(R.id.radiogroup_1);
         rg2 = (RadioGroup) findViewById(R.id.radiogroup_2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id1 = 0, id2 = 0;

                id1 = rg1.getCheckedRadioButtonId();
                id2 = rg2.getCheckedRadioButtonId();
                int b1 = R.id.radioButton1;
                int b2 = R.id.radioButton2;
                int b3 = R.id.radioButton3;
                int b4 = R.id.radioButton4;
                int b5 = R.id.radioButton5;
                double input = Double.parseDouble(et1.getText().toString());
                double output = 0;
                Toast toast = Toast.makeText(getApplicationContext(), "invalid input select correct currencies for conversion", Toast.LENGTH_SHORT);
                Toast toast1 = Toast.makeText(getApplicationContext(), "invalid input", Toast.LENGTH_SHORT);
                if (input <0  ) {
                    toast1.show();
                }
                else {
                if (id1 == b1) {
                    if (id2 == b4)
                        output = input / 1.34;
                    else if (id2 == b5)
                        output = input / 1.34 * 0.83;
                    else
                        toast.show();
                }
                if (id1 == b2) {
                    if (id2 == b4)
                        output = input / 1.32;
                    else if (id2 == b5)
                        output = input / 1.32 * 0.83;
                    else
                        toast.show();
                }
                if (id1 == b3) {
                    if (id2 == b4)
                        output = input / 68.14;
                    else if (id2 == b5)
                        output = input / 68.14 * 0.83;
                    else
                        toast.show();
                }


                et2.setText(output+"");

            }}
        });

        Button b2 = (Button)findViewById(R.id.button_clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                rg1.clearCheck();
            }
        });
    }
}
