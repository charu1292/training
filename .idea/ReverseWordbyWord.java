package questions;

public class ReverseWordbyWord {
    public static String ReverseWordbyWord(String s){
        String[] list=s.split(" ");
        for(int i=0,j= list.length-1;i<j;i++,j--){
            String t=list[i];
            list[i]=list[j];
            list[j]=t;
        }
          String Result="";
        for(int i=0;i< list.length;i++){
            if(i!= list.length-1){
                Result += list[i] + " ";
            }
            else Result += list[i];
        }
        return Result;
    }


    public static void main(String[] args) {
        String s="I have to go outside";
        System.out.println(ReverseWordbyWord(s));
    }
}
