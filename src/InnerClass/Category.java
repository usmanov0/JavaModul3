package InnerClass;

public class Category {
    String username;
    String Phone_number;
    public Category(String username, String phone_number){
        this.username = username;
        this.Phone_number = phone_number;
    }

    public int hashcode(){
        return username.hashCode() + Phone_number.hashCode();
    }
    public boolean equals(Object obj){
        if(obj==this) return true;
        if(obj instanceof Category){
            Category category = (Category) obj;
            if(category.hashCode()==this.hashcode()) return true;
        }
        return false;
    }

    public static void main(String[] args){
        Category category = new Category("Aziz","+998995611060");
        Category category1 = new Category("Aziz","+998995611060");
        boolean tengg = category.equals(category1);
        System.out.println(tengg);
    }
}

