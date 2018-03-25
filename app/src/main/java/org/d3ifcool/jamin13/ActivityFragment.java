package org.d3ifcool.jamin13;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Lenovo Y500 on 3/12/2018.
 */

public class ActivityFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_activity, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listview);

        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("Olahraga", R.drawable.olahraga));
        data.add(new Word("Sekolah", R.drawable.sekolah));
        data.add(new Word("Kerja", R.drawable.kerja));
        data.add(new Word("Liburan", R.drawable.liburan));


        WordAdapter wordAdapter = new WordAdapter(getActivity(), data);
        // wordAdapter.setBackgroundColor(R.color.category_phrases);
        listView.setAdapter(wordAdapter);
        return view;
    }
}