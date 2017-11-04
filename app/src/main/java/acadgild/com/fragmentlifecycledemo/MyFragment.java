package acadgild.com.fragmentlifecycledemo;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sumit on 04-Nov-17.
 */

public class MyFragment extends Fragment {

    final String TAG="LifeCycle of Fragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG,"OnCreateView");
        return inflater.inflate(R.layout.fraglayout,container,false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"OnCreate");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG,"OnAttach");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"OnResume");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"OnActivityCreated");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"OnDestroy");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"OnPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"OnStop");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,"OnStop");
    }
}
