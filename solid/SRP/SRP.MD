# Single responsibility Principle


* SRP came to transform software from being tightly coupled into loosely coupled softwares.

* Softwares become tightly coupled when they have too many reponsibilites

Sample example : 
```
Class Employee {
    printReport()
    saveToDatabase()
}

should be transformed into : 

class EmployeeReport{}
class EmployeeDatabase{}

```
