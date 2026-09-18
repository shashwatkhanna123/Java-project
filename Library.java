import java.util.*;
public class Library {
    private List<Book> books=new ArrayList<>(); private List<Member> members=new ArrayList<>();
    public void addBook(Book b){books.add(b);} public void addMember(Member m){members.add(m);}
    public void showBooks(){if(books.isEmpty())System.out.println("No books."); else books.forEach(System.out::println);}
    public void showMembers(){if(members.isEmpty())System.out.println("No members."); else members.forEach(System.out::println);}
    public boolean issueBook(int bookId,int memberId){
        Book b=findBook(bookId); Member m=findMember(memberId);
        if(b==null||m==null){System.out.println("Invalid book/member ID.");return false;}
        if(b.isIssued()){System.out.println("Book already issued.");return false;} b.setIssued(true); return true;
    }
    public boolean returnBook(int bookId){Book b=findBook(bookId); if(b==null){System.out.println("Book not found.");return false;} if(!b.isIssued()){System.out.println("Book was not issued.");return false;} b.setIssued(false);return true;}
    public Book findBook(int id){for(Book b:books)if(b.getId()==id)return b;return null;}
    private Member findMember(int id){for(Member m:members)if(m.getId()==id)return m;return null;}
}
