package interfaceAndLambdas.exercises;

public class Employee implements Measurable {

    int salary;
    String name;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public double average(Measurable[] objects) {
        if(objects.length == 0) {return 0;}
        double sum = 0;
        for(Measurable obj: objects)  {
            double measurable = obj.getMeasurable();
            sum = sum + measurable;

        }
        return sum / objects.length;
    }


    public static Measurable largest(Measurable[] objects) {

        if (objects.length == 0) {
            return null;
        };

        double maximumMeasure = Double.MIN_VALUE;
        Measurable largestMeasurable = null;

        for (Measurable obj : objects)
        {
            if (obj.getMeasurable() > maximumMeasure) {
                maximumMeasure = obj.getMeasurable();
                largestMeasurable = obj;
            }
        }

        return largestMeasurable;
    }








    @Override
    public double getMeasurable() {
        return salary;
    }
}
