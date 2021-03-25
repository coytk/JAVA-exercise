import java.util.Scanner;

class Dog{
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Ruff!");
    }
}
class Alarm{
    int alarmtimes;

    void alarm(){
        System.out.println("Wake up!!!");
    }

}
public class App {

    // public static void main(String[] args) {
    //     Scanner in=new Scanner(System.in);// 手动输入
    //     System.out.println("Please input a integer number");  
    //     int innum=in.nextInt();
    //     System.out.println("The number you input is "+innum);


    //     Dog dog=new Dog();
    //     Alarm alarm=new Alarm();
    //     dog.size=40;
    //     dog.name="Coy";
    //     int almtime=0;
    //     //System.out.println("Dog say: "+ dog.size);
    //     for (int timing = 1; timing <= 5; timing++) {
    //         try{
    //             Thread.sleep(1000);
    //         }catch(InterruptedException e){
    //         }
    //         System.out.printf("%d sec \n",timing);
    //         if (timing==5) {
    //             alarm.alarm();
    //             almtime++;
    //             if (almtime==5) {
    //                 dog.bark();
    //                 break;
    //             }
    //             timing=0;
    //         }
    //     }
    //     in.close();



    //     //dog.bark();

    // }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------学生信息录入---------------");
        String name = ""; // 获取学生姓名
        int age = 0; // 获取学生年龄
        String sex = ""; // 获取学生性别
        try {
            System.out.println("请输入学生姓名：");
            name = scanner.next();
            System.out.println("请输入学生年龄：");
            age = scanner.nextInt();
            System.out.println("请输入学生性别：");
            sex = scanner.next();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("输入有误！");
            //return;
        }
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + sex);
        scanner.close();
    }
    

}
