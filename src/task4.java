public class task4 {
    public static void main(String[] args) {
        switch("no"){
            case "Yes":
            case "yes":
            case "Так":
            case "так":
            case "ТАК":
            case "Y":
            case "y":
            case "OK":
            case "Ok":
            case "oK":
                System.out.println("Я погоджуюсь!");
                break;
            case "NO":
            case "No":
            case "no":
            case "Ні":
            case "ні":
            case "N":
            case "n":
            case "-":
                System.out.println("Я відмовляюсь!!");
                break;
            default:
                System.out.println("Немає підтвердження або відмовлення");

        }
    }
}
