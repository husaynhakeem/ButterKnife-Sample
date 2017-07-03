package husaynhakeem.io.butterknife_101.topics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import husaynhakeem.io.butterknife_101.R;

import static butterknife.ButterKnife.findById;

public class FindbyId extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findby_id);
    }


    public static class FindByIdFragment extends Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_findby_id, container, false);

            TextView name = findById(rootView, R.id.tv_name);
            name.setText("Husayn Abdul Hakeem");

            ImageView photo = findById(rootView, R.id.iv_photo);
            photo.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.common_google_signin_btn_icon_light_normal));

            return rootView;
        }
    }
}
