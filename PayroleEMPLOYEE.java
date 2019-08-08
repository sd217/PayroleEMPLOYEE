//import java.util.Scanner;
class PayroleEMPLOYEE
{
    public static void main(String args[])
    {
        System.out.println("1-security 2-worker 3-asistant 4-manager 5-CEO");
        // Scanner ob1 = new Scanner(System.in);
        // System.out.println("Enter a number :");
        // int count = ob1.nextInt(); 
        int count = Integer.parseInt(args[0]);   

        switch(count)
        {
            case 1:
            {
                 Security security = new Security();
               security.setName("shardul");
                 security.setId(1);
                security.setEge(25);
                security.setDa(500);
                security.setHoliday(4);
                security.setTax(0);
                security.setPf(12);
                security.setAttendance(new int[] {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                Salary salary = new Salary(security);
                 salary.calSalary();
                  break;
            }
            case 2:
            {
                Worker worker = new Worker();
                worker.setName("sd");
                worker.setId(101);
                worker.setEge(35);
                worker.setDa(600);
                worker.setHoliday(4);
                worker.setTax(10);//in percentage
                worker.setPf(12);//in persentage
                worker.setAttendance(new int[] {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                 Salary salary = new Salary(worker);
                 salary.calSalary();
                  break;
            }
            case 3:
            {
                Asistant asistant = new Asistant();
                asistant.setName("Harsh");
                asistant.setId(201);
                asistant.setEge(45);
                asistant.setDa(2000);
                asistant.setHoliday(6);
                asistant.setTax(10);//in percentage
                asistant.setPf(12);//in persentage
                asistant.setAttendance(new int[] {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                 Salary salary = new Salary(asistant);
                 salary.calSalary();
                 break;
            }
            case 4:
            {
                Manager manager = new Manager();
                manager.setName("Harshil");
                manager.setId(301);
                manager.setEge(30);
                manager.setDa(2500);
                manager.setHoliday(7);
                manager.setTax(12);//in percentage
                manager.setPf(12);//in persentage
                manager.setAttendance(new int[] {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                Salary salary = new Salary(manager);
                 salary.calSalary();
                  break;
            }
            case 5:
            {
                CEO ceo = new CEO();
                ceo.setName("parth");
                ceo.setId(311);
                ceo.setEge(24);
                ceo.setDa(5000);
                ceo.setHoliday(8);
                ceo.setTax(12);//in percentage
                ceo.setPf(12);//in persentage
                ceo.setAttendance(new int[] {0,0,0,1,1,0,-1,-1,-1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                  Salary salary = new Salary(ceo);
                 salary.calSalary();
                break;
            }
            default:
                System.out.println("INVALID INPUT!!");
        }
        
    }
}