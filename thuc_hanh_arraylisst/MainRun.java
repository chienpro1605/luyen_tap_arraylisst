package thuc_hanh_arraylisst;

import java.util.ArrayList;

public class MainRun {
    public static void main(String[] args) {
        ArrayList<Book> arrayList = new ArrayList<>();

        Book b0 = new Book();
        b0.setName("conan");
        b0.setCode(0);
        b0.setPrice(10);
        b0.setBrand("truyen tranh");

        Book b1 = new Book("doremon",1,20,"truyen tranh");
        Book b2 = new Book("lao hac",12,20,"truyen dai");
        Book b3 = new Book("mat biec",23,50,"truyen dai");
        Book b4 = new Book("banh troi nuoc",24,60,"truyen dai");

        arrayList.add(b0);
        arrayList.add(b1);
        arrayList.add(b2);
        arrayList.add(b3);

        for (Book o: arrayList){
            System.out.println(o);
        }

    }
}
