package ex.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class User1Form {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<User1> USER1_ROW_MAPPER=(rs,i)->{
		User1 user1 = new User1();
		user1.setId(rs.getInt("id"));
		user1.setName(rs.getString("name")); 
		user1.setDep_id(rs.getInt("dep_id"));
		user1.setAge(rs.getInt("age"));
		return user1;
		
	};

		public List<User1> findByName(String name) {
			String sql="select id,name,age,dep_id from members where name like :name";
			SqlParameterSource param = new MapSqlParameterSource().addValue("name", "%"+name+"%");
			List<User1> list=template.query(sql, param, USER1_ROW_MAPPER);
			return list;
		}
}
