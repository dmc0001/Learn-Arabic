package dmc66.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        // Create a list of words

        ArrayList<Word> numberArrayList = new ArrayList<>();
        numberArrayList.add(new Word("هل استطيع","May I, might I, can I, could I ",R.raw.cani));
        numberArrayList.add(new Word("هل تسمح","Would you let me , allow me ",R.raw.woulditbepossibleformeto));
        numberArrayList.add(new Word("هل تمانع لو","Do you mind if ",R.raw.doyoumindif));
        numberArrayList.add(new Word("هل مسموح لنا ان","Are we allowed to ",R.raw.areweallowedto));
        numberArrayList.add(new Word("هل الممكن ان","Is it possible to ",R.raw.isitpossibleto));
        numberArrayList.add(new Word("تسطيع، بامكانك ان","Would it be possible for me to ",R.raw.woulditbepossibleformeto));
        numberArrayList.add(new Word("بالتاكيد،انا لا امانع","You may , you can ",R.raw.youmayyoucan));
      ;


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
