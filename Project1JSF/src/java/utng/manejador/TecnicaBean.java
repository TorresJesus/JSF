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
import utng.datos.TecnicaDAO;
import utng.modelo.Marcial;
import utng.modelo.Tecnica;
/**
 *
 * @author erick
 */
@ManagedBean(name = "tecnicaBean")
@SessionScoped
public class TecnicaBean implements Serializable {

    private List<Tecnica> tecnicas;
    private Tecnica tecnica;
    private List<Marcial> marciales;
    public TecnicaBean() {
        tecnica = new Tecnica();
        tecnica.setMarcial(new Marcial());
    }
    

    public List<Tecnica> getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(List<Tecnica> tecnicas) {
        this.tecnicas = tecnicas;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }

    public void setTecnica(Tecnica tecnica) {
        this.tecnica = tecnica;
    }

    public List<Marcial> getMarciales() {
        return marciales;
    }

    public void setRoles(List<Marcial> marciales) {
        this.marciales = marciales;
    }

    public String listar() {
        TecnicaDAO dao = new TecnicaDAO();
        try {
            tecnicas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Tecnica";
    }

    public String eliminar() {
        TecnicaDAO dao = new TecnicaDAO();
        try {
            dao.delete(tecnica);
            tecnicas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {
        tecnica = new Tecnica();
        tecnica.setMarcial(new Marcial());
        try {
            marciales = new MarcialDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }

    public String guardar() {
        TecnicaDAO dao = new TecnicaDAO();
        try {
            if (tecnica.getIdTecnica() != 0) {
                dao.update(tecnica);
            } else {
                dao.insert(tecnica);
            }
            tecnicas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Tecnica tecnica) {
        this.tecnica = tecnica;
        try {
            tecnicas = new TecnicaDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }
}
