package com.colegiolavictoria.signoaventura.modelos;

import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Progreso {
    @Column(name = "id_progreso")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgreso; 

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    Estudiante estudiante; 

    @ManyToOne
    @JoinColumn(name = "id_juego")
    private Juego juego; 

    @Column
    private int puntuacion; 
    
    @Column(name = "fecha_intento")
    private LocalDateTime fechaIntento; 

    @Column(name = "tiempo_jugado")
    private LocalTime tiempoJugado;     


}
