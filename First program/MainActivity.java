package com.example.mytestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public String res = "";
    public String reslocal = "";
    public String res1 = "";
    public int choise;

    public String screen = "";


    public void numset1 (View v) {
        Button num1 = (Button) findViewById(R.id.buttonone);

        res = num1.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }
    public void numset2 (View v) {
        Button num2 = (Button) findViewById(R.id.buttontwo);

        res = num2.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }
    public void numset3 (View v) {
        Button num3 = (Button) findViewById(R.id.buttonthree);

        res = num3.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }
    public void numset4 (View v) {
        Button num4 = (Button) findViewById(R.id.buttonfour);

        res = num4.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }
    public void numset5 (View v) {
        Button num5 = (Button) findViewById(R.id.buttonfive);

        res = num5.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }
    public void numset6 (View v) {
        Button num6 = (Button) findViewById(R.id.buttonsix);

        res = num6.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }
    public void numset7 (View v) {
        Button num7 = (Button) findViewById(R.id.buttonseven);

        res = num7.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }
    public void numset8 (View v) {
        Button num8 = (Button) findViewById(R.id.buttoneight);

        res = num8.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }
    public void numset9 (View v) {
        Button num9 = (Button) findViewById(R.id.buttonnine);

        res = num9.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }
    public void numset0 (View v) {
        Button num0 = (Button) findViewById(R.id.buttonzero);

        res = num0.getText().toString();

        screen += res;
        reslocal += res;

        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }



    public void exprplus (View v){
        screen += "+";
        res1 = reslocal;
        reslocal = "";
        res = "";

        choise = 1;
        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }

    public void exprmin(View v){
        screen += "-";
        res1 = reslocal;
        reslocal = "";
        res = "";

        choise = 2;
        TextView restext = (TextView) findViewById(R.id.FinalText);
        restext.setText(screen);
    }

    public void total(View v){
        if (choise == 1) {
            int totalint = Integer.parseInt(res1.toString()) + Integer.parseInt(reslocal.toString());

            TextView restext = (TextView) findViewById(R.id.FinalText);
            restext.setText(Integer.toString(totalint));
        }
        if (choise == 2) {
            int totalint = Integer.parseInt(res1.toString()) - Integer.parseInt(reslocal.toString());

            TextView restext = (TextView) findViewById(R.id.FinalText);
            restext.setText(Integer.toString(totalint));
        }
        res = "";
        res1 = "";
        reslocal = "";
        screen = "";
    }






}
