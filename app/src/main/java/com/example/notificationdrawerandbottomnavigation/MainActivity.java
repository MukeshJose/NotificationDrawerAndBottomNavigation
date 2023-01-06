package com.example.notificationdrawerandbottomnavigation;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {

    public DrawerLayout drawerLayout;
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


        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

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
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne).commit();
                return true;


            case R.id.item2:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentTwo).commit();
                return true;

            case R.id.item3:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentThree).commit();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.nav_account:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentOne).commit();
                return true;

            case R.id.nav_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentTwo).commit();
                return true;

            case R.id.nav_logout:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, blankFragmentThree).commit();
                return true;

        }
        return false;
    }

}
