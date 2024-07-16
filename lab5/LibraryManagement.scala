import scala.io.StdIn.readLine

object LibraryManagement{

    case class Book(title: String, author: String, isbn: String)
    var library: Set[Book] = Set()

    def addBook(): Set[Book] = {
        println("Enter new book details")
        val title = readLine("Title: ")
        val author = readLine("Author: ")
        val isbn = readLine("ISBN: ")

        val newBook = Book(title, author, isbn)
        if(findBookByISBN(library, newBook.isbn).isDefined) {
            println("A book with that ISBN already exists")
            return library
        }
        library += newBook

        return library
    }

    def removeBookByISBN(isbn: String): Set[Book] = {
        val bookToRemove = findBookByISBN(library, isbn)
        bookToRemove match {
        case Some(book) =>
            println(s"Book removed: $book")
            library -= book
            return library
        case None =>
            println(s"No book found with ISBN: $isbn")
            return library
        }
    }

    def findBookByISBN(library: Set[Book], isbn: String): Option[Book] = {
        library.find(_.isbn == isbn)
    }

    def findBookByTitle(): Unit = {
        println("Enter book title to search:")
        var title = readLine()
        library.find(_.title == title) match {
        case Some(book) =>
            println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
        case None =>
            println(s"No book found with title: $title")
        }
    }

    def printLibrary(): Unit = {
        library.foreach { book =>
            println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
        }
    }

    def displayBooksByAuthor(author: String): Unit = {
        val booksByAuthor = library.filter(_.author == author)
        if (booksByAuthor.isEmpty) {
            println(s"No books found by author: $author")
        } else {
            println(s"Books by $author:")
            booksByAuthor.foreach { book =>
                println(s"Title: ${book.title}, ISBN: ${book.isbn}")
            }
        }
    }

    def main(args: Array[String]): Unit = {

        library += Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565")
        library += Book("Origin", "Dan Brown", "9780451524935")
        library += Book("To Kill a Mockingbird", "Harper Lee", "9780061120084")

        addBook()
        println(library)

        println()
        removeBookByISBN("1")
        println(library)

        println()
        printLibrary()

        println()
        findBookByTitle()

        println()
        displayBooksByAuthor("Dan Brown")

    }
}