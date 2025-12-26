import java.util.Scanner;

public class switch_case
{
    public static void main(String[] args)
    {
        System.out.print("[+] Enter your options: ");
        int opt = new Scanner(System.in).nextInt();

        //  New generation switch-case from > Java 17
         switch (opt) {
             case 1-> System.out.println("[+] Option 1");
             case 2-> System.out.println("[+] Option 2");
             case 3-> System.out.println("[+] Option 3");
             case 4-> System.out.println("[+] Option 4");
             default -> {
                 System.out.println("[+] Invalid option");
                 System.out.println("break");
             }
         }

        /* switch (opt)
        {
            case 1:{
                System.out.print("[+] Option 1");
                break;
            }
            case 2:{
                System.out.print("[+] Option 2");
                break;
            }
        } */

    }
}

/*
    if & switch-case
    -- 
    compare value

    --
    if: can compare both absolute and not absolute

    switch: only absolute(number-noly not integer, string) not boolean

*/