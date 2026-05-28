package com.example.quizadaptadores.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizadaptadores.Clases.Jugador;
import com.example.quizadaptadores.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class JugadorAdaptador extends RecyclerView.Adapter<JugadorAdaptador.ViewHolder> {

    private List<Jugador> datos;

    public JugadorAdaptador(List<Jugador> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public JugadorAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jugador, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JugadorAdaptador.ViewHolder holder, int position) {
        Jugador dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgJugador;
        TextView txtNombre, txtEdad, txtEquipo, txtPosicion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgJugador = itemView.findViewById(R.id.imgJugador);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtEdad = itemView.findViewById(R.id.txtEdad);
            txtEquipo = itemView.findViewById(R.id.txtEquipo);
            txtPosicion = itemView.findViewById(R.id.txtPosicion);
        }

        public void bind(Jugador dato) {
            txtNombre.setText("Nombre completo: " + dato.getNombre());
            txtEdad.setText("Edad: " + dato.getEdad());
            txtEquipo.setText("Equipo de futbol: " + dato.getEquipo());
            txtPosicion.setText("Posición: " + dato.getPosicion());
            Picasso.get().load(dato.getImagen()).into(imgJugador);
        }
    }
}
