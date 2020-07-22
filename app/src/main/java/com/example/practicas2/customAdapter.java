package com.example.practicas2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class customAdapter extends ArrayAdapter<String> {
    public customAdapter(@NonNull Context context, String[] posters) {
        super(context, R.layout.custom_grid_photos_layout,posters);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater photoInflater = LayoutInflater.from(getContext());
        View photosView = photoInflater.inflate(R.layout.custom_grid_photos_layout,parent,false);

        String profiles = getItem(position);
        TextView profName = (TextView) photosView.findViewById(R.id.tvProfileName);
        ImageView profPic = (ImageView) photosView.findViewById(R.id.ivProfilePhoto);
        TextView hobbyDesc = (TextView) photosView.findViewById(R.id.tvHobbyDesc);
        ImageView hobbyPic = (ImageView) photosView.findViewById(R.id.ivHobbyPhoto);

        profName.setText(profiles);
        profPic.setImageResource(R.drawable.ic_8_ball_pool);
        hobbyDesc.setText(profiles);
        hobbyPic.setImageResource(R.drawable.logo2);
        return photosView;
        //return super.getView(position, convertView, parent);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }


}
