package com.example.xinshijie.ramble.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.xinshijie.ramble.R;

/**
 * Created by xsj-chenXin on 2015/12/13.
 */
public class Welcome extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.welcome);

        Button bt_satrt = (Button) findViewById(R.id.bt_satrt);
        bt_satrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
