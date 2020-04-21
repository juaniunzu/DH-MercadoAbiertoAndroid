package com.example.mercadoabierto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button activityMainButtonAgregar;

    //metodo para pegar fragment
    private void pegarFragment(Fragment fragment){

        //creo fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        //creo transaction con el manager
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //agrego el fragment a pegar al container del xml main
        fragmentTransaction.add(R.id.activityMainFrameLayoutContainer, fragment);

        //no se que hace esto, ver
        fragmentTransaction.addToBackStack(null);

        //commitear
        fragmentTransaction.commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pegarFragment(new ItemsFragment());



    }
}
