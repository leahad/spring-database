# Create a Database in Spring Boot applications

### Required Dependencies

- Spring Data JPA
- MySQL Driver

### methode 1: Preloading Data with an SQL Script

1.Create an `import.sql` file in the `src/main/resources` directory with your SQL script.
2.Add the following line to your `application.properties` to configure Hibernate: `spring.jpa.hibernate.ddl-auto=create-drop`

`create-drop`: This option will create the schema when the application starts, but it will also drop the schema when the application shuts down. It's mainly used for development and testing purposes when you want a fresh database each time your application starts.

### methode 2: Using the CommandLineRunner method

1.Add the `CommandLineRunner` method to your main application class:

```java
    @Bean
	`public CommandLineRunner run() throws Exception {`
		return (String[] args) -> {

		};
	}
```
This method will run when the application starts.
2.Inject your repositories into your controller using dependency injection.
3.Create new objects inside the CommandLineRunner method.
4.Use the save method from your repositories to persist objects in your database.

You can see an exemple in the `BddAplication.java ` file.

### Source

* [Article with another method](https://www.masterspringboot.com/data-access/jpa-applications/preloading-data-in-spring-boot-with-import-sql-and-data-sql/)

### Spring Documentation
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)