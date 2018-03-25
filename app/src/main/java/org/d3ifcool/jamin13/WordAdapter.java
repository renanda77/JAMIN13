package org.d3ifcool.jamin13;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lenovo Y500 on 3/12/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listViewItem = convertView;
        if(listViewItem == null ){
            listViewItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //  listViewItem.setBackgroundColor(ContextCompat.getColor(getContext(), backgroundColor));

        Word currentWord = getItem(position);
        // Word currentWord = (Word) getItem(position); //  Word currentWord = getItem(position);
        TextView miwokTexrView = (TextView) listViewItem.findViewById(
                R.id.text1);
        miwokTexrView.setText(currentWord.getMlist());

        ImageView img = (ImageView) listViewItem.findViewById(R.id.imageview);
        if(currentWord.getmImageResourseId()== 0){
            img.setVisibility(View.GONE);
        } else {
            img.setVisibility(View.VISIBLE);
            img.setImageResource(currentWord.getmImageResourseId());
        }





        return listViewItem;
    }
}
