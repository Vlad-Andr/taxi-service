# Taxi Service
The main purpose of this project is the support companies, mainly taxi, that must take control of their cars and drivers. This achieves with functions, mostly CRUD operations, adding/ editing/ removing information about cars, drivers, manufacturers.

# Techniques/ Technologies
The project are separated on three-layer:
  - DAO - connection to DB;
  - Business Logic(service);
  - Presentation - for viewing result;
1) DAO layer was created with JDBC API.
2) The service layer consists of two parts: Servlets, responsible for receiving requests and giving responses and Filters, providing a security function.
3) The presentation layer displays responses as JSP pages.

# Technologies that was used:
DAO and Service layers: Java, JDBC, Servlets, Reflection API

Presentation layer: JSP, JSTL, HTML, CSS

Web-server: Apache Tomcat

Project builder: Apache Maven

Database: RDBMS MySQL

# Usage
1) Click on clone this project, open your IDE, then File -> New -> Project from Version Control -> paste project's URL -> Click clone.
2) Configure Tomcat Server(the best solution is to use Tomcat 9.0.46 or later version);
3) Configure MySQL RDBMS.
4) Open RDBMS and copy init_db.sql into query window.
5) Open ConnectionUtil class and change URL, Username and Password values to your own.(Hint: URL should be like - url: jdbc:mysql://(host name):(port)/(database name)?serverTimezone=UTC) 
6) Run an application.
