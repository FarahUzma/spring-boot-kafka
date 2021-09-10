# spring-boot-kafka
1. Dependency for Kafka in spring boot  <dependency>
    		<groupId>org.springframework.kafka</groupId>
    		<artifactId>spring-kafka</artifactId>
    		<version>2.7.2</version>
       </dependency>

2. After Zookeeper and Kafka are up and running.. Firstly we need a 2 Configurations.. one for producer and one for consumer
3. ProducerConfig : 
Will be annotated by @Configuration to intialize all the properties that are needed to connect to Kafka.
Properties are set using @Bean Annotation.
What does Bean Annotation really do?  Reference : https://www.baeldung.com/spring-bean 
4. In the KafkaProducer config, a bean for Kafka Template with Kafka properties is created.
5. In KafkaConsumer config, a bean for Kafka Listener with Kafka properties is created.
