package de.pet_project.service.integration.annotation;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.jdbc.Sql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@SpringBootTest
@ActiveProfiles("test")
@Target({ElementType.TYPE})
@Sql(value = {"classpath:sql/data.sql"})
//@Sql(value = {"classpath:sql/clear_data.sql"},executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
@Retention(RetentionPolicy.RUNTIME)
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
public @interface IT {
}
