package com.example.recycleevening2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemcClickListner{
    private RecyclerView recyclerView;
    private ArrayList<Animal>arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildData();
        setRecycleview();

    } private void setRecycleview() {
        AnimalAdapter view =new AnimalAdapter(arrayList,this);
       GridLayoutManager linearLayoutManager =new GridLayoutManager(this,2);
      // LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(view);
    }

    private void buildData() {
    }

    private void initView() {
        recyclerView=findViewById(R.id.recycleview);
        for(int i =0;i<50;i++) {
            arrayList.add(new Animal(R.drawable.dog, "Dog", "Domastic", "Bow Bow"));
            arrayList.add(new Animal(R.drawable.backparrot, "Parot", "Domastic", "Mithu Mithu"));
            arrayList.add(new Animal(R.drawable.egale, "Egale", "Domastic", "unknown"));
        }
    }

    @Override
    public void onitemClicked(Animal animal) {
        Toast.makeText(MainActivity.this,animal.getName(),Toast.LENGTH_SHORT).show();

    }
}