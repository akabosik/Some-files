package etu;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class PersonDAOImpl implements PersonDAO {

//	public PersonDAOImpl(Connection conn) {
//		super();
//		this.conn = conn;
//	}
//	private final Connection conn;
	public List<Person> getPersons() throws SQLException {
		return null;
}
	private SqlSessionFactory sqlSessionFactory;
	public PersonDAOImpl(){
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}
	@SuppressWarnings("unchecked")
	public List<Person> selectAll(){
		SqlSession session = sqlSessionFactory.openSession();
		try{
			List<Person> persons = session.selectList("Person.getAll");
			return persons;
		} finally {
			session.close();
	}

	}
//	public List<Person> getPersons() throws SQLException {
//		Statement stat = conn.createStatement();
	//	ResultSet result = stat.executeQuery("SELECT * FROM person");
	
	
		
		
//		List<Person> persons = new ArrayList<Person>();
	//	while (result.next()) {
	//		Person person = new Person();
	//		person.setAge(result.getInt("id"));
	//		person.setName(result.getString("name"));
	//		person.setDate(result.getDate("birthdate"));
	//		persons.add(person);
	//	}
//		return persons;
//	}

}
