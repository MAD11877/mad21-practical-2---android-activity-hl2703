package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final static String TAG="Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //dump all code here
        Log.v(TAG, "Main activity created!");

        Button button =findViewById(R.id.messageBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inner class
                Log.v(TAG, "Button pressed.");
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }
        });
        final boolean[] followed = {false};
        final Button followBtn =findViewById(R.id.followBtn);
        followBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //inner class
                Log.v(TAG, "Button pressed.");
                    if(!followed[0]) {
                        followBtn.setText("Unfollow");
                        followed[0] =true;
                    }
                    else{
                        followBtn.setText("follow");
                        followed[0] =false;
                    }

            }
        });
    }
}
