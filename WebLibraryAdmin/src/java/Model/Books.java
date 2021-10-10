package Model;

public class Books {

    String Addbookname;
    String Addbooktype;
    String Addpublisher;
    String Addprinttime;
    
    public Books(){
    }
    
    public Books(String name,String type,String publisher,String printtime){
       this.Addbookname = name ;
       this.Addbooktype = type ;
       this.Addpublisher = publisher;
       this.Addprinttime = printtime;
    }
    
    public String getAddbookname() {
        return Addbookname;
    }

    public void setAddbookname(String Addbookname) {
        this.Addbookname = Addbookname;
    }

    public String getAddBookType() {
        return Addbooktype;
    }

    public void setAddBookType(String AddBookType) {
        this.Addbooktype = Addbooktype;
    }

    public String getAddpublisher() {
        return Addpublisher;
    }

    public void setAddpublisher(String Addpublisher) {
        this.Addpublisher = Addpublisher;
    }

    public String getAddprinttime() {
        return Addprinttime;
    }

    public void setAddprinttime(String Addprinttime) {
        this.Addprinttime = Addprinttime;
    }

}
