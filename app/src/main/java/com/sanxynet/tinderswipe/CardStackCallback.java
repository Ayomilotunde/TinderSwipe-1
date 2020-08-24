package com.sanxynet.tinderswipe;

import java.util.List;

import androidx.recyclerview.widget.DiffUtil;

public class CardStackCallback extends DiffUtil.Callback {

    private List<ItemModel> old, updated;

    public CardStackCallback(List<ItemModel> old, List<ItemModel> updated) {
        this.old = old;
        this.updated = updated;
    }

    @Override
    public int getOldListSize() {
        return old.size();
    }

    @Override
    public int getNewListSize() {
        return updated.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return old.get(oldItemPosition).getImage() == updated.get(newItemPosition).getImage();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return old.get(oldItemPosition) == updated.get(newItemPosition);
    }
}
