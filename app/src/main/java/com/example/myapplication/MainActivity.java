package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods=findViewById(R.id.lvGoods);

        arrayList=new ArrayList<>();
        arrayList.add(new Goods("Google","$80",R.drawable.images));
        arrayList.add(new Goods("Bing","$70",R.drawable.image_01));
        arrayList.add(new Goods("Folk","$50",R.drawable.folk_navy_blue));
        arrayList.add(new Goods("Code","$50",R.drawable.code));
        arrayList.add(new Goods("Computer","$90",R.drawable.computer));
        arrayList.add(new Goods("Dev","$70",R.drawable.dev));

        adt=new CustomGoodsAdapter(this,R.layout.item_listview,arrayList);
        lvGoods.setAdapter(adt);
    }
}