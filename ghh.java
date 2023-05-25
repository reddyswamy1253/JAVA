class Main{
    public static void main(String[]args){
        String str="java programming";
        char arr[]=new char[10];
        str.getChars(0,4,arr,0);
        System.out.println(arr);
        
    }
}