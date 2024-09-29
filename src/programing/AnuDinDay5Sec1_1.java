package programing;

public class AnuDinDay5Sec1_1 {
    //Problem Statement 1: Develop a simple java application to calculate the tax for a particular employee based on his salary. Develop a class named “TaxCalculator“ with a method named calculateTax with the following method parameters, Variable Name Data Type empName String isIndian boolean empSal double This method should return a double taxAmount. The business logic for calculating the tax is as follows, this has to be implemented inside the method, If the employee is not a Indian The calculator should throw a CountryNotValidException If the employee name is null or empty The calculator should throw a EmployeeNameInvalidException If empSal is greater than one lakh and isIndian true taxAmount =empSal *8/100 Otherwise If empSal is between 50K and 1lakh and isIndian true taxAmount =empSal *6/100 Otherwise If empSal is between 30 and 50 Thousand and isIndian true taxAmount =empSal *5/100 Otherwise If empSal is between 10 and 30 Thousand and isIndian true taxAmount =empSal *4/100 Otherwise The calculator should throw a TaxNotEligibleException. Develop a main class CalculatorSimulator , implement the following logic in main method 1. Execute the calculateTax Method and print the tax amount as “Tax amount is “ 2. In case the calculateTaxMethod throws exceptions, this method needs to catch the appropriate exception print the stack trace and display the following messages, a. Country not valid: “The employee should be an Indian citizen for calculating tax” b. Employee name not valid: “The employee name cannot be empty” c. Not eligible for Tax calculation: “The employee does not need to pay tax” The following test cases to be executed, change the data in main method and run it and verify the output messages Test Cases Employee Name Employee Salary Is Indian Message Expected Test Case 1 Ron 34000 False The employee should be an Indian citizen for calculating tax. Test Case 2 Tim 1000 True The employee does not need to pay tax Test Case 3 Jack 55000 True Tax amount is 3300 Test Case 4 30000 True The employee name cannot be empty.

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        
        // Test cases
        String[][] testCases = {
            {"Rohan", "34000", "False"},
            {"Rajveer", "1000", "True"},
            {"Sorab", "55000", "True"},
            {"", "30000", "True"}
        };

        for (String[] testCase : testCases) {
            String empName = testCase[0];
            double empSal = Double.parseDouble(testCase[1]);
            boolean isIndian = Boolean.parseBoolean(testCase[2]);

            try {
                double taxAmount = taxCalculator.calculateTax(empName, isIndian, empSal);
                System.out.println("Tax amount is " + taxAmount);
            } catch (CountryNotValidException e) {
                e.printStackTrace();
                System.out.println("The employee should be an Indian citizen for calculating tax.");
            } catch (EmployeeNameInvalidException e) {
                e.printStackTrace();
                System.out.println("The employee name cannot be empty.");
            } catch (TaxNotEligibleException e) {
                e.printStackTrace();
                System.out.println("The employee does not need to pay tax.");
            }
        }
    }
}

class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal) 
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        
        // Check if employee name is valid
        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }
        
        // Check if the employee is Indian
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

        // Calculate tax based on salary
        double taxAmount;
        if (empSal > 100000) {
            taxAmount = empSal * 0.08; // 8%
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 0.06; // 6%
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 0.05; // 5%
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 0.04; // 4%
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
        
        return taxAmount;
    }
}

