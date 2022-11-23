package com.example.baitapkt1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModel,MainAdapter.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel model) {

        holder.tenkhoahoc.setText(model.getTenkhoahoc());
        holder.tenthuonggoi.setText(model.getTenthuonggoi());
        holder.dattinh.setText(model.getDattinh());
        holder.congdung.setText(model.getCongdung());
        holder.lieudung.setText(model.getLieudung());
        holder.luuykhidung.setText(model.getLuuykhidung());

        Glide.with(holder.img.getContext())
                .load(model.getSufl() )
                .placeholder(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark)
                .circleCrop()
                .error(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.img);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item,parent,false);

        return new myViewHolder(view);

    }

    class  myViewHolder extends RecyclerView.ViewHolder{
        CircleImageView img;
        TextView tenkhoahoc, tenthuonggoi, dattinh, congdung, lieudung, luuykhidung;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (CircleImageView)itemView.findViewById(R.id.imgl);
            tenkhoahoc = (TextView)itemView.findViewById(R.id.tenkhoahoc);
            tenthuonggoi = (TextView)itemView.findViewById(R.id.tenthuonggoi);
            dattinh = (TextView)itemView.findViewById(R.id.dattinh);
            congdung = (TextView)itemView.findViewById(R.id.congdung);
            lieudung = (TextView)itemView.findViewById(R.id.lieudung);
            luuykhidung = (TextView)itemView.findViewById(R.id.luuykhidung);
        }
    }
}
