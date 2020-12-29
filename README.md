# user-order-relation
OneToMany Mapping example with join using Spring boot, Data JPA, Mysql Driver,</br>.


Add Dependency :-
---
Go to start.spring.io and Create a project with following dependency
1. Web 
   ><br/>  Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container. </br>
   
   > When you select Web Dependency then spring-boot-starter-web dependency is added in pom.xml file.</br>
   
   > spring-boot-starter-web is reponsible for web dependency and also include spring-boot-starter-tomcat. <br>
   
   > Web starter also reposible to load spring-core, spring-mvc, jackson, spring-boot-satrter and tomcat starter.</br>
   
   > spring-boot-starter-tomcat is responsible about the tomcat server like core, logging, websocket.</br>
      
2. Spring Data JPA
  <br/> Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.</br>
   > Spring Data JPA add a layer on top of the JPA. it means Spring Data JPA use all feature of JPA specification. Like Entity relation mapping,
     JPA query capability.</br>
     
   > Spring Data JPA reduced the boilerplate code of JPA that why Spring Data JPA is easier and Faster.</br>
   
   >  There are thre main feature of Spring Data JPA. </br>
   
     * No-Code Repository :- </br>
       > It gives higher abstraction , means the complete implementation is hiden.</br>
     * Reduce boilerplate code :- </br>
       > Provide the default implementation of each method by its Repository interface , so we don't need to implement read and write operations.</br>
     * Generate Query :- </br>
       
     
  
3. Sql 
  <br> MySQL JDBC and R2DBC driver.
  
4. DevTool
 </br>Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
 </br> When we save file then application automatically restart and load the changes , not need to manually restart the server.
