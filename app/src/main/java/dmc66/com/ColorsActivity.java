package dmc66.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        // Create a list of words

        ArrayList<Word> numberArrayList = new ArrayList<>();
        numberArrayList.add(new Word(R.drawable.circlebleu,"ازرق","Bleu"));
        numberArrayList.add(new Word(R.drawable.circleredd,"احمر","Red"));
        numberArrayList.add(new Word(R.drawable.circleyelloww,"اصفر","Yellow"));
        numberArrayList.add(new Word(R.drawable.circleyellow,"برتقالي","Orange"));
        numberArrayList.add(new Word(R.drawable.circlegreen,"اخضر","Green"));
        numberArrayList.add(new Word(R.drawable.circlepurple,"بنفسجي","purple"));
        numberArrayList.add(new Word(R.drawable.circleblack,"اسود","Black"));
        numberArrayList.add(new Word(R.drawable.circlewhite,"ابيض","White"));



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
