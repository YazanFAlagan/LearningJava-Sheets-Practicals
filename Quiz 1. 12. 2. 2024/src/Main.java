public static void main(String[] args) {
    Employee emp1 = new Employee();
    System.out.println(emp1);
    Employee emp2 = new Employee("Yazan", "IT", 50000.0);
    System.out.println(emp2);
    emp2.giveAnnualRaise(10);
    System.out.println("After raise: " + emp2);
}
