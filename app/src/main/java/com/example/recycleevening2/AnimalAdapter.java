package com.example.recycleevening2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private ItemcClickListner itemcClickListner;
    private ArrayList<Animal>arrayList=new ArrayList<>();
    public AnimalAdapter(ArrayList<Animal>arrayList,ItemcClickListner itemcClickListner){
        this.arrayList=arrayList;
        this.itemcClickListner=itemcClickListner;
    }
    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new AnimalViewHolder(view,itemcClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull  AnimalViewHolder holder, int position) {
        Animal view=arrayList.get(position);
        holder.setData(view);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
