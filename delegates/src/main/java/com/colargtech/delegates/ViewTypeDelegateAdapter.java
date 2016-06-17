package com.colargtech.delegates;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * @author gdfesta.
 */

public interface ViewTypeDelegateAdapter<VH extends RecyclerView.ViewHolder, V extends ViewType> {

    VH onCreateViewHolder(ViewGroup parent);

    void onBindViewHolder(VH holder, V item);
}
