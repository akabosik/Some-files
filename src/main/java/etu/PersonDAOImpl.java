package etu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {

	public PersonDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	private final Connection conn;

	public List<Person> getPersons() throws SQLException {
		Statement stat = conn.createStatement();
		ResultSet result = stat.executeQuery("SELECT * FROM person");
		List<Person> persons = new ArrayList<Person>();
		while (result.next()) {
			Person person = new Person();
			person.setAge(result.getInt("id"));
			person.setName(result.getString("name"));
			person.setDate(result.getDate("birthdate"));
			persons.add(person);
		}
		return persons;
	}

}
