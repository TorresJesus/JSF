/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Tecnica;

/**
 *
 * @author erick
 */
public class TecnicaDAO extends DAO<Tecnica> {

    public TecnicaDAO() {
        super(new Tecnica());
    }
    
    public Tecnica getOneById(Tecnica tecnica)
            throws HibernateException{
        return super.getOneById(tecnica.getIdTecnica());
    }
    

}
