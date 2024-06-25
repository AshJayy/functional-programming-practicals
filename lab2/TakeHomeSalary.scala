object  TakeHomeSalary{
    def normalSalary(hours: Double): Double = hours * 250;
    def OTSalary(hours: Double): Double = hours * 85;
    def taxAmount(salary: Double): Double = salary * 12/100
    def takeHomeSalary(normalHours: Double, OTHours: Double): Double = normalSalary(normalHours) + OTSalary(OTHours) - taxAmount(normalSalary(normalHours) + OTSalary(OTHours));

    def main(args: Array[String]): Unit = {
        println(takeHomeSalary(40, 30))
    }
}