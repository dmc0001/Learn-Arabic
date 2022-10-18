package dmc66.com;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class preInterfaceAcitvity  extends AppCompatActivity {
    Timer timer;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.pre_interface);

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(preInterfaceAcitvity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);


    }


}
