// package com.example;

// import java.util.List;

// import edu.umd.cs.findbugs.annotations.NonNull;
// import io.micronaut.data.jdbc.annotation.JdbcRepository;
// import io.micronaut.data.model.query.builder.sql.Dialect;
// import io.micronaut.data.repository.CrudRepository;

// //since the queries are precomputed we need to specify dialect to which the
// repository is talking
// @JdbcRepository(dialect = Dialect.MYSQL)
// public interface PersonRepository extends CrudRepository<Person, Long> {

// @NonNull
// @Override
// List<Person> findAll();

// }
