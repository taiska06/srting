public class Main {
    public static void main(String[] args) {
        String str = "ДАЙТЕ МНЕ БЕЛЫЕ КРЫЛЬЯ";
        int amount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ' ) {
                amount++;
            }
        }
        System.out.println(amount);
    }
}