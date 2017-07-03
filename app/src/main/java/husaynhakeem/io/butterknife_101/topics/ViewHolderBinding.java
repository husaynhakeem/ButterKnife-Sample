package husaynhakeem.io.butterknife_101.topics;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import husaynhakeem.io.butterknife_101.R;

public class ViewHolderBinding extends AppCompatActivity {


    @BindView(R.id.lv_view_holder_binding)
    ListView listView;

    Person[] people = new Person[]{
            new Person("Husayn", "Abdul Hakeem", 23),
            new Person("Abderrahmane", "Bachiri", 25),
            new Person("Aymane", "Sennoussi", 26),
            new Person("Yassine", "Ziyad", 32),
            new Person("Laarbi", "Alaoui Belghiti", 36)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_holder_binding);
        ButterKnife.bind(this);

        listView.setAdapter(new ViewHolderAdapter(this, R.layout.item_view_holder_binding, people));
    }


    static class ViewHolderAdapter extends ArrayAdapter<Person> {

        private Person[] people;

        public ViewHolderAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Person[] people) {
            super(context, resource, people);
            this.people = people;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_holder_binding, parent, false);

            Person person = people[position];
            ViewHolder viewHolder = new ViewHolder(itemView);
            viewHolder.firstName.setText(person.firstName);
            viewHolder.lastName.setText(person.lastName + ",");
            viewHolder.age.setText(person.age + " years old");

            return itemView;
        }
    }


    static class ViewHolder {

        @BindView(R.id.tv_firstname)
        TextView firstName;

        @BindView(R.id.tv_lastname)
        TextView lastName;

        @BindView(R.id.tv_age)
        TextView age;

        public ViewHolder(View itemView) {
            ButterKnife.bind(this, itemView);
        }
    }


    static class Person {

        String firstName;
        String lastName;
        int age;

        public Person() {
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }
}
