package com.dragon.androidlearn.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import timber.log.Timber;

/**
 * 项目名：  AndroidLearn <br/>
 * 包名：    com.dragon.androidlearn.fragment <br/>
 * 创建者:   gonghe <br/>
 * 创建时间:  2020/3/25 <br/>
 * 描述：    TODO
 */
public abstract class BaseFragment extends Fragment
{
    protected abstract int initContentView();


    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onSaveInstanceState"+ "  " + this.hashCode());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(initContentView(), container, false);
        ButterKnife.bind(this, view);

        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onCreateView"+ "  " + this.hashCode());
        return view;
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        String name = getClass().getSimpleName();

        Timber.tag("LifeCicleTetst").e(name + "  onAttach"+ "  " + this.hashCode());
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onCreate" + "  " + this.hashCode());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onActivityCreated"+ "  " + this.hashCode());

//        setRetainInstance(true);
    }

    @Override
    public void onStart()
    {
        super.onStart();

        String name = getClass().getSimpleName();
        Log.e("LifeCicleTetst", name + "  onStart"+ "  " + this.hashCode());
    }


    @Override
    public void onResume()
    {
        super.onResume();
        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onResume"+ "  " + this.hashCode());
    }

    @Override
    public void onPause()
    {
        super.onPause();
        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onPause"+ "  " + this.hashCode());
    }

    @Override
    public void onStop()
    {
        super.onStop();
        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onStop"+ "  " + this.hashCode());
    }


    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onDestroyView"+ "  " + this.hashCode());
    }


    @Override
    public void onDestroy()
    {
        super.onDestroy();
        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onDestroy"+ "  " + this.hashCode());
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        String name = getClass().getSimpleName();
        Timber.tag("LifeCicleTetst").e(name + "  onDetach"+ "  " + this.hashCode());
    }

}
