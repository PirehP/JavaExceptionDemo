public class Person {
    String name;
    int age;
    JobType job;
    public void printPerson()
    {
        job = new JobType();
        System.out.println("Name: "+ name+ ", Age: "+ age + ", jobName:" + job.getJobName());
    }
}
