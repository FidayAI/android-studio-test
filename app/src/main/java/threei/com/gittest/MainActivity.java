package threei.com.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import threei.com.gittest.adapter.ParalaxAdapter;

public class MainActivity extends AppCompatActivity {
    private ParalaxAdapter adapter;
    private ListView lv_list;
    private List<String> objects = new ArrayList<>();
    private LinearLayout ll_header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_list = (ListView) findViewById(R.id.lv_list);
        ll_header = (LinearLayout) getLayoutInflater().inflate(R.layout.palarax_header, null);
        ll_header.findViewById(R.id.img_test).setVisibility(View.INVISIBLE);
        lv_list.addHeaderView(ll_header);

        for(int index = 0; index < 10; index++){
            objects.add("List "+index);
        }

        adapter = new ParalaxAdapter(this,objects);
        lv_list.setAdapter(adapter);

    }
}
