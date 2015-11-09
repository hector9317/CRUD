package com.example.conf;

@Configuration
@EnableNeo4jRepositories(basePackages="com.example.repository")
@EnableTransactionManagement
@ComponentScan("com.example")
public class AppConfig extends Neo4jConfiguration {	
	@Override
	public SessionFactory getSessionFactory() {
		return new SessionFactory("com.recommender.domain");
	}

	@Override
	public Neo4jServer neo4jServer() {
		return new RemoteServer("http://localhost:7474");
	}

}
