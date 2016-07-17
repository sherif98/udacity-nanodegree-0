package com.nanodegree.udacity.android.myappportfolio;

import android.support.v4.app.Fragment;

public class MainActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return ProjectsLauncherFragment.newInstance();
    }
}
