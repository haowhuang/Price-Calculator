package com.example.ese343assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String money_str = "";
    String displayString = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPrice(){
        displayString = "";
        TextView priceTxt = findViewById(R.id.priceTxt);
        if(money_str.length() < 2){ //0.01
            displayString = "0.0" + money_str;
        }
        else if(money_str.length() < 3) { //0.15
            displayString = "0." + money_str;
        }
        else{ //length() >= 3, 1.15
            for(int i=0; i < money_str.length(); i++){
                if(i == money_str.length() - 2){
                    displayString += ".";
                }
                displayString += money_str.charAt(i);
            }
        }
        priceTxt.setText("Price: " + displayString);
        return;
    }
    public void calculation(){
        double price = Double.parseDouble(displayString);

//        TextView debugTxt = findViewById(R.id.debug); //debug
//        debugTxt.setText(String.valueOf(price)); //debug
        int twentyCount = 0, tenCount = 0, fiveCount = 0, oneCount = 0, twoFiveCentCount =0, tenCentCount = 0,fiveCentCount = 0, oneCentCount = 0;
        while(price > 0){
            if(price >= 20){
                price -= 20;
                twentyCount++;
                price = Math.round(price * 100.0) / 100.0;
            }
            else if(price >= 10){
                price -= 10;
                tenCount++;
                price = Math.round(price * 100.0) / 100.0;
            }
            else if(price >= 5){
                price -= 5;
                fiveCount++;
                price = Math.round(price * 100.0) / 100.0;
            }
            else if(price >= 1){
                price -=1;
                oneCount++;
                price = Math.round(price * 100.0) / 100.0;
            }
            else if(price >= 0.25){
                price -= 0.25;
                twoFiveCentCount++;
                price = Math.round(price * 100.0) / 100.0;
            }
            else if(price >= 0.1){
                price -= 0.1;
                tenCentCount++;
                price = Math.round(price * 100.0) / 100.0;
            }
            else if(price > 0.04){
                price -= 0.05;
                fiveCentCount++;
                price = Math.round(price * 100.0) / 100.0;
            }
            else if(price > 0.00){
                price -= 0.01;
                oneCentCount++;
                price = Math.round(price * 100.0) / 100.0;
            }
        }
        TextView twentyTxt = findViewById(R.id.twenty);
        twentyTxt.setText("$20: " + twentyCount);
        TextView tenTxt = findViewById(R.id.ten);
        tenTxt.setText("$10: " + tenCount);
        TextView fiveTxt = findViewById(R.id.five);
        fiveTxt.setText("$5: " + fiveCount);
        TextView oneTxt = findViewById(R.id.one);
        oneTxt.setText("$1: " + oneCount);
        TextView twoFiveTxt = findViewById(R.id.twentyFiveC);
        twoFiveTxt.setText("25¢: " + twoFiveCentCount);
        TextView tenCTxt = findViewById(R.id.tenC);
        tenCTxt.setText("10¢: " + tenCentCount);
        TextView fiveCTxt = findViewById(R.id.fiveC);
        fiveCTxt.setText("5¢: " + fiveCentCount);
        TextView oneCTxt = findViewById(R.id.oneC);
        oneCTxt.setText("1¢: " + oneCentCount);
    }
    public void button1Clicked(View view){
        money_str = money_str + "1";
        displayPrice();
        calculation();
        System.out.println("1");
    }
    public void button2Clicked(View view){
        money_str = money_str + "2";
        displayPrice();
        calculation();
    }
    public void button3Clicked(View view){
        money_str = money_str + "3";
        displayPrice();
        calculation();
    }
    public void button4Clicked(View view){
        money_str = money_str + "4";
        displayPrice();
        calculation();
    }
    public void button5Clicked(View view){
        money_str = money_str + "5";
        displayPrice();
        calculation();
    }
    public void button6Clicked(View view){
        money_str = money_str + "6";
        displayPrice();
        calculation();
    }
    public void button7Clicked(View view){
        money_str = money_str + "7";
        displayPrice();
        calculation();
    }
    public void button8Clicked(View view){
        money_str = money_str + "8";
        displayPrice();
        calculation();
    }
    public void button9Clicked(View view){
        money_str = money_str + "9";
        displayPrice();
        calculation();
    }
    public void button0Clicked(View view){
        money_str = money_str + "0";
        displayPrice();
        calculation();
    }

    public void clearClicked(View view){
        money_str = "";
        displayString = "0";
        TextView priceTxt = findViewById(R.id.priceTxt);
        priceTxt.setText("Price: 0.00");
        calculation();
    }

}