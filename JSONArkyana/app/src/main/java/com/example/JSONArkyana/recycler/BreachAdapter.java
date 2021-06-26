package com.example.JSONArkyana.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.JSONArkyana.R;
import com.example.JSONArkyana.api.BreachResponse;

import java.util.List;

public class BreachAdapter extends RecyclerView.Adapter<BreachAdapter.BreachAdapterVH> {
    private List<BreachResponse> breachResponseList;
    private Context context;

    public BreachAdapter() {

    }

    public void setData(List<BreachResponse> breachResponseList){
        this.breachResponseList = breachResponseList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BreachAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new BreachAdapter.BreachAdapterVH(LayoutInflater.from(context).inflate(R.layout.item_data_breach, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BreachAdapterVH holder, int position) {
        BreachResponse breachResponse = breachResponseList.get(position);

        String title = breachResponse.getName();
        String date = breachResponse.getBreachDate();
        String description = breachResponse.getDescription();
        String imageUrl = breachResponse.getLogoPath();

        holder.title.setText(title);
        holder.date.setText("Breach date: " + date);
        holder.description.setText(description);

        RequestOptions options = new RequestOptions()
                .override(200, 150)
                .fitCenter()
                .circleCrop()
                .placeholder(R.drawable.image_placeholder)
                .error(R.drawable.image_not_found);

        Glide.with(context).load(imageUrl).apply(options).into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return breachResponseList.size();
    }

    public class BreachAdapterVH extends RecyclerView.ViewHolder {
        TextView title, date, description;
        ImageView thumbnail;

        public BreachAdapterVH(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.breach_name);
            date = itemView.findViewById(R.id.breach_year);
            description = itemView.findViewById(R.id.breach_content);
            thumbnail = itemView.findViewById(R.id.thumbnail);
        }
    }
}
