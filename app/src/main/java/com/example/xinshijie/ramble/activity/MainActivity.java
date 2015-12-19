package com.example.xinshijie.ramble.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.xinshijie.ramble.R;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgbt_snow      = (ImageButton) findViewById(R.id.imgbt_snow);
        ImageButton imgbt_sea       = (ImageButton) findViewById(R.id.imgbt_sea);
        ImageButton imgbt_mountain  = (ImageButton) findViewById(R.id.imgbt_mountain);
        ImageButton imgbt_rural     = (ImageButton) findViewById(R.id.imgbt_rural);
        ImageButton imgbt_city      = (ImageButton) findViewById(R.id.imgbt_city);
        imgbt_snow.setOnClickListener(MainActivity.this);
        imgbt_sea.setOnClickListener(MainActivity.this);
        imgbt_mountain.setOnClickListener(MainActivity.this);
        imgbt_rural.setOnClickListener(MainActivity.this);
        imgbt_city.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgbt_snow:
                Toast.makeText(MainActivity.this, "imgbt_snow", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imgbt_sea:
                Toast.makeText(MainActivity.this, "imgbt_sea", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imgbt_mountain:
                Toast.makeText(MainActivity.this, "imgbt_mountain", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imgbt_rural:
                Toast.makeText(MainActivity.this, "imgbt_rural", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imgbt_city:
                Toast.makeText(MainActivity.this, "imgbt_city", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
