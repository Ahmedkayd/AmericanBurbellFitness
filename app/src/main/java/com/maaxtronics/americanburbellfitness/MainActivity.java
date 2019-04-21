package com.maaxtronics.americanburbellfitness;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchMap(View view) {
        Button button = (Button) findViewById(R.id.launchMap);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=1900 Duane Ave,Santa Clara, CA 95054"));
        this.startActivity(intent);
    }

    public void closeApp(View v) {
        finish();
        System.exit(0);
    }

}
