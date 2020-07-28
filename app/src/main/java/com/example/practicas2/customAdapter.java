package com.example.practicas2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

class customAdapter extends ArrayAdapter<String> {
    public customAdapter(@NonNull Context context, List<String> posters) {
        super(context, R.layout.custom_grid_photos_layout,posters);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater photoInflater = LayoutInflater.from(getContext());
        View photosView = photoInflater.inflate(R.layout.custom_grid_photos_layout,parent,false);

        String profiles = getItem(position);
        final TextView profName = (TextView) photosView.findViewById(R.id.tvProfileName);
        ImageView profPic = (ImageView) photosView.findViewById(R.id.ivProfilePhoto);
        final TextView hobbyDesc = (TextView) photosView.findViewById(R.id.tvHobbyDesc);
        final ImageView hobbyPic = (ImageView) photosView.findViewById(R.id.ivHobbyPhoto);

        profName.setText(profiles);
        profPic.setImageResource(R.drawable.ic_8_ball_pool);
        hobbyDesc.setText(profiles);
        hobbyPic.setImageResource(R.drawable.logo2);

        Button like = (Button) photosView.findViewById(R.id.btnLike);
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"\uD83D\uDE01",Toast.LENGTH_LONG).show();
            }
        });
        Button dislike = (Button) photosView.findViewById(R.id.btnDislike);
        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"\uD83D\uDE20",Toast.LENGTH_LONG).show();
            }
        });

        ImageButton share = (ImageButton) photosView.findViewById(R.id.btnShare);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameShare = profName.getText().toString();
                /*
                Intent intentFb = new Intent();
                intentFb.setAction(Intent.ACTION_VIEW);
                intentFb.setData(Uri.parse("https://"+nameShare));
                v.getContext().startActivity(intentFb);
                */
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT,hobbyDesc.getText().toString());
                shareIntent.putExtra(Intent.EXTRA_STREAM,hobbyPic.getDrawingCache());
                shareIntent.setType("image/*");
                Intent addActivity = new Intent(v.getContext(), com.example.practicas2.addActivity.class);
                v.getContext().startActivity(addActivity);
                //v.getContext().startActivity(shareIntent);
            }
        });


        return photosView;
        //return super.getView(position, convertView, parent);
    }




}
