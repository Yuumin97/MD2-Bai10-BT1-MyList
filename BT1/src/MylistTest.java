public class MylistTest {
     public static void main(String[] args) {
          MyList<String> list = new MyList<>();
          list.add(0, "D");
          list.add(1, "a");
          list.add(1, "n");
          list.add(1, "h");
          list.remove(3);
           for (Object s: list.elements){
                System.out.println(s);
      }
          System.out.println(list.contains("a"));
     }

}
