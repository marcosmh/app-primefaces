package com.dev.markcode.negocio;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TipoProductoFacade extends AbstractFacade<TipoProductoFacade> {
	
	@ PersistenceContext(unitName = "sisfac-ejb")
	private EntityManager entityManager;
	
	public TipoProductoFacade() {
		super(TipoProductoFacade.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
