package app.elbase.fr.myresumeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class SkillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        ProgressBar progressSkill1 = (ProgressBar) findViewById(R.id.progressBar);
        progressSkill1.setProgress(50);
        ProgressBar progressSkill2 = (ProgressBar) findViewById(R.id.progressBar1);
        progressSkill2.setProgress(25);
        ProgressBar progressSkill3 = (ProgressBar) findViewById(R.id.progressBar2);
        progressSkill3.setProgress(75);
        ProgressBar progressSkill4 = (ProgressBar) findViewById(R.id.progressBar3);
        progressSkill4.setProgress(30);
        ProgressBar progressSkill5 = (ProgressBar) findViewById(R.id.progressBar4);
        progressSkill5.setProgress(62);
    }
}
