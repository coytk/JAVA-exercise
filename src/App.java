
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
class Dogtest {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Alarm alarm=new Alarm();
        dog.size=40;
        dog.name="Coy";
        int almtime=0;
        //System.out.println("Dog say: "+ dog.size);
        for (int timing = 1; timing <= 5; timing++) {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            System.out.printf("%d sec \n",timing);
            if (timing==5) {
                alarm.alarm();
                almtime++;
                if (almtime==5) {
                    dog.bark();
                    break;
                }
                timing=0;
            }
        }



        //dog.bark();

    }


}
