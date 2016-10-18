/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author erick
 */
@Entity @Table(name = "tecnica")
public class Tecnica implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_tecnica")
    private Long idTecnica;
    @Column(name = "nombre_tecnica", length = 10)
    private String nombreTecnica;
    @Column(length = 40)
    private String dificultad;
    @Column(name = "anios_experiencia")
    private Long aniosExperiencia;
    @ManyToOne()
    @JoinColumn(name = "id_arte_marcial")
    private Marcial marcial;

    public Tecnica(Long idTecnica, String nombreTecnica, String dificultad, Long aniosExperiencia, Marcial marcial) {
        super();
        this.idTecnica = idTecnica;
        this.nombreTecnica = nombreTecnica;
        this.dificultad = dificultad;
        this.aniosExperiencia = aniosExperiencia;
        this.marcial = marcial;
    }

    public Tecnica() {
       this (0L,"","",0L,null);
    }

    public Long getIdTecnica() {
        return idTecnica;
    }

    public void setIdTecnica(Long idTecnica) {
        this.idTecnica = idTecnica;
    }

    public String getNombreTecnica() {
        return nombreTecnica;
    }

    public void setNombreTecnica(String nombreTecnica) {
        this.nombreTecnica = nombreTecnica;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public Long getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Long aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Marcial getMarcial() {
        return marcial;
    }

    public void setMarcial(Marcial marcial) {
        this.marcial = marcial;
    }
    
    
    
    
}
