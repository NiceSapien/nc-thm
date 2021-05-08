package tw.osthm.manager;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;

import tw.osthm.OsThmTheme;
import tw.osthm.osthmEngine;

public class MainActivity extends AppCompatActivity {
    private final int REQUEST_PERM_CODE = 107;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(0xFFFFFFFF);

        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED ||
                ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                        PackageManager.PERMISSION_GRANTED)

            ActivityCompat.requestPermissions(MainActivity.this, new String[]{
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
            }, REQUEST_PERM_CODE);

        else
            continueActivity();
    }

    private void continueActivity() {
        loadTheme();

        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), ThemeManagerActivity.class);
                startActivity(intent);
                finish();
            }
        };

        handler.postDelayed(runnable, 2000);
    }

    private void loadTheme() {
        OsThmTheme theme = osthmEngine.getCurrentTheme();

        findViewById(R.id.rootView).setBackgroundColor(theme.colorBackground);
        ((TextView) findViewById(R.id.textView)).setTextColor(theme.colorBackgroundText);

        getWindow().setStatusBarColor(theme.colorBackground);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ColorUtils.calculateLuminance(theme.colorBackground) < 0.5)
                getWindow().getDecorView().setSystemUiVisibility(0);
            else
                getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PERM_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                continueActivity();

            } else {
                Toast.makeText(MainActivity.this, "Please grant storage permission!",
                        Toast.LENGTH_LONG).show();
            }
        }
    }
}
