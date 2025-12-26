//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //    int a = 2 // is called expression
    //    int b = 4; // one statement
    //    2  // is nay value operand (value)
    //    {....} // Block of code

//   1- [if else Statement]
//    int a = 2;
//    if (a > 0) {
//        System.out.println("Hello World 1");
//    }
//    else if(a > 11+1) {
//        System.out.println("Hello World 2");
//    }
//    else {
//        System.out.println("Hello World 3");
//    }

     System.out.println("[+]Insert age:");
     byte age = new Scanner(System.in).nextByte();

     if (age <= 18) {
         System.out.println("You have been allowed to vote!");
     }
     else {
         System.out.println("You haven`t been allowed to vote!");
     }

}
