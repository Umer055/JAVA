public class q7 {
    public static void main(String[] args) {
        boolean prime = true;
        int count = 0;
        for (int i = 100; i <=1000; i++){
            prime = true;
            for (int j = 2; j < i;j++ ){
            if (i % j == 0){
                prime = false;
                break;
            }}
            if (prime) {
                System.out.printf("%-5d",i);
                count+=1;
                
            }
            if (count % 8 == 0){
                System.out.println();
            }
            
        }
    }
    }
