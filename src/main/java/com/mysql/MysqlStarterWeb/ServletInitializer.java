package com.mysql.MysqlStarterWeb;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	/* *
- /api/vl/students [GET]: Fetch all the students
- /api/vl/students (POST): Add a new student
- /api/vl/students/{id} (GET): Fetch the details of a student
- /api/vl/students/{id) [PUT]: Update the details of a student
- /api/vl/students/{id} (DELETE): Delete the student.
	 * */

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MysqlStarterWebApplication.class);
	}

}
