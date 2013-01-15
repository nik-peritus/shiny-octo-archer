package name.elaman.budgetsms;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MessageSend extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_send);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.message_send, menu);
        return true;
    }
    
}