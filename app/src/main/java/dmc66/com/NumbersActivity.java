package dmc66.com;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;


import dmc66.com.databinding.ActivityMainBinding;

public class NumbersActivity extends AppCompatActivity {

    /** Handles playback of all the sound files */

private MediaPlayer mMediaPlayer;

    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed
     * playing the audio file.
     */
    
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        // Create a list of words

       final ArrayList<Word> numberArrayList = new ArrayList<>();
        numberArrayList.add(new Word(R.drawable.zero,"صفر","Zero",R.raw.zero));
        numberArrayList.add(new Word(R.drawable.number_one,"واحد","One",R.raw.one));
        numberArrayList.add(new Word(R.drawable.number_2,"إثنان","Two",R.raw.two));
        numberArrayList.add(new Word(R.drawable.number_3,"ثلاثة","Three",R.raw.three));
        numberArrayList.add(new Word(R.drawable.number_four,"أربعة","Four",R.raw.four));
        numberArrayList.add(new Word(R.drawable.number_5,"خمسة","Five",R.raw.five));
        numberArrayList.add(new Word(R.drawable.six,"ستّة","Six",R.raw.six));
        numberArrayList.add(new Word(R.drawable.seven,"سبعة","Seven",R.raw.seven));
        numberArrayList.add(new Word(R.drawable.number_8,"ثامنية","Eight",R.raw.eight));
        numberArrayList.add(new Word(R.drawable.number_9,"تعسة","Nine",R.raw.nine));


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

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file
                releaseMediaPlayer();

                // Get the {@link Word} object at the given position the user clicked on
                Word word = numberArrayList.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                 mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getResourceAudioId());

                // Start the audio file
                mMediaPlayer.start();

                // Setup a listener on the media player, so that we can stop and release the
                // media player once the sound has finished playing.
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
      
    }
