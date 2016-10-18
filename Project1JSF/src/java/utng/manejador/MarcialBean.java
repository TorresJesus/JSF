/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.MarcialDAO;
import utng.modelo.Marcial;

/**
 *
 * @author erick
 */
@ManagedBean
@SessionScoped
public class MarcialBean implements Serializable{
    private List<Marcial> marciales;
    private Marcial marcial;

    /**
     * Creates a new instance of MarcialBean
     */
    public MarcialBean() {
    }

    public List<Marcial> getMarciales() {
        return marciales;
    }

    public void setMarciales(List<Marcial> marciales) {
        this.marciales = marciales;
    }

    public Marcial getMarcial() {
        return marcial;
    }

    public void setMarcial(Marcial marcial) {
        this.marcial = marcial;
    }
    
     public String listar(){
        MarcialDAO dao = new MarcialDAO();
        try {
            marciales = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Marciales";
    }
    
    public String eliminar(){
        MarcialDAO dao = new MarcialDAO();
        try {
            dao.delete(marcial);
            marciales = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        marcial = new Marcial();
        return "Iniciar";
    }
    
    public String guardar(){
        MarcialDAO dao = new MarcialDAO();
        try {
            if(marcial.getIdArteMarcial()!=0){
                dao.update(marcial);
            } else {
                dao.insert(marcial);
            }
            marciales = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "cancelar";
    }
    public String editar(Marcial marcial){
        this.marcial = marcial;
        return "Editar";
    }
}
