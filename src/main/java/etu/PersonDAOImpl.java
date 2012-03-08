package etu;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.postgresql.ds.common.BaseDataSource;


public class PersonDAOImpl implements PersonDAO {

//	public PersonDAOImpl(Connection conn) {
//		super();
//		this.conn = conn;
//	}
//	private final Connection conn;
	public List<Person> getPersons() throws SQLException {
		// TODO Auto-generated method stub
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
			List<Person> list = session.selectList("Person.getAll");
			return list;
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
