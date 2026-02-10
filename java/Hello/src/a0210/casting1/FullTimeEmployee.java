package a0210.casting1;

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    private double bonus;

    public void workFullTime(){
        System.out.println();
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

}
