package com.example.andrewsamtoy.quadrantproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by andrewsamtoy on 9/22/17.
 */

public class ToDosAdapter extends ArrayAdapter<ToDo> {
    public ToDosAdapter(Context context, ArrayList<ToDo> toDo){
        super(context, 0, toDo);

    }

    @Override
    public View getView(int rank, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.content_main, parent, false);

        }
        ToDo toDo = getItem(toDo);

        TextView toDo = (TextView) listItemView.findViewById(R.id.toDo);
        rank.setText(toDo.getRanking().toString());
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentToDo.getTitle().toString());

        listItemView.setTag(currentToDo);

        return listItemView;
    }
}
