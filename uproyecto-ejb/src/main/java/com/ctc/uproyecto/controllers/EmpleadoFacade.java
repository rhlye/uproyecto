/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ctc.uproyecto.controllers;

import com.ctc.uproyecto.entities.Departamento;
import com.ctc.uproyecto.entities.Empleado;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author digllon
 */
public class EmpleadoFacade extends AbstractFacade<Empleado> {
    @PersistenceContext(unitName = "com.ctc_uproyecto-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
      public EmpleadoFacade() {
        super(Empleado.class);
    }
    
}
