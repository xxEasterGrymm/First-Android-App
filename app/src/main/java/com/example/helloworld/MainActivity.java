package com.example.helloworld;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onBtnClick(View view) {
        TextView firstName = findViewById(R.id.txtFirstName);
        EditText edtFirstName = findViewById(R.id.edtFirstName);
        firstName.setText("First Name: " + edtFirstName.getText().toString());
        TextView lastName = findViewById(R.id.txtLastName);
        EditText edtLastName = findViewById(R.id.edtLastName);
        lastName.setText("Last Name: " + edtLastName.getText().toString());
        TextView email = findViewById(R.id.txtEmail);
        EditText edtEmail = findViewById(R.id.edtEmail);
        email.setText("Email: " + edtEmail.getText().toString());
    }
}
