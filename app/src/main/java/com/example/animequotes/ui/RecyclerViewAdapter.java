package com.example.animequotes.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animequotes.R;
import com.example.animequotes.data.AnimeQuoteModel;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<AnimeQuoteModel> dataList;

    @SuppressLint("NotifyDataSetChanged")
    public void setSearchList(List<AnimeQuoteModel> dataSearchList){
        this.dataList = dataSearchList;
        notifyDataSetChanged();
    }

    @SuppressLint("NotConstructor")
    public RecyclerViewAdapter(Context context, List<AnimeQuoteModel> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.recImage.setImageResource(dataList.get(position).getDataImage());
        holder.recQuote.setText(dataList.get(position).getDataQuote());

        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast welcome = Toast.makeText(context,"💕Anime Quote💕",Toast.LENGTH_SHORT);
                welcome.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
                welcome.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{

    ImageView recImage;
    TextView recQuote;
    CardView recCard;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        recImage = itemView.findViewById(R.id.img_recycler);
        recQuote = itemView.findViewById(R.id.txt_recycler);
        recCard = itemView.findViewById(R.id.recycler_card);
    }
}