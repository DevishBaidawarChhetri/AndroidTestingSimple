package np.com.devish.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFirstNumber, etSecondNumber;
    Button btnSum, btnSub, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstNumber = findViewById(R.id.etFirstNumber);
        etSecondNumber = findViewById(R.id.etSecondNumber);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first, second, result;
                first = Float.parseFloat(etFirstNumber.getText().toString());
                second = Float.parseFloat(etSecondNumber.getText().toString());
                ArithmeticClass arithmeticClass = new ArithmeticClass();
                result = arithmeticClass.add(first, second);

                Intent intent = new Intent(MainActivity.this, OutputActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first, second, result;
                first = Float.parseFloat(etFirstNumber.getText().toString());
                second = Float.parseFloat(etSecondNumber.getText().toString());
                ArithmeticClass arithmeticClass = new ArithmeticClass();
                result = arithmeticClass.subtract(first, second);

                Intent intent = new Intent(MainActivity.this, OutputActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first, second, result;
                first = Float.parseFloat(etFirstNumber.getText().toString());
                second = Float.parseFloat(etSecondNumber.getText().toString());
                ArithmeticClass arithmeticClass = new ArithmeticClass();
                result = arithmeticClass.divide(first, second);

                Intent intent = new Intent(MainActivity.this, OutputActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }
}
