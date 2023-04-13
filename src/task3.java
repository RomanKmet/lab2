public class task3 {
    public static void main(String[] args) {
        String direction = "Up";
        String s1 = "Up";
        String s2 = "Down";
        int level = 4;
        if (direction.equals(s2) && level == 2){
            level=1;
        }if (direction.equals(s1)&& level == 2) {
            level=3;
        }if (direction.equals(s2) && level < 9){
            System.out.println("Ви спустились на " + level + " поверх");
        }else if(direction.equals(s1) && level < 9){
            System.out.println("Ви піднялись на " + level + " поверх");
        }else{
            System.out.println("Такого поверху не існує");
        }
    }
}