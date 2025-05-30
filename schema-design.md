# Schema Design - Smart Clinic Management System

    ## MySQL Database Design
    
    ### Table : Patient
    
    ---id: INT, Primary Key, Auto Increment
    ---first_name: VARCHAR(255), Not Null
    ---last_name: VARCHAR(255), Not Null
    ---age: INT, Not Null, >0 AND <125
    ---gender: ENUM('Male', 'Female', 'Other'), Not Null
    ---email: VARCHAR(255), Unique, Not Null
    ---phone:  VARCHAR(20), Unique, Not Null
    
    
