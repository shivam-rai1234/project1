     
     create database ProjectDB;
     
     use ProjectDB;
     
     CREATE TABLE BoilerPlate (
                          id INT PRIMARY KEY, 
                          appliction_name VARCHAR(80),
                          BoilerPlate_code TEXT,
                          Reduced_Code TEXT,
                          Reduce_Method VARCHAR(900) NOT NULL                       
                          );
   INSERT INTO BoilerPlate VALUES( 1, " JAVA ", 
    " public class User {
      private Long id;
      ...
      public Long getId() {
        return id;
     }
     public void setId(Long id) {
        this.id = id;
     }
     ...
     }",
     
     " 
      import lombok.Getter;
      import lombok.Setter;
     
      @Getter
       @Setter
       public class User {
       private Long id;
       ...
       }
     " , " Use Annotations to Reduce Boilerplate Code" );
 
 INSERT INTO BoilerPlate VALUES( 2, " JAVA+XML ", 
       "
       /** Query company employees */
     public List< EmployeeDO> queryEmployee(Long companyId) {
       try (Connection connection = tddlDataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(QUERY_EMPLOYEE_SQL)) {
        statement.setLong(1, companyId);
        try (ResultSet result = statement.executeQuery()) {
            List< EmployeeDO> employeeList = new ArrayList<>();
            while (result.next()) {
                EmployeeDO employee = new EmployeeDO();
                employee.setId(result.getLong(1));
                employee.setName(result.getString(2));
                ...
                employeeList.add(employee);
            }
            return employeeList;
        }
      } catch (SQLException e) {
	String message = String.format(query user exceptions of the company(%s), companyId);
        log.error(message, e);
        throw new ExampleException(message, e);
     }
   } ",
   "
   UserDAO.java:
      @Mapper
      public interface UserDAO {
      List< EmployeeDO> queryEmployee(@Param(companyId) Long companyId);
      }
      
      UserDAO.xml:
   < mapper namespace=com.example.repository.UserDAO>
       < select id=queryEmployee resultType=com.example.repository.UserDO>
        select id
        , name
        ...
        from t_user
        where company_id = #{companyId}
       < /select>
    < /mapper>
     " , " Use Framework to Reduce Boilerplate Code");
     

INSERT INTO BoilerPlate VALUES( 3, " JAVA  ", 
      "
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
    String line;
    while (Objects.nonNull(line = reader.readLine())) {
        // process a line
        ...
    }
    } catch (IOException e) {
    String message = String.format(read file(%s) exception, fileName);
    log.error(message, e);
    throw new ExampleException(message, e);
   }
      ",
      "
      /** Define method */
    public static void readLine(String fileName, Consumer< String> lineConsumer) {
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        while (Objects.nonNull(line = reader.readLine())) {
            lineConsumer.accept(line);
        }
    } catch (IOException e) {
        String message = String.format(read file (%s) exception, fileName);
        log.error(message, e);
        throw new ExampleException(message, e);
    }
   }

    // Use code
    readLine(example.txt, line -> {
    // Process a line
    ...
   });
      ", " Use Design Pattern to Reduce Boilerplate Code ");


INSERT INTO BoilerPlate VALUES( 4, " JAVA ", 
    " public class Product {
      private Long id;
      ...
      public Long getId() {
        return id;
     }
     public void setId(Long id) {
        this.id = id;
     }
     ...
     }",
     
     " 
      import lombok.Getter;
      import lombok.Setter;
     
      @Getter
       @Setter
       public class Product {
       private Long id;
       ...
       }
     " , " Use Annotations to Reduce Boilerplate Code" );
     

     
INSERT INTO BoilerPlate VALUES( 5, " JAVA ", 
    " public class Employee {
      private Long id;
      ...
      public Long getId() {
        return id;
     }
     public void setId(Long id) {
        this.id = id;
     }
     ...
     }",
     
     " 
      import lombok.Getter;
      import lombok.Setter;
     
      @Getter
       @Setter
       public class Employee {
       private Long id;
       ...
       }
     " , " Use Annotations to Reduce Boilerplate Code" );     
        
     select*from Boilerplate;
    select BoilerPlate_Code from  Boilerplate; # query to fetch only one column in table
     
     create table user(user_id int primary key,  appliction_name VARCHAR(80),
                          user_code TEXT);
           select*from user;               
           
	insert into user values(1,"JAVA"," public class User {
      private Long id;
      ...
      public Long getId() {
        return id;
     }
     public void setId(Long id) {
        this.id = id;
     }
     ...
     }");
     insert into user values(2, " JAVA+XML ", 
       " UserDAO.java:
      @Mapper
      public interface UserDAO {
      List< EmployeeDO> queryEmployee(@Param(companyId) Long companyId);
      }
      
      UserDAO.xml:
   < mapper namespace=com.example.repository.UserDAO>
       < select id=queryEmployee resultType=com.example.repository.UserDO>
        select id
        , name
        ...
        from t_user
        where company_id = #{companyId}
       < /select>
    < /mapper>");
    INSERT INTO user VALUES( 3, " JAVA  ", 
      "
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
    String line;
    while (Objects.nonNull(line = reader.readLine())) {
        // process a line
        ...
    }
    } catch (IOException e) {
    String message = String.format(read file(%s) exception, fileName);
    log.error(message, e);
    throw new ExampleException(message, e);
   }
	");
    
    INSERT INTO user VALUES( 4, " JAVA ",    " 
      import lombok.Getter;
      import lombok.Setter;
     
      @Getter
       @Setter
       public class Product {
       private Long id;
       ...
       }");
       INSERT INTO user VALUES( 5, " JAVA ", 
    " public class Employee {
      private Long id;
      ...
      public Long getId() {
        return id;
     }
     public void setId(Long id) {
        this.id = id;
     }
     ...
     }");
      
      select*from user;
     select *from  Boilerplate INNER JOIN user ON Boilerplate.BoilerPlate_code=user.user_code;
