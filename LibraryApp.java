public class LibraryApp {
    public static void main(String[] args){
        Library lib=new Library();
        lib.addBook(new Book(1,"Clean Code","Robert C. Martin"));
        lib.addBook(new Book(2,"Java: The Complete Reference","Herbert Schildt"));
        lib.addMember(new Member(101,"Student One"));
        while(true){Menu.show(); int c=InputUtil.readInt("Choose: ");
            switch(c){
                case 1: lib.addBook(new Book(InputUtil.readInt("Book ID: "),InputUtil.readString("Title: "),InputUtil.readString("Author: ")));System.out.println("Book added.");break;
                case 2: lib.addMember(new Member(InputUtil.readInt("Member ID: "),InputUtil.readString("Name: ")));System.out.println("Member added.");break;
                case 3: lib.showBooks();break; case 4: lib.showMembers();break;
                case 5: if(lib.issueBook(InputUtil.readInt("Book ID: "),InputUtil.readInt("Member ID: ")))System.out.println("Book issued successfully.");break;
                case 6: if(lib.returnBook(InputUtil.readInt("Book ID: ")))System.out.println("Book returned successfully.");break;
                case 7: System.out.println("Thank you!");return; default:System.out.println("Invalid choice.");
            }
        }
    }
}
