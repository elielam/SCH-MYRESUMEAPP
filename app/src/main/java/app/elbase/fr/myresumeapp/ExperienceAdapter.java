package app.elbase.fr.myresumeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by eliel on 18/04/2018.
 */

public class ExperienceAdapter extends ArrayAdapter<Experience> {
    //tweets est la liste des models à afficher
    public ExperienceAdapter(Context context, List<Experience> experiences) {
        super(context, 0, experiences);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_listgrid,parent, false);
        }

        ExperienceViewHolder viewHolder = (ExperienceViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new ExperienceViewHolder();
            viewHolder.libelle = (TextView) convertView.findViewById(R.id.libelle);
            viewHolder.year = (TextView) convertView.findViewById(R.id.year);
            viewHolder.desc = (TextView) convertView.findViewById(R.id.desc);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Experience experience = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.libelle.setText(experience.getLibelle());
        viewHolder.year.setText(experience.getYear());
        viewHolder.desc.setText(experience.getDesc());

        return convertView;
    }

    private class ExperienceViewHolder{
        TextView libelle;
        public TextView year;
        public TextView desc;
    }
}
