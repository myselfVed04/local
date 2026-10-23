class Area {
  static void fun1() {
    System.out.println("Area 1"); // to run this sentence we add static function required before void fun1() and
                                  // fun2()
  }

 static void fun2() {
    System.out.println("Area 2"); // to run this sentence we add static function required before void fun1() and
                                  // fun2()
  }

}

class Example2 {
  static void fun1() {
    System.out.println("A");
  }

  static void fun2() {
    System.out.println("B");
  }

  public static void main(String[] args) {
    System.out.println("Vedant");
    fun1();
    fun2();

    Area.fun1();
    Area.fun2();
  }
}
