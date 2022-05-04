package com.example.college_project;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<ModelClass1> modelClass1ArrayList;

    public Adapter(Context context, ArrayList<ModelClass1> modelClass1ArrayList) {
        this.context = context;
        this.modelClass1ArrayList = modelClass1ArrayList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,webView.class);
                intent.putExtra("url",modelClass1ArrayList.get(position).getUrl());
                context.startActivity(intent);
            }
        });

        holder.mtime.setText("Published At:-"+modelClass1ArrayList.get(position).getPublishedAt());
        holder.mauthor.setText(modelClass1ArrayList.get(position).getAuthor());
        holder.mheading.setText(modelClass1ArrayList.get(position).getTittle());
        holder.mcontent.setText(modelClass1ArrayList.get(position).getDescription());
       // Glide.with(context).load(modelClass1ArrayList.get(position).getUrlToImage()).into(holder.imageView);
        Glide.with(context).load(modelClass1ArrayList.get(position).getUrlToImage()).into(holder.imageView);





    }

    @Override
    public int getItemCount() {
        return modelClass1ArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mheading,mcontent,mauthor,mtime;
        CardView cardView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mheading=itemView.findViewById(R.id.mainheading);
            mcontent=itemView.findViewById(R.id.content);
            mauthor=itemView.findViewById(R.id.author);
            mtime=itemView.findViewById(R.id.time);
            imageView=itemView.findViewById(R.id.imageview);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }
}
