package dmc66.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;


import dmc66.com.databinding.ActivityMainBinding;

public class NumbersActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        // Create a list of words

       ArrayList<Word> numberArrayList = new ArrayList<>();
        numberArrayList.add(new Word(R.drawable.zero,"صفر","Zero"));
        numberArrayList.add(new Word(R.drawable.number_one,"واحد","One"));
        numberArrayList.add(new Word(R.drawable.number_2,"إثنان","Two"));
        numberArrayList.add(new Word(R.drawable.number_3,"ثلاثة","Three"));
        numberArrayList.add(new Word(R.drawable.number_four,"أربعة","Four"));
        numberArrayList.add(new Word(R.drawable.number_5,"خمسة","Five"));
        numberArrayList.add(new Word(R.drawable.six,"ستّة","Six"));
        numberArrayList.add(new Word(R.drawable.seven,"سبعة","Seven"));
        numberArrayList.add(new Word(R.drawable.number_8,"ثامنية","Eight"));
        numberArrayList.add(new Word(R.drawable.number_9,"تعسة","Nine"));


        /** Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
          *adapter knows how to create list items for each item in the list.
          */

        WordAdapter items = new WordAdapter(this,numberArrayList);

        /** Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
         * There should be a {@link ListView} with the view ID called list, which is declared in the
         * word_list.xml file.
         */

        ListView listView=(ListView) findViewById(R.id.listview);

        /** Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
         *  {@link ListView} will display list items for each {@link Word} in the list.
         */
        listView.setAdapter(items);
      
    }
}