package com.example.notificationdrawerandbottomnavigation;


import android.content.ClipData;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {

    public  static DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    public NavigationView navigationView;
    public BottomNavigationView bottomNavigationView;
    BlankFragmentOne blankFragmentOne = new BlankFragmentOne();
    BlankFragmentTwo blankFragmentTwo = new BlankFragmentTwo();
    BlankFragmentThree blankFragmentThree = new BlankFragmentThree();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // drawer layout instance to toggle the menu icon to open
        // drawer and back button to close drawer
        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);


        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        //so that the blankFragmentOne will not load whenever a run time configuration change occurs
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne).commit();

        }
        navigationView.setCheckedItem(R.id.nav_account);

        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }




    public void closeDrawer() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    // override the onOptionsItemSelected()
    // function to implement
    // the item click listener callback
    // to open and close the navigation
    // drawer when the icon is clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne).commit();
                FragmentManager fragmentOneManager = getSupportFragmentManager();
                FragmentTransaction fragmentOneTransaction = fragmentOneManager.beginTransaction();
                fragmentOneTransaction.replace(R.id.main_fragment, blankFragmentOne);
                fragmentOneTransaction.addToBackStack(null);
                fragmentOneTransaction.commit();
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne).addToBackStack(null);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne).commit();

                return true;


            case R.id.item2:
                FragmentManager fragmentTwoManager = getSupportFragmentManager();
                FragmentTransaction fragmentTwoTransaction = fragmentTwoManager.beginTransaction();
                fragmentTwoTransaction.replace(R.id.main_fragment, blankFragmentTwo);
                fragmentTwoTransaction.addToBackStack(null);
                fragmentTwoTransaction.commit();

//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentTwo);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentTwo).addToBackStack(null);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentTwo).commit();
                return true;

            case R.id.item3:
                //   getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentThree).commit();
                FragmentManager fragmentThreeManager = getSupportFragmentManager();
                FragmentTransaction fragmentThreeTransaction = fragmentThreeManager.beginTransaction();
                fragmentThreeTransaction.replace(R.id.main_fragment, blankFragmentThree);
                fragmentThreeTransaction.addToBackStack(null);
                fragmentThreeTransaction.commit();
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentThree);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentThree).addToBackStack(null);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentThree).commit();

                return true;
        }

        switch (item.getItemId()) {
            case R.id.nav_account:
                FragmentManager fragmentOneManager = getSupportFragmentManager();
                FragmentTransaction fragmentOneTransaction = fragmentOneManager.beginTransaction();
                fragmentOneTransaction.replace(R.id.main_fragment, blankFragmentOne);
                fragmentOneTransaction.addToBackStack(null);
                fragmentOneTransaction.commit();
                // to close drawer when this item is clicked
                closeDrawer();
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne).addToBackStack(null);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne).commit();
                return true;

            case R.id.nav_settings:
                FragmentManager fragmentTwoManager = getSupportFragmentManager();
                FragmentTransaction fragmentTwoTransaction = fragmentTwoManager.beginTransaction();
                fragmentTwoTransaction.replace(R.id.main_fragment, blankFragmentTwo);
                fragmentTwoTransaction.addToBackStack(null);
                fragmentTwoTransaction.commit();
                // to close drawer when this item is clicked
                closeDrawer();
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentTwo);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentTwo).addToBackStack(null);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentTwo).commit();
                return true;

            case R.id.nav_logout:

                FragmentManager fragmentThreeManager = getSupportFragmentManager();
                FragmentTransaction fragmentThreeTransaction = fragmentThreeManager.beginTransaction();
                fragmentThreeTransaction.replace(R.id.main_fragment, blankFragmentThree);
                fragmentThreeTransaction.addToBackStack(null);
                fragmentThreeTransaction.commit();
                // to close drawer when this item is clicked
                closeDrawer();
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentThree);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentThree).addToBackStack(null);
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentThree).commit();
                return true;

        }
        return false;
    }

}
