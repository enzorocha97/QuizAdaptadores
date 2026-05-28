package com.example.quizadaptadores;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizadaptadores.Clases.Jugador;
import com.example.quizadaptadores.adaptadores.JugadorAdaptador;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvJugadores;
    List<Jugador> listJugadores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rcvJugadores = findViewById(R.id.rcvJugadores);

        Jugador jug1 = new Jugador("https://estaticos.elcolombiano.com/binrepository/848x565/34c0/780d565/none/11101/XGEE/junior-and-teo_47888257_20250517175248.jpg", "Teofilo Gutierrez", "39", "Junior de Barranquilla", "Delantero");
        Jugador jug2 = new Jugador("https://wallpapers4screen.com/Uploads/6-8-2025/85363/thumb2-luis-diaz-4k-red-neon-lights-bayern-munich-bundesliga.jpg", "Luis Diaz", "27", "Bayern de Munich", "Extremo");
        Jugador jug3 = new Jugador("https://images2.minutemediacdn.com/image/upload/c_fill,w_1080,ar_16:9,f_auto,q_auto,g_auto/shape%2Fcover%2Fsport%2FFILES----Picture-taken-15-October-2003-cc0f6baf7991de255cdd8cfaa7fdf377.jpg", "Ronaldinho", "44", "Retirado", "Mediocampista");
        Jugador jug4 = new Jugador("https://imagenes.noticiasrcn.com/ImgDeportesRCN/junior-sonrie-por-la-exitosa-operacion-de-jermein-pena.webp?w=960", "Jermein Zidane Peña", "25", "Junior de Barranquilla", "Defensa");
        Jugador jug5 = new Jugador("https://wallpapers4screen.com/Uploads/14-2-2025/66875/thumb2-4k-michael-olise-red-abstract-background-bayern-munich-fc-bundesliga.jpg", "Michael Olise", "22", "Bayern Munich", "Extremo");
        Jugador jug6 = new Jugador("https://files.winsports.co/cms/2025/01/14144644/Victor-Cantillo.jpg?w=640", "Victor Cantillo", "31", "Junior de Barranquilla", "Mediocampista");

        listJugadores.add(jug1);
        listJugadores.add(jug2);
        listJugadores.add(jug3);
        listJugadores.add(jug4);
        listJugadores.add(jug5);
        listJugadores.add(jug6);

        rcvJugadores.setLayoutManager(new LinearLayoutManager(this));
        rcvJugadores.setAdapter(new JugadorAdaptador(listJugadores));
    }
}
