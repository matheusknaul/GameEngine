package com.matheusknaul.GameEngine.db.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.matheusknaul.GameEngine.core.Entity;
import com.matheusknaul.GameEngine.db.persistence.Repository;

public class EntityRepository implements Repository<Entity>{
	private final Connection connection;
	
	public EntityRepository(Connection connection) {
		this.connection = connection;
	}
	
	public void save(Entity entity) {
		try {
			String query = "INSERT INTO entities (name) VALUES (?)";
			try(PreparedStatement stmt = connection.prepareStatement(query)){
				stmt.setString(1, entity.getName());
				stmt.executeUpdate();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteById(int id) {
		try {
			String query = "DELETE FROM entities WHERE id = ?";
		}
	}
}
