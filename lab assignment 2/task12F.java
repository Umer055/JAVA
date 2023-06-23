public class task12F {
    public static void main(String[] args) {
                int n = 5;
                for(int i=1;i<=n;i++){
                    //first triangle
                    for(int j=5;j>=i;j--){
                        System.out.print("  ");
                    }

                    //second triangle
                    for(int k=i;k>=1;k--){
                        System.out.print(k+" ");
                    }

                    //3rd triangle
                    for(int l=2;l<=i;l++){
                        if(i!=1){
                            System.out.print(l+" ");
                        
                        }
                    }
                    System.out.println();
                }

            }
        }
        
