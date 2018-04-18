package app.elbase.fr.myresumeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FormationsActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formations);

        mListView = (ListView) findViewById(R.id.listViewFormation);

        List<Formation> formations = genererFormations();

        FormationAdapter adapter = new FormationAdapter(FormationsActivity.this, formations);
        mListView.setAdapter(adapter);
    }

    private List<Formation> genererFormations(){
        List<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("Formation 1", "2014-2016", "Mon premier machin !"));
        formations.add(new Formation("Formation 2", "2016-2016", "C'est ici que ça se passe !"));
        formations.add(new Formation("Formation 3", "2014-2019", "Que c'est beau..."));
        formations.add(new Formation("Formation 4", "2012-2013", "Il est quelle heure ??"));
        formations.add(new Formation("Formation 5", "2010-2012", "On y est presque"));
        formations.add(new Formation("Formation 6", "2014-2016", "Mon premier machin !"));
        formations.add(new Formation("Formation 7", "2016-2016", "C'est ici que ça se passe !"));
        formations.add(new Formation("Formation 8", "2014-2019", "Que c'est beau..."));
        formations.add(new Formation("Formation 9", "2012-2013", "Il est quelle heure ??"));
        formations.add(new Formation("Formation 10", "2010-2012", "On y est presque"));
        return formations;
    }

}
