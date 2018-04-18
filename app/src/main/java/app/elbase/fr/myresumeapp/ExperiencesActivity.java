package app.elbase.fr.myresumeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ExperiencesActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiences);
        mListView = (ListView) findViewById(R.id.listviewExperiences);

        List<Experience> experiences = genererExperiences();

        ExperienceAdapter adapter = new ExperienceAdapter(ExperiencesActivity.this, experiences);
        mListView.setAdapter(adapter);
    }

    private List<Experience> genererExperiences() {
        List<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("Experiences 1", "2014-2016", "Mon premier truc !"));
        experiences.add(new Experience("Experiences 2", "2016-2016", "C'est ici que ça se passe !"));
        experiences.add(new Experience("Experiences 3", "2014-2019", "Que c'est beau..."));
        experiences.add(new Experience("Experiences 4", "2012-2013", "Il est quelle heure ??"));
        experiences.add(new Experience("Experiences 5", "2010-2012", "On y est presque"));
        experiences.add(new Experience("Experiences 6", "2014-2016", "Mon premier truc !"));
        experiences.add(new Experience("Experiences 7", "2016-2016", "C'est ici que ça se passe !"));
        experiences.add(new Experience("Experiences 8", "2014-2019", "Que c'est beau..."));
        experiences.add(new Experience("Experiences 9", "2012-2013", "Il est quelle heure ??"));
        experiences.add(new Experience("Experiences 10", "2010-2012", "On y est presque"));
        return experiences;
    }
}


