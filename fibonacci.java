public class fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.println(of(i));
        }
    }
    public static int of(int num){
        if(num <= 0){
            System.out.println("请输入正确的序号");
            return -1;
        }
        else if(num == 1 && num == 2){
            return 1;
        }
        int n0 = 0, n1 = 1, temp = 0;
        for (int i = 1; i < num; i++) {
            temp = n0 + n1;
            n0 = n1;
            n1 = temp;
        }
        return n1;        
    }
}