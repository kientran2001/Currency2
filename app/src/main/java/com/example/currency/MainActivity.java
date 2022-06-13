package com.example.currency;


import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2;
    private String dollar, dong;
    double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv_valDollar);
        tv2 = (TextView) findViewById(R.id.tv_valDong);
    }

    public void btnClick(View view) {
        Button button = (Button) view;
        String data = button.getText().toString();
        switch (data){
            case "=":
                solve();
                break;

            case "CE":
                //solve();
                dollar = "";
                break;

            case "x":
                //solve();
                if(dollar.length() > 1){
                    int value = parseInt(dollar)/10;
                    dollar = value + "";
                    break;
                }else{
                    dollar = "";
                    break;
                }
            default:
                if(dollar == null){
                    dollar = "";
                }
                //solve();
                dollar += data;
        }
        tv2.setText("đ " + answer + "K");
        tv1.setText("$ " + dollar);
    }

    public void solve(){
        try {
            answer = Double.parseDouble(dollar) * 23.185;
            dong = answer + "";
        }catch (Exception e){

        }
    }
}