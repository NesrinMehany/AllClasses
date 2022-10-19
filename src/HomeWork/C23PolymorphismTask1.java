package HomeWork;

public class C23PolymorphismTask1 {
/*Create a class File that will have the following behaviors: open, edit, close. Edit and close are
implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide
 specific implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .
 doc file we need Microsoft word to be installed etc
 */

}
abstract class File {

    abstract void open();
    void close(){
        System.out.println("Browser closed");
    }
    void edit(){
        System.out.println("Browser Edited");
    }
}

class JavaFile extends File{
    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}
class WoedFile extends File{
    @Override
    void open() {
        System.out.println("to open doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("to open PDF file we need PDF reader ");
    }
}