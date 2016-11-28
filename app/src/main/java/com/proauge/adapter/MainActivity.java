package com.proauge.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.proauge.adapter.adapters.adapter_pro;
import com.proauge.adapter.model.vajes;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recy);
        Vector<vajes> listaPro=new Vector<vajes>();

        //consulta en bd
        listaPro.add(new vajes("vacacion5","gdl1","dos"));
        listaPro.add(new vajes("vacacion4","gdl2","dos"));
        listaPro.add(new vajes("vacacion3","gdl3","dos"));
        listaPro.add(new vajes("vacacion2","gdl4","dos"));
        listaPro.add(new vajes("vacacion1","gdl5","dos"));

        adapter_pro ap=new adapter_pro();
        ap.setListaPro(listaPro);
        ap.setContext(MainActivity.this);


        LinearLayoutManager llm = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(1);

        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_LOW);


        recyclerView.setAdapter(ap);
    }
}
