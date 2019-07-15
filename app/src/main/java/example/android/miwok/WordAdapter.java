package example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> Words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);


        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.mivok);

        miwokTextView.setText(currentWord.getMiwikokTranslation());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaut);

        defaultTextView.setText(currentWord.getDefaultTranslation());

       
        ImageView ResourceId =(ImageView) listItemView.findViewById((R.id.image));

        ResourceId.setImageResource(currentWord.getResourceId());


        return listItemView;
    }
}
