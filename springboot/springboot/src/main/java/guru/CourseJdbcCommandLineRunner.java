package guru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.guru.springboot.controller.Course;
import com.guru.springboot.jdbc.CourseJdbcRepository;
import com.guru.springboot.jdbc.CourseJpaRepository;
import com.guru.springboot.jdbc.DataJpaRepository;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	CourseJdbcRepository repo;
	
	@Autowired
	private CourseJpaRepository em;
	
	@Autowired
	private DataJpaRepository jpa_repo;

	@Override
	public void run(String... args) throws Exception {
		jpa_repo.save(new Course("Guru",1,"Hyd"));
		jpa_repo.save(new Course("Ram",2,"Vizag"));
		jpa_repo.save(new Course("Rahul",3,"Elr"));
		//jpa_repo.deleteById(1);
		System.out.println(jpa_repo.findByName("Ram"));
		System.out.println(jpa_repo.findByLoc("Eluru"));
		
		
	}

}
