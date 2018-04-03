package com.alisonxu.caricard.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.alisonxu.caricard.Connections.ConnectionsActivity;
import com.alisonxu.caricard.History.HistoryActivity;
import com.alisonxu.caricard.Home.HomeActivity;
import com.alisonxu.caricard.R;
import com.alisonxu.caricard.Scancard.ScancardActivity;
import com.alisonxu.caricard.Viewconnect.ViewconnectActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(true);
        bottomNavigationViewEx.setIconSize(25,25);
    }
    public static void enableNavigation (final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){

                    case R.id.icon_home:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.icon_connections:
                        Intent intent2 = new Intent(context, ConnectionsActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.icon_viewconnect:
                        Intent intent3 = new Intent(context, ViewconnectActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.icon_scancard:
                        Intent intent4 = new Intent(context, ScancardActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.icon_history:
                        Intent intent5 = new Intent(context, HistoryActivity.class);
                        context.startActivity(intent5);
                        break;
                }
                return false;
            }
        });
    }
}
