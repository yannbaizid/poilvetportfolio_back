package fr.yannbaizid.payveportfolio.services;

import java.util.List;
import java.util.Optional;

public interface DaoService<T, ID> {

	public Optional<T> findById(ID id);

	public List<T> findAll();

	public T save(T o);

	public void deleteById(ID id);

}
