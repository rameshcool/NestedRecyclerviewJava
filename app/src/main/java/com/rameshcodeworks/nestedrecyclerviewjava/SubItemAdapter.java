package com.rameshcodeworks.nestedrecyclerviewjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubItemAdapter extends RecyclerView.Adapter<SubItemAdapter.SubItemViewHolder> {

    private List<SubItem> subItemList;

    SubItemAdapter(List<SubItem> subItemList) {
        this.subItemList = subItemList;
    }

    @NonNull
    @Override
    public SubItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_sub_item, parent, false);
        return new SubItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubItemViewHolder holder, int position) {

        SubItem subItem = subItemList.get(position);
        holder.tvSubItemTitle.setText(subItem.getSubItemTitle());

    }

    @Override
    public int getItemCount() {
        return subItemList.size();
    }

    public class SubItemViewHolder extends RecyclerView.ViewHolder {

        TextView tvSubItemTitle;

        public SubItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSubItemTitle = itemView.findViewById(R.id.tv_sub_item_title);
        }
    }
}
