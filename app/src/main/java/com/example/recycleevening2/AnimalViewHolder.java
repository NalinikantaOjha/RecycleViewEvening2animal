package com.example.recycleevening2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private ItemcClickListner itemcClickListner;
    private CardView cardView;
    private ImageView imageView;
    private TextView name;
    private TextView bark;
    private TextView category;
    public AnimalViewHolder(@NonNull View itemView,ItemcClickListner itemcClickListner) {
        super(itemView);
        initView(itemView);
        this.itemcClickListner=itemcClickListner;

    }

    public void setData(Animal animal) {
        imageView.setImageResource(animal.getImage());
        name.setText(animal.getName());
        bark.setText(animal.getBark());
        category.setText(animal.getCategory());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemcClickListner.onitemClicked(animal);

            }
        });

    }

    private void initView(View itemView) {
        imageView=itemView.findViewById(R.id.image1);
        name=itemView.findViewById(R.id.name1);
        bark=itemView.findViewById(R.id.bark);
        category=itemView.findViewById(R.id.catagory);
        cardView=itemView.findViewById(R.id.cardview);
    }


}
