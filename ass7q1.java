public class ass7q1{
          public static void main(String[]args){
            recurssion();
          }
            private static void recurssion(){
                    int i;
                    int n1=0;
                    int n2=1;
                    int n3;
                  
                
System.out.println(n1+ " \n"  +    n2);
                    for( i=2;i<=10;i++){
                        n3=n1+n2;
                        
                        System.out.println(n3);
                        n1=n2;
                        n2=n3;
                    }
                  }
            
}
