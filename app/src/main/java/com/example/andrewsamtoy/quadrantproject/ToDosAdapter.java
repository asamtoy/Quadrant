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

    public ToDosAdapter(Context context, ArrayList<ToDo> toDos){
        super(context, 0, toDos);
    }

    @Override
    public View getView(int rank, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_to_do, parent, false);
        }

        ToDo toDo = getItem(rank);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(String.valueOf(toDo.getRank()));

        TextView title = listItemView.findViewById(R.id.ToDoDescription);
        title.setText(toDo.getToDo().toString());

        TextView importance = listItemView.findViewById(R.id.textImportance);
        importance.setText(toDo.importance().toString());

        TextView urgency = listItemView.findViewById(R.id.textUrgency);
        urgency.setText(toDo.urgency().toString());

        listItemView.setTag(toDo);

        return listItemView;
    }
}
