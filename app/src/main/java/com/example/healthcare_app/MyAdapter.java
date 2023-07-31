package com.example.healthcare_app;

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

import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context context;
    private List<DataClass> dataList;
    public void setSearchList(List<DataClass> dataSearchList){
        this.dataList = dataSearchList;
        notifyDataSetChanged();
    }
    public MyAdapter(Context context, List<DataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.recImage.setImageResource(dataList.get(position).getDataImage());
        holder.recTitle.setText(dataList.get(position).getDataTitle());
        holder.recDesc.setText(dataList.get(position).getDataDesc());
        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Image", dataList.get(holder.getAdapterPosition()).getDataImage());
                intent.putExtra("Image2", dataList.get(holder.getAdapterPosition()).getDataImage2());
                intent.putExtra("Image3", dataList.get(holder.getAdapterPosition()).getDataImage3());
                intent.putExtra("Image4", dataList.get(holder.getAdapterPosition()).getDataImage4());
                intent.putExtra("Image5", dataList.get(holder.getAdapterPosition()).getDataImage5());
                intent.putExtra("Image6", dataList.get(holder.getAdapterPosition()).getDataImage6());
                intent.putExtra("Title", dataList.get(holder.getAdapterPosition()).getDataTitle());
                intent.putExtra("Title2", dataList.get(holder.getAdapterPosition()).getDataTitle2());
                intent.putExtra("Desc", dataList.get(holder.getAdapterPosition()).getDataDesc());
                intent.putExtra("Desc8", dataList.get(holder.getAdapterPosition()).getDataDesc8());
                intent.putExtra("Desc2", dataList.get(holder.getAdapterPosition()).getDataDesc2());
                intent.putExtra("Desc3", dataList.get(holder.getAdapterPosition()).getDataDesc3());
                intent.putExtra("Desc4", dataList.get(holder.getAdapterPosition()).getDataDesc4());
                intent.putExtra("Desc5", dataList.get(holder.getAdapterPosition()).getDataDesc5());
                intent.putExtra("Desc6", dataList.get(holder.getAdapterPosition()).getDataDesc6());
                intent.putExtra("Desc7", dataList.get(holder.getAdapterPosition()).getDataDesc7());
                context.startActivity(intent);
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
    TextView recTitle, recDesc;
    CardView recCard;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        recImage = itemView.findViewById(R.id.recImage);
        recTitle = itemView.findViewById(R.id.recTitle);
        recDesc = itemView.findViewById(R.id.recDesc);
        recCard = itemView.findViewById(R.id.recCard);
    }
}