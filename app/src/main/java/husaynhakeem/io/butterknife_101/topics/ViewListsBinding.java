package husaynhakeem.io.butterknife_101.topics;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import butterknife.BindViews;
import butterknife.ButterKnife;
import husaynhakeem.io.butterknife_101.R;

public class ViewListsBinding extends AppCompatActivity {


    @BindViews({R.id.checkBox, R.id.checkBox2, R.id.checkBox3})
    CheckBox[] checkBoxes;

    ButterKnife.Action<CheckBox> CHECK;
    ButterKnife.Setter<CheckBox, Boolean> UNCHECK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_lists_binding);
        ButterKnife.bind(this);


        CHECK = new ButterKnife.Action<CheckBox>() {
            @Override
            public void apply(@NonNull CheckBox checkBox, int index) {
                checkBox.setChecked(true);
            }
        };


        UNCHECK = new ButterKnife.Setter<CheckBox, Boolean>() {
            @Override
            public void set(@NonNull CheckBox checkBox, Boolean value, int index) {
                checkBox.setChecked(value);
            }
        };
    }


    public void checkAll(View view) {
        ButterKnife.apply(checkBoxes, CHECK);
    }


    public void uncheckAll(View view) {
        ButterKnife.apply(checkBoxes, UNCHECK, false);
    }
}
