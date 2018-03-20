package com.example.jaya.itday;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaurav on 2/2/18.
 */

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final int VIEW_TYPE_LOADING = 1;
    private static final int VIEW_TYPE_ITEM = 0;
    Context context;
    List <Place> Places = new ArrayList<>();
    DatabaseReference nref= FirebaseDatabase.getInstance().getReference();
    public List<String> Gen;
    String b;
    public RecyclerViewAdapter(Context context , List<Place> Places) {

        this.context = context;
        this.Places=Places;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


        Place p = Places.get(position);
        String  a= p.getimg();


        //Toast.makeText(context,b,Toast.LENGTH_SHORT).show();
        //Toast.makeText(context, a, Toast.LENGTH_SHORT).show();
        Glide.with(context.getApplicationContext()).load(a).into(holder.imagedisplay);

        //holder.productcode.setText(productDetail.getProductcode());
        holder.name.setText(p.getName());




    }

    @Override
    public int getItemCount() {

        return Places.size();
    }
    @Override
    public int getItemViewType(int position) {
        return Places.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagedisplay;
        public TextView name;
        public RelativeLayout R;

        public ViewHolder(View itemView) {

          super(itemView);


        }
    }


    public int getSize(){
        return Places.size();
    }



    private void delete(int i) {
        Places.remove(i);
        notifyItemRemoved(i);
    }

}
