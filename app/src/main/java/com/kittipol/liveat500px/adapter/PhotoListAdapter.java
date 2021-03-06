package com.kittipol.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kittipol.liveat500px.view.PhotoListItem;

/**
 * Created by KittipolC on 7/10/2016.
 */
public class PhotoListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 10000;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PhotoListItem item;
        if (convertView != null) {
            item = (PhotoListItem) convertView;
        } else {
            item = new PhotoListItem(parent.getContext());
        }
        return item;
    }
}
