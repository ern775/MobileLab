package msku.ceng.madlab.week2_listviewexample;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("Chip", R.drawable.screenshot_20250925_115816));
        animals.add(new Animal("Cipis", R.drawable.screenshot_20250925_115816));
        animals.add(new Animal("Pipis", R.drawable.screenshot_20250925_115816));
        animals.add(new Animal("Lipis", R.drawable.screenshot_20250925_115816));
        animals.add(new Animal("Mipis", R.drawable.screenshot_20250925_115816));
        animals.add(new Animal("Bipis", R.drawable.screenshot_20250801_210554));

        final ListView listView = (ListView) findViewById(R.id.listview);
        AnimalAdapter animalAdapter = new AnimalAdapter(this, animals);
        listView.setAdapter(animalAdapter);
    }
}