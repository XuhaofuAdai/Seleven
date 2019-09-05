package com.qly.seleven.ui.base;

import android.content.Context;

import com.qly.seleven.ui.activity.BaseActivity;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ActivityManager {
    private CopyOnWriteArrayList<BaseActivity> mBaseActivitiesList = new CopyOnWriteArrayList<>();
    private Context mContext;

    public ActivityManager(Context context) {
        mContext = context;
    }

    public void addActivity(BaseActivity baseActivity) {
        mBaseActivitiesList.add(baseActivity);
    }

    public void removeActivity(BaseActivity baseActivity) {
        baseActivity.finish();
        mBaseActivitiesList.remove(baseActivity);
    }

    public void removeAll() {
        for (BaseActivity activity : mBaseActivitiesList) {
            activity.finish();
            mBaseActivitiesList.remove(activity);
        }
    }

    public void killProcess(){

    }
}
