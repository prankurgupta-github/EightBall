package com.prankurdevelopement.eightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbutton;

        askbutton = findViewById(R.id.askbutton);

        final ImageView ballImage = findViewById(R.id.ballimage);

        final int[] ballArray = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5
        };

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("EightBall","Ze button has been pressed");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(4);

                Log.d("EightBall","The random number is: " + number);

                ballImage.setImageResource(ballArray[number]);

            }
        });



    }
}
