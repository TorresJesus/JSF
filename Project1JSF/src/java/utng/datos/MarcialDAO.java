/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Marcial;

/**
 *
 * @author erick
 */
public class MarcialDAO extends DAO<Marcial>{
    public MarcialDAO(){
        super(new Marcial());
    }
    
    public Marcial getOneById(Marcial marcial)
            throws HibernateException{
        return super.getOneById(
                        marcial.getIdArteMarcial());
    }
    
}
