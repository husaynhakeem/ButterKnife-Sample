package husaynhakeem.io.butterknife_101.topics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import husaynhakeem.io.butterknife_101.R;

public class OptionalBinding extends AppCompatActivity {


    @BindView(R.id.checkBox1)
    CheckBox existantCheckBox;

    @Nullable
    @BindView(R.id.checkBox)
    CheckBox inexistantCheckBox;

    private Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optional_binding);
        ButterKnife.bind(this);
    }


    @Optional
    @OnClick(R.id.checkBox1)
    public void onCheckBoxChecked() {
        toast = Toast.makeText(this, "Existant checkbox check state changed.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
