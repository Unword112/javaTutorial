public class Perimeter {
      public int findPerimeter(int length, int width)  {
        int result = (length + length) + (width + width);
        return result;
      }
      public static void main(String[] args) {
        Perimeter p = new Perimeter();
        System.out.print(p.findPerimeter(6, 7));          
      }
}
