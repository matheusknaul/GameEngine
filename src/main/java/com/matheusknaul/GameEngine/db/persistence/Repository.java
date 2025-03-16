package com.matheusknaul.GameEngine.db.persistence;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
	void save(T entity);
	Optional<T> findById(int id);
	List<T> findAll();
	void deleteById(int id);
}
