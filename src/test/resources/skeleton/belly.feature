Feature: Salary Management

  Scenario: Modify an employee's salary
    Given  the salary management system is initialized with the following data
      | employee_id | employee_user | employee_salary |
      | 1           | donald        | 60000.0         |
      | 2           | dewie         | 62000.0         |
      | 3           | goofy         | 55000.0         |
      | 4           | scrooge       | 70000.0         |
    When the boss increases the salary for the employee with id '3' by 5%
    Then the payroll for the employee with id '3' should display a salary of 57750