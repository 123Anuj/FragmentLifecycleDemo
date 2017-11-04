package acadgild.com.fragmentlifecycledemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final String TAG="LifeCycle of Activity";

    ConstraintLayout parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
parent=(ConstraintLayout)findViewById(R.id.fragment_container);

        FragmentManager fragmentManager=getFragmentManager();

        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        MyFragment fragment=new MyFragment();

        fragmentTransaction.add(R.id.fragment_container,fragment);

        fragmentTransaction.commit();
        Log.d(TAG,"OnCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"OnStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"OnResume called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"OnRestart called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG,"OnPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG,"OnStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG,"OnDestroy called");
    }

    /*@Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        Log.d(TAG,"onAttachFragment called");
    }*/




}
