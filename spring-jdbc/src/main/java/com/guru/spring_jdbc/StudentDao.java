package com.guru.spring_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class StudentDao {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int saveStudent(Student s) {
		String sql="insert into student values(?,?)";
		return template.update(sql, s.getId(),s.getName());
	}
	public void getAllStudents(int sid)
	{
		String sql="select * from student";
		List<Student> list=template.query(sql,new RowMapper<Student>()
		{
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				return s;
			}
		});
		list.forEach(
				new Consumer<Student>() {
					public void accept(Student x) {
						System.out.println(x);
					}
				}
				);
	}

}
