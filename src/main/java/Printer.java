public class Printer {
    private int numberSheets;
    private int toner;


    public Printer(int numberSheets, int toner) {
        this.numberSheets = numberSheets;
        this.toner = toner;
    }

    public int checkSheets(){
      return this.numberSheets;
    }

    public int checkToner(){
        return this.toner;
    }

    public int printPage(int numberPage, int numberCopies) {
        if (numberPage * numberCopies <= this.numberSheets) {
           this.toner -= numberPage;
            return  this.numberSheets -= (numberPage * numberCopies);

        }
        return this.numberSheets;

    }


}


//    Create a Printer class that has a property for number of sheets of paper left.
//    Add a method to print that takes in a number of pages and number of copies.
//    The print method will only run if the printer has enough paper. If it runs
//    it will reduce the value of the paper left by number of copies * number of pages.
//    Add a toner volume property to the class.
//    Modify the printer so that it reduces the toner by 1 for each page printed.