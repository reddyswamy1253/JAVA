
class a{
    
    public static void main(int x){
        System.out.println("first argu");
    }
    public static void main(int x,int y){
        System.out.println("second argu");
    }
    public static void main(boolean x){
        System.out.println("third argu");
    }
    public static void main(String t[]){
        main(1);
        main(2,3);
        main(true);
    }
    
}