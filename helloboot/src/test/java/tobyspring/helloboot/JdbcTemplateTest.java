package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@HellobootTest
public class JdbcTemplateTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @BeforeEach
    void init() {
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS hello(name VARCHAR(50) PRIMARY KEY, count INT)");
    }

    @Test
    public void insertAndQuery() {
       jdbcTemplate.update("INSERT INTO hello values(?, ?)", "Toby", 3);
       jdbcTemplate.update("INSERT INTO hello values(?, ?)", "Spring", 1);

        Long count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM hello", Long.class);
        Assertions.assertThat(count).isEqualTo(2);
    }

    @Test
    public void insertAndQuery2() {
        jdbcTemplate.update("INSERT INTO hello values(?, ?)", "Toby", 3);
        jdbcTemplate.update("INSERT INTO hello values(?, ?)", "Spring", 1);

        Long count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM hello", Long.class);
        Assertions.assertThat(count).isEqualTo(2);
    }
}
