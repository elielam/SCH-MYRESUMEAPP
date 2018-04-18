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

public class FormationAdapter extends ArrayAdapter<Formation> {
    //tweets est la liste des models à afficher
    public FormationAdapter(Context context, List<Formation> formations) {
        super(context, 0, formations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_listgrid,parent, false);
        }

        FormationViewHolder viewHolder = (FormationViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new FormationViewHolder();
            viewHolder.libelle = (TextView) convertView.findViewById(R.id.libelle);
            viewHolder.year = (TextView) convertView.findViewById(R.id.year);
            viewHolder.desc = (TextView) convertView.findViewById(R.id.desc);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Formation formation = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.libelle.setText(formation.getLibelle());
        viewHolder.year.setText(formation.getYear());
        viewHolder.desc.setText(formation.getDesc());

        return convertView;
    }

    private class FormationViewHolder{
        TextView libelle;
        public TextView year;
        public TextView desc;
    }
}
