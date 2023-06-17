package org.tnsif.repository;

//Program to demonstrate on CRUD operation

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsif.entities.Student;

public interface StudentRepo {
	/*
	 * The object used for executing a static SQL statement and returning the
	 * results it produces.
	 */
	Statement makeStatement();

	PreparedStatement createPrepareStatement(String query);

	public int addQuery(String query, Student student);

	public int updateQuery(String query, Student student);

	public int deleteQuery(String query);

	public ResultSet retrieveQuery(String query);

}
