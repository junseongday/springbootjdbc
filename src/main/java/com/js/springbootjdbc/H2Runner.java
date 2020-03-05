package com.js.springbootjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class H2Runner implements ApplicationRunner {

    Logger logger = LoggerFactory.getLogger(H2Runner.class);

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        try(Connection connection = dataSource.getConnection();) {
//            Statement statement = connection.createStatement();
//
//            logger.info(connection.getMetaData().getURL());
//            logger.info(connection.getMetaData().getUserName());
//
//            String sql = "CREATE TABLE USER (ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
//            statement.executeUpdate(sql);
////            connection.close();
//        }
//
//        jdbcTemplate.execute("INSERT INTO USER VALUES (1, 'junseong')");
    }
}
