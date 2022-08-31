package dmc66.com;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
     * based on a data source, which is a list of {@link Word} objects.
     */


    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words   is the list of {@link Word}s to be displayed.
     */

    public WordAdapter(@NonNull Activity context, @NonNull ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        // Check if an existing view is being reused, otherwise inflate the view
         if(listItemView== null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item2, parent, false);
         }

        // Find the TextView in the list_item2.xml layout with the ID default_text_view
        TextView default_text = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Find the TextView in the list_item2.xml layout with the ID arabic_text_view
        TextView arabic_text = (TextView)listItemView.findViewById(R.id.arabic_text_view);
        // Find the ImageView in the list_item2.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Get the {@link Word} object located at this position in the list

        Word currentWord = getItem(position);

         // Get the default translation from the currentWord object and set this text on the default TextView

        default_text.setText(currentWord.getDefaultTranslation());

        // Get the Arabic translation from the currentWord object and set this text on the Arabic TextView

        arabic_text.setText(currentWord.getArabicTranslation());

        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getResourceImageId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        imageView.setImageResource(currentWord.getResourceImageId());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in the ListView
        return listItemView;
    }

}
