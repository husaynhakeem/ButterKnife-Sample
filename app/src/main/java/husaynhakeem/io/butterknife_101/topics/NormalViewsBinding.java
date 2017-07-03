package husaynhakeem.io.butterknife_101.topics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.ToggleButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import husaynhakeem.io.butterknife_101.R;

public class NormalViewsBinding extends AppCompatActivity {


    @BindView(R.id.radioButton)
    RadioButton radioButton;

    @BindView(R.id.toggleButton)
    ToggleButton toggleButton;

    @BindView(R.id.seekBar)
    SeekBar seekBar;

    @BindView(R.id.editText)
    EditText editText;

    @BindView(R.id.imageView)
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_views_binding);
        ButterKnife.bind(this);

        radioButton.setText("Radio Button");
        toggleButton.setChecked(true);
        seekBar.setMinimumWidth(200);
        editText.setHint("Edit text");
        imageView.setContentDescription("Image view");
    }
}
