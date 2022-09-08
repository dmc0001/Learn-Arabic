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
        setContentView(R.layout.activity_main);
        Context context = this;


        ListView listView = findViewById(R.id.listview);


        ArrayList<Word> arrayList = new ArrayList<>();
        arrayList.add(new Word(R.drawable.one, "الارقام", "Numbers",R.raw.rolling));
        arrayList.add(new Word(R.drawable.family, "العائلة", "Family",R.raw.rolling));
        arrayList.add(new Word(R.drawable.colour, "الالوان", "Colors",R.raw.rolling));
        arrayList.add(new Word(R.drawable.left_quotes, "الجمل", "Phrases",R.raw.rolling));
        ArrayAdapter<Word> myAdapter = new WordAdapter(this, arrayList);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            switch (position){
                case 0:{
                    Toast.makeText(view.getContext(),"Open the list of numbers",Toast.LENGTH_SHORT).show();
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                    break;
                }
                case 1:{
                    Toast.makeText(context,"Open the list of family",Toast.LENGTH_SHORT).show();
                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(familyIntent);
                    break;
                }
                case 2:{
                    Toast.makeText(view.getContext(),"Open the list of colors",Toast.LENGTH_SHORT).show();
                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(colorsIntent);
                    break;
                }
                case 3:{
                    Toast.makeText(view.getContext(),"Open the list of phrases",Toast.LENGTH_SHORT).show();
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phrasesIntent);
                    break;

                }
            }

                }
        );


    }


    }