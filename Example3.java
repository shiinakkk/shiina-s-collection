class Example3{
 public static void main(String args[ ]){
  int x , y;
  x = 10;
  y = 20;
  if(x < y) System.out.println("x is less than y");
  x = x * 2;
  if(x == y) System.out.println("x is equal to y");
  x = x + 1;
  if(x > y) System.out.println("x is larger than y");
  if(x == y) System.out.println("There must be sth. wrong");
  if(x < y) System.out.println("There must be sth. wrong");
 }
}