package threei.com.gittest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import threei.com.gittest.R;

/**
 * Created by KING on 2/4/2016.
 */
public class ParalaxAdapter extends BaseAdapter {
    private Context ctx;
    private List<String> objects;

    public ParalaxAdapter(Context ctx,List<String> objects){
        this.ctx = ctx;
        this.objects = objects;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = LayoutInflater.from(ctx).inflate(R.layout.row_default,null);
        return convertView;
    }
}
