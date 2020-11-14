package firstlook.gohool.please;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button myBtn;
    private TextView meat;
    private EditText medittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myBtn = (Button) findViewById(R.id.btn);
        meat = (TextView) findViewById(R.id.mtext);
        medittext = (EditText) findViewById(R.id.editText);

        myBtn.setText(R.string.button_name);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String enterMessage;

                enterMessage = medittext.getText().toString();

                meat.setVisibility(View.VISIBLE);
                meat.setText(enterMessage);
            } 
        });



    }





}

