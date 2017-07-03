package husaynhakeem.io.butterknife_101.topics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import husaynhakeem.io.butterknife_101.R;

public class ResetBinding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_binding);
    }


    public static class ResetBindingFragment extends Fragment {


        @BindView(R.id.textView)
        TextView textView;

        private Unbinder unbinder;


        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_reset_binding, container, false);
            unbinder = ButterKnife.bind(this, rootView);
            textView.setText(getString(R.string.text_reset_binding));
            return rootView;
        }


        @Override
        public void onDestroyView() {
            super.onDestroyView();
            unbinder.unbind();
        }
    }
}
