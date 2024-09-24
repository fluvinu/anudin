package String;

public class S1 {
    public static void main(String[] args) {
        char[] nn={'s','i','d'};
        String  s=new String(nn);
        System.out.println(s);
        String name;
        name=s; 
        // name =  "sid";
        System.out.println(name);
        if(name==s){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

    }
}
