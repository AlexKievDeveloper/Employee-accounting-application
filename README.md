# Employee-accounting-application
This application allows you to work with the accounting staff of the enterprise. It includes 3 types of employees. Also allows you to calculate the salaries of employees. (TASK 1)
# Employee-accounting-application-TASK-1
Разработать приложение по учёту сотрудников предприятия.
Типы сотрудников + характеристики для хранения:
Developer (id name, age salary, gender, fixedBugs)
Manager (id name, age, salary, gender)
Cleaner (id name, age, salary, gender, rate, workedDays)

ставка-> salary

Расчёт итоговой зарплаты для Developer происходит по формуле:
(ставка + fixedBugs коэффициент) (randomBoolean ? 2: 0)
Итоговой зарплатой Manager`a является его ставка:
Расчёт итоговой зарплаты для Cleaner происходит по формуле:
ставка + rate * workedDays

Разработать класс EmployeeService который будет хранить всех сотрудников предприятия в массиве.
Класс должен содержать методы для работы с сотрудниками (которые представлены массивом внутри класса):
void printEmployees() -> вывод на экран информации о сотрудниках
double calculateSalaryAndBonus() -> возвращает количество денег необходимое для выплаты зарплат для всех сотрудников в этом месяце
Employee getById(long) -> возращает сотрудника по заданному id
Employee[] getByName(String)-> возращает сотрудника по заданному имени
Employee[] sortByName()
Employee edit(Employee) -> находит сотрудника по id, и подменяет информацию о нём на новую.

Использовать класс Test для создания объекта EmployeeService и тестирования описанных выше методов.
