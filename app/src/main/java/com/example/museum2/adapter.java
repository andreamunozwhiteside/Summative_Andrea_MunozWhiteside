package com.example.museum2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {
    private List<Museum> myData;
    private LayoutInflater myInflater;

    public adapter(Context c, List<Museum> data){
        this.myInflater = LayoutInflater.from(c);
        this.myData = data;
    }

    @Override
    public adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = myInflater.inflate(R.layout.row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.ViewHolder holder, int position) {
        String name = myData.get(position).name; //Modify the types to assign the name and description
        String desc = myData.get(position).description;
        holder.myTextView.setText(name);
        holder.myTextView.setText(desc);

        holder.myTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //open page of museum
                Intent intent = new Intent(v.getContext(), Details.class);
                intent.putExtra("selectedMuseum", myData.get(position).name);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView myTextView;
        TextView myDescView;

        public ViewHolder(@NonNull View v) {
            super(v);
            myTextView = itemView.findViewById(R.id.itemTxt);
            myDescView = itemView.findViewById(R.id.descTxt);
        }
    }
}
