public class App {
       

    public static void main(String[] args) throws Exception {

        boolean flag=true;
        int x=5;
        while(flag){

            System.out.printf("x is %d\n",x);
            if(x==1){
                flag=false;
            }
            x=x-1;
            
        }
        System.out.println("End");
    }


}