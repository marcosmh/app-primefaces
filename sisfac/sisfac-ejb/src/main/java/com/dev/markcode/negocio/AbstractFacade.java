package com.dev.markcode.negocio;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class AbstractFacade<T> {
	
	
	private Class<T> classEntity;
	
	public AbstractFacade(Class<T> classEntity) {
		this.classEntity = classEntity;

	}
	
	protected abstract EntityManager getEntityManager();
	
	public void guardar(T entidad) throws Exception {
		getEntityManager().persist(entidad);
	}
	
	public void actualizar(T entidad) throws Exception {
		getEntityManager().merge(entidad);
	}
	
	public void eliminar(T entidad) throws Exception {
		getEntityManager().remove(getEntityManager().merge(entidad));
	}
	public T consularPorId(Object id) {
		return getEntityManager().find(classEntity, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> consultarTodos() {
		return getEntityManager()
				.createQuery("Select alias from " + classEntity.getSimpleName() + " alias " )
				.getResultList();
				
	}
	
	
;
}
