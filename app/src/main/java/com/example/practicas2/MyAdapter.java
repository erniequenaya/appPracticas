package com.example.practicas2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<String> posters;

    public MyAdapter(Context context, int layout, List<String> posters){
        this.context = context;
        this.layout = layout;
        this.posters = posters;
    }
    @Override
    public int getCount() {
        return this.posters.size();
    }
    @Override
    public Object getItem(int position) {
        return this.posters.get(position);
    }
    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //Patron View holder
        ViewHolder holder;

        if(convertView == null){
            //Inflamos la vista que nos ha llegado a nuestro layout
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(this.layout,null);
            holder = new ViewHolder();

            //Referencias el elemento a modificar y lo rellenamos
            //holder.nametextView = (TextView) convertView.findViewById(R.id.textView);
            holder.nametextView = (TextView) convertView.findViewById(R.id.tvProfileName);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        //Nos traemos el valor actual dependiente de la posición
        String nombreActual = posters.get(position);

        //Referencias el elemento a modificar y lo rellenamos
        holder.nametextView.setText(nombreActual);

        return convertView;
    }

    static class ViewHolder {
        public TextView nametextView;
    }
}

