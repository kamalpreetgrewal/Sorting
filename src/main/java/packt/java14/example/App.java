package packt.java14.example;

public class App 
{
    public static void main( String[] args )
    {
        var namesList = new String[] {
                "Elizabeth", "Maxine", "Aria", "Pam", "Spencer"
        };
        BubbleSort.sort(namesList);
        for (var name: namesList){
            System.out.println(name);
        }
    }
}