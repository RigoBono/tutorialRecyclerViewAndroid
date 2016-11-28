package com.proauge.adapter.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.proauge.adapter.R;
import com.proauge.adapter.model.vajes;

import java.util.Vector;

/**
 * Created by rigobono on 25/11/16.
 */

public class adapter_pro extends RecyclerView.Adapter<adapter_pro.adapterVH> {

    Vector<vajes> listaPro;
    Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setListaPro(Vector<vajes> listaPro) {
        this.listaPro = listaPro;
    }

    @Override
    public adapterVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adaper_recy, parent, false);
        adapterVH cvh = new adapterVH(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(adapterVH holder, final int position) {

        holder.nombre.setText(listaPro.elementAt(position).getNombre());
        holder.ubicacion.setText(listaPro.elementAt(position).getUbicacion());
        holder.algo.setText(listaPro.elementAt(position).getAlgo());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Hola bombone "+listaPro.elementAt(position).getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaPro.size();
    }

    public class adapterVH extends RecyclerView.ViewHolder{

        ImageView image;
        TextView nombre,ubicacion,algo;
        public adapterVH(View itemView) {
            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.image);
            nombre=(TextView)itemView.findViewById(R.id.nombre);
            ubicacion=(TextView)itemView.findViewById(R.id.ubicacion);
            algo=(TextView)itemView.findViewById(R.id.algo);

        }
    }
}
