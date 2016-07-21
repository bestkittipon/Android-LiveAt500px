package com.kittipol.liveat500px.dao;

import java.util.List;

/**
 * Created by KittipolC on 7/17/2016.
 */
public class PhotoItemCollectionDao {
    private boolean success;
    private List<PhotoItemDao> data;

    public List<PhotoItemDao> getData() {
        return data;
    }

    public void setData(List<PhotoItemDao> data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
