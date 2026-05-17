package model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;
    private int puntaje;

    @ManyToOne
    @JoinColumn(name = "examen_id")
    private Examen examen;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL)
    private List<Respuesta> respuestas;
}