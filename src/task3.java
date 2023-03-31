public class task3 {
    public static void main(String[] args) {
        int floor=5;
        String direction="Вверх";
        if(floor==2&&direction=="Вверх"){
            floor=3;
        }else if(floor==2&&direction=="Вниз"){
            floor=1;
        }
        if(direction=="Вниз"&&floor<9){
            System.out.println("Ви спустились на "+floor+" поверх");
        }
        else if(direction=="Вверх"&&floor>1){
            System.out.println("Ви піднялись на "+floor+" поверх");
        }
        else{
            System.out.println("Такого поверху не існує");
        }
    }
}
