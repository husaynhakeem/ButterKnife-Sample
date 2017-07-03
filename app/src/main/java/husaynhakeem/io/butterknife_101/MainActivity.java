package husaynhakeem.io.butterknife_101;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import husaynhakeem.io.butterknife_101.topics.FindbyId;
import husaynhakeem.io.butterknife_101.topics.NonActivityBinding;
import husaynhakeem.io.butterknife_101.topics.NormalViewsBinding;
import husaynhakeem.io.butterknife_101.topics.OptionalBinding;
import husaynhakeem.io.butterknife_101.topics.ResetBinding;
import husaynhakeem.io.butterknife_101.topics.ResourcesBinding;
import husaynhakeem.io.butterknife_101.topics.ViewHolderBinding;
import husaynhakeem.io.butterknife_101.topics.ViewListsBinding;
import husaynhakeem.io.butterknife_101.topics.listenerBinding;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.lv_topics) ListView topicsListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayAdapter<String> topicsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.topic_names));
        topicsListView.setAdapter(topicsAdapter);
        topicsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onTopicClick(position);
            }
        });
    }


    private void onTopicClick(int position) {

        Intent intent;

        switch (position) {

            case 0:
                intent = new Intent(this, NormalViewsBinding.class);
                break;

            case 1:
                intent = new Intent(this, ResourcesBinding.class);
                break;

            case 2:
                intent = new Intent(this, NonActivityBinding.class);
                break;

            case 3:
                intent = new Intent(this, ViewHolderBinding.class);
                break;

            case 4:
                intent = new Intent(this, ViewListsBinding.class);
                break;

            case 5:
                intent = new Intent(this, listenerBinding.class);
                break;

            case 6:
                intent = new Intent(this, ResetBinding.class);
                break;

            case 7:
                intent = new Intent(this, OptionalBinding.class);
                break;

            case 8:
                intent = new Intent(this, FindbyId.class);
                break;

            default:
                throw new RuntimeException("Click event on non existant topic.");
        }

        startActivity(intent);
    }
}