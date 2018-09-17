package digitalhouse.com.projetojson;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //esse cara aqui embaixo está pegando a pasta assets
        AssetManager assetManager = getAssets();
        //* pega o arquivo da assets e transforma em bytes para que possamos ler ele no java */
        //em seguida qdo deu a luz vermelha em cima do nome noticias.json eu clico na lampada vermelha e ele implementa para mim o try e catch
        try {
            InputStream newJson = assetManager.open("noticias.json");
        //Buffer é O ESPACO DE MEMORIA QUE VOU CACHEAR OU GUARDAR O MEU ARRAY DE dados que vai vir do json
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(newJson));
            Gson gson = new Gson();

            NoticiasRespostas respostas = gson.fromJson(bufferedReader,NoticiasRespostas.class);

            //se funcionar vai aparecer a mensagem no logcat
            Log.i("TAG","title: " + respostas.getNoticias().get(0).getTitle());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
