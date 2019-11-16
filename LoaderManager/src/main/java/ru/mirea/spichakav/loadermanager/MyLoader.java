package ru.mirea.spichakav.loadermanager;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

import androidx.annotation.Nullable;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

public class MyLoader extends AsyncTaskLoader {
    public static final String ARG_WORD = "sad";

    @Nullable
    @Override
    public String loadInBackground() {
        SystemClock.sleep(5000);
        return "5 second go home";
    }

    MyLoader(Context context, Bundle bundle) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    
}

//class MyLoader extends Loader<String> {
//    public MyLoader(MainActivity mainActivity, Bundle bundle) {
//        super();
//    }
//}
