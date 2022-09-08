package dmc66.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        // Create a list of words

        ArrayList<Word> numberArrayList = new ArrayList<>();
        numberArrayList.add(new Word(R.drawable.dad,"الاب","Father",R.raw.rolling));
        numberArrayList.add(new Word(R.drawable.mother,"الام","Mother",R.raw.rolling));
        numberArrayList.add(new Word(R.drawable.brother,"الاخ","Brother",R.raw.rolling));
        numberArrayList.add(new Word(R.drawable.sister,"الاخت","Sister",R.raw.rolling));
        numberArrayList.add(new Word(R.drawable.grandpa,"الجد","Grandfather",R.raw.rolling));
        numberArrayList.add(new Word(R.drawable.grandma,"الجدة","Grandmother",R.raw.rolling));


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

