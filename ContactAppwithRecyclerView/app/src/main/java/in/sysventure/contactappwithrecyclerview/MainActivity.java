package in.sysventure.contactappwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import in.sysventure.contactappwithrecyclerview.adapter.CustomAdapter;
import in.sysventure.contactappwithrecyclerview.model.Contact;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    /*Contact[] contacts = {
            new Contact(1, "1234567890", "Ram G"),
            new Contact(2, "1234567891", "Sita G"),
            new Contact(3, "1234567892", "Laxman G"),
            new Contact(4, "1234567893", "Bharat G"),
            new Contact(5, "1234567894", "Shatrughan G"),
            new Contact(6, "1234567895", "Krishna G"),
            new Contact(7, "1234567896", "Radha G"),
            new Contact(8, "1234567897", "Rukkmini G"),
            new Contact(9, "1234567898", "Dau G"),
            new Contact(10, "12345678901", "1 Ram G"),
            new Contact(11, "12345678919", "2 Sita G"),
            new Contact(12, "12345678929", "3 Laxman G"),
            new Contact(13, "12345678939", "4 Bharat G"),
            new Contact(14, "12345678949", "5 Shatrughan G"),
            new Contact(15, "12345678959", "6 Krishna G"),
            new Contact(16, "12345678969", "7 Radha G"),
            new Contact(17, "12345678979", "8 Rukkmini G"),
            new Contact(18, "12345678989", "9 Dau G")

    };*/

    Contact c1 = new Contact(1, "1234567890", "Ram G");
    Contact c2 = new Contact(2, "1234567891", "Sita G");
    Contact c3 = new Contact(3, "1234567892", "Laxman G");
    Contact c4 = new Contact(4, "1234567893", "Bharat G");
    Contact c5 = new Contact(5, "1234567894", "Shatrughan G");
    Contact c6 = new Contact(6, "1234567895", "Krishna G");
    Contact c7 = new Contact(7, "1234567896", "Radha G");
    Contact c8 = new Contact(8, "1234567897", "Rukkmini G");
    Contact c9 = new Contact(9, "1234567898", "Dau G");
    Contact c10 = new Contact(10, "12345678901", "a Ram G9");
    Contact c11 = new Contact(11, "12345678911", "a Sita G9");
    Contact c12 = new Contact(12, "12345678921", "a Laxman G9");
    Contact c13 = new Contact(13, "12345678931", "a Bharat G9");
    Contact c14 = new Contact(14, "12345678941", "a Shatrughan G9");
    Contact c15 = new Contact(15, "12345678951", "a Krishna G9");
    Contact c16 = new Contact(16, "12345678961", "a Radha G9");
    Contact c17 = new Contact(17, "12345678971", "a Rukkmini G9");
    Contact c18 = new Contact(18, "12345678981", "a Dau G9");

    Contact[] contacts = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CustomAdapter ca = new CustomAdapter(contacts);
        recyclerView.setAdapter(ca);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}