package com.ps_bn.filmfinderpractice;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RecycleViewViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList;
    Context context;
    public RvAdapter(ArrayList<RecyclerViewItem> arrayList,Context context) {
        this.arrayList = arrayList;
        this.context=context;
    }


    @NonNull
    @Override
    public RecycleViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        RecycleViewViewHolder holder = new RecycleViewViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewViewHolder holder, int position) {
        RecyclerViewItem recycleViewItem = arrayList.get(position);
        holder.textView.setText(recycleViewItem.getTitleText());
        holder.imageView.setImageResource(recycleViewItem.getImageView());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecycleViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView textView;
        Button button;

        public TextView getTextView() {
            return textView;
        }

        public RecycleViewViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.title);
            button = (Button) itemView.findViewById(R.id.button);
            button.setOnClickListener(this);
        }


        void bind(){
        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            RecyclerViewItem item=arrayList.get(position);
            textView.setTextColor(Color.parseColor("#878fff"));
            Intent intent=new Intent(context,FilmDetailItem.class);
            intent.putExtra("Title",item.getTitleText());
            intent.putExtra("img",item.getImageView());
            intent.putExtra("desc",item.getDescription());
            context.startActivity(intent);
        }
    }
}
