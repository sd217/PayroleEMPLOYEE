class Salary
{
    Job job = null;
    int presentdays = 0,absentdays = 0,halfdays = 0;

    public Salary(Job job)
    {
        this.job = job;
    }

    public void calSalary()
    {
        if(job.getClass().getName().equals("Security"))
        {
            Security security = (Security) job;
            System.out.println("Security salary report");
            countSalary(security.getName(),security.getId(),security.getEge(),security.getDa(),security.getAttendance(),security.getHoliday(),security.getTax(),security.getPf());
        }
         else if(job.getClass().getName().equals("Worker"))
        {
            Worker worker = (Worker) job;
            System.out.println("Worker salary report");
            countSalary(worker.getName(),worker.getId(),worker.getEge(),worker.getDa(),worker.getAttendance(),worker.getHoliday(),worker.getTax(),worker.getPf());
        }
         else if(job.getClass().getName().equals("Asistant"))
        {
            Asistant asistant = (Asistant) job;
            System.out.println("Asistant salary report");
            countSalary(asistant.getName(),asistant.getId(),asistant.getEge(),asistant.getDa(),asistant.getAttendance(),asistant.getHoliday(),asistant.getTax(),asistant.getPf());
        }
        else if(job.getClass().getName().equals("Manager"))
        {
            Manager manager = (Manager) job;
            System.out.println("Manager salary report");
            countSalary(manager.getName(),manager.getId(),manager.getEge(),manager.getDa(),manager.getAttendance(),manager.getHoliday(),manager.getTax(),manager.getPf());
        }
        else if(job.getClass().getName().equals("CEO"))
        {
            CEO ceo = (CEO) job;
            System.out.println("CEO salary report");
            countSalary(ceo.getName(),ceo.getId(),ceo.getEge(),ceo.getDa(),ceo.getAttendance(),ceo.getHoliday(),ceo.getTax(),ceo.getPf());
        }
        else{
            System.out.println("you have some error please check your code first");
        }
            
    }
    public void countSalary(String Name,int Id,float Ege,float Da,int[] Attendance,int Holiday,float Tax,float Pf)
    {

        System.out.println("name : "+ Name+"  id : "+ Id+"  ege : "+ Ege+"  day allowence : "+ Da);
        
            for(int a:Attendance)
            {
                if(a==1)
                {
                    presentdays += 1;
                }
                else if(a==-1)
                {
                    halfdays += 1;
                }
                else
                {
                    absentdays +=1;
                }
            }
            System.out.println("present: "+presentdays+"  absent: "+absentdays+"  half: "+halfdays);
            System.out.println("allocated holidays: "+ Holiday);
            double sum,overday,t_absent;
            if(absentdays==Holiday)
                sum = presentdays*Da + halfdays*0.5*Da + Holiday*Da;
            else if(absentdays < Holiday)
            {
                overday = Holiday - absentdays;
                System.out.println("overday: "+overday);
                sum = presentdays*Da + halfdays*0.5*Da + overday*Da;
            }
            else
            {
                t_absent = absentdays - Holiday;
                System.out.println("Total absent days: "+ t_absent);
                sum = presentdays*Da + halfdays*0.5*Da+ Holiday*Da;
            }
            System.out.println("salary: "+sum);
            System.out.println(Tax+"% tax : "+Tax*sum/100+"  "+Pf+"% PF : "+ Pf*sum/100);
            double newsalary;
            newsalary = sum - Tax*sum/100 - Pf*sum/100;
            System.out.println("In hand salary : "+newsalary);
        
    }
}