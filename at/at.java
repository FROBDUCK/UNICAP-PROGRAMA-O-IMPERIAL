import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  int a, b, c;

  System.out.println("digite um número");
  a = teclado.nextInt();


  System.out.println("digite um número");
  b = teclado.nextInt();
  
  System.out.println("digite um número");
  c = teclado.nextInt();

  if((a>b)&&(b>c)){
    System.out.println(c + "," + b + ","+ a);
  }else if ((b>a)&&(a>c)) {
    System.out.println(c + "," + a + ',' + b);
    
  }else if((c>a)&&(a>b)){
    System.out.println(b + ","+ a + "," + c);

  }else if ((c>b)&&(b>a)) {
    System.out.println(a +"," + b + "," + c);
    
  }else if ((b>c)&&(c>a)){
    System.out.println(a + "," + c +"," + b);
  }else{
    System.out.println(b + "," + c + "," + a);
  }
  }
  }