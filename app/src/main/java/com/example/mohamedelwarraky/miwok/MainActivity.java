package com.example.mohamedelwarraky.miwok;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    /*
    The reference value of time
     */
    private static long back_pressed;
    /*
    Toast messege to know if user press back button
     */
    Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find the view that show the numbers category
        TextView numbers = findViewById(R.id.numbers);
        // set onClickListener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // create a new intent to open the {@link NumbersActivity}
                Intent myintent = new Intent(MainActivity.this, NumbersActivity.class);
                // start the new activity
                startActivity(myintent);

            }
        });

        //find the view that show the family category
        TextView family = findViewById(R.id.family);
        // set onClickListener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new intent to open the {@link FamilyMembersActivity}
                Intent myintent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                // start the new activity
                startActivity(myintent);
            }
        });


        //find the view that show the colors category
        TextView color = findViewById(R.id.colors);
        // set onClickListener on that view
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new intent to open the {@link ColorsActivity}
                Intent myintent = new Intent(MainActivity.this, ColorsActivity.class);
                // start the new activity
                startActivity(myintent);
            }
        });

        //find the view that show the phrases category
        TextView phrases = findViewById(R.id.phrases);
        // set onClickListener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new intent to open the {@link PhrasesActivity}
                Intent myintent = new Intent(MainActivity.this, PhrasesActivity.class);
                // start the new activity
                startActivity(myintent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (back_pressed + 1500 > System.currentTimeMillis()) {
            super.onBackPressed();
            mToast.cancel();
        }
        else {
            //show toast messege when user press back once
            mToast = Toast.makeText(MainActivity.this, "Press once again to exit!", Toast.LENGTH_SHORT);
            mToast.show();
        }
        back_pressed = System.currentTimeMillis();
    }

}
