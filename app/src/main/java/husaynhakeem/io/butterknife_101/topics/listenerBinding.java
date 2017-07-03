package husaynhakeem.io.butterknife_101.topics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import husaynhakeem.io.butterknife_101.R;

public class listenerBinding extends AppCompatActivity {


    private Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener_binding);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4})
    public void handleButtonsClick(Button button) {

        if (toast != null)
            toast.cancel();

        toast = Toast.makeText(this, "Button " + button.getText() + " clicked", Toast.LENGTH_SHORT);
        toast.show();
    }
}