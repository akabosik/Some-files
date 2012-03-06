package etu;

import java.sql.SQLException;
import java.util.List;

public interface PersonDAO {
	List<Person> getPersons() throws SQLException;
}
