package creativeflint.com.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button libraryButton;
    private Button spotifyStreamerButton;
    private Button scoresButton;
    private Button buildBiggerButton;
    private Button capstoneButton;
    private Button xyzReaderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        libraryButton = getButtonById(R.id.button_library);
        spotifyStreamerButton = getButtonById(R.id.button_streamer);
        scoresButton = getButtonById(R.id.button_scores);
        buildBiggerButton = getButtonById(R.id.button_build_bigger);
        capstoneButton = getButtonById(R.id.button_capstone);
        xyzReaderButton = getButtonById(R.id.button_xyz_reader);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void displayToastMessage(Button button){
        String message = "This button will launch ";
        switch (button.getId()){
            case R.id.button_streamer :
                message += "Spotify Streamer";
                break;
            case R.id.button_build_bigger :
                message += "Build It Bigger";
                break;
            case R.id.button_library :
                message += "Library";
                break;
            case R.id.button_scores :
                message += "Scores";
                break;
            case R.id.button_xyz_reader :
                message += "XYZ reader";
                break;
            case R.id.button_capstone :
                message = message + "Capstone";
                break;
            default:
                throw new AssertionError("Unsupported button type");
        }
        Toast.makeText(this.getApplicationContext(), message, Toast.LENGTH_SHORT);
    }

    private Button getButtonById(int id){
        return (Button) findViewById(id);
    }
}
