package ch01_classes_pointer;

public class tut01_classess {
    public static class Cookie {
        private String color;

        public Cookie(String color) {
            this.color = color;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
    }
    public static void main(String[] args){
        Cookie CookieOne = new Cookie("Green");
        Cookie CookieTwo = new Cookie("Blue");
        System.out.println(CookieOne.getColor());
        System.out.println(CookieTwo.getColor());
        CookieOne.setColor("Yellow");
        System.out.println(CookieOne.getColor());
    }
}
