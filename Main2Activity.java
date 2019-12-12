package com.example.calculator;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;



/*
import com.google.androidx.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
*/

public class Main2Activity extends AppCompatActivity {
    protected static final int RESULT_SPEECH = 1;
    TextToSpeech textToSpeech;
    protected Button btnSpeak;
    protected Button btnSpeak2;
    protected Button btnSpeak3;
    protected Button btnSpeak4;
    protected Button btnSpeak5;
    protected Button btnSpeak6;
    protected Button btnSpeak7;
    protected Button btnSpeak8;
    protected Button btnSpeak9;
    protected Button btnSpeak10;
    protected Button btnSpeak11;
    protected Button btnSpeak12;
    protected Button btnSpeak14;
    protected Button btnSpeak15;
    protected Button btnSpeak20;
    protected Button btnSpeak21;
    private TextView txtText, txtText2, txtText3, txtText20, txtText21, txtText4, txtText5, txtText6, txtText7, txtText8, txtText9, txtText10, txtText11, txtText12, txtText14, txtText15;
    private EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e20, e21;
    private String n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14;
    private float nn1, nn2, nn3, nn4, nn5, nn6, nn7, nn8, nn9, nn10, nn11, nn12, nn13, nn14;

    public Main2Activity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtText = (TextView) findViewById(R.id.editText1);

        Button btnSpeak = (Button) findViewById(R.id.b1);

        btnSpeak.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");
                 /*ArrayList<String> text = data
                        .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);*/
                if (!isNumeric(String.valueOf(intent))) {
                    try {
                        startActivityForResult(intent, 1);
                        txtText.setText("");
                    } catch (ActivityNotFoundException a) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Opps! Your device doesn't support Speech to Text",
                                Toast.LENGTH_SHORT);
                        t.show();
                        //startActivityForResult(intent, 12);
                    }
                } else {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter a number";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();

                }
                /*try {
                    startActivityForResult(intent, 1);
                    txtText.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();

                }*/
            }
        });


 /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main2, menu);
        return true;
    }*/

        txtText2 = (TextView) findViewById(R.id.editText2);

        btnSpeak2 = (Button) findViewById(R.id.b2);

        btnSpeak2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 2);
                    txtText2.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //     startActivityForResult(intent, 2);
                }
            }
        });
        txtText3 = (TextView) findViewById(R.id.editText3);

        btnSpeak3 = (Button) findViewById(R.id.b3);

        btnSpeak3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 3);
                    txtText3.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 3);
                }
            }
        });
        txtText4 = (TextView) findViewById(R.id.editText4);

        btnSpeak4 = (Button) findViewById(R.id.b4);

        btnSpeak4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 4);
                    txtText4.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 4);
                }
            }
        });
        txtText5 = (TextView) findViewById(R.id.editText5);

        btnSpeak5 = (Button) findViewById(R.id.b5);

        btnSpeak5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 5);
                    txtText5.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 5);
                }
            }
        });
        txtText6 = (TextView) findViewById(R.id.editText6);

        btnSpeak6 = (Button) findViewById(R.id.b6);

        btnSpeak6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 6);
                    txtText6.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    //startActivityForResult(intent, 6);
                }
            }
        });
        txtText7 = (TextView) findViewById(R.id.editText7);

        btnSpeak7 = (Button) findViewById(R.id.b7);

        btnSpeak7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 7);
                    txtText7.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 7);
                }
            }
        });
        txtText8 = (TextView) findViewById(R.id.editText8);

        btnSpeak8 = (Button) findViewById(R.id.b8);

        btnSpeak8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 8);
                    txtText8.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 8);
                }
            }
        });
        txtText9 = (TextView) findViewById(R.id.editText9);

        btnSpeak9 = (Button) findViewById(R.id.b9);

        btnSpeak9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 9);
                    txtText9.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 9);
                }
            }
        });
        txtText10 = (TextView) findViewById(R.id.editText10);

        btnSpeak10 = (Button) findViewById(R.id.b10);

        btnSpeak10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 10);
                    txtText10.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    // startActivityForResult(intent, 10);
                }
            }
        });
        txtText11 = (TextView) findViewById(R.id.editText11);

        Button btnSpeak11 = (Button) findViewById(R.id.b11);

        btnSpeak11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 11);
                    txtText11.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 11);
                }
            }
        });
        txtText12 = (TextView) findViewById(R.id.editText12);

        btnSpeak12 = (Button) findViewById(R.id.b12);

        btnSpeak12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 12);
                    txtText12.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 12);
                }
            }
        });
        txtText14 = (TextView) findViewById(R.id.editText20);

        btnSpeak14 = (Button) findViewById(R.id.b14);

        btnSpeak14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 13);
                    txtText12.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 12);
                }
            }
        });
        txtText15 = (TextView) findViewById(R.id.editText13);

        btnSpeak15 = (Button) findViewById(R.id.b15);

        btnSpeak15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 14);
                    txtText12.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 12);
                }
            }
        });
        txtText20 = (TextView) findViewById(R.id.editText30);

        btnSpeak20 = (Button) findViewById(R.id.b16);

        btnSpeak20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, 20);
                    txtText20.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                    //startActivityForResult(intent, 12);
                }
            }
        });
        txtText21 = (TextView) findViewById(R.id.editText31);

        btnSpeak21 = (Button) findViewById(R.id.b17);

        btnSpeak21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");
                /*ArrayList<String> text = data
                        .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);*/
                 if (!isNumeric(String.valueOf(intent))) {
                     try {
                         startActivityForResult(intent, 21);
                         txtText21.setText("");
                     } catch (ActivityNotFoundException a) {
                         Toast t = Toast.makeText(getApplicationContext(),
                                 "Opps! Your device doesn't support Speech to Text",
                                 Toast.LENGTH_SHORT);
                         t.show();
                         //startActivityForResult(intent, 12);
                     }
                    } else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }
                /*try {
                    startActivityForResult(intent, 21);
                    txtText21.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();*/
                    //startActivityForResult(intent, 12);
                //}
            }
        });

        final String[] n1 = new String[1];
        final String[] n2 = new String[1];
        final String[] n3 = new String[1];
        final String[] n4 = new String[1];
        final String[] n5 = new String[1];
        final String[] n6 = new String[1];
        final String[] n7 = new String[1];
        final String[] n8 = new String[1];
        final String[] n9 = new String[1];
        final String[] n10 = new String[1];
        final String[] n11 = new String[1];
        final String[] n12 = new String[1];
        final String[] n13 = new String[1];
        final String[] n14 = new String[1];
        final String[] n20 = new String[1];
        final String[] n21 = new String[1];
        final float[] nn1 = new float[1];
        final float[] nn2 = new float[1];
        final float[] nn3 = new float[1];
        final float[] nn4 = new float[1];
        final float[] nn5 = new float[1];
        final float[] nn6 = new float[1];
        final float[] nn7 = new float[1];
        final float[] nn8 = new float[1];
        final float[] nn9 = new float[1];
        final float[] nn10 = new float[1];
        final float[] nn11 = new float[1];
        final float[] nn12 = new float[1];
        final float[] nn13 = new float[1];
        final float[] nn14 = new float[1];
        final float[] nn20 = new float[1];
        final float[] nn21 = new float[1];
        Button btnSpeak13 = (Button) findViewById(R.id.b13);

        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        e5 = (EditText) findViewById(R.id.editText5);
        e6 = (EditText) findViewById(R.id.editText6);
        e7 = (EditText) findViewById(R.id.editText7);
        e8 = (EditText) findViewById(R.id.editText8);
        e9 = (EditText) findViewById(R.id.editText9);
        e10 = (EditText) findViewById(R.id.editText10);
        e11 = (EditText) findViewById(R.id.editText11);
        e12 = (EditText) findViewById(R.id.editText12);
        e13 = (EditText) findViewById(R.id.editText40);
        e14 = (EditText) findViewById(R.id.editText20);
        e15 = (EditText) findViewById(R.id.editText13);
        e20 = (EditText) findViewById(R.id.editText30);
        e21 = (EditText) findViewById(R.id.editText31);
        btnSpeak13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1[0] = e1.getText().toString();
                nn1[0] = Float.parseFloat(n1[0]);
                if(!(nn1[0]>5 && nn1[0]<11))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter subject1 mark between 6 and 10";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n2[0] = e2.getText().toString();
                nn2[0] = Float.parseFloat(n2[0]);

                if(!(nn2[0]>5 && nn2[0]<11))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter subject2 mark between 6 and 10";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n3[0] = e3.getText().toString();
                nn3[0] = Float.parseFloat(n3[0]);

                if(!(nn3[0]>5 && nn3[0]<11))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter subject3 mark between 6 and 10";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n4[0] = e4.getText().toString();
                nn4[0] = Float.parseFloat(n4[0]);

                if(!(nn4[0]>5 && nn4[0]<11))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter subject4 mark between 6 and 10";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n5[0] = e5.getText().toString();
                nn5[0] = Float.parseFloat(n5[0]);

                if(!(nn5[0]>5 && nn5[0]<11))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter subject5 mark between 6 and 10";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n6[0] = e6.getText().toString();
                nn6[0] = Float.parseFloat(n6[0]);

                if(!(nn6[0]>5 && nn6[0]<11))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter subject6 mark between 6 and 10";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n7[0] = e7.getText().toString();
                nn7[0] = Float.parseFloat(n7[0]);

                if(!(nn7[0]>1 && nn7[0]<5))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter credit for subject1 between 2 and 4";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n8[0] = e8.getText().toString();
                nn8[0] = Float.parseFloat(n8[0]);

                if(!(nn8[0]>1 && nn8[0]<5))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter credit for subject2 between 2 and 4";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n9[0] = e9.getText().toString();
                nn9[0] = Float.parseFloat(n9[0]);

                if(!(nn9[0]>1 && nn9[0]<5))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter credit for subject3 between 2 and 4";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n10[0] = e10.getText().toString();
                nn10[0] = Float.parseFloat(n10[0]);

                if(!(nn10[0]>1 && nn10[0]<5))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter credit for subject4 between 2 and 4";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n11[0] = e11.getText().toString();
                nn11[0] = Float.parseFloat(n11[0]);

                if(!(nn11[0]>1 && nn11[0]<5))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter credit for subject5 between 2 and 4";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n12[0] = e12.getText().toString();
                nn12[0] = Float.parseFloat(n12[0]);

                if(!(nn12[0]>1 && nn12[0]<5))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter credit for subject6 between 2 and 4";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n13[0] = e14.getText().toString();
                nn13[0] = Float.parseFloat(n13[0]);

                if(!(nn13[0]>5 && nn13[0]<11))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter subject7 mark between 6 and 10";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n14[0] = e15.getText().toString();
                nn14[0] = Float.parseFloat(n14[0]);

                if(!(nn14[0]>1 && nn14[0]<5))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter credit for subject7 between 2 and 4";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }


                n20[0] = e20.getText().toString();
                nn20[0] = Float.parseFloat(n20[0]);

                if(!(nn20[0]>5 && nn20[0]<11))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter subject8 mark between 6 and 10";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                n21[0] = e21.getText().toString();
                nn21[0] = Float.parseFloat(n21[0]);

                if(!(nn21[0]>1 && nn21[0]<5))
                {
                    Context context = getApplicationContext();
                    CharSequence tt = "Please enter credit for subject8 between 2 and 4";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, tt, duration);
                    toast.show();
                }

                //Float RESULT = ;
                e13.setText(String.valueOf((((nn1[0] * nn7[0]) + (nn2[0] * nn8[0]) + (nn3[0] * nn9[0]) + (nn4[0] * nn10[0]) + (nn5[0] * nn11[0]) + (nn6[0] * nn12[0]) + (nn14[0] * nn13[0]) + (nn20[0] * nn21[0])) / (nn7[0] + nn8[0] + nn9[0] + nn10[0] + nn11[0] + nn12[0] + nn14[0] + nn21[0]))));
               // textToSpeech.speak(String.valueOf(RESULT), TextToSpeech.QUEUE_ADD, null);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);



                    txtText.setText(text.get(0));
                    /*if (!isNumeric(String.valueOf(text))) {
                        txtText.setText(text.get(0));
                    } else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/

                }
                break;
            }
            case 2: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    txtText2.setText(text.get(0));
                    /*if (isNumeric(String.valueOf(text))) {
                        txtText2.setText(text.get(0));
                    } else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 3: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    txtText3.setText(text.get(0));
                   /* if (isNumeric(String.valueOf(text))) {
                        txtText3.setText(text.get(0));
                    } else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 4: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    txtText4.setText(text.get(0));

                   /* if (isNumeric(String.valueOf(text))) {
                        txtText4.setText(text.get(0));
                    } else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 5: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    txtText5.setText(text.get(0));

                    /*if (isNumeric(String.valueOf(text))) {
                        txtText5.setText(text.get(0));
                    } else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 6: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    txtText6.setText(text.get(0));
                    /*
                    if (isNumeric(String.valueOf(text))) {
                        txtText6.setText(text.get(0));
                    } else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 7: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    txtText7.setText(text.get(0));
                    /*
                    if (isNumeric(String.valueOf(text))) {
                        txtText7.setText(text.get(0));
                    } else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 8: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    txtText8.setText(text.get(0));
                    /*if (isNumeric(String.valueOf(text))) {
                        txtText8.setText(text.get(0));
                    } else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 9: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                  //  if (isNumeric(String.valueOf(text))) {
                        txtText9.setText(text.get(0));
                    /*} else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 10: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    //if (isNumeric(String.valueOf(text))) {
                        txtText10.setText(text.get(0));
                    /*} else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 11: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    //if (isNumeric(String.valueOf(text))) {
                        txtText11.setText(text.get(0));
                    /*} else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 12: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    //if (isNumeric(String.valueOf(text))) {
                        txtText12.setText(text.get(0));
                    /*} else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 13: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    //if (isNumeric(String.valueOf(text))) {
                        txtText14.setText(text.get(0));
                    /*} else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 14: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    //if (isNumeric(String.valueOf(text))) {
                        txtText15.setText(text.get(0));
                    /*} else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 20: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    //if (isNumeric(String.valueOf(text))) {
                        txtText20.setText(text.get(0));
                    /*} else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
            case 21: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    //if (isNumeric(String.valueOf(text)))
                   // {
                        txtText21.setText(text.get(0));
                    /*}
                    else {
                        Context context = getApplicationContext();
                        CharSequence tt = "Please enter a number";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, tt, duration);
                        toast.show();

                    }*/
                }
                break;
            }
        }


    }
    static boolean isNumeric(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i))
                    == false)
                return false;

        return true;
    }

}

