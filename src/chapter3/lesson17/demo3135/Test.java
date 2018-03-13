package chapter3.lesson17.demo3135;

public class Test {
     class Book{
        private int anInt=10;

        public int getAnInt() {
            return anInt;
        }

        public void setAnInt(int anInt) {
            this.anInt = anInt;
        }
    }

    public void fun(){
         Test.Book book=new Book();
    }


}


