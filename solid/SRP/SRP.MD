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


```
Why this is SRP-compliant:
Each class has exactly one reason to change:

- Change input style? → modify NumberReader

- Change math logic? → modify Adder

- Change how output is shown? → modify ResultPresenter

- Need to plug things together differently? → modify SumApplication

```
