package dmc66.com;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = this;

        LinearLayout numbers= (LinearLayout) findViewById(R.id.numbers_Activity);
        LinearLayout family= (LinearLayout) findViewById(R.id.familyMembers_Activity);
        LinearLayout colors= (LinearLayout) findViewById(R.id.colors_Activity);
        LinearLayout phrases= (LinearLayout) findViewById(R.id.phrass_Activity);

        numbers.setOnClickListener(view -> {
            Toast.makeText(view.getContext(),"Open the list of numbers",Toast.LENGTH_SHORT).show();
            Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
            startActivity(numbersIntent);

        }

        );
        family.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(context,"Open the list of family",Toast.LENGTH_SHORT).show();
                                           Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                                           startActivity(familyIntent);

                                       }
                                   }

        );
        colors.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Toast.makeText(view.getContext(),"Open the list of colors",Toast.LENGTH_SHORT).show();
                                          Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                                          startActivity(colorsIntent);

                                      }
                                  }

        );
        phrases.setOnClickListener(view -> {
            Toast.makeText(view.getContext(),"Open the list of phrases",Toast.LENGTH_SHORT).show();
            Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
            startActivity(phrasesIntent);

        }

        );
    }


    }