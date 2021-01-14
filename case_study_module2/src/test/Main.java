package test;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int choose;
     do {
         showMenu();
         Scanner input=new Scanner(System.in);
         choose=Integer.parseInt(input.nextLine());
         switch (choose){
             case 1:
                 List<Book> bookList=new ArrayList<>();
                 System.out.println("them bao nhieu quyen sach?");
                 int n=Integer.parseInt(input.nextLine());
                 for (int i=0;i<n;i++){
                     Book book=new Book();
                     book.input();
                     bookList.add(book);
                 }
                 try {
                     FileWriter fileWriter=new FileWriter("src/test/data.txt");
                     BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                     for (Book book:bookList) {
                         bufferedWriter.write(String.valueOf(book));
                         bufferedWriter.newLine();
                     }
                     bufferedWriter.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
                 break;
             case 2:
                 List<Book> bookList1=new ArrayList<>();
             try {
                 FileReader fileReader=new FileReader("src/test/data.txt");
                 BufferedReader bufferedReader=new BufferedReader(fileReader);
                 String line="";
                 while (true){
                     line=bufferedReader.readLine();
                     if(line==null){
                         break;
                     }
                     String [] txt=line.split(",");

                     String name=txt[0];
                     String author=txt[1];
                     String dateOfSale=txt[2];
                     String dateOfPublication=txt[3];
                     String producer=txt[4];
                     bookList1.add(new Book(name,author,dateOfSale,dateOfPublication,producer));
                 }
                 Collections.sort(bookList1, new Comparator<Book>() {
                     @Override
                     public int compare(Book b, Book b1) {
                         return b.getAuthor().compareTo(b1.getAuthor());
                     }
                 });
                 for (Book b: bookList1) {
                     b.showInfo();
                 }

             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             } catch (IOException e) {
                 e.printStackTrace();
             }
             break;

             case 3:
                 try {
                     FileReader fileReader=new FileReader("src/test/data.txt");
                     BufferedReader bufferedReader=new BufferedReader(fileReader);
                     String line="";
                     while (true){
                         line=bufferedReader.readLine();
                         if(line==null){
                             break;
                         }
                         System.out.println(line);

                     }

                 } catch (FileNotFoundException e) {
                     e.printStackTrace();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
                 break;
             case 4:
                 System.out.println("bye!");
                 break;
             case 5: List<Book> bookList2=new ArrayList<>();
                 try {
                     FileReader fileReader=new FileReader("src/test/data.txt");
                     BufferedReader bufferedReader=new BufferedReader(fileReader);
                     String line="";
                     while (true) {
                         line = bufferedReader.readLine();
                         if (line == null) {
                             break;
                         }
                         String[] txt = line.split(",");
                         String name = txt[0];
                         String author = txt[1];
                         String dateOfSale = txt[2];
                         String dateOfPublication = txt[3];
                         String producer = txt[4];
                         bookList2.add(new Book(name, author, dateOfSale, dateOfPublication, producer));

                     }
                 } catch (FileNotFoundException e) {
                     e.printStackTrace();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
         }
     } while (choose!=4);


    }
    public static void showMenu(){
        System.out.println("1. Nhập thông tin N quấn sách va ghi vao file");
        System.out.println("2. Sắp xếp theo tên tác giả");
        System.out.println("3. Hien thi sach trong file");
        System.out.println("4.exit");
        System.out.println("you choose??");
    }




}
