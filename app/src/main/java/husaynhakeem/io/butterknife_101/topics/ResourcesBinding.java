package husaynhakeem.io.butterknife_101.topics;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import husaynhakeem.io.butterknife_101.R;

public class ResourcesBinding extends AppCompatActivity {


    @BindString(R.string.dummy_text)
    String text;

    @BindColor(R.color.colorAccent)
    int color;

    @BindDimen(R.dimen.space)
    int space;

    @BindDrawable(R.drawable.common_google_signin_btn_icon_light_normal)
    Drawable drawable;


    @BindView(R.id.textView)
    TextView textView;

    @BindView(R.id.view)
    View view;

    @BindView(R.id.imageView)
    ImageView imageView;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources_binding);
        ButterKnife.bind(this);

        textView.setText(text);
        view.setBackgroundColor(color);
        imageView.setImageDrawable(drawable);
        progressBar.setMinimumWidth(space);
    }
}
