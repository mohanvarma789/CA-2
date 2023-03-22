import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("sai");
        names.add("varma");
        names.add("akhil");
        names.add("madhan");
        Collections.sort(names);
        System.out.println(names);
        System.out.println("Enter What You What To Search");
        Scanner string = new Scanner(System.in);
        String input = string.nextLine();
        if(names.contains(input)){
            System.out.println(input +"was present in the List");
        }
        else{
            System.out.println(input +"was not present in the List");

        }
    }

    }

