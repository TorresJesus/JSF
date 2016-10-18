/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author erick
 */
@Entity @Table(name="marcial")
public class Marcial implements Serializable{
    @Id
    @GeneratedValue(
                    strategy = GenerationType.IDENTITY)
    @Column(name="id_marcial")
    private Long idArteMarcial;
    @Column(length=30)
    private String nombre;
    @Column(length=30)
    private String nacionalidad;
    @Column(length=30)
    private String mortalidad;

    public Marcial() {
        this.idArteMarcial = 0L;
    }

    public Long getIdArteMarcial() {
        return idArteMarcial;
    }

    public void setIdArteMarcial(Long idArteMarcial) {
        this.idArteMarcial = idArteMarcial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getMortalidad() {
        return mortalidad;
    }

    public void setMortalidad(String mortalidad) {
        this.mortalidad = mortalidad;
    }
    
    
    
    
    
}
