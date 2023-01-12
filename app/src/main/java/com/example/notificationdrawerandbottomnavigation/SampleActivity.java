package com.example.notificationdrawerandbottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class SampleActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    BlankFragmentOne blankFragmentOne = new BlankFragmentOne();
    BlankFragmentTwo blankFragmentTwo = new BlankFragmentTwo();
    BlankFragmentThree blankFragmentThree = new BlankFragmentThree();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);


        bottomNavigationView = findViewById(R.id.bottom_navigation_view_sample);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
//        bottomNavigationView.setSelectedItemId(R.id.item1);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
                getSupportFragmentManager().beginTransaction().replace(R.id.sample_fragment, blankFragmentOne).commit();
//                FragmentManager fragmentOneManagerSample = getSupportFragmentManager();
//                FragmentTransaction fragmentOneTransactionSample = fragmentOneManagerSample.beginTransaction();
//                fragmentOneTransactionSample.replace(R.id.main_fragment, blankFragmentOne);
//                fragmentOneTransactionSample.addToBackStack(null);
//                fragmentOneTransactionSample.commit();
                return true;


            case R.id.item2:
                getSupportFragmentManager().beginTransaction().replace(R.id.sample_fragment, blankFragmentTwo).commit();
//                FragmentManager fragmentTwoManagerSample = getSupportFragmentManager();
//                FragmentTransaction fragmentTwoTransactionSample = fragmentTwoManagerSample.beginTransaction();
//                fragmentTwoTransactionSample.replace(R.id.main_fragment, blankFragmentTwo);
//                fragmentTwoTransactionSample.addToBackStack(null);
//                fragmentTwoTransactionSample.commit();

                return true;

            case R.id.item3:
                getSupportFragmentManager().beginTransaction().replace(R.id.sample_fragment, blankFragmentThree).commit();
//                FragmentManager fragmentThreeManager = getSupportFragmentManager();
//                FragmentTransaction fragmentThreeTransaction = fragmentThreeManager.beginTransaction();
//                fragmentThreeTransaction.replace(R.id.main_fragment, blankFragmentThree);
//                fragmentThreeTransaction.addToBackStack(null);
//                fragmentThreeTransaction.commit();
                return true;
        }
        return false;
    }
}