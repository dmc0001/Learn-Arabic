package dmc66.com;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity   {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Find the View that shows the numbers category
        Context context = this;


        ListView listView = findViewById(R.id.listview);


        ArrayList<Word> arrayList = new ArrayList<>();
        arrayList.add(new Word(R.drawable.one, "الارقام", "Numbers",R.raw.rolling));
        arrayList.add(new Word(R.drawable.family, "العائلة", "Family",R.raw.rolling));
        arrayList.add(new Word(R.drawable.colour, "الالوان", "Colors",R.raw.rolling));
        arrayList.add(new Word(R.drawable.left_quotes, "الجمل", "Phrases",R.raw.rolling));
        ArrayAdapter<Word> myAdapter = new WordAdapter(this, arrayList);
        listView.setAdapter(myAdapter);

        // Set a click listener on that View

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
                    switch (position){
                        case 0:{
                            // This case will be executed when the numbers category is clicked on.
                            Toast.makeText(view.getContext(),"Open the list of numbers",Toast.LENGTH_SHORT).show();
                            /** Create a new intent to open the {@link NumbersActivity}*/
                            Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                            // Start the new activity
                            startActivity(numbersIntent);
                            break;
                        }
                        case 1:{
                            // This case will be executed when the family category is clicked on.
                            Toast.makeText(context,"Open the list of family",Toast.LENGTH_SHORT).show();
                            /** Create a new intent to open the {@link FamilyActivity}*/
                            Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                            // Start the new activity
                            startActivity(familyIntent);
                            break;
                        }
                        case 2:{
                            // This case will be executed when the colors category is clicked on.
                            Toast.makeText(view.getContext(),"Open the list of colors",Toast.LENGTH_SHORT).show();
                            /** Create a new intent to open the {@link ColorsActivity}*/
                            Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                            // Start the new activity
                            startActivity(colorsIntent);
                            break;
                        }
                        case 3:{
                            // This case will be executed when the phrases category is clicked on.
                            Toast.makeText(view.getContext(),"Open the list of phrases",Toast.LENGTH_SHORT).show();
                            /** Create a new intent to open the {@link PhrasesActivity}*/
                            Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                            // Start the new activity
                            startActivity(phrasesIntent);
                            break;

                        }
                    }

                }
        );


    }


}