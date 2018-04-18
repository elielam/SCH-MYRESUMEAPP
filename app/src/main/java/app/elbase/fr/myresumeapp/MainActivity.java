package app.elbase.fr.myresumeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button skillBtn = (Button) findViewById(R.id.button9);
        skillBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SkillsActivity.class);
                startActivity(intent);
            }
        });
        final Button formationsBtn = (Button) findViewById(R.id.button10);
        formationsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormationsActivity.class);
                startActivity(intent);
            }
        });
        final Button experiencesBtn = (Button) findViewById(R.id.button11);
        experiencesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExperiencesActivity.class);
                startActivity(intent);
            }
        });
    }
}
