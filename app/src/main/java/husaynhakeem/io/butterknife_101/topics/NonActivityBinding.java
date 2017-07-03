package husaynhakeem.io.butterknife_101.topics;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import husaynhakeem.io.butterknife_101.R;

public class NonActivityBinding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_activity_binding);
    }


    public static class NonActivityBindingFragment extends Fragment {


        @BindView(R.id.textView)
        TextView textView;


        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_non_activity_binding, container, false);
            ButterKnife.bind(this, rootView);
            textView.setText(getString(R.string.text_non_activity_binding));
            return rootView;
        }
    }
}